package org.openapitools.model;

import org.openapitools.model.Role;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BusinessToBusinessSharedAudience implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of an audience
   */
  @JsonProperty("audience_id")
  private String audienceId;

  /**
   * Permissions granted to the recipients.
   */
  @JsonProperty("permissions")
  private List<Role> permissions = new ArrayList<>();

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   */
  @JsonProperty("recipient_business_ids")
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   * @return audienceId
   */
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Permissions granted to the recipients.
   * @return permissions
   */
  public List<Role> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientBusinessIds
   */
  public List<String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  public void setRecipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessToBusinessSharedAudience businessToBusinessSharedAudience = (BusinessToBusinessSharedAudience) o;
    return Objects.equals(this.audienceId, businessToBusinessSharedAudience.audienceId) &&
        Objects.equals(this.permissions, businessToBusinessSharedAudience.permissions) &&
        Objects.equals(this.recipientBusinessIds, businessToBusinessSharedAudience.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessToBusinessSharedAudience {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
