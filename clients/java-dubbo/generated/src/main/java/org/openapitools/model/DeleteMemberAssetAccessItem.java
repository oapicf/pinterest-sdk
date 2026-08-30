package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DeleteMemberAssetAccessItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Id of the asset on which to remove member permissions.
   */
  @JsonProperty("asset_id")
  private String assetId;

  /**
   * Unique identifier of the member on which to perform the asset permission removal
   */
  @JsonProperty("member_id")
  private String memberId;

  /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
   */
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the asset permission removal
   * @return memberId
   */
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMemberAssetAccessItem deleteMemberAssetAccessItem = (DeleteMemberAssetAccessItem) o;
    return Objects.equals(this.assetId, deleteMemberAssetAccessItem.assetId) &&
        Objects.equals(this.memberId, deleteMemberAssetAccessItem.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMemberAssetAccessItem {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
