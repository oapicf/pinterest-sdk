package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetIdPermissions;
import com.prokarma.pkmst.model.TotalCountByEntityStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Paginated response for business member assets with total count metadata.
 */
@ApiModel(description = "Paginated response for business member assets with total count metadata.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMemberAssetsGetResponse   {
  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  
  private List<AssetIdPermissions> items = new ArrayList<>();

  @JsonProperty("total_data_count")
  private Integer totalDataCount;

  @JsonProperty("total_data_count_by_status")
  private TotalCountByEntityStatus totalDataCountByStatus;

  public BusinessMemberAssetsGetResponse bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  /**
   * Get bookmark
   * @return bookmark
   */
  @ApiModelProperty(value = "")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public BusinessMemberAssetsGetResponse items(List<AssetIdPermissions> items) {
    this.items = items;
    return this;
  }

  public BusinessMemberAssetsGetResponse addItemsItem(AssetIdPermissions itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @ApiModelProperty(required = true, value = "")
  public List<AssetIdPermissions> getItems() {
    return items;
  }

  public void setItems(List<AssetIdPermissions> items) {
    this.items = items;
  }

  public BusinessMemberAssetsGetResponse totalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
    return this;
  }

  /**
   * Total number of assets matching the query
   * @return totalDataCount
   */
  @ApiModelProperty(required = true, value = "Total number of assets matching the query")
  public Integer getTotalDataCount() {
    return totalDataCount;
  }

  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  public BusinessMemberAssetsGetResponse totalDataCountByStatus(TotalCountByEntityStatus totalDataCountByStatus) {
    this.totalDataCountByStatus = totalDataCountByStatus;
    return this;
  }

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   * @return totalDataCountByStatus
   */
  @ApiModelProperty(value = "Breakdown of asset counts by entity status (ad accounts only)")
  public TotalCountByEntityStatus getTotalDataCountByStatus() {
    return totalDataCountByStatus;
  }

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

