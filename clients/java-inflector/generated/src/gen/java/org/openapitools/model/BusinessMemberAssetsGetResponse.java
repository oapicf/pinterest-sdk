package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;
import org.openapitools.model.TotalCountByEntityStatus;



/**
 * Paginated response for business member assets with total count metadata.
 **/

@ApiModel(description = "Paginated response for business member assets with total count metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMemberAssetsGetResponse   {
  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<AssetIdPermissions> items = new ArrayList<>();

  @JsonProperty("total_data_count")
  private Integer totalDataCount;

  @JsonProperty("total_data_count_by_status")
  private TotalCountByEntityStatus totalDataCountByStatus;

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
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   **/
  public BusinessMemberAssetsGetResponse items(List<AssetIdPermissions> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  public List<AssetIdPermissions> getItems() {
    return items;
  }
  public void setItems(List<AssetIdPermissions> items) {
    this.items = items;
  }

  /**
   * Total number of assets matching the query
   **/
  public BusinessMemberAssetsGetResponse totalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of assets matching the query")
  @JsonProperty("total_data_count")
  public Integer getTotalDataCount() {
    return totalDataCount;
  }
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
    return Objects.equals(bookmark, businessMemberAssetsGetResponse.bookmark) &&
        Objects.equals(items, businessMemberAssetsGetResponse.items) &&
        Objects.equals(totalDataCount, businessMemberAssetsGetResponse.totalDataCount) &&
        Objects.equals(totalDataCountByStatus, businessMemberAssetsGetResponse.totalDataCountByStatus);
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

