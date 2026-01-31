package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserWebsiteSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UserWebsiteSummary {

  private @Nullable String status;

  private @Nullable String verifiedAt;

  private @Nullable String website;

  public UserWebsiteSummary status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the verification process
   * @return status
   */
  
  @Schema(name = "status", example = "success", description = "Status of the verification process", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public UserWebsiteSummary verifiedAt(@Nullable String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   * @return verifiedAt
   */
  
  @Schema(name = "verified_at", example = "2022-12-14T21:03:01.602000", description = "UTC timestamp when the verification happened - sometimes missing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified_at")
  public @Nullable String getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(@Nullable String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  public UserWebsiteSummary website(@Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Website with path or domain only
   * @return website
   */
  
  @Schema(name = "website", example = "mysite.test", description = "Website with path or domain only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public @Nullable String getWebsite() {
    return website;
  }

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
    UserWebsiteSummary userWebsiteSummary = (UserWebsiteSummary) o;
    return Objects.equals(this.status, userWebsiteSummary.status) &&
        Objects.equals(this.verifiedAt, userWebsiteSummary.verifiedAt) &&
        Objects.equals(this.website, userWebsiteSummary.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verifiedAt, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteSummary {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

