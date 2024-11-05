package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetInvitesRequestItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request body for updating asset roles for existing invites.
 **/
@ApiModel(description="Request body for updating asset roles for existing invites.")

public class CreateAssetInvitesRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid CreateAssetInvitesRequestItem> invites = new ArrayList<>();
 /**
   * Get invites
   * @return invites
  **/
  @JsonProperty("invites")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid CreateAssetInvitesRequestItem> getInvites() {
    return invites;
  }

  public void setInvites(List<@Valid CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
  }

  public CreateAssetInvitesRequest invites(List<@Valid CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetInvitesRequest addInvitesItem(CreateAssetInvitesRequestItem invitesItem) {
    this.invites.add(invitesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

