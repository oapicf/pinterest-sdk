package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * User website verification request
 **/
@ApiModel(description = "User website verification request")
@JsonTypeName("UserWebsiteVerifyRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserWebsiteVerifyRequest   {
  private @Valid String website;
  public enum VerificationMethodEnum {

    FILENAME(String.valueOf("FILENAME")), METATAG(String.valueOf("METATAG")), DNSTXT(String.valueOf("DNSTXT"));


    private String value;

    VerificationMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static VerificationMethodEnum fromString(String s) {
        for (VerificationMethodEnum b : VerificationMethodEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid VerificationMethodEnum verificationMethod = VerificationMethodEnum.METATAG;

  /**
   **/
  public UserWebsiteVerifyRequest website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(example = "pintest-website-12345678.test/test_1", value = "")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  public UserWebsiteVerifyRequest verificationMethod(VerificationMethodEnum verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verification_method")
  public VerificationMethodEnum getVerificationMethod() {
    return verificationMethod;
  }

  @JsonProperty("verification_method")
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

