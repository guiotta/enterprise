package br.com.otta.enterprise.controller;

import java.util.Collection;

import javax.inject.Inject;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Enterprise> findEnterpriseById(long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @Override
    public ResponseEntity<Collection<Enterprise>> listAllEnterprises() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<Enterprise> saveEnterprise(Enterprise enterprise) {
        return ResponseEntity.ok(service.save(enterprise));
    }

    @Override
    public ResponseEntity<Enterprise> updateEnterprise(Enterprise enterprise) {
        return ResponseEntity.ok(service.update(enterprise));
    }

}
