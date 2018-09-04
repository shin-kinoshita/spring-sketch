package com.example.sketch.postdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/postdata")
public class PostController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("form", new ModelattributeForm());
        return "postdata/index";
    }

    @PostMapping("attribute")
    public String modelAttribute(@ModelAttribute ModelattributeForm form) {
        return "postdata/model_attribute";
    }

    @PostMapping("part")
    public String requestPart(@RequestPart MultipartFile file) {
        return "postdata/model_attribute";
    }

    @PostMapping("param")
    public String requestParam(@RequestParam Integer id, @RequestParam String name) {
        return "postdata/request_param";
    }

    @PostMapping("body")
    public String requestBody(@RequestBody String data, @RequestBody String data2) {
        return "postdata/request_body";
    }
}
