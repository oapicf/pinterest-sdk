package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object for updating a hotel product group.
 */
public class CatalogsHotelProductGroupUpdateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsHotelProductGroupFilters filters;

  /**
   * Name of catalog product group
   */
  @JsonProperty("name")
  private String name;

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   * @return filters
   */
  public CatalogsHotelProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Name of catalog product group
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
        Objects.equals(this.description, catalogsHotelProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsHotelProductGroupUpdateRequest.filters) &&
        Objects.equals(this.name, catalogsHotelProductGroupUpdateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, description, filters, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupUpdateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
