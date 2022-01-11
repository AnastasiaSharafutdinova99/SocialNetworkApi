package ru.mtuci.socialnetwork.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.socialnetwork.model.SNAccount;
import ru.mtuci.socialnetwork.service.SNAccountService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = SNAccountController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class SNAccountController {
    public static final String REST_URL = "/api/v1/snaccounts";

    private SNAccountService SNAccountService;

    @Autowired
    public SNAccountController(SNAccountService SNAccountService) {
        this.SNAccountService = SNAccountService;
    }

    @GetMapping(value = "/{id}")
    public SNAccount get(@PathVariable("id") long id) {
        log.info("get " + id);
        return SNAccountService.get(id);
    }

    @GetMapping
    public List<SNAccount> getAll() {
        log.info("getAll");
        return SNAccountService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public SNAccount save(@RequestBody SNAccount SNAccount) {
        log.info("save " + SNAccount);
        return SNAccountService.save(SNAccount);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        log.info("delete " + id);
        SNAccountService.delete(id);
    }
}
