package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsCreateReportResponse   {

    private String token;

    /**
     * Default constructor.
     */
    public CatalogsCreateReportResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreateReportResponse.
     *
     * @param token Token to be used to get the report
     */
    public CatalogsCreateReportResponse(
        String token
    ) {
        this.token = token;
    }



    /**
     * Token to be used to get the report
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreateReportResponse {\n");
        
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

