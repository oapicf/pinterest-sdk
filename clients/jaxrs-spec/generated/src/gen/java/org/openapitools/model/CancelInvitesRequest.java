package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object with the list of invite/request ids to cancel.
 **/
@ApiModel(description = "An object with the list of invite/request ids to cancel.")
@JsonTypeName("CancelInvitesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInvitesRequest   {
  private @Valid List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds = new ArrayList<>();

  public CancelInvitesRequest() {
  }

  @JsonCreator
  public CancelInvitesRequest(
    @JsonProperty(required = true, value = "invite_ids") List< @Pattern(regexp="^\\d+$") @Size(max=25)String> inviteIds
  ) {
    this.inviteIds = inviteIds;
  }

  /**
   * A list of invite/request ids to cancel.
   **/
  public CancelInvitesRequest inviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of invite/request ids to cancel.")
  @JsonProperty(required = true, value = "invite_ids")
  @NotNull  @Size(min=1,max=50)public List< @Pattern(regexp="^\\d+$") @Size(max=25)String> getInviteIds() {
    return inviteIds;
  }

  @JsonProperty(required = true, value = "invite_ids")
  public void setInviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
  }

  public CancelInvitesRequest addInviteIdsItem(String inviteIdsItem) {
    if (this.inviteIds == null) {
      this.inviteIds = new ArrayList<>();
    }

    this.inviteIds.add(inviteIdsItem);
    return this;
  }

  public CancelInvitesRequest removeInviteIdsItem(String inviteIdsItem) {
    if (inviteIdsItem != null && this.inviteIds != null) {
      this.inviteIds.remove(inviteIdsItem);
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
    CancelInvitesRequest cancelInvitesRequest = (CancelInvitesRequest) o;
    return Objects.equals(this.inviteIds, cancelInvitesRequest.inviteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInvitesRequest {\n");
    
    sb.append("    inviteIds: ").append(toIndentedString(inviteIds)).append("\n");
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
