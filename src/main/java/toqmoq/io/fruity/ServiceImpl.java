package toqmoq.io.fruity;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements MailService {


    private final JavaMailSender javaMailSender;

    @Value("${mail.send}")
    private String sendTo;

    @Value("${spring.mail.sender.email}")
    private String sendFrom;

    @Override
    public void send(FormModel formModel) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sendFrom);
        message.setTo(sendTo);
        message.setSubject("Message from Fruity");
        message.setText(formModel.toString());
        javaMailSender.send(message);
    }
}
