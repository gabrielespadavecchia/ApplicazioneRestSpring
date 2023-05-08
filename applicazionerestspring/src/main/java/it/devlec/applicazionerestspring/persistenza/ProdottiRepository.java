package it.devlec.applicazionerestspring.persistenza;

import it.devlec.applicazionerestspring.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdottiRepository extends JpaRepository<Prodotto, Long>  {
}
