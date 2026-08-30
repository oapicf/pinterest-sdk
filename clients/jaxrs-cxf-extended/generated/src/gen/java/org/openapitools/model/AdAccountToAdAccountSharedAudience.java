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


public class AdAccountToAdAccountSharedAudience  {
  
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
  * Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
  @ApiModelProperty(required = true, value = "Ad account IDs to share with or revoke from (request) / that received the audience (response).")
  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();
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
  public AdAccountToAdAccountSharedAudience audienceId(String audienceId) {
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
  public AdAccountToAdAccountSharedAudience permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   * <br><em>N.B. <code>permissions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdAccountToAdAccountSharedAudience addPermissionsItem(Role permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * Ad account IDs to share with or revoke from (request) / that received the audience (response).
  * @return recipientAccountIds
  */
  @JsonProperty("recipient_account_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  /**
   * Sets the <code>recipientAccountIds</code> property.
   */
 public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }

  /**
   * Sets the <code>recipientAccountIds</code> property.
   */
  public AdAccountToAdAccountSharedAudience recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  /**
   * Adds a new item to the <code>recipientAccountIds</code> list.
   */
  public AdAccountToAdAccountSharedAudience addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    this.recipientAccountIds.add(recipientAccountIdsItem);
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
    AdAccountToAdAccountSharedAudience adAccountToAdAccountSharedAudience = (AdAccountToAdAccountSharedAudience) o;
    return Objects.equals(this.audienceId, adAccountToAdAccountSharedAudience.audienceId) &&
        Objects.equals(this.permissions, adAccountToAdAccountSharedAudience.permissions) &&
        Objects.equals(this.recipientAccountIds, adAccountToAdAccountSharedAudience.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountToAdAccountSharedAudience {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    recipientAccountIds: ").append(toIndentedString(recipientAccountIds)).append("\n");
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

