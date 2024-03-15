package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object for updating a hotel product group.
 */
@ApiModel(description="Request object for updating a hotel product group.")

public class CatalogsHotelProductGroupUpdateRequest  {
  
public enum CatalogTypeEnum {

    @JsonProperty("HOTEL") HOTEL(String.valueOf("HOTEL"));

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

  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsHotelProductGroupFilters filters;
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
  public CatalogsHotelProductGroupUpdateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get name
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
  public CatalogsHotelProductGroupUpdateRequest name(String name) {
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
  public CatalogsHotelProductGroupUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  public CatalogsHotelProductGroupFilters getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsHotelProductGroupUpdateRequest filters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
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
    CatalogsHotelProductGroupUpdateRequest catalogsHotelProductGroupUpdateRequest = (CatalogsHotelProductGroupUpdateRequest) o;
    return Objects.equals(this.catalogType, catalogsHotelProductGroupUpdateRequest.catalogType) &&
        Objects.equals(this.name, catalogsHotelProductGroupUpdateRequest.name) &&
        Objects.equals(this.description, catalogsHotelProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsHotelProductGroupUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupUpdateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

