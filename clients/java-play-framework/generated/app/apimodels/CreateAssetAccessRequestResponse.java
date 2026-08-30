package apimodels;

import apimodels.AssetAccessRequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAssetAccessRequestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssetAccessRequestResponse   {
  @JsonProperty("exceptions")
  @Valid

  private List<@Valid AssetAccessRequestError> exceptions = null;

  @JsonProperty("invites")
  
  private Map<String, String> invites = null;

  public CreateAssetAccessRequestResponse exceptions(List<@Valid AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(AssetAccessRequestError exceptionsItem) {
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
  public List<@Valid AssetAccessRequestError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid AssetAccessRequestError> exceptions) {
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
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

