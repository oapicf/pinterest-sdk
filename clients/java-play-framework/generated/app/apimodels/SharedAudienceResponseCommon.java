package apimodels;

import apimodels.Role;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SharedAudienceResponseCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SharedAudienceResponseCommon   {
  @JsonProperty("audience_id")
  
  private String audienceId;

  @JsonProperty("permissions")
  @Valid

  private List<Role> permissions = null;

  public SharedAudienceResponseCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

   /**
   * Audience ID that was shared
   * @return audienceId
  **/
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public SharedAudienceResponseCommon permissions(List<Role> permissions) {
    this.permissions = permissions;
    return this;
  }

  public SharedAudienceResponseCommon addPermissionsItem(Role permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  public List<Role> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Role> permissions) {
    this.permissions = permissions;
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
    return Objects.equals(audienceId, sharedAudienceResponseCommon.audienceId) &&
        Objects.equals(permissions, sharedAudienceResponseCommon.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

