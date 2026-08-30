package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;
import org.openapitools.model.TotalCountByEntityStatus;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Paginated response for business member assets with total count metadata.
 */

@Schema(name = "BusinessMemberAssetsGetResponse", description = "Paginated response for business member assets with total count metadata.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMemberAssetsGetResponse {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> bookmark = JsonNullable.<String>undefined();

  private List<@Valid AssetIdPermissions> items = new ArrayList<>();

  private Integer totalDataCount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TotalCountByEntityStatus totalDataCountByStatus;

  public BusinessMemberAssetsGetResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessMemberAssetsGetResponse(List<@Valid AssetIdPermissions> items, Integer totalDataCount) {
    this.items = items;
    this.totalDataCount = totalDataCount;
  }

  public BusinessMemberAssetsGetResponse bookmark(String bookmark) {
    this.bookmark = JsonNullable.of(bookmark);
    return this;
  }

  /**
   * Get bookmark
   * @return bookmark
   */
  
  @Schema(name = "bookmark", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmark")
  public JsonNullable<String> getBookmark() {
    return bookmark;
  }

  public void setBookmark(JsonNullable<String> bookmark) {
    this.bookmark = bookmark;
  }

  public BusinessMemberAssetsGetResponse items(List<@Valid AssetIdPermissions> items) {
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
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid AssetIdPermissions> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid AssetIdPermissions> items) {
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
  @NotNull 
  @Schema(name = "total_data_count", description = "Total number of assets matching the query", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_data_count")
  public Integer getTotalDataCount() {
    return totalDataCount;
  }

  @JsonProperty("total_data_count")
  public void setTotalDataCount(Integer totalDataCount) {
    this.totalDataCount = totalDataCount;
  }

  public BusinessMemberAssetsGetResponse totalDataCountByStatus(@Nullable TotalCountByEntityStatus totalDataCountByStatus) {
    this.totalDataCountByStatus = totalDataCountByStatus;
    return this;
  }

  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   * @return totalDataCountByStatus
   */
  @Valid 
  @Schema(name = "total_data_count_by_status", description = "Breakdown of asset counts by entity status (ad accounts only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_data_count_by_status")
  public @Nullable TotalCountByEntityStatus getTotalDataCountByStatus() {
    return totalDataCountByStatus;
  }

  @JsonProperty("total_data_count_by_status")
  public void setTotalDataCountByStatus(@Nullable TotalCountByEntityStatus totalDataCountByStatus) {
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
    return equalsNullable(this.bookmark, businessMemberAssetsGetResponse.bookmark) &&
        Objects.equals(this.items, businessMemberAssetsGetResponse.items) &&
        Objects.equals(this.totalDataCount, businessMemberAssetsGetResponse.totalDataCount) &&
        Objects.equals(this.totalDataCountByStatus, businessMemberAssetsGetResponse.totalDataCountByStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bookmark), items, totalDataCount, totalDataCountByStatus);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

