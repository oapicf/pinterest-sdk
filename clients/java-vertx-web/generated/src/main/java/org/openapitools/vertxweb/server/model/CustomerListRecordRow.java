package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single row in a multi-field customer list (v2 format).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListRecordRow   {
  
  private String email;
  private String externalId;
  private String hashedPhoneNumber;
  private String hashedPinnerId;
  private String ipAddress;
  private String liverampEnvelope;
  private String maid;
  private String userAgent;

  public CustomerListRecordRow () {

  }

  public CustomerListRecordRow (String email, String externalId, String hashedPhoneNumber, String hashedPinnerId, String ipAddress, String liverampEnvelope, String maid, String userAgent) {
    this.email = email;
    this.externalId = externalId;
    this.hashedPhoneNumber = hashedPhoneNumber;
    this.hashedPinnerId = hashedPinnerId;
    this.ipAddress = ipAddress;
    this.liverampEnvelope = liverampEnvelope;
    this.maid = maid;
    this.userAgent = userAgent;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("hashed_phone_number")
  public String getHashedPhoneNumber() {
    return hashedPhoneNumber;
  }
  public void setHashedPhoneNumber(String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
  }

    
  @JsonProperty("hashed_pinner_id")
  public String getHashedPinnerId() {
    return hashedPinnerId;
  }
  public void setHashedPinnerId(String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
  }

    
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

    
  @JsonProperty("liveramp_envelope")
  public String getLiverampEnvelope() {
    return liverampEnvelope;
  }
  public void setLiverampEnvelope(String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
  }

    
  @JsonProperty("maid")
  public String getMaid() {
    return maid;
  }
  public void setMaid(String maid) {
    this.maid = maid;
  }

    
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
