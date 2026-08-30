package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.WebsiteVerificationMethod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "UserWebsiteCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable WebsiteVerificationMethod verificationMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String website;

  public UserWebsiteCreate verificationMethod(@Nullable WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  /**
   * Method used to verify website ownership.
   * @return verificationMethod
   */
  @Valid 
  @Schema(name = "verification_method", description = "Method used to verify website ownership.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_method")
  public @Nullable WebsiteVerificationMethod getVerificationMethod() {
    return verificationMethod;
  }

  @JsonProperty("verification_method")
  public void setVerificationMethod(@Nullable WebsiteVerificationMethod verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  public UserWebsiteCreate website(@Nullable String website) {
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
    UserWebsiteCreate userWebsiteCreate = (UserWebsiteCreate) o;
    return Objects.equals(this.verificationMethod, userWebsiteCreate.verificationMethod) &&
        Objects.equals(this.website, userWebsiteCreate.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationMethod, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteCreate {\n");
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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

