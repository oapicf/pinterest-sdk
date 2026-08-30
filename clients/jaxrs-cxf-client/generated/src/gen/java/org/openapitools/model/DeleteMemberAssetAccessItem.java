package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteMemberAssetAccessItem  {
  
 /**
  * Id of the asset on which to remove member permissions.
  */
  @ApiModelProperty(required = true, value = "Id of the asset on which to remove member permissions.")

  private String assetId;

 /**
  * Unique identifier of the member on which to perform the asset permission removal
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the member on which to perform the asset permission removal")

  private String memberId;
 /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeleteMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Unique identifier of the member on which to perform the asset permission removal
   * @return memberId
  **/
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public DeleteMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

