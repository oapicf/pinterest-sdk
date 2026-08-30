package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequestUserEmailTargets;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionDeletionRequestTargets   {
  
  private List<String> userEmails = new ArrayList<>();
  private List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestTargets () {

  }

  public ConversionDeletionRequestTargets (List<String> userEmails, List<String> epiks) {
    this.userEmails = userEmails;
    this.epiks = epiks;
  }

    
  @JsonProperty("user_emails")
  public List<String> getUserEmails() {
    return userEmails;
  }
  public void setUserEmails(List<String> userEmails) {
    this.userEmails = userEmails;
  }

    
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
    return Objects.equals(userEmails, conversionDeletionRequestTargets.userEmails) &&
        Objects.equals(epiks, conversionDeletionRequestTargets.epiks);
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
