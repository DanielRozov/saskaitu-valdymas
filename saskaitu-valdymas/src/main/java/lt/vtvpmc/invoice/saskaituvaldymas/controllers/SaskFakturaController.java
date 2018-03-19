package lt.vtvpmc.invoice.saskaituvaldymas.controllers;
import lt.vtvpmc.invoice.saskaituvaldymas.models.SaskFaktura;
import lt.vtvpmc.invoice.saskaituvaldymas.services.SaskFakturaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/saskaitafaktura")
public class SaskFakturaController {

    private SaskFakturaService saskFakturaService;

    public SaskFakturaController(SaskFakturaService saskFakturaService) {
        super();
        this.saskFakturaService = saskFakturaService;
    }

    @RequestMapping(path = "/{get}",method = RequestMethod.GET)
    public List<SaskFaktura> getSaskFaktura(){
        return this.saskFakturaService.getSaskFaktura();
    }

    @RequestMapping(path = "/{post}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createSaskFaktura(@RequestBody @Valid final SaskFaktura saskFaktura) {
        this.saskFakturaService.createSaskFaktura(saskFaktura);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSaskFaktura(@PathVariable Long id) {
        this.saskFakturaService.deleteSaskFaktura(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateSaskaitFaktura(@PathVariable Long id,@RequestBody SaskFaktura saskFaktura) {
        this.saskFakturaService.updateSaskFaktura(id, saskFaktura);
    }

}