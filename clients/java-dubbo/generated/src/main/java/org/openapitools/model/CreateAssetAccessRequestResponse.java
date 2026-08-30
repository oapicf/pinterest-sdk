package org.openapitools.model;

import org.openapitools.model.AssetAccessRequestError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateAssetAccessRequestResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   */
  @JsonProperty("exceptions")
  private List<AssetAccessRequestError> exceptions = new ArrayList<>();

  /**
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
   */
  @JsonProperty("invites")
  private Map<String, String> invites = new HashMap<>();

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
   */
  public List<AssetAccessRequestError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
   * @return invites
   */
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
    return Objects.equals(this.exceptions, createAssetAccessRequestResponse.exceptions) &&
        Objects.equals(this.invites, createAssetAccessRequestResponse.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, invites);
  }

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
