package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetInvitesRequestItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request body for updating asset roles for existing invites.
 */

@Schema(name = "CreateAssetInvitesRequest", description = "Request body for updating asset roles for existing invites.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetInvitesRequest {

  @Valid
  private List<@Valid CreateAssetInvitesRequestItem> invites = new ArrayList<>();

  public CreateAssetInvitesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssetInvitesRequest(List<@Valid CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
  }

  public CreateAssetInvitesRequest invites(List<@Valid CreateAssetInvitesRequestItem> invites) {
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
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "invites", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invites")
  public List<@Valid CreateAssetInvitesRequestItem> getInvites() {
    return invites;
  }

  public void setInvites(List<@Valid CreateAssetInvitesRequestItem> invites) {
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

