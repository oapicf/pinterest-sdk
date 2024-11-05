package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.Role;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessSharedAudienceResponse   {
  
  private String audienceId;
  private List<Role> permissions = new ArrayList<>();
  private List<String> recipientBusinessIds = new ArrayList<>();

  public BusinessSharedAudienceResponse () {

  }

  public BusinessSharedAudienceResponse (String audienceId, List<Role> permissions, List<String> recipientBusinessIds) {
    this.audienceId = audienceId;
    this.permissions = permissions;
    this.recipientBusinessIds = recipientBusinessIds;
  }

    
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

    
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

    
  @JsonProperty("recipient_business_ids")
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
    BusinessSharedAudienceResponse businessSharedAudienceResponse = (BusinessSharedAudienceResponse) o;
    return Objects.equals(audienceId, businessSharedAudienceResponse.audienceId) &&
        Objects.equals(permissions, businessSharedAudienceResponse.permissions) &&
        Objects.equals(recipientBusinessIds, businessSharedAudienceResponse.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSharedAudienceResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
