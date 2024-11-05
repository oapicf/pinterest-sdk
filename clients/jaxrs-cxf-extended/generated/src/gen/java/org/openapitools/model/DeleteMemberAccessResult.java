package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The terminated asset access.
 */
@ApiModel(description="The terminated asset access.")

public class DeleteMemberAccessResult  {
  
 /**
  * Unique identifier of the business asset.
  */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of the business asset.")
  private String assetId;

 /**
  * Unique identifier of the business member.
  */
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of the business member.")
  private String memberId;
 /**
  * Unique identifier of the business asset.
  * @return assetId
  */
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$")  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public DeleteMemberAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Unique identifier of the business member.
  * @return memberId
  */
  @JsonProperty("member_id")
 @Pattern(regexp="^\\d+$")  public String getMemberId() {
    return memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
 public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
  public DeleteMemberAccessResult memberId(String memberId) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

