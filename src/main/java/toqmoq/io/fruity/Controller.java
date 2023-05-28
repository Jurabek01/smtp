package toqmoq.io.fruity;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/email")
public class Controller {

    private final MailService mailService;

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody FormModel formModel) {
        mailService.send(formModel);
        return ResponseEntity.ok().build();
    }
}
