package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The terminated asset access.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteMemberAccessResult   {
  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")

  private String assetId;

  @JsonProperty("member_id")
  @Pattern(regexp="^\\d+$")

  private String memberId;

  public DeleteMemberAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of the business asset.
   * @return assetId
  **/
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeleteMemberAccessResult memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the business member.
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
    DeleteMemberAccessResult deleteMemberAccessResult = (DeleteMemberAccessResult) o;
    return Objects.equals(assetId, deleteMemberAccessResult.assetId) &&
        Objects.equals(memberId, deleteMemberAccessResult.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMemberAccessResult {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

