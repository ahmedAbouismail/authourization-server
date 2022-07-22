package htw.berlin.authserver.authorizationserver.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "oauth2_authorization")
public class OAuth2AuthorizationEntity {

    @Id@GeneratedValue@PrimaryKeyJoinColumn
    @Column(nullable = false, length = 100)
    private String id;

    @Column(nullable = false, length = 100)
    private String registered_client_id;

    @Column(nullable = false, length = 200)
    private String principal_name;

    @Column(nullable = false, length = 100)
    private String authorization_grant_type;

    @Column(length=100000)
    private byte[] attributes = null;

    @Column(length = 500)
    private String state = null;

    @Column(length = 100000)
    private byte[] authorization_code_value = null;

    private Timestamp authorization_code_issued_at = null;

    private Timestamp authorization_code_expires_at = null;

    @Column(length = 100000)
    private byte[] authorization_code_metadata = null;

    @Column(length = 100000)
    private byte[] access_token_value = null;

    private Timestamp access_token_issued_at = null;

    private  Timestamp access_token_expires_at = null;

    @Column(length = 100000)
    private byte[] access_token_metadata = null;


    @Column(length = 100)
    private String access_token_type = null;

    @Column(length = 1000)
    private String access_token_scopes = null;

    @Column(length = 100000)
    private byte[] oidc_id_token_value = null;

    private Timestamp oidc_id_token_issued_at = null;

    private Timestamp oidc_id_token_expires_at = null;

    @Column(length = 100000)
    private byte[] oidc_id_token_metadata = null;

    @Column(length = 100000)
    private byte[] refresh_token_value = null;

    private Timestamp refresh_token_issued_at = null;

    private Timestamp refresh_token_expires_at = null;

    @Column(length = 100000)
    private byte[] refresh_token_metadata = null;

    public OAuth2AuthorizationEntity() {
    }

