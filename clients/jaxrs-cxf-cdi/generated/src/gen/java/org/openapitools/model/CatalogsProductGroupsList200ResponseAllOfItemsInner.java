package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroup;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.openapitools.model.CatalogsVerticalProductGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsProductGroupsList200ResponseAllOfItemsInner   {
  
  private String id;

  private String name;

  private String description;

  private CatalogsProductGroupFilters filters;

  private Boolean isFeatured;

  private CatalogsProductGroupType type;

  private CatalogsProductGroupStatus status;

  private Integer createdAt;

  private Integer updatedAt;

  private String feedId;


public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CatalogTypeEnum catalogType;

  /**
   * ID of the catalog product group.
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of catalog product group
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner name(String name) {
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
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }


  /**
   * boolean indicator of whether the product group is being featured or not
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }


  /**
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }


  /**
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }


  /**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner createdAt(Integer createdAt) {
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
  public CatalogsProductGroupsList200ResponseAllOfItemsInner updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * id of the catalogs feed belonging to this catalog product group
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }


  /**
   **/
  public CatalogsProductGroupsList200ResponseAllOfItemsInner catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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
    return Objects.equals(this.id, catalogsProductGroupsList200ResponseAllOfItemsInner.id) &&
        Objects.equals(this.name, catalogsProductGroupsList200ResponseAllOfItemsInner.name) &&
        Objects.equals(this.description, catalogsProductGroupsList200ResponseAllOfItemsInner.description) &&
        Objects.equals(this.filters, catalogsProductGroupsList200ResponseAllOfItemsInner.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsList200ResponseAllOfItemsInner.isFeatured) &&
        Objects.equals(this.type, catalogsProductGroupsList200ResponseAllOfItemsInner.type) &&
        Objects.equals(this.status, catalogsProductGroupsList200ResponseAllOfItemsInner.status) &&
        Objects.equals(this.createdAt, catalogsProductGroupsList200ResponseAllOfItemsInner.createdAt) &&
        Objects.equals(this.updatedAt, catalogsProductGroupsList200ResponseAllOfItemsInner.updatedAt) &&
        Objects.equals(this.feedId, catalogsProductGroupsList200ResponseAllOfItemsInner.feedId) &&
        Objects.equals(this.catalogType, catalogsProductGroupsList200ResponseAllOfItemsInner.catalogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, filters, isFeatured, type, status, createdAt, updatedAt, feedId, catalogType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsList200ResponseAllOfItemsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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

