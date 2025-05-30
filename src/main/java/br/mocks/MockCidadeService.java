package br.mocks;

import br.cidade.soap.Cidade;
import br.cidade.soap.CidadeService;

import java.util.ArrayList;
import java.util.List;

public class MockCidadeService implements CidadeService {
    private final List<Cidade> cidades = new ArrayList<>();

    public MockCidadeService() {
        for (int i = 1; i <= 10; i++) {
            Cidade c = new Cidade();
            c.setIbge("IBGE" + i);
            c.setNome("Cidade " + i);
            cidades.add(c);
        }
    }

    @Override
    public void insertCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    @Override
    public List<Cidade> getCidades() {
        return cidades;
    }

    @Override
    public Cidade getCidade(int index) {
        if (index >= 0 && index < cidades.size()) {
            return cidades.get(index);
        }
        return new Cidade();
    }

    @Override
    public void deleteCidade(int index) {
        if (index >= 0 && index < cidades.size()) {
            cidades.remove(index);
        }
    }

    @Override
    public void updateCidade(Cidade cidade) {
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getIbge().equals(cidade.getIbge())) {
                cidades.set(i, cidade);
                break;
            }
        }
    }
}
