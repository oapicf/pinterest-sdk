package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CreateAssetAccessRequestErrorMessageInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetAccessRequestResponse   {
  
  private List<CreateAssetAccessRequestErrorMessageInner> exceptions;
  private Map<String, String> invites;

  public CreateAssetAccessRequestResponse () {

  }

  public CreateAssetAccessRequestResponse (List<CreateAssetAccessRequestErrorMessageInner> exceptions, Map<String, String> invites) {
    this.exceptions = exceptions;
    this.invites = invites;
  }

    
  @JsonProperty("exceptions")
  public List<CreateAssetAccessRequestErrorMessageInner> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = exceptions;
  }

    
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
    return Objects.equals(exceptions, createAssetAccessRequestResponse.exceptions) &&
        Objects.equals(invites, createAssetAccessRequestResponse.invites);
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
