package htw.berlin.authserver.authorizationserver.persistence;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "oauth2_registered_client")
public class OAuthRegisteredClientEntity {

    @Id@GeneratedValue
    @PrimaryKeyJoinColumn
    @Column(nullable = false, length = 100)
    private String id;

    @Column(nullable = false, length = 100)
    private String client_id;

    @Column(nullable = false)
    private Timestamp client_id_issued_at = Timestamp.from(Instant.now());

    @Column(length = 200)
    private String client_secret = null;

    private Timestamp client_secret_expires_at = null;

    @Column(nullable = false, length = 200)
    private String client_name;

    @Column(nullable = false, length = 1000)
    private String client_authentication_methods;

    @Column(nullable = false, length = 1000)
    private String authorization_grant_types;

    @Column(length = 1000)
    private String redirect_uris = null;

    @Column(nullable = false, length = 1000)
    private String scopes;

    @Column(nullable = false, length = 2000)
    private String client_settings;

    @Column(nullable = false, length = 2000)
    private String token_settings;

    public OAuthRegisteredClientEntity() {
    }

    public OAuthRegisteredClientEntity(String client_id, Timestamp client_id_issued_at, String client_secret, Timestamp client_secret_expires_at, String client_name, String client_authentication_methods, String authorization_grant_types, String redirect_uris, String scopes, String client_settings, String token_settings) {
        this.client_id = client_id;
        this.client_id_issued_at = client_id_issued_at;
        this.client_secret = client_secret;
        this.client_secret_expires_at = client_secret_expires_at;
        this.client_name = client_name;
        this.client_authentication_methods = client_authentication_methods;
        this.authorization_grant_types = authorization_grant_types;
        this.redirect_uris = redirect_uris;
        this.scopes = scopes;
        this.client_settings = client_settings;
        this.token_settings = token_settings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public Timestamp getClient_id_issued_at() {
        return client_id_issued_at;
    }

    public void setClient_id_issued_at(Timestamp client_id_issued_at) {
        this.client_id_issued_at = client_id_issued_at;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public Timestamp getClient_secret_expires_at() {
        return client_secret_expires_at;
    }

    public void setClient_secret_expires_at(Timestamp client_secret_expires_at) {
        this.client_secret_expires_at = client_secret_expires_at;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_authentication_methods() {
        return client_authentication_methods;
    }

    public void setClient_authentication_methods(String client_authentication_methods) {
        this.client_authentication_methods = client_authentication_methods;
    }

    public String getAuthorization_grant_types() {
        return authorization_grant_types;
    }

    public void setAuthorization_grant_types(String authorization_grant_types) {
        this.authorization_grant_types = authorization_grant_types;
    }

    public String getRedirect_uris() {
        return redirect_uris;
    }

    public void setRedirect_uris(String redirect_uris) {
        this.redirect_uris = redirect_uris;
    }

    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public String getClient_settings() {
        return client_settings;
    }

    public void setClient_settings(String client_settings) {
        this.client_settings = client_settings;
    }

    public String getToken_settings() {
        return token_settings;
    }

    public void setToken_settings(String token_settings) {
        this.token_settings = token_settings;
    }
}
