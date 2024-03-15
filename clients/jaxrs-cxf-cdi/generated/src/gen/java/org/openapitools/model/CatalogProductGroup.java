package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * non-promoted catalog product group entity
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "non-promoted catalog product group entity")
public class CatalogProductGroup   {
  
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

  /**
   * ID of the catalog product group.
   **/
  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the catalog product group.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Merchant ID pertaining to the owner of the catalog product group.
   **/
  public CatalogProductGroup merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Merchant ID pertaining to the owner of the catalog product group.")
  @JsonProperty("merchant_id")
 @Pattern(regexp="^\\d+$")  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  /**
   * Name of catalog product group
   **/
  public CatalogProductGroup name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Object holding a list of filters
   **/
  public CatalogProductGroup filters(Object filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
  @JsonProperty("filters")
  public Object getFilters() {
    return filters;
  }
  public void setFilters(Object filters) {
    this.filters = filters;
  }


  /**
   * Object holding a list of filters
   **/
  public CatalogProductGroup filterV2(Object filterV2) {
    this.filterV2 = filterV2;
    return this;
  }

  
  @ApiModelProperty(example = "{\"1\":[\"123chars_title\"]}", value = "Object holding a list of filters")
  @JsonProperty("filter_v2")
  public Object getFilterV2() {
    return filterV2;
  }
  public void setFilterV2(Object filterV2) {
    this.filterV2 = filterV2;
  }


  /**
   **/
  public CatalogProductGroup type(Board type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public Board getType() {
    return type;
  }
  public void setType(Board type) {
    this.type = type;
  }


  /**
   **/
  public CatalogProductGroup status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  /**
   * id of the feed profile belonging to this catalog product group
   **/
  public CatalogProductGroup feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  
  @ApiModelProperty(value = "id of the feed profile belonging to this catalog product group")
  @JsonProperty("feed_profile_id")
 @Pattern(regexp="^\\d+$")  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }


  /**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  public CatalogProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   **/
  public CatalogProductGroup lastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  @JsonProperty("last_update")
  public Integer getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  /**
   * Amount of products in the catalog product group
   **/
  public CatalogProductGroup productCount(Integer productCount) {
    this.productCount = productCount;
    return this;
  }

  
  @ApiModelProperty(example = "6", value = "Amount of products in the catalog product group")
  @JsonProperty("product_count")
  public Integer getProductCount() {
    return productCount;
  }
  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }


  /**
   * index of the featured position of the catalog product group
   **/
  public CatalogProductGroup featuredPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "index of the featured position of the catalog product group")
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

