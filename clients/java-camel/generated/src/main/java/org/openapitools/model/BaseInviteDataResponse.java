package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Common invite/request data returned by the business access endpoints.
 */

@Schema(name = "BaseInviteDataResponse", description = "Common invite/request data returned by the business access endpoints.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BaseInviteDataResponse {

  private String id;

  private InviteDataResponse inviteData;

  private Boolean isReceivedInvite;

  private BusinessAccessUserSummary user;

  public BaseInviteDataResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseInviteDataResponse inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  /**
   * Get inviteData
   * @return inviteData
   */
  @Valid 
  @Schema(name = "invite_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_data")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  public BaseInviteDataResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
   */
  
  @Schema(name = "is_received_invite", description = "Indicates whether the invite/request was received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public BaseInviteDataResponse user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
   */
  @Valid 
  @Schema(name = "user", description = "Metadata for the member/partner that was sent the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseInviteDataResponse baseInviteDataResponse = (BaseInviteDataResponse) o;
    return Objects.equals(this.id, baseInviteDataResponse.id) &&
        Objects.equals(this.inviteData, baseInviteDataResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, baseInviteDataResponse.isReceivedInvite) &&
        Objects.equals(this.user, baseInviteDataResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseInviteDataResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

