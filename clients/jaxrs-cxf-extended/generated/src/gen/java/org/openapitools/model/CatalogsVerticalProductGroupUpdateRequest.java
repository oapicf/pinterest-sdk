package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroupUpdateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupUpdateRequest.class, name = "HOTEL"),
})

/**
 * Request object for updating a hotel product group.
 */
@ApiModel(description="Request object for updating a hotel product group.")

public class CatalogsVerticalProductGroupUpdateRequest  {
  
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
  public CatalogsVerticalProductGroupUpdateRequest catalogType(CatalogTypeEnum catalogType) {
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
  public CatalogsVerticalProductGroupUpdateRequest name(String name) {
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
  public CatalogsVerticalProductGroupUpdateRequest description(String description) {
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
  public CatalogsVerticalProductGroupUpdateRequest filters(CatalogsHotelProductGroupFilters filters) {
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
    CatalogsVerticalProductGroupUpdateRequest catalogsVerticalProductGroupUpdateRequest = (CatalogsVerticalProductGroupUpdateRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalProductGroupUpdateRequest.catalogType) &&
        Objects.equals(this.name, catalogsVerticalProductGroupUpdateRequest.name) &&
        Objects.equals(this.description, catalogsVerticalProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsVerticalProductGroupUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroupUpdateRequest {\n");
    
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

