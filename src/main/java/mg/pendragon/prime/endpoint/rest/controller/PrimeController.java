package mg.pendragon.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimeController {

  @GetMapping("new-prime")
  public BigInteger generatePrime() {
    BigInteger primeNumber = BigInteger.probablePrime(10000, new Random());
    return primeNumber;
  }
}
