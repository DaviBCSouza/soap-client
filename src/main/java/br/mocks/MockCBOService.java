package br.mocks;

import br.cbo.soap.Cbo;
import br.cbo.soap.CboService;

import java.util.ArrayList;
import java.util.List;

public class MockCBOService implements CboService {
    private final List<Cbo> cboList = new ArrayList<>();

    public MockCBOService() {
        for (int i = 1; i <= 10; i++) {
            Cbo cbo = new Cbo();
            cbo.setCodCbo("CBO" + i);
            cbo.setProfissao("Profissão " + i);
            cboList.add(cbo);
        }
    }

    @Override
    public List<Cbo> getListCbo() {
        return cboList;
    }

    @Override
    public Cbo getCbo(String codCbo) {
        return cboList.stream()
                .filter(c -> c.getCodCbo().equals(codCbo))
                .findFirst()
                .orElse(new Cbo());
    }

    @Override
    public void setCbo(String codCbo, String profissao) {
        for (Cbo c : cboList) {
            if (c.getCodCbo().equals(codCbo)) {
                c.setProfissao(profissao);
                return;
            }
        }
        Cbo novo = new Cbo();
        novo.setCodCbo(codCbo);
        novo.setProfissao(profissao);
        cboList.add(novo);
    }

    @Override
    public Cbo removeCbo(int index) {
        if (index >= 0 && index < cboList.size()) {
            return cboList.remove(index);
        }
        return new Cbo();
    }
}
