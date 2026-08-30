package org.openapitools.model;

import org.openapitools.model.Permissions;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class UpdateMemberAssetAccessItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Id of the asset to update.
   */
  @JsonProperty("asset_id")
  private String assetId;

  /**
   * Unique identifier of the member on which to perform the update
   */
  @JsonProperty("member_id")
  private String memberId;

  /**
   * A non-empty array of permissions to assign to the member.
   */
  @JsonProperty("permissions")
  private List<Permissions> permissions = new ArrayList<>();

  /**
   * Id of the asset to update.
   * @return assetId
   */
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the update
   * @return memberId
   */
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * A non-empty array of permissions to assign to the member.
   * @return permissions
   */
  public List<Permissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permissions> permissions) {
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
    UpdateMemberAssetAccessItem updateMemberAssetAccessItem = (UpdateMemberAssetAccessItem) o;
    return Objects.equals(this.assetId, updateMemberAssetAccessItem.assetId) &&
        Objects.equals(this.memberId, updateMemberAssetAccessItem.memberId) &&
        Objects.equals(this.permissions, updateMemberAssetAccessItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessItem {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
