package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A single row in a multi-field customer list (v2 format).
 */
public class CustomerListRecordRow   {

    private String email;
    private String externalId;
    private String hashedPhoneNumber;
    private String hashedPinnerId;
    private String ipAddress;
    private String liverampEnvelope;
    private String maid;
    private String userAgent;

    /**
     * Default constructor.
     */
    public CustomerListRecordRow() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListRecordRow.
     *
     * @param email Email address (plain or hashed with SHA1, SHA256, or MD5).
     * @param externalId External ID identifier (not hashed).
     * @param hashedPhoneNumber Hashed phone number (hashed with SHA1, SHA256, or MD5).
     * @param hashedPinnerId Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
     * @param ipAddress IP address (not hashed).
     * @param liverampEnvelope LiveRamp envelope identifier (Base64-encoded, not hashed).
     * @param maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
     * @param userAgent User agent string (not hashed).
     */
    public CustomerListRecordRow(
        String email, 
        String externalId, 
        String hashedPhoneNumber, 
        String hashedPinnerId, 
        String ipAddress, 
        String liverampEnvelope, 
        String maid, 
        String userAgent
    ) {
        this.email = email;
        this.externalId = externalId;
        this.hashedPhoneNumber = hashedPhoneNumber;
        this.hashedPinnerId = hashedPinnerId;
        this.ipAddress = ipAddress;
        this.liverampEnvelope = liverampEnvelope;
        this.maid = maid;
        this.userAgent = userAgent;
    }



    /**
     * Email address (plain or hashed with SHA1, SHA256, or MD5).
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * External ID identifier (not hashed).
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Hashed phone number (hashed with SHA1, SHA256, or MD5).
     * @return hashedPhoneNumber
     */
    public String getHashedPhoneNumber() {
        return hashedPhoneNumber;
    }

    public void setHashedPhoneNumber(String hashedPhoneNumber) {
        this.hashedPhoneNumber = hashedPhoneNumber;
    }

    /**
     * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
     * @return hashedPinnerId
     */
    public String getHashedPinnerId() {
        return hashedPinnerId;
    }

    public void setHashedPinnerId(String hashedPinnerId) {
        this.hashedPinnerId = hashedPinnerId;
    }

    /**
     * IP address (not hashed).
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * LiveRamp envelope identifier (Base64-encoded, not hashed).
     * @return liverampEnvelope
     */
    public String getLiverampEnvelope() {
        return liverampEnvelope;
    }

    public void setLiverampEnvelope(String liverampEnvelope) {
        this.liverampEnvelope = liverampEnvelope;
    }

    /**
     * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
     * @return maid
     */
    public String getMaid() {
        return maid;
    }

    public void setMaid(String maid) {
        this.maid = maid;
    }

    /**
     * User agent string (not hashed).
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerListRecordRow {\n");
        
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    hashedPhoneNumber: ").append(toIndentedString(hashedPhoneNumber)).append("\n");
        sb.append("    hashedPinnerId: ").append(toIndentedString(hashedPinnerId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    liverampEnvelope: ").append(toIndentedString(liverampEnvelope)).append("\n");
        sb.append("    maid: ").append(toIndentedString(maid)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

