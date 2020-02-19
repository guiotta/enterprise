package br.com.otta.enterprise.repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import br.com.otta.enterpriseApi.model.Enterprise;

@Repository
public class EnterpriseRepository {
    private Set<Enterprise> enterpriseList;

    @Inject
    public EnterpriseRepository() {
        enterpriseList = new HashSet<Enterprise>();
    }

    public Collection<Enterprise> findAll() {
        return enterpriseList;
    }

    public Enterprise findById(long id) {
        return enterpriseList.stream()
                .filter(enterprise -> enterprise.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public Enterprise save(Enterprise enterprise) {
        enterpriseList.add(enterprise);

        return enterprise;
    }

    public Enterprise udpate(Enterprise enterprise) {
        Enterprise oldValue = enterpriseList.stream()
        .filter(value -> value.getId() == enterprise.getId())
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);

        enterpriseList.remove(oldValue);
        enterpriseList.add(enterprise);

        return enterprise;
    }
}
