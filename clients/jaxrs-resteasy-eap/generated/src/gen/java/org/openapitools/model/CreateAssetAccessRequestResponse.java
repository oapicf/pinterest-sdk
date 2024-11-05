package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestResponse   {
  
  private List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions;
  private Map<String, String> invites;

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   **/
  
  @ApiModelProperty(value = "A list of errors associated with the asset access requests. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  public List<@Valid CreateAssetAccessRequestErrorMessageInner> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   **/
  
  @ApiModelProperty(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", value = "")
  @JsonProperty("invites")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

