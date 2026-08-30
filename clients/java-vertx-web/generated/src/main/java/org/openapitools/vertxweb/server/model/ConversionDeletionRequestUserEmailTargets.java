package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionDeletionRequestUserEmailTargets   {
  
  private List<String> userEmails = new ArrayList<>();

  public ConversionDeletionRequestUserEmailTargets () {

  }

  public ConversionDeletionRequestUserEmailTargets (List<String> userEmails) {
    this.userEmails = userEmails;
  }

    
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
