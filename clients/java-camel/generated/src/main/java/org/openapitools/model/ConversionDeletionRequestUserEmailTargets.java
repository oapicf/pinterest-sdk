package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionDeletionRequestUserEmailTargets
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestUserEmailTargets {

  @Valid
  private List<String> userEmails = new ArrayList<>();

  public ConversionDeletionRequestUserEmailTargets() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionDeletionRequestUserEmailTargets(List<String> userEmails) {
    this.userEmails = userEmails;
  }

  public ConversionDeletionRequestUserEmailTargets userEmails(List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }

  public ConversionDeletionRequestUserEmailTargets addUserEmailsItem(String userEmailsItem) {
    if (this.userEmails == null) {
      this.userEmails = new ArrayList<>();
    }
    this.userEmails.add(userEmailsItem);
    return this;
  }

  /**
   * Array of plain text user emails.
   * @return userEmails
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "user_emails", description = "Array of plain text user emails.", requiredMode = Schema.RequiredMode.REQUIRED)
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

