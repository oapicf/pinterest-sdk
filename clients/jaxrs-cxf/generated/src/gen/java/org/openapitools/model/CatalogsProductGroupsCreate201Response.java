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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupsCreate201Response  {
  
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
 /**
   * ID of the catalog product group.
  **/
  private String id;

  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
 /**
   * Name of catalog product group
  **/
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupFilters filters;

  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
 /**
   * boolean indicator of whether the product group is being featured or not
  **/
  private Boolean isFeatured;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupType type;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupStatus status;

  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
 /**
   * Unix timestamp in seconds of when catalog product group was created.
  **/
  private Integer createdAt;

  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
 /**
   * Unix timestamp in seconds of last time catalog product group was updated.
  **/
  private Integer updatedAt;

  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
 /**
   * id of the catalogs feed belonging to this catalog product group
  **/
  private String feedId;

public enum CatalogTypeEnum {

RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsProductGroupsCreate201Response id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Name of catalog product group
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsProductGroupsCreate201Response name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsProductGroupsCreate201Response description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupsCreate201Response filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

 /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupsCreate201Response isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  public CatalogsProductGroupsCreate201Response type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  public CatalogsProductGroupsCreate201Response status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsProductGroupsCreate201Response createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
  **/
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsProductGroupsCreate201Response updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
   * id of the catalogs feed belonging to this catalog product group
   * @return feedId
  **/
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsProductGroupsCreate201Response feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

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

