package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A successful conversion access token response.
 */
public class ConversionAccessToken   {

    private String accessToken;
    private String tokenType = "conversion";

    /**
     * Default constructor.
     */
    public ConversionAccessToken() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionAccessToken.
     *
     * @param accessToken accessToken
     * @param tokenType tokenType
     */
    public ConversionAccessToken(
        String accessToken, 
        String tokenType
    ) {
        this.accessToken = accessToken;
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
        sb.append("class ConversionAccessToken {\n");
        
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

