package mg.pendragon.prime.service.event;

import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mg.pendragon.prime.PojaGenerated;
import mg.pendragon.prime.endpoint.event.gen.UuidCreated;
import mg.pendragon.prime.repository.DummyUuidRepository;
import mg.pendragon.prime.repository.model.DummyUuid;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
