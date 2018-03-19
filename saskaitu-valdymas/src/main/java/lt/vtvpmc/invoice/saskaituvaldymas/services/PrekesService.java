package lt.vtvpmc.invoice.saskaituvaldymas.services;

import lt.vtvpmc.invoice.saskaituvaldymas.models.Prekes;
import lt.vtvpmc.invoice.saskaituvaldymas.repositories.PrekesRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class PrekesService
{
    private PrekesRepository prekesRepository;

    public PrekesService(PrekesRepository prekesRepository)
    {
        super();
        this.prekesRepository = prekesRepository;
    }

    @Transactional
    public List<Prekes> getPrekes()
    {
        return prekesRepository.findAll();
    }

    @Transactional
    public void createPreke(Prekes prekes)
    {
        prekesRepository.save(prekes);
    }

    @Transactional
    public void deletePreke(Long id)
    {
        prekesRepository.deleteById(id);
    }

    @Transactional
    public void updatePreke(Long id, Prekes prekes)
    {
        prekesRepository.save(prekes);
    }
}