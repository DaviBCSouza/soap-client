package br.mocks;

import br.ubs.soap.IUnidadeSaudeService;
import br.ubs.soap.UnidadeSaude;

import java.util.ArrayList;
import java.util.List;

public class MockUnidadeSaudeService implements IUnidadeSaudeService {
    private final List<UnidadeSaude> unidades = new ArrayList<>();

    public MockUnidadeSaudeService() {
        for (int i = 1; i <= 10; i++) {
            UnidadeSaude ubs = new UnidadeSaude();
            ubs.setCnes("CNES" + i);
            ubs.setName("UBS Bairro " + i);
            ubs.setBairro("Bairro " + i);
            unidades.add(ubs);
        }
    }

    @Override
    public List<UnidadeSaude> getAll() {
        return unidades;
    }

    @Override
    public UnidadeSaude getByCNES(String cnes) {
        return unidades.stream()
                .filter(ubs -> ubs.getCnes().equals(cnes))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean save(String cnes, String name, String bairro) {
        UnidadeSaude nova = new UnidadeSaude();
        nova.setCnes(cnes);
        nova.setName(name);
        nova.setBairro(bairro);
        return unidades.add(nova);
    }

    @Override
    public boolean update(int index, String cnes, String name, String bairro) {
        if (index >= 0 && index < unidades.size()) {
            UnidadeSaude ubs = unidades.get(index);
            ubs.setCnes(cnes);
            ubs.setName(name);
            ubs.setBairro(bairro);
            return true;
        }
        return false;
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < unidades.size()) {
            unidades.remove(index);
        }
    }
}
