package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The terminated asset access.
 */
@ApiModel(description = "The terminated asset access.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteMemberAccessResult   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("member_id")
  private String memberId;

  public DeleteMemberAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of the business asset.
   * @return assetId
  **/
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of the business asset.")
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
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of the business member.")
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
    return Objects.equals(this.assetId, deleteMemberAccessResult.assetId) &&
        Objects.equals(this.memberId, deleteMemberAccessResult.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId);
  }

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

