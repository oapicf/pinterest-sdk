package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountToBusinessSharedAudience  {
  
 /**
  * Unique identifier of an audience
  */
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  private String audienceId;

 /**
  * Permissions granted to the recipients.
  */
  @ApiModelProperty(example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", value = "Permissions granted to the recipients.")
  @Valid
  private List<Role> permissions = new ArrayList<>();

 /**
  * Business IDs to share with or revoke from (request) / that received the audience (response).
  */
  @ApiModelProperty(required = true, value = "Business IDs to share with or revoke from (request) / that received the audience (response).")
  private List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();
 /**
  * Unique identifier of an audience
  * @return audienceId
  */
  @JsonProperty("audience_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
 public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
  public AdAccountToBusinessSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
  * Permissions granted to the recipients.
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   * <br><em>N.B. <code>permissions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   * <br><em>N.B. <code>permissions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdAccountToBusinessSharedAudience permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   * <br><em>N.B. <code>permissions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdAccountToBusinessSharedAudience addPermissionsItem(Role permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * Business IDs to share with or revoke from (request) / that received the audience (response).
  * @return recipientBusinessIds
  */
  @JsonProperty("recipient_business_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
 public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
  public AdAccountToBusinessSharedAudience recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  /**
   * Adds a new item to the <code>recipientBusinessIds</code> list.
   */
  public AdAccountToBusinessSharedAudience addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    this.recipientBusinessIds.add(recipientBusinessIdsItem);
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
    AdAccountToBusinessSharedAudience adAccountToBusinessSharedAudience = (AdAccountToBusinessSharedAudience) o;
    return Objects.equals(this.audienceId, adAccountToBusinessSharedAudience.audienceId) &&
        Objects.equals(this.permissions, adAccountToBusinessSharedAudience.permissions) &&
        Objects.equals(this.recipientBusinessIds, adAccountToBusinessSharedAudience.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountToBusinessSharedAudience {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    recipientBusinessIds: ").append(toIndentedString(recipientBusinessIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

