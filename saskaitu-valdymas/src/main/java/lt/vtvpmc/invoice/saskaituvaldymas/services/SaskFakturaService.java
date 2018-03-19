package lt.vtvpmc.invoice.saskaituvaldymas.services;

import lt.vtvpmc.invoice.saskaituvaldymas.models.SaskFaktura;
import lt.vtvpmc.invoice.saskaituvaldymas.repositories.SaskFakturaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaskFakturaService {

    private SaskFakturaRepository saskFakturaRepository;

    public SaskFakturaService(SaskFakturaRepository saskFakturaRepository) {
        super();
        this.saskFakturaRepository = saskFakturaRepository;
    }

    @Transactional(readOnly = true)
    public List<SaskFaktura> getSaskFaktura() {
        return saskFakturaRepository.findAll();
    }

    @Transactional
    public void createSaskFaktura(SaskFaktura saskFaktura) {
        saskFakturaRepository.save(saskFaktura);
    }

    @Transactional
    public void deleteSaskFaktura(Long id) {
        saskFakturaRepository.deleteById(id);
    }

    @Transactional
    public void updateSaskFaktura(Long id, SaskFaktura saskFaktura) {
        saskFakturaRepository.save(saskFaktura);
    }
}

    