package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A single row in a multi-field customer list (v2 format).
 **/

@ApiModel(description = "A single row in a multi-field customer list (v2 format).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * Email address (plain or hashed with SHA1, SHA256, or MD5).
   **/
  public CustomerListRecordRow email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "Email address (plain or hashed with SHA1, SHA256, or MD5).")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * External ID identifier (not hashed).
   **/
  public CustomerListRecordRow externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(value = "External ID identifier (not hashed).")
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Hashed phone number (hashed with SHA1, SHA256, or MD5).
   **/
  public CustomerListRecordRow hashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Hashed phone number (hashed with SHA1, SHA256, or MD5).")
  @JsonProperty("hashed_phone_number")
  public String getHashedPhoneNumber() {
    return hashedPhoneNumber;
  }
  public void setHashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
  }

  /**
   * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
   **/
  public CustomerListRecordRow hashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
    return this;
  }

  
  @ApiModelProperty(value = "Hashed pinner ID (hashed with SHA1, SHA256, or MD5).")
  @JsonProperty("hashed_pinner_id")
  public String getHashedPinnerId() {
    return hashedPinnerId;
  }
  public void setHashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
  }

  /**
   * IP address (not hashed).
   **/
  public CustomerListRecordRow ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @ApiModelProperty(value = "IP address (not hashed).")
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * LiveRamp envelope identifier (Base64-encoded, not hashed).
   **/
  public CustomerListRecordRow liverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
    return this;
  }

  
  @ApiModelProperty(value = "LiveRamp envelope identifier (Base64-encoded, not hashed).")
  @JsonProperty("liveramp_envelope")
  public String getLiverampEnvelope() {
    return liverampEnvelope;
  }
  public void setLiverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
  }

  /**
   * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
   **/
  public CustomerListRecordRow maid(String maid) {
    this.maid = maid;
    return this;
  }

  
  @ApiModelProperty(value = "Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).")
  @JsonProperty("maid")
  public String getMaid() {
    return maid;
  }
  public void setMaid(String maid) {
    this.maid = maid;
  }

  /**
   * User agent string (not hashed).
   **/
  public CustomerListRecordRow userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(value = "User agent string (not hashed).")
  @JsonProperty("user_agent")
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
    return Objects.equals(email, customerListRecordRow.email) &&
        Objects.equals(externalId, customerListRecordRow.externalId) &&
        Objects.equals(hashedPhoneNumber, customerListRecordRow.hashedPhoneNumber) &&
        Objects.equals(hashedPinnerId, customerListRecordRow.hashedPinnerId) &&
        Objects.equals(ipAddress, customerListRecordRow.ipAddress) &&
        Objects.equals(liverampEnvelope, customerListRecordRow.liverampEnvelope) &&
        Objects.equals(maid, customerListRecordRow.maid) &&
        Objects.equals(userAgent, customerListRecordRow.userAgent);
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

