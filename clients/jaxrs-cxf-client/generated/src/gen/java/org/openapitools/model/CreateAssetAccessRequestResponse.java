package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssetAccessRequestErrorMessageInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssetAccessRequestResponse  {
  
  @ApiModelProperty(value = "A list of errors associated with the asset access requests. Will be returned if there is an error.")
 /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
  **/
  private List<CreateAssetAccessRequestErrorMessageInner> exceptions;

  @ApiModelProperty(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", value = "")
  private Map<String, String> invites;
 /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<CreateAssetAccessRequestErrorMessageInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse exceptions(List<CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(CreateAssetAccessRequestErrorMessageInner exceptionsItem) {
    this.exceptions.add(exceptionsItem);
    return this;
  }

 /**
   * Get invites
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

