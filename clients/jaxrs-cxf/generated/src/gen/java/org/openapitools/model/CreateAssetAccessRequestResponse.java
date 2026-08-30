package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AssetAccessRequestError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssetAccessRequestResponse  {
  
 /**
  * A list of errors associated with the asset access requests. Will be returned if there is an error.
  */
  @ApiModelProperty(value = "A list of errors associated with the asset access requests. Will be returned if there is an error.")

  @Valid

  private List<@Valid AssetAccessRequestError> exceptions = new ArrayList<>();

 /**
  * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
  */
  @ApiModelProperty(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", value = "An object mapping each partner id to the asset access request id. Only one request id is returned per partner.")

  private Map<String, String> invites = new HashMap<>();
 /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<@Valid AssetAccessRequestError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse exceptions(List<@Valid AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(AssetAccessRequestError exceptionsItem) {
    this.exceptions.add(exceptionsItem);
    return this;
  }

 /**
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
   * @return invites
  **/
  @JsonProperty("invites")
  public Map<String, String> getInvites() {
    return invites;
  }

  public void setInvites(Map<String, String> invites) {
    this.invites = invites;
  }

  public CreateAssetAccessRequestResponse invites(Map<String, String> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetAccessRequestResponse putInvitesItem(String key, String invitesItem) {
    this.invites.put(key, invitesItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

