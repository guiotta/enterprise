package br.com.otta.enterprise.controller;

import java.util.Collection;

import javax.inject.Inject;
import org.springframework.web.bind.annotation.RestController;

import br.com.otta.enterprise.service.EnterpriseService;
import br.com.otta.enterpriseApi.api.EnterpriseApi;
import br.com.otta.enterpriseApi.model.Enterprise;

@RestController
public class EnterpriseController implements EnterpriseApi {
    private EnterpriseService service;

    @Inject
    public EnterpriseController(EnterpriseService service) {
        this.service = service;
    }

    @Override
    public Enterprise findEnterpriseById(long id) {
        return service.findById(id);
    }

    @Override
    public Collection<Enterprise> listAllEnterprises() {
        return service.findAll();
    }

    @Override
    public Enterprise saveEnterprise(Enterprise enterprise) {
        return service.save(enterprise);
    }

    @Override
    public Enterprise updateEnterprise(Enterprise enterprise) {
        return service.update(enterprise);
    }

}
