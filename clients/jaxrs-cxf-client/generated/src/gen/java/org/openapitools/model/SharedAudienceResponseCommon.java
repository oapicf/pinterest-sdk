package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudienceResponseCommon  {
  
  @ApiModelProperty(example = "2542621871096", value = "Audience ID that was shared")
 /**
   * Audience ID that was shared
  **/
  private String audienceId;

  @ApiModelProperty(example = "[\"RESOURCE_PINNER_LIST_READER\",\"RESOURCE_PINNER_LIST_OWNER\"]", value = "")
  private List<Role> permissions = new ArrayList<>();
 /**
   * Audience ID that was shared
   * @return audienceId
  **/
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public SharedAudienceResponseCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<Role> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
  }

  public SharedAudienceResponseCommon permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  public SharedAudienceResponseCommon addPermissionsItem(Role permissionsItem) {
    this.permissions.add(permissionsItem);
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
    SharedAudienceResponseCommon sharedAudienceResponseCommon = (SharedAudienceResponseCommon) o;
    return Objects.equals(this.audienceId, sharedAudienceResponseCommon.audienceId) &&
        Objects.equals(this.permissions, sharedAudienceResponseCommon.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudienceResponseCommon {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

