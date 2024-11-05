package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BusinessMembersAssetAccessDeleteRequestAccessesInner
 */

@JsonTypeName("business_members_asset_access_delete_request_accesses_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequestAccessesInner {

  private String assetId;

  private String memberId;

  public BusinessMembersAssetAccessDeleteRequestAccessesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessMembersAssetAccessDeleteRequestAccessesInner(String assetId, String memberId) {
    this.assetId = assetId;
    this.memberId = memberId;
  }

  public BusinessMembersAssetAccessDeleteRequestAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", example = "549755885175", description = "Id of the asset on which to remove member permissions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
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
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "member_id", example = "140943737684417", description = "Unique identifier of the member on which to perform the asset permission removal", requiredMode = Schema.RequiredMode.REQUIRED)
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

