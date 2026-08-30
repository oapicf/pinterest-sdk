package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MediaUploadParameters   {

    private String contentType;
    private String key;
    private String policy;
    private String xAmzAlgorithm;
    private String xAmzCredential;
    private String xAmzDate;
    private String xAmzSecurityToken;
    private String xAmzSignature;

    /**
     * Default constructor.
     */
    public MediaUploadParameters() {
    // JSON-B / Jackson
    }

    /**
     * Create MediaUploadParameters.
     *
     * @param contentType contentType
     * @param key key
     * @param policy policy
     * @param xAmzAlgorithm xAmzAlgorithm
     * @param xAmzCredential xAmzCredential
     * @param xAmzDate xAmzDate
     * @param xAmzSecurityToken xAmzSecurityToken
     * @param xAmzSignature xAmzSignature
     */
    public MediaUploadParameters(
        String contentType, 
        String key, 
        String policy, 
        String xAmzAlgorithm, 
        String xAmzCredential, 
        String xAmzDate, 
        String xAmzSecurityToken, 
        String xAmzSignature
    ) {
        this.contentType = contentType;
        this.key = key;
        this.policy = policy;
        this.xAmzAlgorithm = xAmzAlgorithm;
        this.xAmzCredential = xAmzCredential;
        this.xAmzDate = xAmzDate;
        this.xAmzSecurityToken = xAmzSecurityToken;
        this.xAmzSignature = xAmzSignature;
    }



    /**
     * Get contentType
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Get policy
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * Get xAmzAlgorithm
     * @return xAmzAlgorithm
     */
    public String getxAmzAlgorithm() {
        return xAmzAlgorithm;
    }

    public void setxAmzAlgorithm(String xAmzAlgorithm) {
        this.xAmzAlgorithm = xAmzAlgorithm;
    }

    /**
     * Get xAmzCredential
     * @return xAmzCredential
     */
    public String getxAmzCredential() {
        return xAmzCredential;
    }

    public void setxAmzCredential(String xAmzCredential) {
        this.xAmzCredential = xAmzCredential;
    }

    /**
     * Get xAmzDate
     * @return xAmzDate
     */
    public String getxAmzDate() {
        return xAmzDate;
    }

    public void setxAmzDate(String xAmzDate) {
        this.xAmzDate = xAmzDate;
    }

    /**
     * Get xAmzSecurityToken
     * @return xAmzSecurityToken
     */
    public String getxAmzSecurityToken() {
        return xAmzSecurityToken;
    }

    public void setxAmzSecurityToken(String xAmzSecurityToken) {
        this.xAmzSecurityToken = xAmzSecurityToken;
    }

    /**
     * Get xAmzSignature
     * @return xAmzSignature
     */
    public String getxAmzSignature() {
        return xAmzSignature;
    }

    public void setxAmzSignature(String xAmzSignature) {
        this.xAmzSignature = xAmzSignature;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaUploadParameters {\n");
        
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    xAmzAlgorithm: ").append(toIndentedString(xAmzAlgorithm)).append("\n");
        sb.append("    xAmzCredential: ").append(toIndentedString(xAmzCredential)).append("\n");
        sb.append("    xAmzDate: ").append(toIndentedString(xAmzDate)).append("\n");
        sb.append("    xAmzSecurityToken: ").append(toIndentedString(xAmzSecurityToken)).append("\n");
        sb.append("    xAmzSignature: ").append(toIndentedString(xAmzSignature)).append("\n");
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

