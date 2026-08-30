package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelProductGroup  {
  
 /**
  * Catalog ID pertaining to the product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog ID pertaining to the product group.")

  private String catalogId;

public enum CatalogTypeEnum {

HOTEL(String.valueOf("HOTEL"));


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

  @ApiModelProperty(required = true, value = "")

  private CatalogTypeEnum catalogType;

 /**
  * Unix timestamp in seconds of when catalog product group was created.
  */
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")

  private Integer createdAt;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsHotelProductGroupFilters filters;

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

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsHotelProductGroupType type;

 /**
  * Unix timestamp in seconds of last time catalog product group was updated.
  */
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")

  private Integer updatedAt;
 /**
   * Catalog ID pertaining to the product group.
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsHotelProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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

  public CatalogsHotelProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
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

  public CatalogsHotelProductGroup description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  @NotNull
  public CatalogsHotelProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsHotelProductGroup filters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

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

  public CatalogsHotelProductGroup id(String id) {
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

  public CatalogsHotelProductGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public CatalogsHotelProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsHotelProductGroupType type) {
    this.type = type;
  }

  public CatalogsHotelProductGroup type(CatalogsHotelProductGroupType type) {
    this.type = type;
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

  public CatalogsHotelProductGroup updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
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
    CatalogsHotelProductGroup catalogsHotelProductGroup = (CatalogsHotelProductGroup) o;
    return Objects.equals(this.catalogId, catalogsHotelProductGroup.catalogId) &&
        Objects.equals(this.catalogType, catalogsHotelProductGroup.catalogType) &&
        Objects.equals(this.createdAt, catalogsHotelProductGroup.createdAt) &&
        Objects.equals(this.description, catalogsHotelProductGroup.description) &&
        Objects.equals(this.filters, catalogsHotelProductGroup.filters) &&
        Objects.equals(this.id, catalogsHotelProductGroup.id) &&
        Objects.equals(this.name, catalogsHotelProductGroup.name) &&
        Objects.equals(this.type, catalogsHotelProductGroup.type) &&
        Objects.equals(this.updatedAt, catalogsHotelProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, description, filters, id, name, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroup {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

