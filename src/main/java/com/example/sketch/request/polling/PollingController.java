package com.example.sketch.request.polling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.CompletableFuture;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/polling")
public class PollingController {
    @GetMapping("/short")
    public DeferredResult<String> shortGet() {
        return index(10L);
    }

    @GetMapping("/long")
    public DeferredResult<String> longGet() {
        return index(1000L);
    }

    private DeferredResult<String> index(Long sleepTime) {
        DeferredResult<String> result = new DeferredResult<>(500L);
        result.onCompletion(() -> {
            System.out.println("## enter onCompletion");
            result.setResult("onCompletion");
        });
        result.onTimeout(() -> {
            System.out.println("## enter onTimeout");
            result.setResult("onTimeout");
        });
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return result;
    }
}
