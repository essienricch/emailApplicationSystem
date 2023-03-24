package api.email_system.emailSystem.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subject;
    private String body;
    @OneToOne(cascade = CascadeType.ALL)
    private Sender sender;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Recipient> recipients;

    private String attachment;

}
