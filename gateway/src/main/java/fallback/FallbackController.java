package fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/userFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("USER-MGMT-SERVICE is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/accountFallback")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("ACCOUNT-MGMT-SERVICE is taking too long to respond or is down. Please try again later");
    }
}
