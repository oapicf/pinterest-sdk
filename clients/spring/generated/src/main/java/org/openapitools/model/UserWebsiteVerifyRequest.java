package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * User website verification request
 */

@Schema(name = "UserWebsiteVerifyRequest", description = "User website verification request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserWebsiteVerifyRequest {

  private String website;

  /**
   * Gets or Sets verificationMethod
   */
  public enum VerificationMethodEnum {
    FILENAME("FILENAME"),
    
    METATAG("METATAG"),
    
    DNSTXT("DNSTXT");

    private String value;

    VerificationMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerificationMethodEnum fromValue(String value) {
      for (VerificationMethodEnum b : VerificationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VerificationMethodEnum verificationMethod = VerificationMethodEnum.METATAG;

  public UserWebsiteVerifyRequest website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  */
  
  @Schema(name = "website", example = "pintest-website-12345678.test/test_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public UserWebsiteVerifyRequest verificationMethod(VerificationMethodEnum verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  /**
   * Get verificationMethod
   * @return verificationMethod
  */
  
  @Schema(name = "verification_method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_method")
  public VerificationMethodEnum getVerificationMethod() {
    return verificationMethod;
  }

  public void setVerificationMethod(VerificationMethodEnum verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsiteVerifyRequest userWebsiteVerifyRequest = (UserWebsiteVerifyRequest) o;
    return Objects.equals(this.website, userWebsiteVerifyRequest.website) &&
        Objects.equals(this.verificationMethod, userWebsiteVerifyRequest.verificationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(website, verificationMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteVerifyRequest {\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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

