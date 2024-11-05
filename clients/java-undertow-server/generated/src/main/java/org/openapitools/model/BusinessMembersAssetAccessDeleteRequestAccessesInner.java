/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequestAccessesInner   {
  
  private String assetId;
  private String memberId;

  /**
   * Id of the asset on which to remove member permissions.
   */
  public BusinessMembersAssetAccessDeleteRequestAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset on which to remove member permissions.")
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the asset permission removal
   */
  public BusinessMembersAssetAccessDeleteRequestAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the asset permission removal")
  @JsonProperty("member_id")
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
    return Objects.equals(assetId, businessMembersAssetAccessDeleteRequestAccessesInner.assetId) &&
        Objects.equals(memberId, businessMembersAssetAccessDeleteRequestAccessesInner.memberId);
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

