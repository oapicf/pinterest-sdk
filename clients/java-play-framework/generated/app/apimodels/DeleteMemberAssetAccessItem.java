package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteMemberAssetAccessItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteMemberAssetAccessItem   {
  @JsonProperty("asset_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String assetId;

  @JsonProperty("member_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String memberId;

  public DeleteMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
  **/
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeleteMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the member on which to perform the asset permission removal
   * @return memberId
  **/
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
    return Objects.equals(assetId, deleteMemberAssetAccessItem.assetId) &&
        Objects.equals(memberId, deleteMemberAssetAccessItem.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

