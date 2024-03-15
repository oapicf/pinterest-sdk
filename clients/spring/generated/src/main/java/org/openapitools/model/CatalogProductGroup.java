package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * non-promoted catalog product group entity
 */

@Schema(name = "CatalogProductGroup", description = "non-promoted catalog product group entity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogProductGroup {

  private String id;

  private String merchantId;

  private String name;

  private Object filters;

  private Object filterV2;

  private Board type;

  private EntityStatus status;

  private String feedProfileId;

  private Integer createdAt;

  private Integer lastUpdate;

  private Integer productCount;

  private Integer featuredPosition;

  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the catalog product group.
   * @return id
  */
  
  @Schema(name = "id", example = "2680059592705", description = "ID of the catalog product group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogProductGroup merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Merchant ID pertaining to the owner of the catalog product group.
   * @return merchantId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "merchant_id", example = "2680059592705", description = "Merchant ID pertaining to the owner of the catalog product group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public CatalogProductGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of catalog product group
   * @return name
  */
  
  @Schema(name = "name", example = "Most Popular", description = "Name of catalog product group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogProductGroup filters(Object filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Object holding a list of filters
   * @return filters
  */
  
  @Schema(name = "filters", example = "{\"1\":[\"123chars_title\"]}", description = "Object holding a list of filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public Object getFilters() {
    return filters;
  }

  public void setFilters(Object filters) {
    this.filters = filters;
  }

  public CatalogProductGroup filterV2(Object filterV2) {
    this.filterV2 = filterV2;
    return this;
  }

  /**
   * Object holding a list of filters
   * @return filterV2
  */
  
  @Schema(name = "filter_v2", example = "{\"1\":[\"123chars_title\"]}", description = "Object holding a list of filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter_v2")
  public Object getFilterV2() {
    return filterV2;
  }

  public void setFilterV2(Object filterV2) {
    this.filterV2 = filterV2;
  }

  public CatalogProductGroup type(Board type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Board getType() {
    return type;
  }

  public void setType(Board type) {
    this.type = type;
  }

  public CatalogProductGroup status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CatalogProductGroup feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  /**
   * id of the feed profile belonging to this catalog product group
   * @return feedProfileId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "feed_profile_id", description = "id of the feed profile belonging to this catalog product group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public CatalogProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
  */
  
  @Schema(name = "created_at", example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogProductGroup lastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return lastUpdate
  */
  
  @Schema(name = "last_update", example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_update")
  public Integer getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public CatalogProductGroup productCount(Integer productCount) {
    this.productCount = productCount;
    return this;
  }

  /**
   * Amount of products in the catalog product group
   * @return productCount
  */
  
  @Schema(name = "product_count", example = "6", description = "Amount of products in the catalog product group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_count")
  public Integer getProductCount() {
    return productCount;
  }

  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

  public CatalogProductGroup featuredPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
    return this;
  }

  /**
   * index of the featured position of the catalog product group
   * @return featuredPosition
  */
  
  @Schema(name = "featured_position", example = "2", description = "index of the featured position of the catalog product group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured_position")
  public Integer getFeaturedPosition() {
    return featuredPosition;
  }

  public void setFeaturedPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogProductGroup catalogProductGroup = (CatalogProductGroup) o;
    return Objects.equals(this.id, catalogProductGroup.id) &&
        Objects.equals(this.merchantId, catalogProductGroup.merchantId) &&
        Objects.equals(this.name, catalogProductGroup.name) &&
        Objects.equals(this.filters, catalogProductGroup.filters) &&
        Objects.equals(this.filterV2, catalogProductGroup.filterV2) &&
        Objects.equals(this.type, catalogProductGroup.type) &&
        Objects.equals(this.status, catalogProductGroup.status) &&
        Objects.equals(this.feedProfileId, catalogProductGroup.feedProfileId) &&
        Objects.equals(this.createdAt, catalogProductGroup.createdAt) &&
        Objects.equals(this.lastUpdate, catalogProductGroup.lastUpdate) &&
        Objects.equals(this.productCount, catalogProductGroup.productCount) &&
        Objects.equals(this.featuredPosition, catalogProductGroup.featuredPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantId, name, filters, filterV2, type, status, feedProfileId, createdAt, lastUpdate, productCount, featuredPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogProductGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    filterV2: ").append(toIndentedString(filterV2)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    featuredPosition: ").append(toIndentedString(featuredPosition)).append("\n");
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

