package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object for updating a product group.
 */
@ApiModel(description="Request object for updating a product group.")

public class CatalogsProductGroupUpdateRequest  {
  
  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

 /**
  * boolean indicator of whether the product group is being featured or not
  */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  private Boolean isFeatured;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupFiltersRequest filters;
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
  public CatalogsProductGroupUpdateRequest name(String name) {
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
  public CatalogsProductGroupUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * boolean indicator of whether the product group is being featured or not
  * @return isFeatured
  */
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * Sets the <code>isFeatured</code> property.
   */
 public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   * Sets the <code>isFeatured</code> property.
   */
  public CatalogsProductGroupUpdateRequest isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsProductGroupUpdateRequest filters(CatalogsProductGroupFiltersRequest filters) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

