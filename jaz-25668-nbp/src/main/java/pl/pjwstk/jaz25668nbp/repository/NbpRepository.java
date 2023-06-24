package pl.pjwstk.jaz25668nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjwstk.jaz25668nbp.model.NbpEntity;


@Repository
public interface NbpRepository extends JpaRepository<NbpEntity, Long> {

}
