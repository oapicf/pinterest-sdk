/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestUserEmailTargets   {
  
  private List<String> userEmails = new ArrayList<>();

  /**
   * Array of plain text user emails.
   */
  public ConversionDeletionRequestUserEmailTargets userEmails(List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of plain text user emails.")
  @JsonProperty("user_emails")
  public List<String> getUserEmails() {
    return userEmails;
  }
  public void setUserEmails(List<String> userEmails) {
    this.userEmails = userEmails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestUserEmailTargets conversionDeletionRequestUserEmailTargets = (ConversionDeletionRequestUserEmailTargets) o;
    return Objects.equals(userEmails, conversionDeletionRequestUserEmailTargets.userEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestUserEmailTargets {\n");
    
    sb.append("    userEmails: ").append(toIndentedString(userEmails)).append("\n");
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

