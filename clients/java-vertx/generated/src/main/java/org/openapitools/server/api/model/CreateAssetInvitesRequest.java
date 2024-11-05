package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateAssetInvitesRequestItem;

/**
 * Request body for updating asset roles for existing invites.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetInvitesRequest   {
  
  private List<CreateAssetInvitesRequestItem> invites = new ArrayList<>();

  public CreateAssetInvitesRequest () {

  }

  public CreateAssetInvitesRequest (List<CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
  }

    
  @JsonProperty("invites")
  public List<CreateAssetInvitesRequestItem> getInvites() {
    return invites;
  }
  public void setInvites(List<CreateAssetInvitesRequestItem> invites) {
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
    CreateAssetInvitesRequest createAssetInvitesRequest = (CreateAssetInvitesRequest) o;
    return Objects.equals(invites, createAssetInvitesRequest.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetInvitesRequest {\n");
    
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
