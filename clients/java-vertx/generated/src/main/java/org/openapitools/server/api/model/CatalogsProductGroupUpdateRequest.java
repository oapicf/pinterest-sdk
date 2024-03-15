package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest;

/**
 * Request object for updating a product group.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupUpdateRequest   {
  
  private String name;
  private String description;
  private Boolean isFeatured;
  private CatalogsProductGroupFiltersRequest filters;

  public CatalogsProductGroupUpdateRequest () {

  }

  public CatalogsProductGroupUpdateRequest (String name, String description, Boolean isFeatured, CatalogsProductGroupFiltersRequest filters) {
    this.name = name;
    this.description = description;
    this.isFeatured = isFeatured;
    this.filters = filters;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

    
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = (CatalogsProductGroupUpdateRequest) o;
    return Objects.equals(name, catalogsProductGroupUpdateRequest.name) &&
        Objects.equals(description, catalogsProductGroupUpdateRequest.description) &&
        Objects.equals(isFeatured, catalogsProductGroupUpdateRequest.isFeatured) &&
        Objects.equals(filters, catalogsProductGroupUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isFeatured, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
