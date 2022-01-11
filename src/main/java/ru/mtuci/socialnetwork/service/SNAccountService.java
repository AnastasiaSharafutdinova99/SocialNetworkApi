package ru.mtuci.socialnetwork.service;

import ru.mtuci.socialnetwork.model.SNAccount;

import java.util.List;

public interface SNAccountService {

    SNAccount get(Long id);

    List<SNAccount> getAll();

    SNAccount save(SNAccount SNAccount);

    void delete(long id);
}
