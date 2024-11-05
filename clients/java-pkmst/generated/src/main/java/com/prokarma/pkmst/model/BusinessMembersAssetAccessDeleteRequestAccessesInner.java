package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BusinessMembersAssetAccessDeleteRequestAccessesInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequestAccessesInner   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("member_id")
  private String memberId;

  public BusinessMembersAssetAccessDeleteRequestAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
   */
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset on which to remove member permissions.")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public BusinessMembersAssetAccessDeleteRequestAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Unique identifier of the member on which to perform the asset permission removal
   * @return memberId
   */
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the asset permission removal")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

