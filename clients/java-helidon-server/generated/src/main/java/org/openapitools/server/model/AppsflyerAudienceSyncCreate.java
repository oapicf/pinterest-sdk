package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class AppsflyerAudienceSyncCreate   {

    private String containerId;
    private String urlAdidSha256;
    private String urlEmailSha256;

    /**
     * Default constructor.
     */
    public AppsflyerAudienceSyncCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AppsflyerAudienceSyncCreate.
     *
     * @param containerId The container ID of the audience
     * @param urlAdidSha256 The pre-signed URL for SHA256 hashed GAID/IDFA file
     * @param urlEmailSha256 The pre-signed URL for SHA256 hashed email file
     */
    public AppsflyerAudienceSyncCreate(
        String containerId, 
        String urlAdidSha256, 
        String urlEmailSha256
    ) {
        this.containerId = containerId;
        this.urlAdidSha256 = urlAdidSha256;
        this.urlEmailSha256 = urlEmailSha256;
    }



    /**
     * The container ID of the audience
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    /**
     * The pre-signed URL for SHA256 hashed GAID/IDFA file
     * @return urlAdidSha256
     */
    public String getUrlAdidSha256() {
        return urlAdidSha256;
    }

    public void setUrlAdidSha256(String urlAdidSha256) {
        this.urlAdidSha256 = urlAdidSha256;
    }

    /**
     * The pre-signed URL for SHA256 hashed email file
     * @return urlEmailSha256
     */
    public String getUrlEmailSha256() {
        return urlEmailSha256;
    }

    public void setUrlEmailSha256(String urlEmailSha256) {
        this.urlEmailSha256 = urlEmailSha256;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsflyerAudienceSyncCreate {\n");
        
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    urlAdidSha256: ").append(toIndentedString(urlAdidSha256)).append("\n");
        sb.append("    urlEmailSha256: ").append(toIndentedString(urlEmailSha256)).append("\n");
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

