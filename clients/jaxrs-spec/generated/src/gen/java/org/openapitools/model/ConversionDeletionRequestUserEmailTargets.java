package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionDeletionRequestUserEmailTargets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestUserEmailTargets   {
  private @Valid List<String> userEmails = new ArrayList<>();

  public ConversionDeletionRequestUserEmailTargets() {
  }

  @JsonCreator
  public ConversionDeletionRequestUserEmailTargets(
    @JsonProperty(required = true, value = "user_emails") List<String> userEmails
  ) {
    this.userEmails = userEmails;
  }

  /**
   * Array of plain text user emails.
   **/
  public ConversionDeletionRequestUserEmailTargets userEmails(List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of plain text user emails.")
  @JsonProperty(required = true, value = "user_emails")
  @NotNull  @Size(min=1)public List<String> getUserEmails() {
    return userEmails;
  }

  @JsonProperty(required = true, value = "user_emails")
  public void setUserEmails(List<String> userEmails) {
    this.userEmails = userEmails;
  }

  public ConversionDeletionRequestUserEmailTargets addUserEmailsItem(String userEmailsItem) {
    if (this.userEmails == null) {
      this.userEmails = new ArrayList<>();
    }

    this.userEmails.add(userEmailsItem);
    return this;
  }

  public ConversionDeletionRequestUserEmailTargets removeUserEmailsItem(String userEmailsItem) {
    if (userEmailsItem != null && this.userEmails != null) {
      this.userEmails.remove(userEmailsItem);
    }

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
    ConversionDeletionRequestUserEmailTargets conversionDeletionRequestUserEmailTargets = (ConversionDeletionRequestUserEmailTargets) o;
    return Objects.equals(this.userEmails, conversionDeletionRequestUserEmailTargets.userEmails);
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
