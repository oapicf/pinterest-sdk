package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("DeleteMemberAssetAccessItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteMemberAssetAccessItem   {
  private String assetId;
  private String memberId;

  public DeleteMemberAssetAccessItem() {
  }

  @JsonCreator
  public DeleteMemberAssetAccessItem(
    @JsonProperty(required = true, value = "asset_id") String assetId,
    @JsonProperty(required = true, value = "member_id") String memberId
  ) {
    this.assetId = assetId;
    this.memberId = memberId;
  }

  /**
   * Id of the asset on which to remove member permissions.
   **/
  public DeleteMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Id of the asset on which to remove member permissions.")
  @JsonProperty(required = true, value = "asset_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getAssetId() {
    return assetId;
  }

  @JsonProperty(required = true, value = "asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the asset permission removal
   **/
  public DeleteMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the member on which to perform the asset permission removal")
  @JsonProperty(required = true, value = "member_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getMemberId() {
    return memberId;
  }

  @JsonProperty(required = true, value = "member_id")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
