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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UserWebsite")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsite   {
  private String status;
  private String verifiedAt;
  private String website;

  public UserWebsite() {
  }

  /**
   * Status of the verification process
   **/
  public UserWebsite status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status of the verification process")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * UTC timestamp when the verification happened - sometimes missing
   **/
  public UserWebsite verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  
  @ApiModelProperty(value = "UTC timestamp when the verification happened - sometimes missing")
  @JsonProperty("verified_at")
  public String getVerifiedAt() {
    return verifiedAt;
  }

  @JsonProperty("verified_at")
  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  /**
   * Website with path or domain only
   **/
  public UserWebsite website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(value = "Website with path or domain only")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
