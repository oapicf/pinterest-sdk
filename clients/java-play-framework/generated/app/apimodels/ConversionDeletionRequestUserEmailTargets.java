package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionDeletionRequestUserEmailTargets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionDeletionRequestUserEmailTargets   {
  @JsonProperty("user_emails")
  @NotNull
@Size(min=1)

  private List<String> userEmails = new ArrayList<>();

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

