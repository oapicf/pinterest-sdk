package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User website verification request
 */
@ApiModel(description="User website verification request")

public class UserWebsiteVerifyRequest  {
  
  @ApiModelProperty(example = "pintest-website-12345678.test/test_1", value = "")
  private String website;

public enum VerificationMethodEnum {

    @JsonProperty("FILENAME") FILENAME(String.valueOf("FILENAME")),
    @JsonProperty("METATAG") METATAG(String.valueOf("METATAG")),
    @JsonProperty("DNSTXT") DNSTXT(String.valueOf("DNSTXT"));

    private String value;

    VerificationMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VerificationMethodEnum fromValue(String value) {
        for (VerificationMethodEnum b : VerificationMethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private VerificationMethodEnum verificationMethod = VerificationMethodEnum.METATAG;
 /**
  * Get website
  * @return website
  */
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  /**
   * Sets the <code>website</code> property.
   */
 public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * Sets the <code>website</code> property.
   */
  public UserWebsiteVerifyRequest website(String website) {
    this.website = website;
    return this;
  }

 /**
  * Get verificationMethod
  * @return verificationMethod
  */
  @JsonProperty("verification_method")
  public String getVerificationMethod() {
    return verificationMethod == null ? null : verificationMethod.value();
  }

  /**
   * Sets the <code>verificationMethod</code> property.
   */
 public void setVerificationMethod(VerificationMethodEnum verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  /**
   * Sets the <code>verificationMethod</code> property.
   */
  public UserWebsiteVerifyRequest verificationMethod(VerificationMethodEnum verificationMethod) {
    this.verificationMethod = verificationMethod;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

