package apimodels;

import apimodels.CreateAssetAccessRequestErrorMessageInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAssetAccessRequestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssetAccessRequestResponse   {
  @JsonProperty("exceptions")
  @Valid

  private List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions = null;

  @JsonProperty("invites")
  
  private Map<String, String> invites = null;

  public CreateAssetAccessRequestResponse exceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(CreateAssetAccessRequestErrorMessageInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
  **/
  public List<@Valid CreateAssetAccessRequestErrorMessageInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse invites(Map<String, String> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetAccessRequestResponse putInvitesItem(String key, String invitesItem) {
    if (this.invites == null) {
      this.invites = new HashMap<>();
    }
    this.invites.put(key, invitesItem);
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  public Map<String, String> getInvites() {
    return invites;
  }

  public void setInvites(Map<String, String> invites) {
    this.invites = invites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestResponse createAssetAccessRequestResponse = (CreateAssetAccessRequestResponse) o;
    return Objects.equals(exceptions, createAssetAccessRequestResponse.exceptions) &&
        Objects.equals(invites, createAssetAccessRequestResponse.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, invites);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestResponse {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

