package lt.vtvpmc.invoice.saskaituvaldymas.controllers;


import lt.vtvpmc.invoice.saskaituvaldymas.models.Prekes;
import lt.vtvpmc.invoice.saskaituvaldymas.services.PrekesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(value = "/api/prekes")
public class PrekesController
{
    private PrekesService prekesService;

    public PrekesController(PrekesService prekesService)
    {
        super();
        this.prekesService = prekesService;
    };

    @RequestMapping(path = "/{get}",method = RequestMethod.GET)
    public List<Prekes> getPrekes()
    {
        return this.prekesService.getPrekes();
    }

    @RequestMapping(path = "/{post}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createPrekes(@RequestBody @Valid final Prekes prekes) {
        this.prekesService.createPreke(prekes);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePreke(@PathVariable Long id) {
        this.prekesService.deletePreke(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updatePreke(@PathVariable Long id,@RequestBody Prekes prekes) {
        this.prekesService.updatePreke(id, prekes);
    }
}