    public OAuth2AuthorizationEntity(String registered_client_id, String principal_name, String authorization_grant_type, byte[] attributes, String state, byte[] authorization_code_value, Timestamp authorization_code_issued_at, Timestamp authorization_code_expires_at, byte[] authorization_code_metadata, byte[] access_token_value, Timestamp access_token_issued_at, Timestamp access_token_expires_at, byte[] access_token_metadata, String access_token_type, String access_token_scopes, byte[] oidc_id_token_value, Timestamp oidc_id_token_issued_at, Timestamp oidc_id_token_expires_at, byte[] oidc_id_token_metadata, byte[] refresh_token_value, Timestamp refresh_token_issued_at, Timestamp refresh_token_expires_at, byte[] refresh_token_metadata) {
        this.registered_client_id = registered_client_id;
        this.principal_name = principal_name;
        this.authorization_grant_type = authorization_grant_type;
        this.attributes = attributes;
        this.state = state;
        this.authorization_code_value = authorization_code_value;
        this.authorization_code_issued_at = authorization_code_issued_at;
        this.authorization_code_expires_at = authorization_code_expires_at;
        this.authorization_code_metadata = authorization_code_metadata;
        this.access_token_value = access_token_value;
        this.access_token_issued_at = access_token_issued_at;
        this.access_token_expires_at = access_token_expires_at;
        this.access_token_metadata = access_token_metadata;
        this.access_token_type = access_token_type;
        this.access_token_scopes = access_token_scopes;
        this.oidc_id_token_value = oidc_id_token_value;
        this.oidc_id_token_issued_at = oidc_id_token_issued_at;
        this.oidc_id_token_expires_at = oidc_id_token_expires_at;
        this.oidc_id_token_metadata = oidc_id_token_metadata;
        this.refresh_token_value = refresh_token_value;
        this.refresh_token_issued_at = refresh_token_issued_at;
        this.refresh_token_expires_at = refresh_token_expires_at;
        this.refresh_token_metadata = refresh_token_metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistered_client_id() {
        return registered_client_id;
    }

    public void setRegistered_client_id(String registered_client_id) {
        this.registered_client_id = registered_client_id;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    public String getAuthorization_grant_type() {
        return authorization_grant_type;
    }

    public void setAuthorization_grant_type(String authorization_grant_type) {
        this.authorization_grant_type = authorization_grant_type;
    }

    public byte[] getAttributes() {
        return attributes;
    }

    public void setAttributes(byte[] attributes) {
        this.attributes = attributes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public byte[] getAuthorization_code_value() {
        return authorization_code_value;
    }

    public void setAuthorization_code_value(byte[] authorization_code_value) {
        this.authorization_code_value = authorization_code_value;
    }

    public Timestamp getAuthorization_code_issued_at() {
        return authorization_code_issued_at;
    }

    public void setAuthorization_code_issued_at(Timestamp authorization_code_issued_at) {
        this.authorization_code_issued_at = authorization_code_issued_at;
    }

    public Timestamp getAuthorization_code_expires_at() {
        return authorization_code_expires_at;
    }

    public void setAuthorization_code_expires_at(Timestamp authorization_code_expires_at) {
        this.authorization_code_expires_at = authorization_code_expires_at;
    }

    public byte[] getAuthorization_code_metadata() {
        return authorization_code_metadata;
    }

    public void setAuthorization_code_metadata(byte[] authorization_code_metadata) {
        this.authorization_code_metadata = authorization_code_metadata;
    }

    public byte[] getAccess_token_value() {
        return access_token_value;
    }

    public void setAccess_token_value(byte[] access_token_value) {
        this.access_token_value = access_token_value;
    }

    public Timestamp getAccess_token_issued_at() {
        return access_token_issued_at;
    }

    public void setAccess_token_issued_at(Timestamp access_token_issued_at) {
        this.access_token_issued_at = access_token_issued_at;
    }

    public Timestamp getAccess_token_expires_at() {
        return access_token_expires_at;
    }

    public void setAccess_token_expires_at(Timestamp access_token_expires_at) {
        this.access_token_expires_at = access_token_expires_at;
    }

    public byte[] getAccess_token_metadata() {
        return access_token_metadata;
    }

    public void setAccess_token_metadata(byte[] access_token_metadata) {
        this.access_token_metadata = access_token_metadata;
    }

    public String getAccess_token_type() {
        return access_token_type;
    }

    public void setAccess_token_type(String access_token_type) {
        this.access_token_type = access_token_type;
    }

    public String getAccess_token_scopes() {
        return access_token_scopes;
    }

    public void setAccess_token_scopes(String access_token_scopes) {
        this.access_token_scopes = access_token_scopes;
    }

    public byte[] getOidc_id_token_value() {
        return oidc_id_token_value;
    }

    public void setOidc_id_token_value(byte[] oidc_id_token_value) {
        this.oidc_id_token_value = oidc_id_token_value;
    }

    public Timestamp getOidc_id_token_issued_at() {
        return oidc_id_token_issued_at;
    }

    public void setOidc_id_token_issued_at(Timestamp oidc_id_token_issued_at) {
        this.oidc_id_token_issued_at = oidc_id_token_issued_at;
    }

    public Timestamp getOidc_id_token_expires_at() {
        return oidc_id_token_expires_at;
    }

    public void setOidc_id_token_expires_at(Timestamp oidc_id_token_expires_at) {
        this.oidc_id_token_expires_at = oidc_id_token_expires_at;
    }

    public byte[] getOidc_id_token_metadata() {
        return oidc_id_token_metadata;
    }

    public void setOidc_id_token_metadata(byte[] oidc_id_token_metadata) {
        this.oidc_id_token_metadata = oidc_id_token_metadata;
    }

    public byte[] getRefresh_token_value() {
        return refresh_token_value;
    }

    public void setRefresh_token_value(byte[] refresh_token_value) {
        this.refresh_token_value = refresh_token_value;
    }

    public Timestamp getRefresh_token_issued_at() {
        return refresh_token_issued_at;
    }

    public void setRefresh_token_issued_at(Timestamp refresh_token_issued_at) {
        this.refresh_token_issued_at = refresh_token_issued_at;
    }

    public Timestamp getRefresh_token_expires_at() {
        return refresh_token_expires_at;
    }

    public void setRefresh_token_expires_at(Timestamp refresh_token_expires_at) {
        this.refresh_token_expires_at = refresh_token_expires_at;
    }

    public byte[] getRefresh_token_metadata() {
        return refresh_token_metadata;
    }

    public void setRefresh_token_metadata(byte[] refresh_token_metadata) {
        this.refresh_token_metadata = refresh_token_metadata;
    }
}
