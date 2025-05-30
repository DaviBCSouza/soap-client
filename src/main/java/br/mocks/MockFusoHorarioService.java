package br.mocks;

import br.fuso.soap.FusoHorario;
import br.fuso.soap.FusoHorarioService;

import java.util.ArrayList;
import java.util.List;

public class MockFusoHorarioService implements FusoHorarioService {
    private final List<FusoHorario> lista = new ArrayList<>();

    public MockFusoHorarioService() {
        for (int i = 1; i <= 10; i++) {
            FusoHorario fuso = new FusoHorario();
            fuso.setCnes("CNES" + i);
            fuso.setCidade("Cidade " + i);
            fuso.setFuso(String.format("UTC-%02d:00", i));
            lista.add(fuso);
        }
    }

    @Override
    public List<FusoHorario> getAll() {
        return lista;
    }

    @Override
    public FusoHorario getByCNES(String cnes) {
        return lista.stream()
                .filter(f -> f.getCnes().equals(cnes))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean addFuso(FusoHorario fusoHorario) {
        return lista.add(fusoHorario);
    }

    @Override
    public boolean removeFusoByCNES(String cnes) {
        return lista.removeIf(f -> f.getCnes().equals(cnes));
    }

    @Override
    public boolean updateFuso(FusoHorario fusoHorario) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCnes().equals(fusoHorario.getCnes())) {
                lista.set(i, fusoHorario);
                return true;
            }
        }
        return false;
    }
}
