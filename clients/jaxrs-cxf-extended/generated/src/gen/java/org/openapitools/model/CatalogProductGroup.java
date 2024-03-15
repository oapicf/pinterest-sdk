package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * non-promoted catalog product group entity
 */
@ApiModel(description="non-promoted catalog product group entity")

public class CatalogProductGroup  {
  
 /**
  * ID of the catalog product group.
  */
  @ApiModelProperty(example = "2680059592705", value = "ID of the catalog product group.")
  private String id;

 /**
  * Merchant ID pertaining to the owner of the catalog product group.
  */
  @ApiModelProperty(example = "2680059592705", value = "Merchant ID pertaining to the owner of the catalog product group.")
  private String merchantId;

 /**
  * Name of catalog product group
  */
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  private String name;

 /**
  * Object holding a list of filters
  */
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
  private Object filters;

 /**
  * Object holding a list of filters
  */
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
  private Object filterV2;

  @ApiModelProperty(value = "")
  @Valid
  private Board type;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;

 /**
  * id of the feed profile belonging to this catalog product group
  */
  @ApiModelProperty(value = "id of the feed profile belonging to this catalog product group")
  private String feedProfileId;

 /**
  * Unix timestamp in seconds of when catalog product group was created.
  */
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  private Integer createdAt;

 /**
  * Unix timestamp in seconds of last time catalog product group was updated.
  */
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  private Integer lastUpdate;

 /**
  * Amount of products in the catalog product group
  */
  @ApiModelProperty(example = "6", value = "Amount of products in the catalog product group")
  private Integer productCount;

 /**
  * index of the featured position of the catalog product group
  */
  @ApiModelProperty(example = "2", value = "index of the featured position of the catalog product group")
  private Integer featuredPosition;
 /**
  * ID of the catalog product group.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Merchant ID pertaining to the owner of the catalog product group.
  * @return merchantId
  */
  @JsonProperty("merchant_id")
 @Pattern(regexp="^\\d+$")  public String getMerchantId() {
    return merchantId;
  }

  /**
   * Sets the <code>merchantId</code> property.
   */
 public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * Sets the <code>merchantId</code> property.
   */
  public CatalogProductGroup merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

 /**
  * Name of catalog product group
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CatalogProductGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Object holding a list of filters
  * @return filters
  */
  @JsonProperty("filters")
  public Object getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(Object filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogProductGroup filters(Object filters) {
    this.filters = filters;
    return this;
  }

 /**
  * Object holding a list of filters
  * @return filterV2
  */
  @JsonProperty("filter_v2")
  public Object getFilterV2() {
    return filterV2;
  }

  /**
   * Sets the <code>filterV2</code> property.
   */
 public void setFilterV2(Object filterV2) {
    this.filterV2 = filterV2;
  }

  /**
   * Sets the <code>filterV2</code> property.
   */
  public CatalogProductGroup filterV2(Object filterV2) {
    this.filterV2 = filterV2;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public Board getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(Board type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CatalogProductGroup type(Board type) {
    this.type = type;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogProductGroup status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * id of the feed profile belonging to this catalog product group
  * @return feedProfileId
  */
  @JsonProperty("feed_profile_id")
 @Pattern(regexp="^\\d+$")  public String getFeedProfileId() {
    return feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
 public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
  public CatalogProductGroup feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
  * Unix timestamp in seconds of when catalog product group was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public CatalogProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Unix timestamp in seconds of last time catalog product group was updated.
  * @return lastUpdate
  */
  @JsonProperty("last_update")
  public Integer getLastUpdate() {
    return lastUpdate;
  }

  /**
   * Sets the <code>lastUpdate</code> property.
   */
 public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Sets the <code>lastUpdate</code> property.
   */
  public CatalogProductGroup lastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

 /**
  * Amount of products in the catalog product group
  * @return productCount
  */
  @JsonProperty("product_count")
  public Integer getProductCount() {
    return productCount;
  }

  /**
   * Sets the <code>productCount</code> property.
   */
 public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

  /**
   * Sets the <code>productCount</code> property.
   */
  public CatalogProductGroup productCount(Integer productCount) {
    this.productCount = productCount;
    return this;
  }

 /**
  * index of the featured position of the catalog product group
  * @return featuredPosition
  */
  @JsonProperty("featured_position")
  public Integer getFeaturedPosition() {
    return featuredPosition;
  }

  /**
   * Sets the <code>featuredPosition</code> property.
   */
 public void setFeaturedPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
  }

  /**
   * Sets the <code>featuredPosition</code> property.
   */
  public CatalogProductGroup featuredPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

