/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.CatalogsProductGroup;
import org.openapitools.client.model.CatalogsProductGroupFilters;
import org.openapitools.client.model.CatalogsProductGroupStatus;
import org.openapitools.client.model.CatalogsProductGroupType;
import org.openapitools.client.model.CatalogsVerticalProductGroup;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsProductGroupsList200ResponseAllOfItemsInner {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("filters")
  private CatalogsProductGroupFilters filters = null;
  @SerializedName("is_featured")
  private Boolean isFeatured = null;
  @SerializedName("type")
  private CatalogsProductGroupType type = null;
  @SerializedName("status")
  private CatalogsProductGroupStatus status = null;
  @SerializedName("created_at")
  private Integer createdAt = null;
  @SerializedName("updated_at")
  private Integer updatedAt = null;
  public enum FeedIdEnum {
     , 
  };
  @SerializedName("feed_id")
  private FeedIdEnum feedId = null;
  public enum CatalogTypeEnum {
     RETAIL, 
  };
  @SerializedName("catalog_type")
  private CatalogTypeEnum catalogType = null;
  @SerializedName("catalog_id")
  private String catalogId = null;

  /**
   * ID of the catalog product group.
   **/
  @ApiModelProperty(required = true, value = "ID of the catalog product group.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of catalog product group
   **/
  @ApiModelProperty(value = "Name of catalog product group")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   **/
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsProductGroupType getType() {
    return type;
  }
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds of when catalog product group was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds of last time catalog product group was updated.")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FeedIdEnum getFeedId() {
    return feedId;
  }
  public void setFeedId(FeedIdEnum feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupsList200ResponseAllOfItemsInner catalogsProductGroupsList200ResponseAllOfItemsInner = (CatalogsProductGroupsList200ResponseAllOfItemsInner) o;
    return (this.id == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.id == null : this.id.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.id)) &&
        (this.name == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.name == null : this.name.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.name)) &&
        (this.description == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.description == null : this.description.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.description)) &&
        (this.filters == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.filters == null : this.filters.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.filters)) &&
        (this.isFeatured == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.isFeatured == null : this.isFeatured.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.isFeatured)) &&
        (this.type == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.type == null : this.type.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.type)) &&
        (this.status == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.status == null : this.status.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.status)) &&
        (this.createdAt == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.createdAt == null : this.createdAt.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.createdAt)) &&
        (this.updatedAt == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.updatedAt == null : this.updatedAt.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.updatedAt)) &&
        (this.feedId == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.feedId == null : this.feedId.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.feedId)) &&
        (this.catalogType == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.catalogType == null : this.catalogType.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.catalogType)) &&
        (this.catalogId == null ? catalogsProductGroupsList200ResponseAllOfItemsInner.catalogId == null : this.catalogId.equals(catalogsProductGroupsList200ResponseAllOfItemsInner.catalogId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    result = 31 * result + (this.isFeatured == null ? 0: this.isFeatured.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.feedId == null ? 0: this.feedId.hashCode());
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.catalogId == null ? 0: this.catalogId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsList200ResponseAllOfItemsInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("  isFeatured: ").append(isFeatured).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  feedId: ").append(feedId).append("\n");
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  catalogId: ").append(catalogId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}