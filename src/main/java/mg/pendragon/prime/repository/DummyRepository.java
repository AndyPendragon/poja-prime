package mg.pendragon.prime.repository;

import java.util.List;
import mg.pendragon.prime.PojaGenerated;
import mg.pendragon.prime.repository.model.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
