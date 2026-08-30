package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Paginated response for business member assets with total count metadata.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMemberAssetsGetResponse   {
  
  private String bookmark;
  private List<@Valid AssetIdPermissions> items = new ArrayList<>();
  private Integer totalDataCount;
  private TotalCountByEntityStatus totalDataCountByStatus;

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  @Valid
  public List<@Valid AssetIdPermissions> getItems() {
    return items;
  }
  public void setItems(List<@Valid AssetIdPermissions> items) {
    this.items = items;
  }

  /**
   * Total number of assets matching the query
   **/
  
  @ApiModelProperty(required = true, value = "Total number of assets matching the query")
  @JsonProperty("total_data_count")
  @NotNull
  public Integer getTotalDataCount() {
    return totalDataCount;
  }
  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   **/
  
  @ApiModelProperty(value = "Breakdown of asset counts by entity status (ad accounts only)")
  @JsonProperty("total_data_count_by_status")
  @Valid
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

