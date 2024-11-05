package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssetAccessRequestErrorMessageInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateAssetAccessRequestResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestResponse   {
  private @Valid List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions;
  private @Valid Map<String, String> invites;

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   **/
  public CreateAssetAccessRequestResponse exceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset access requests. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  @Valid public List<@Valid CreateAssetAccessRequestErrorMessageInner> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(CreateAssetAccessRequestErrorMessageInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public CreateAssetAccessRequestResponse removeExceptionsItem(CreateAssetAccessRequestErrorMessageInner exceptionsItem) {
    if (exceptionsItem != null && this.exceptions != null) {
      this.exceptions.remove(exceptionsItem);
    }

    return this;
  }
  /**
   **/
  public CreateAssetAccessRequestResponse invites(Map<String, String> invites) {
    this.invites = invites;
    return this;
  }

  
  @ApiModelProperty(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", value = "")
  @JsonProperty("invites")
  public Map<String, String> getInvites() {
    return invites;
  }

  @JsonProperty("invites")
  public void setInvites(Map<String, String> invites) {
    this.invites = invites;
  }

  public CreateAssetAccessRequestResponse putInvitesItem(String key, String invitesItem) {
    if (this.invites == null) {
      this.invites = new HashMap<>();
    }

    this.invites.put(key, invitesItem);
    return this;
  }

  public CreateAssetAccessRequestResponse removeInvitesItem(String key) {
    if (this.invites != null) {
      this.invites.remove(key);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

