package mg.pendragon.prime.repository;

import java.util.Optional;
import mg.pendragon.prime.PojaGenerated;
import mg.pendragon.prime.repository.model.DummyUuid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
