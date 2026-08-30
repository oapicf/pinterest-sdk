package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A single row in a multi-field customer list (v2 format).
 */
public class CustomerListRecordRow implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Email address (plain or hashed with SHA1, SHA256, or MD5).
   */
  @JsonProperty("email")
  private String email;

  /**
   * External ID identifier (not hashed).
   */
  @JsonProperty("external_id")
  private String externalId;

  /**
   * Hashed phone number (hashed with SHA1, SHA256, or MD5).
   */
  @JsonProperty("hashed_phone_number")
  private String hashedPhoneNumber;

  /**
   * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
   */
  @JsonProperty("hashed_pinner_id")
  private String hashedPinnerId;

  /**
   * IP address (not hashed).
   */
  @JsonProperty("ip_address")
  private String ipAddress;

  /**
   * LiveRamp envelope identifier (Base64-encoded, not hashed).
   */
  @JsonProperty("liveramp_envelope")
  private String liverampEnvelope;

  /**
   * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
   */
  @JsonProperty("maid")
  private String maid;

  /**
   * User agent string (not hashed).
   */
  @JsonProperty("user_agent")
  private String userAgent;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListRecordRow customerListRecordRow = (CustomerListRecordRow) o;
    return Objects.equals(this.email, customerListRecordRow.email) &&
        Objects.equals(this.externalId, customerListRecordRow.externalId) &&
        Objects.equals(this.hashedPhoneNumber, customerListRecordRow.hashedPhoneNumber) &&
        Objects.equals(this.hashedPinnerId, customerListRecordRow.hashedPinnerId) &&
        Objects.equals(this.ipAddress, customerListRecordRow.ipAddress) &&
        Objects.equals(this.liverampEnvelope, customerListRecordRow.liverampEnvelope) &&
        Objects.equals(this.maid, customerListRecordRow.maid) &&
        Objects.equals(this.userAgent, customerListRecordRow.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, externalId, hashedPhoneNumber, hashedPinnerId, ipAddress, liverampEnvelope, maid, userAgent);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
