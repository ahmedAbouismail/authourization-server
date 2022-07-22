package htw.berlin.authserver.authorizationserver.persistence;

import javax.persistence.*;

@Entity
@Table(name = "oauth2_authorization_consent")
public class OAuth2AuthorizationConsentEntity {

    @Id
    @Column(nullable = false, length = 100)
    @PrimaryKeyJoinColumn
    private String registered_client_id;

    @Column(nullable = true, length = 200)
    @PrimaryKeyJoinColumn
    private String principal_name;

    @Column(nullable = false, length = 1000)
    private String authorities;
}
