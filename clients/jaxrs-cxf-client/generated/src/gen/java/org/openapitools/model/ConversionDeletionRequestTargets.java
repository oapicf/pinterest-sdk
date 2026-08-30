package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.model.ConversionDeletionRequestUserEmailTargets;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionDeletionRequestTargets  {
  
 /**
  * Array of plain text user emails.
  */
  @ApiModelProperty(required = true, value = "Array of plain text user emails.")

  private List<String> userEmails = new ArrayList<>();

 /**
  * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  */
  @ApiModelProperty(required = true, value = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).")

  private List<String> epiks = new ArrayList<>();
 /**
   * Array of plain text user emails.
   * @return userEmails
  **/
  @JsonProperty("user_emails")
  public List<String> getUserEmails() {
    return userEmails;
  }

  public void setUserEmails(List<String> userEmails) {
    this.userEmails = userEmails;
  }

  public ConversionDeletionRequestTargets userEmails(List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }

  public ConversionDeletionRequestTargets addUserEmailsItem(String userEmailsItem) {
    this.userEmails.add(userEmailsItem);
    return this;
  }

 /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   * @return epiks
  **/
  @JsonProperty("epiks")
  public List<String> getEpiks() {
    return epiks;
  }

  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }

  public ConversionDeletionRequestTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  public ConversionDeletionRequestTargets addEpiksItem(String epiksItem) {
    this.epiks.add(epiksItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

