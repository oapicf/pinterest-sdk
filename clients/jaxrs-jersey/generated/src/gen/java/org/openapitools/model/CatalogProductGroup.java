/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * non-promoted catalog product group entity
 */
@ApiModel(description = "non-promoted catalog product group entity")
@JsonPropertyOrder({
  CatalogProductGroup.JSON_PROPERTY_ID,
  CatalogProductGroup.JSON_PROPERTY_MERCHANT_ID,
  CatalogProductGroup.JSON_PROPERTY_NAME,
  CatalogProductGroup.JSON_PROPERTY_FILTERS,
  CatalogProductGroup.JSON_PROPERTY_FILTER_V2,
  CatalogProductGroup.JSON_PROPERTY_TYPE,
  CatalogProductGroup.JSON_PROPERTY_STATUS,
  CatalogProductGroup.JSON_PROPERTY_FEED_PROFILE_ID,
  CatalogProductGroup.JSON_PROPERTY_CREATED_AT,
  CatalogProductGroup.JSON_PROPERTY_LAST_UPDATE,
  CatalogProductGroup.JSON_PROPERTY_PRODUCT_COUNT,
  CatalogProductGroup.JSON_PROPERTY_FEATURED_POSITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogProductGroup   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  private String merchantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  @JsonProperty(JSON_PROPERTY_FILTERS)
  private Object filters;

  public static final String JSON_PROPERTY_FILTER_V2 = "filter_v2";
  @JsonProperty(JSON_PROPERTY_FILTER_V2)
  private Object filterV2;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private Board type;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private EntityStatus status;

  public static final String JSON_PROPERTY_FEED_PROFILE_ID = "feed_profile_id";
  @JsonProperty(JSON_PROPERTY_FEED_PROFILE_ID)
  private String feedProfileId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private Integer createdAt;

  public static final String JSON_PROPERTY_LAST_UPDATE = "last_update";
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  private Integer lastUpdate;

  public static final String JSON_PROPERTY_PRODUCT_COUNT = "product_count";
  @JsonProperty(JSON_PROPERTY_PRODUCT_COUNT)
  private Integer productCount;

  public static final String JSON_PROPERTY_FEATURED_POSITION = "featured_position";
  @JsonProperty(JSON_PROPERTY_FEATURED_POSITION)
  private Integer featuredPosition;

  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the catalog product group.
   * @return id
   **/
  @JsonProperty(value = "id")
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
  @JsonProperty(value = "merchant_id")
  @ApiModelProperty(example = "2680059592705", value = "Merchant ID pertaining to the owner of the catalog product group.")
   @Pattern(regexp="^\\d+$")
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
  @JsonProperty(value = "name")
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
  @JsonProperty(value = "filters")
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
  @JsonProperty(value = "filter_v2")
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
  @JsonProperty(value = "type")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "status")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "feed_profile_id")
  @ApiModelProperty(value = "id of the feed profile belonging to this catalog product group")
   @Pattern(regexp="^\\d+$")
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
  @JsonProperty(value = "created_at")
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
  @JsonProperty(value = "last_update")
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
  @JsonProperty(value = "product_count")
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
  @JsonProperty(value = "featured_position")
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
