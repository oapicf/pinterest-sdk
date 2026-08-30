package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;
import org.openapitools.model.TotalCountByEntityStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Paginated response for business member assets with total count metadata.
 **/
@ApiModel(description = "Paginated response for business member assets with total count metadata.")
@JsonTypeName("BusinessMemberAssetsGetResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMemberAssetsGetResponse   {
  private String bookmark;
  private @Valid List<@Valid AssetIdPermissions> items = new ArrayList<>();
  private Integer totalDataCount;
  private TotalCountByEntityStatus totalDataCountByStatus;

  public BusinessMemberAssetsGetResponse() {
  }

  @JsonCreator
  public BusinessMemberAssetsGetResponse(
    @JsonProperty(required = true, value = "items") List<@Valid AssetIdPermissions> items,
    @JsonProperty(required = true, value = "total_data_count") Integer totalDataCount
  ) {
    this.items = items;
    this.totalDataCount = totalDataCount;
  }

  /**
   **/
  public BusinessMemberAssetsGetResponse bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  @JsonProperty("bookmark")
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   **/
  public BusinessMemberAssetsGetResponse items(List<@Valid AssetIdPermissions> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid AssetIdPermissions> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid AssetIdPermissions> items) {
    this.items = items;
  }

  public BusinessMemberAssetsGetResponse addItemsItem(AssetIdPermissions itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public BusinessMemberAssetsGetResponse removeItemsItem(AssetIdPermissions itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
  /**
   * Total number of assets matching the query
   **/
  public BusinessMemberAssetsGetResponse totalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of assets matching the query")
  @JsonProperty(required = true, value = "total_data_count")
  @NotNull public Integer getTotalDataCount() {
    return totalDataCount;
  }

  @JsonProperty(required = true, value = "total_data_count")
  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   **/
  public BusinessMemberAssetsGetResponse totalDataCountByStatus(TotalCountByEntityStatus totalDataCountByStatus) {
    this.totalDataCountByStatus = totalDataCountByStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Breakdown of asset counts by entity status (ad accounts only)")
  @JsonProperty("total_data_count_by_status")
  @Valid public TotalCountByEntityStatus getTotalDataCountByStatus() {
    return totalDataCountByStatus;
  }

  @JsonProperty("total_data_count_by_status")
  public void setTotalDataCountByStatus(TotalCountByEntityStatus totalDataCountByStatus) {
    this.totalDataCountByStatus = totalDataCountByStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessMemberAssetsGetResponse businessMemberAssetsGetResponse = (BusinessMemberAssetsGetResponse) o;
    return Objects.equals(this.bookmark, businessMemberAssetsGetResponse.bookmark) &&
        Objects.equals(this.items, businessMemberAssetsGetResponse.items) &&
        Objects.equals(this.totalDataCount, businessMemberAssetsGetResponse.totalDataCount) &&
        Objects.equals(this.totalDataCountByStatus, businessMemberAssetsGetResponse.totalDataCountByStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items, totalDataCount, totalDataCountByStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsGetResponse {\n");
    
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalDataCount: ").append(toIndentedString(totalDataCount)).append("\n");
    sb.append("    totalDataCountByStatus: ").append(toIndentedString(totalDataCountByStatus)).append("\n");
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
