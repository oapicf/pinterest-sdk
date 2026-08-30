package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssetIdPermissions;
import org.openapitools.vertxweb.server.model.TotalCountByEntityStatus;

/**
 * Paginated response for business member assets with total count metadata.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessMemberAssetsGetResponse   {
  
  private String bookmark;
  private List<AssetIdPermissions> items = new ArrayList<>();
  private Integer totalDataCount;
  private TotalCountByEntityStatus totalDataCountByStatus;

  public BusinessMemberAssetsGetResponse () {

  }

  public BusinessMemberAssetsGetResponse (String bookmark, List<AssetIdPermissions> items, Integer totalDataCount, TotalCountByEntityStatus totalDataCountByStatus) {
    this.bookmark = bookmark;
    this.items = items;
    this.totalDataCount = totalDataCount;
    this.totalDataCountByStatus = totalDataCountByStatus;
  }

    
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

    
  @JsonProperty("items")
  public List<AssetIdPermissions> getItems() {
    return items;
  }
  public void setItems(List<AssetIdPermissions> items) {
    this.items = items;
  }

    
  @JsonProperty("total_data_count")
  public Integer getTotalDataCount() {
    return totalDataCount;
  }
  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

    
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
