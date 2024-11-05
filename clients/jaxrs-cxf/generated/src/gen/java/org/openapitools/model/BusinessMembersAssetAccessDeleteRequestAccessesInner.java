package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessMembersAssetAccessDeleteRequestAccessesInner  {
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset on which to remove member permissions.")
 /**
   * Id of the asset on which to remove member permissions.
  **/
  private String assetId;

  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the asset permission removal")
 /**
   * Unique identifier of the member on which to perform the asset permission removal
  **/
  private String memberId;
 /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public BusinessMembersAssetAccessDeleteRequestAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Unique identifier of the member on which to perform the asset permission removal
   * @return memberId
  **/
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public BusinessMembersAssetAccessDeleteRequestAccessesInner memberId(String memberId) {
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
    BusinessMembersAssetAccessDeleteRequestAccessesInner businessMembersAssetAccessDeleteRequestAccessesInner = (BusinessMembersAssetAccessDeleteRequestAccessesInner) o;
    return Objects.equals(this.assetId, businessMembersAssetAccessDeleteRequestAccessesInner.assetId) &&
        Objects.equals(this.memberId, businessMembersAssetAccessDeleteRequestAccessesInner.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteRequestAccessesInner {\n");
    
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

