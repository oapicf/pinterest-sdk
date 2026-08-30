package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single row in a multi-field customer list (v2 format).
 */
@ApiModel(description="A single row in a multi-field customer list (v2 format).")

public class CustomerListRecordRow  {
  
 /**
  * Email address (plain or hashed with SHA1, SHA256, or MD5).
  */
  @ApiModelProperty(value = "Email address (plain or hashed with SHA1, SHA256, or MD5).")

  private String email;

 /**
  * External ID identifier (not hashed).
  */
  @ApiModelProperty(value = "External ID identifier (not hashed).")

  private String externalId;

 /**
  * Hashed phone number (hashed with SHA1, SHA256, or MD5).
  */
  @ApiModelProperty(value = "Hashed phone number (hashed with SHA1, SHA256, or MD5).")

  private String hashedPhoneNumber;

 /**
  * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
  */
  @ApiModelProperty(value = "Hashed pinner ID (hashed with SHA1, SHA256, or MD5).")

  private String hashedPinnerId;

 /**
  * IP address (not hashed).
  */
  @ApiModelProperty(value = "IP address (not hashed).")

  private String ipAddress;

 /**
  * LiveRamp envelope identifier (Base64-encoded, not hashed).
  */
  @ApiModelProperty(value = "LiveRamp envelope identifier (Base64-encoded, not hashed).")

  private String liverampEnvelope;

 /**
  * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
  */
  @ApiModelProperty(value = "Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).")

  private String maid;

 /**
  * User agent string (not hashed).
  */
  @ApiModelProperty(value = "User agent string (not hashed).")

  private String userAgent;
 /**
   * Email address (plain or hashed with SHA1, SHA256, or MD5).
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerListRecordRow email(String email) {
    this.email = email;
    return this;
  }

 /**
   * External ID identifier (not hashed).
   * @return externalId
  **/
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public CustomerListRecordRow externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Hashed phone number (hashed with SHA1, SHA256, or MD5).
   * @return hashedPhoneNumber
  **/
  @JsonProperty("hashed_phone_number")
  public String getHashedPhoneNumber() {
    return hashedPhoneNumber;
  }

  public void setHashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
  }

  public CustomerListRecordRow hashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
    return this;
  }

 /**
   * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
   * @return hashedPinnerId
  **/
  @JsonProperty("hashed_pinner_id")
  public String getHashedPinnerId() {
    return hashedPinnerId;
  }

  public void setHashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
  }

  public CustomerListRecordRow hashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
    return this;
  }

 /**
   * IP address (not hashed).
   * @return ipAddress
  **/
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CustomerListRecordRow ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

 /**
   * LiveRamp envelope identifier (Base64-encoded, not hashed).
   * @return liverampEnvelope
  **/
  @JsonProperty("liveramp_envelope")
  public String getLiverampEnvelope() {
    return liverampEnvelope;
  }

  public void setLiverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
  }

  public CustomerListRecordRow liverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
    return this;
  }

 /**
   * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
   * @return maid
  **/
  @JsonProperty("maid")
  public String getMaid() {
    return maid;
  }

  public void setMaid(String maid) {
    this.maid = maid;
  }

  public CustomerListRecordRow maid(String maid) {
    this.maid = maid;
    return this;
  }

 /**
   * User agent string (not hashed).
   * @return userAgent
  **/
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public CustomerListRecordRow userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

