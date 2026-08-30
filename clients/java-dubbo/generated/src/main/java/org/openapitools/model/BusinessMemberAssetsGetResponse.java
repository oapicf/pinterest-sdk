package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;
import org.openapitools.model.TotalCountByEntityStatus;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Paginated response for business member assets with total count metadata.
 */
public class BusinessMemberAssetsGetResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<AssetIdPermissions> items = new ArrayList<>();

  /**
   * Total number of assets matching the query
   */
  @JsonProperty("total_data_count")
  private Integer totalDataCount;

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   */
  @JsonProperty("total_data_count_by_status")
  private TotalCountByEntityStatus totalDataCountByStatus;

  /**
   * 
   * @return bookmark
   */
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * 
   * @return items
   */
  public List<AssetIdPermissions> getItems() {
    return items;
  }

  public void setItems(List<AssetIdPermissions> items) {
    this.items = items;
  }

  /**
   * Total number of assets matching the query
   * @return totalDataCount
   */
  public Integer getTotalDataCount() {
    return totalDataCount;
  }

  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   * @return totalDataCountByStatus
   */
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
