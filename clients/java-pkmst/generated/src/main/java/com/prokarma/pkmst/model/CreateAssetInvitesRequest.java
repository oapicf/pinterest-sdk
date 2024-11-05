package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateAssetInvitesRequestItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request body for updating asset roles for existing invites.
 */
@ApiModel(description = "Request body for updating asset roles for existing invites.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetInvitesRequest   {
  @JsonProperty("invites")
  
  private List<CreateAssetInvitesRequestItem> invites = new ArrayList<>();

  public CreateAssetInvitesRequest invites(List<CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetInvitesRequest addInvitesItem(CreateAssetInvitesRequestItem invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

  /**
   * Get invites
   * @return invites
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.invites, createAssetInvitesRequest.invites);
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

