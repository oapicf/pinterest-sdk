package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object for updating a product group.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object for updating a product group.")
public class CatalogsProductGroupUpdateRequest   {
  
  private String name;

  private String description;

  private Boolean isFeatured;

  private CatalogsProductGroupFiltersRequest filters;

  /**
   **/
  public CatalogsProductGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public CatalogsProductGroupUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * boolean indicator of whether the product group is being featured or not
   **/
  public CatalogsProductGroupUpdateRequest isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }


  /**
   **/
  public CatalogsProductGroupUpdateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.name, catalogsProductGroupUpdateRequest.name) &&
        Objects.equals(this.description, catalogsProductGroupUpdateRequest.description) &&
        Objects.equals(this.isFeatured, catalogsProductGroupUpdateRequest.isFeatured) &&
        Objects.equals(this.filters, catalogsProductGroupUpdateRequest.filters);
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

