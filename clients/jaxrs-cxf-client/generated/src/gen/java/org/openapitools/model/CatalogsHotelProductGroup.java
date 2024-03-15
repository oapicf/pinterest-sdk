package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelProductGroup  {
  
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

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the hotel product group.")
 /**
   * ID of the hotel product group.
  **/
  private String id;

  @ApiModelProperty(example = "Most Popular", value = "Name of hotel product group")
 /**
   * Name of hotel product group
  **/
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(required = true, value = "")
  private CatalogsHotelProductGroupFilters filters;

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

  @ApiModelProperty(required = true, value = "")
  private String catalogId;
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

  public CatalogsHotelProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * ID of the hotel product group.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
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
   * Name of hotel product group
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

 /**
   * Get catalogId
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsHotelProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
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
    return Objects.equals(this.catalogType, catalogsHotelProductGroup.catalogType) &&
        Objects.equals(this.id, catalogsHotelProductGroup.id) &&
        Objects.equals(this.name, catalogsHotelProductGroup.name) &&
        Objects.equals(this.description, catalogsHotelProductGroup.description) &&
        Objects.equals(this.filters, catalogsHotelProductGroup.filters) &&
        Objects.equals(this.createdAt, catalogsHotelProductGroup.createdAt) &&
        Objects.equals(this.updatedAt, catalogsHotelProductGroup.updatedAt) &&
        Objects.equals(this.catalogId, catalogsHotelProductGroup.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, createdAt, updatedAt, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroup {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

