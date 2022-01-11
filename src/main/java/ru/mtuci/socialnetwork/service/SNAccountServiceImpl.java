package ru.mtuci.socialnetwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.socialnetwork.dao.SNAccountRepository;
import ru.mtuci.socialnetwork.model.SNAccount;

import java.util.List;

@Service
public class SNAccountServiceImpl implements SNAccountService {

    private final SNAccountRepository snaccountRepository;

    @Autowired
    public SNAccountServiceImpl(SNAccountRepository snaccountRepository) {
        this.snaccountRepository = snaccountRepository;
    }

    @Override
    public SNAccount get(Long id) {
        return snaccountRepository.findById(id).orElse(null);
    }

    @Override
    public List<SNAccount> getAll() {
        return snaccountRepository.findAll();
    }

    @Override
    public SNAccount save(SNAccount snaccount) {
        return snaccountRepository.save(snaccount);
    }

    @Override
    public void delete(long id) {
        snaccountRepository.delete(id);
    }
}
