package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A single row in a multi-field customer list (v2 format).
 */
@ApiModel(description = "A single row in a multi-field customer list (v2 format).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListRecordRow   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("external_id")
  private String externalId;

  @JsonProperty("hashed_phone_number")
  private String hashedPhoneNumber;

  @JsonProperty("hashed_pinner_id")
  private String hashedPinnerId;

  @JsonProperty("ip_address")
  private String ipAddress;

  @JsonProperty("liveramp_envelope")
  private String liverampEnvelope;

  @JsonProperty("maid")
  private String maid;

  @JsonProperty("user_agent")
  private String userAgent;

  public CustomerListRecordRow email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address (plain or hashed with SHA1, SHA256, or MD5).
   * @return email
  **/
  @ApiModelProperty(value = "Email address (plain or hashed with SHA1, SHA256, or MD5).")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerListRecordRow externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External ID identifier (not hashed).
   * @return externalId
  **/
  @ApiModelProperty(value = "External ID identifier (not hashed).")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public CustomerListRecordRow hashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
    return this;
  }

   /**
   * Hashed phone number (hashed with SHA1, SHA256, or MD5).
   * @return hashedPhoneNumber
  **/
  @ApiModelProperty(value = "Hashed phone number (hashed with SHA1, SHA256, or MD5).")
  public String getHashedPhoneNumber() {
    return hashedPhoneNumber;
  }

  public void setHashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
  }

  public CustomerListRecordRow hashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
    return this;
  }

   /**
   * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
   * @return hashedPinnerId
  **/
  @ApiModelProperty(value = "Hashed pinner ID (hashed with SHA1, SHA256, or MD5).")
  public String getHashedPinnerId() {
    return hashedPinnerId;
  }

  public void setHashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
  }

  public CustomerListRecordRow ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address (not hashed).
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address (not hashed).")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CustomerListRecordRow liverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
    return this;
  }

   /**
   * LiveRamp envelope identifier (Base64-encoded, not hashed).
   * @return liverampEnvelope
  **/
  @ApiModelProperty(value = "LiveRamp envelope identifier (Base64-encoded, not hashed).")
  public String getLiverampEnvelope() {
    return liverampEnvelope;
  }

  public void setLiverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
  }

  public CustomerListRecordRow maid(String maid) {
    this.maid = maid;
    return this;
  }

   /**
   * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
   * @return maid
  **/
  @ApiModelProperty(value = "Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).")
  public String getMaid() {
    return maid;
  }

  public void setMaid(String maid) {
    this.maid = maid;
  }

  public CustomerListRecordRow userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User agent string (not hashed).
   * @return userAgent
  **/
  @ApiModelProperty(value = "User agent string (not hashed).")
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

