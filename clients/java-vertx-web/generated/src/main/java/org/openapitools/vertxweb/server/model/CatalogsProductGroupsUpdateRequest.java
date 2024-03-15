package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroupUpdateRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupsUpdateRequest   {
  
  private String name;
  private String description;
  private Boolean isFeatured;
  private CatalogsProductGroupFiltersRequest filters;

  public CatalogsProductGroupsUpdateRequest () {

  }

  public CatalogsProductGroupsUpdateRequest (String name, String description, Boolean isFeatured, CatalogsProductGroupFiltersRequest filters) {
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
    CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = (CatalogsProductGroupsUpdateRequest) o;
    return Objects.equals(name, catalogsProductGroupsUpdateRequest.name) &&
        Objects.equals(description, catalogsProductGroupsUpdateRequest.description) &&
        Objects.equals(isFeatured, catalogsProductGroupsUpdateRequest.isFeatured) &&
        Objects.equals(filters, catalogsProductGroupsUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isFeatured, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsUpdateRequest {\n");
    
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
