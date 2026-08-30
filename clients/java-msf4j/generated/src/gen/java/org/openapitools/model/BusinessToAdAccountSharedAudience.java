package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;

/**
 * BusinessToAdAccountSharedAudience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessToAdAccountSharedAudience   {
  @JsonProperty("audience_id")
  private String audienceId;

  @JsonProperty("permissions")
  private List<Role> permissions = null;

  @JsonProperty("recipient_account_ids")
  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

  public BusinessToAdAccountSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

   /**
   * Unique identifier of an audience
   * @return audienceId
  **/
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

   /**
   * Permissions granted to the recipients.
   * @return permissions
  **/
  @ApiModelProperty(example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", value = "Permissions granted to the recipients.")
  public List<Role> getPermissions() {
    return permissions;
  }

  public BusinessToAdAccountSharedAudience recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  public BusinessToAdAccountSharedAudience addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    this.recipientAccountIds.add(recipientAccountIdsItem);
    return this;
  }

   /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientAccountIds
  **/
  @ApiModelProperty(required = true, value = "Ad account IDs to share with or revoke from (request) / that received the audience (response).")
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessToAdAccountSharedAudience businessToAdAccountSharedAudience = (BusinessToAdAccountSharedAudience) o;
    return Objects.equals(this.audienceId, businessToAdAccountSharedAudience.audienceId) &&
        Objects.equals(this.permissions, businessToAdAccountSharedAudience.permissions) &&
        Objects.equals(this.recipientAccountIds, businessToAdAccountSharedAudience.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessToAdAccountSharedAudience {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

