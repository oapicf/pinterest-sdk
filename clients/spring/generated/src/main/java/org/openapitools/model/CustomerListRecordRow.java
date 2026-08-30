package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A single row in a multi-field customer list (v2 format).
 */

@Schema(name = "CustomerListRecordRow", description = "A single row in a multi-field customer list (v2 format).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListRecordRow {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String email;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String externalId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String hashedPhoneNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String hashedPinnerId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String ipAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String liverampEnvelope;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String maid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String userAgent;

  public CustomerListRecordRow email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address (plain or hashed with SHA1, SHA256, or MD5).
   * @return email
   */
  
  @Schema(name = "email", description = "Email address (plain or hashed with SHA1, SHA256, or MD5).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public CustomerListRecordRow externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External ID identifier (not hashed).
   * @return externalId
   */
  
  @Schema(name = "external_id", description = "External ID identifier (not hashed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public @Nullable String getExternalId() {
    return externalId;
  }

  @JsonProperty("external_id")
  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public CustomerListRecordRow hashedPhoneNumber(@Nullable String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
    return this;
  }

  /**
   * Hashed phone number (hashed with SHA1, SHA256, or MD5).
   * @return hashedPhoneNumber
   */
  
  @Schema(name = "hashed_phone_number", description = "Hashed phone number (hashed with SHA1, SHA256, or MD5).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashed_phone_number")
  public @Nullable String getHashedPhoneNumber() {
    return hashedPhoneNumber;
  }

  @JsonProperty("hashed_phone_number")
  public void setHashedPhoneNumber(@Nullable String hashedPhoneNumber) {
    this.hashedPhoneNumber = hashedPhoneNumber;
  }

  public CustomerListRecordRow hashedPinnerId(@Nullable String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
    return this;
  }

  /**
   * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
   * @return hashedPinnerId
   */
  
  @Schema(name = "hashed_pinner_id", description = "Hashed pinner ID (hashed with SHA1, SHA256, or MD5).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashed_pinner_id")
  public @Nullable String getHashedPinnerId() {
    return hashedPinnerId;
  }

  @JsonProperty("hashed_pinner_id")
  public void setHashedPinnerId(@Nullable String hashedPinnerId) {
    this.hashedPinnerId = hashedPinnerId;
  }

  public CustomerListRecordRow ipAddress(@Nullable String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IP address (not hashed).
   * @return ipAddress
   */
  
  @Schema(name = "ip_address", description = "IP address (not hashed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip_address")
  public @Nullable String getIpAddress() {
    return ipAddress;
  }

  @JsonProperty("ip_address")
  public void setIpAddress(@Nullable String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CustomerListRecordRow liverampEnvelope(@Nullable String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
    return this;
  }

  /**
   * LiveRamp envelope identifier (Base64-encoded, not hashed).
   * @return liverampEnvelope
   */
  
  @Schema(name = "liveramp_envelope", description = "LiveRamp envelope identifier (Base64-encoded, not hashed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liveramp_envelope")
  public @Nullable String getLiverampEnvelope() {
    return liverampEnvelope;
  }

  @JsonProperty("liveramp_envelope")
  public void setLiverampEnvelope(@Nullable String liverampEnvelope) {
    this.liverampEnvelope = liverampEnvelope;
  }

  public CustomerListRecordRow maid(@Nullable String maid) {
    this.maid = maid;
    return this;
  }

  /**
   * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
   * @return maid
   */
  
  @Schema(name = "maid", description = "Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maid")
  public @Nullable String getMaid() {
    return maid;
  }

  @JsonProperty("maid")
  public void setMaid(@Nullable String maid) {
    this.maid = maid;
  }

  public CustomerListRecordRow userAgent(@Nullable String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * User agent string (not hashed).
   * @return userAgent
   */
  
  @Schema(name = "user_agent", description = "User agent string (not hashed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_agent")
  public @Nullable String getUserAgent() {
    return userAgent;
  }

  @JsonProperty("user_agent")
  public void setUserAgent(@Nullable String userAgent) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

