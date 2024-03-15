package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;

/**
 * non-promoted catalog product group entity
 */
@ApiModel(description = "non-promoted catalog product group entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogProductGroup   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("merchant_id")
  private String merchantId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("filters")
  private Object filters;

  @JsonProperty("filter_v2")
  private Object filterV2;

  @JsonProperty("type")
  private Board type;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("last_update")
  private Integer lastUpdate;

  @JsonProperty("product_count")
  private Integer productCount;

  @JsonProperty("featured_position")
  private Integer featuredPosition;

  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the catalog product group.
   * @return id
  **/
  @ApiModelProperty(example = "2680059592705", value = "ID of the catalog product group.")
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
  **/
  @ApiModelProperty(example = "2680059592705", value = "Merchant ID pertaining to the owner of the catalog product group.")
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
  **/
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
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
  **/
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
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
  **/
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "id of the feed profile belonging to this catalog product group")
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
  **/
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
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
  **/
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
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
  **/
  @ApiModelProperty(example = "6", value = "Amount of products in the catalog product group")
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
  **/
  @ApiModelProperty(example = "2", value = "index of the featured position of the catalog product group")
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

