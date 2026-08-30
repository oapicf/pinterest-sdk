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
 * UserWebsite
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsite {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String verifiedAt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String website;

  public UserWebsite status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the verification process
   * @return status
   */
  
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Status of the verification process", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public UserWebsite verifiedAt(@Nullable String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
   */
  
  @Schema(name = "verified_at", accessMode = Schema.AccessMode.READ_ONLY, description = "UTC timestamp when the verification happened - sometimes missing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified_at")
  public @Nullable String getVerifiedAt() {
    return verifiedAt;
  }

  @JsonProperty("verified_at")
  public void setVerifiedAt(@Nullable String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  public UserWebsite website(@Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Website with path or domain only
   * @return website
   */
  
  @Schema(name = "website", description = "Website with path or domain only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public @Nullable String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(@Nullable String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsite userWebsite = (UserWebsite) o;
    return Objects.equals(this.status, userWebsite.status) &&
        Objects.equals(this.verifiedAt, userWebsite.verifiedAt) &&
        Objects.equals(this.website, userWebsite.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verifiedAt, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsite {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

