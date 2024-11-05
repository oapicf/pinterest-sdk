package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The terminated asset access.
 */

@Schema(name = "DeleteMemberAccessResult", description = "The terminated asset access.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteMemberAccessResult {

  private String assetId;

  private String memberId;

  public DeleteMemberAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of the business asset.
   * @return assetId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "asset_id", example = "549755885175", description = "Unique identifier of the business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_id")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "member_id", example = "140943737684417", description = "Unique identifier of the business member.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

