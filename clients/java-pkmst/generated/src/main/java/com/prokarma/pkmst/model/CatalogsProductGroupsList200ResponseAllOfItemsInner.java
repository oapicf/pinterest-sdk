package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsProductGroup;
import com.prokarma.pkmst.model.CatalogsProductGroupFilters;
import com.prokarma.pkmst.model.CatalogsProductGroupStatus;
import com.prokarma.pkmst.model.CatalogsProductGroupType;
import com.prokarma.pkmst.model.CatalogsVerticalProductGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsProductGroupsList200ResponseAllOfItemsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupsList200ResponseAllOfItemsInner   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("type")
  private CatalogsProductGroupType type;

  @JsonProperty("status")
  private CatalogsProductGroupStatus status;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("updated_at")
  private Integer updatedAt;

  @JsonProperty("feed_id")
  private String feedId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  public CatalogsProductGroupsList200ResponseAllOfItemsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the catalog product group.
   * @return id
  **/
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner name(String name) {
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

  public CatalogsProductGroupsList200ResponseAllOfItemsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public CatalogsProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner createdAt(Integer createdAt) {
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

  public CatalogsProductGroupsList200ResponseAllOfItemsInner updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * id of the catalogs feed belonging to this catalog product group
   * @return feedId
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsProductGroupsList200ResponseAllOfItemsInner catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(value = "")
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

