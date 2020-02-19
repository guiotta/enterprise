package br.com.otta.enterprise.service;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.com.otta.enterprise.repository.EnterpriseRepository;
import br.com.otta.enterpriseApi.model.Enterprise;

@Component
public class EnterpriseService {
    private EnterpriseRepository repository;

    @Inject
    public EnterpriseService(EnterpriseRepository repository) {
        this.repository = repository;
    }

    public Collection<Enterprise> findAll() {
        return repository.findAll();
    }

    public Enterprise findById(long id) {
        return repository.findById(id);
    }

    public Enterprise save(Enterprise enterprise) {
        return repository.save(enterprise);
    }

    public Enterprise update(Enterprise enterprise) {
        return repository.udpate(enterprise);
    }

}
