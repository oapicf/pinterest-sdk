package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * User website verification request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserWebsiteVerifyRequest   {
  
  private String website;


  public enum VerificationMethodEnum {
    FILENAME("FILENAME"),
    METATAG("METATAG"),
    DNSTXT("DNSTXT");

    private String value;

    VerificationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private VerificationMethodEnum verificationMethod = VerificationMethodEnum.METATAG;

  public UserWebsiteVerifyRequest () {

  }

  public UserWebsiteVerifyRequest (String website, VerificationMethodEnum verificationMethod) {
    this.website = website;
    this.verificationMethod = verificationMethod;
  }

    
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

    
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
    return Objects.equals(website, userWebsiteVerifyRequest.website) &&
        Objects.equals(verificationMethod, userWebsiteVerifyRequest.verificationMethod);
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
