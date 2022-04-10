package com.mber;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StringController {
    List<String> strings = new ArrayList<>(Arrays.asList("A","B","C"));

    @GetMapping
    public List<String> getStrings() {
        return strings;
    }

    @PostMapping
    public String addString(@RequestBody String value) {
        strings.add(value);
        return strings.toString();
    }

    @DeleteMapping("/{id}")
    public String removeString(@PathVariable("id") int id) {
        strings.remove(id);
        return strings.toString();
    }
}