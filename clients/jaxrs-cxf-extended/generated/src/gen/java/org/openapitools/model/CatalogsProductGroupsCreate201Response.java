package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroup;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.openapitools.model.CatalogsVerticalProductGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupsCreate201Response  {
  
 /**
  * ID of the catalog product group.
  */
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
  private String id;

 /**
  * Name of catalog product group
  */
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupFilters filters;

 /**
  * boolean indicator of whether the product group is being featured or not
  */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  private Boolean isFeatured;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupType type;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupStatus status;

 /**
  * Unix timestamp in seconds of when catalog product group was created.
  */
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  private Integer createdAt;

 /**
  * Unix timestamp in seconds of last time catalog product group was updated.
  */
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  private Integer updatedAt;

 /**
  * id of the catalogs feed belonging to this catalog product group
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
  private String feedId;

public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));

    private String value;

    CatalogTypeEnum (String v) {
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

  @ApiModelProperty(value = "")
  private CatalogTypeEnum catalogType;
 /**
  * ID of the catalog product group.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
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
  public CatalogsProductGroupsCreate201Response id(String id) {
    this.id = id;
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
  public CatalogsProductGroupsCreate201Response name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public CatalogsProductGroupsCreate201Response description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsProductGroupsCreate201Response filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

 /**
  * boolean indicator of whether the product group is being featured or not
  * @return isFeatured
  */
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * Sets the <code>isFeatured</code> property.
   */
 public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   * Sets the <code>isFeatured</code> property.
   */
  public CatalogsProductGroupsCreate201Response isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CatalogsProductGroupsCreate201Response type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogsProductGroupsCreate201Response status(CatalogsProductGroupStatus status) {
    this.status = status;
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
  public CatalogsProductGroupsCreate201Response createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Unix timestamp in seconds of last time catalog product group was updated.
  * @return updatedAt
  */
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public CatalogsProductGroupsCreate201Response updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
  * id of the catalogs feed belonging to this catalog product group
  * @return feedId
  */
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
 public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
  public CatalogsProductGroupsCreate201Response feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsProductGroupsCreate201Response catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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
    CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate201Response = (CatalogsProductGroupsCreate201Response) o;
    return Objects.equals(this.id, catalogsProductGroupsCreate201Response.id) &&
        Objects.equals(this.name, catalogsProductGroupsCreate201Response.name) &&
        Objects.equals(this.description, catalogsProductGroupsCreate201Response.description) &&
        Objects.equals(this.filters, catalogsProductGroupsCreate201Response.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsCreate201Response.isFeatured) &&
        Objects.equals(this.type, catalogsProductGroupsCreate201Response.type) &&
        Objects.equals(this.status, catalogsProductGroupsCreate201Response.status) &&
        Objects.equals(this.createdAt, catalogsProductGroupsCreate201Response.createdAt) &&
        Objects.equals(this.updatedAt, catalogsProductGroupsCreate201Response.updatedAt) &&
        Objects.equals(this.feedId, catalogsProductGroupsCreate201Response.feedId) &&
        Objects.equals(this.catalogType, catalogsProductGroupsCreate201Response.catalogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, filters, isFeatured, type, status, createdAt, updatedAt, feedId, catalogType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsCreate201Response {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

