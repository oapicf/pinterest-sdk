package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.model.ConversionDeletionRequestUserEmailTargets;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionDeletionRequestTargets
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestTargets {

  @Valid
  private List<String> userEmails = new ArrayList<>();

  @Valid
  private List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestTargets() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionDeletionRequestTargets(List<String> userEmails, List<String> epiks) {
    this.userEmails = userEmails;
    this.epiks = epiks;
  }

  public ConversionDeletionRequestTargets userEmails(List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }

  public ConversionDeletionRequestTargets addUserEmailsItem(String userEmailsItem) {
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

  public ConversionDeletionRequestTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  public ConversionDeletionRequestTargets addEpiksItem(String epiksItem) {
    if (this.epiks == null) {
      this.epiks = new ArrayList<>();
    }
    this.epiks.add(epiksItem);
    return this;
  }

  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   * @return epiks
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "epiks", description = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("epiks")
  public List<String> getEpiks() {
    return epiks;
  }

  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestTargets conversionDeletionRequestTargets = (ConversionDeletionRequestTargets) o;
    return Objects.equals(this.userEmails, conversionDeletionRequestTargets.userEmails) &&
        Objects.equals(this.epiks, conversionDeletionRequestTargets.epiks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmails, epiks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestTargets {\n");
    sb.append("    userEmails: ").append(toIndentedString(userEmails)).append("\n");
    sb.append("    epiks: ").append(toIndentedString(epiks)).append("\n");
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

