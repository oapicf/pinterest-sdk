package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.model.ConversionDeletionRequestUserEmailTargets;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionDeletionRequestTargets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestTargets   {
  private @Valid List<String> userEmails = new ArrayList<>();
  private @Valid List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestTargets() {
  }

  @JsonCreator
  public ConversionDeletionRequestTargets(
    @JsonProperty(required = true, value = "user_emails") List<String> userEmails,
    @JsonProperty(required = true, value = "epiks") List<String> epiks
  ) {
    this.userEmails = userEmails;
    this.epiks = epiks;
  }

  /**
   * Array of plain text user emails.
   **/
  public ConversionDeletionRequestTargets userEmails(List<String> userEmails) {
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

  public ConversionDeletionRequestTargets addUserEmailsItem(String userEmailsItem) {
    if (this.userEmails == null) {
      this.userEmails = new ArrayList<>();
    }

    this.userEmails.add(userEmailsItem);
    return this;
  }

  public ConversionDeletionRequestTargets removeUserEmailsItem(String userEmailsItem) {
    if (userEmailsItem != null && this.userEmails != null) {
      this.userEmails.remove(userEmailsItem);
    }

    return this;
  }
  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   **/
  public ConversionDeletionRequestTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).")
  @JsonProperty(required = true, value = "epiks")
  @NotNull  @Size(min=1)public List<String> getEpiks() {
    return epiks;
  }

  @JsonProperty(required = true, value = "epiks")
  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }

  public ConversionDeletionRequestTargets addEpiksItem(String epiksItem) {
    if (this.epiks == null) {
      this.epiks = new ArrayList<>();
    }

    this.epiks.add(epiksItem);
    return this;
  }

  public ConversionDeletionRequestTargets removeEpiksItem(String epiksItem) {
    if (epiksItem != null && this.epiks != null) {
      this.epiks.remove(epiksItem);
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
