package api.email_system.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Draft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long draftId;
    @OneToOne(fetch = FetchType.EAGER)
    private Mail emails;
}
