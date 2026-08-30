package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.TokenGrantType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Describes the valid schema for possible OAuth access token requests.
 */
public class OauthAccessToken   {

    private String accessToken;
    private Integer expiresIn;
    private String refreshToken;
    private Integer refreshTokenExpiresAt;
    private Integer refreshTokenExpiresIn;
    private TokenGrantType responseType;
    private String scope;
    private String tokenType = "bearer";

    /**
     * Default constructor.
     */
    public OauthAccessToken() {
    // JSON-B / Jackson
    }

    /**
     * Create OauthAccessToken.
     *
     * @param accessToken accessToken
     * @param expiresIn expiresIn
     * @param refreshToken refreshToken
     * @param refreshTokenExpiresAt refreshTokenExpiresAt
     * @param refreshTokenExpiresIn refreshTokenExpiresIn
     * @param responseType responseType
     * @param scope scope
     * @param tokenType tokenType
     */
    public OauthAccessToken(
        String accessToken, 
        Integer expiresIn, 
        String refreshToken, 
        Integer refreshTokenExpiresAt, 
        Integer refreshTokenExpiresIn, 
        TokenGrantType responseType, 
        String scope, 
        String tokenType
    ) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
        this.responseType = responseType;
        this.scope = scope;
        this.tokenType = tokenType;
    }



    /**
     * Get accessToken
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Get expiresIn
     * @return expiresIn
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Get refreshToken
     * @return refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * Get refreshTokenExpiresAt
     * @return refreshTokenExpiresAt
     */
    public Integer getRefreshTokenExpiresAt() {
        return refreshTokenExpiresAt;
    }

    public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    }

    /**
     * Get refreshTokenExpiresIn
     * @return refreshTokenExpiresIn
     */
    public Integer getRefreshTokenExpiresIn() {
        return refreshTokenExpiresIn;
    }

    public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    }

    /**
     * Get responseType
     * @return responseType
     */
    public TokenGrantType getResponseType() {
        return responseType;
    }

    public void setResponseType(TokenGrantType responseType) {
        this.responseType = responseType;
    }

    /**
     * Get scope
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Get tokenType
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OauthAccessToken {\n");
        
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
        sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
        sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

