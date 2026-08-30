package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeleteMemberAssetAccessItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteMemberAssetAccessItem {

  private String assetId;

  private String memberId;

  public DeleteMemberAssetAccessItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteMemberAssetAccessItem(String assetId, String memberId) {
    this.assetId = assetId;
    this.memberId = memberId;
  }

  public DeleteMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Id of the asset on which to remove member permissions.
   * @return assetId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", description = "Id of the asset on which to remove member permissions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
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
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "member_id", description = "Unique identifier of the member on which to perform the asset permission removal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  @JsonProperty("member_id")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

