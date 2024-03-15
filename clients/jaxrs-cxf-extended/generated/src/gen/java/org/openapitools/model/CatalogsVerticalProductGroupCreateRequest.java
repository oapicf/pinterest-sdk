package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupCreateRequest;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupCreateRequest.class, name = "HOTEL"),
})

/**
 * Request object for creating a hotel product group.
 */
@ApiModel(description="Request object for creating a hotel product group.")

public class CatalogsVerticalProductGroupCreateRequest  {
  
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

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsHotelProductGroupFilters filters;

 /**
  * Catalog id pertaining to the hotel product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the hotel product group.")
  private String catalogId;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
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
  public CatalogsVerticalProductGroupCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
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
  public CatalogsVerticalProductGroupCreateRequest name(String name) {
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
  public CatalogsVerticalProductGroupCreateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
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
  public CatalogsVerticalProductGroupCreateRequest filters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

 /**
  * Catalog id pertaining to the hotel product group.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsVerticalProductGroupCreateRequest catalogId(String catalogId) {
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
    CatalogsVerticalProductGroupCreateRequest catalogsVerticalProductGroupCreateRequest = (CatalogsVerticalProductGroupCreateRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalProductGroupCreateRequest.catalogType) &&
        Objects.equals(this.name, catalogsVerticalProductGroupCreateRequest.name) &&
        Objects.equals(this.description, catalogsVerticalProductGroupCreateRequest.description) &&
        Objects.equals(this.filters, catalogsVerticalProductGroupCreateRequest.filters) &&
        Objects.equals(this.catalogId, catalogsVerticalProductGroupCreateRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroupCreateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

