package it.devlec.applicazionerestspring.controller;

import it.devlec.applicazionerestspring.model.Prodotto;
import it.devlec.applicazionerestspring.persistenza.ProdottiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdottoRestController {
    private static Logger logger =
            LoggerFactory.getLogger(ProdottoRestController.class);
    private ProdottiRepository repository;

    ProdottoRestController(ProdottiRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/prodotti")
    public List<Prodotto> leggiTuttiIProdotti() {
        logger.info("Prendo tutti i Prodotti");
        return repository.findAll();
    }

    @PostMapping("/prodotto")
    public Prodotto inserisciUnNuovoProdotto(@RequestBody Prodotto nuovoProdotto) {
        return repository.save(nuovoProdotto);
    }

    @PutMapping("/prodotto")
    public Prodotto aggiornaDatiProdotto(@RequestBody Prodotto prodotto) {
        return repository.save(prodotto);
    }
//    @PutMapping("/prodotto/{id}")
//    public Utente aggiornaDatiUtente(@RequestBody Prodotto prodotto, @RequestBody Prodotto nuovoProdotto, @PathVariable Long id)
//    {
//    return repository.findById(id).map(
//            //creare nuovo
//
//            nuovoProdotto -> {
//        nuovoProdotto.setNome(prodotto.getNome());
//        return repository.save(nuovoProdotto);
//        }
//        ).orElseGet(
//                () -> {
//        //l'utente esiste
//        prodotto.setId(id);
//        return repository.save(prodotto);
//    }
//        );
//    }

    @DeleteMapping("/prodotto/{id}")
    void eliminaProdotto(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
