/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CatalogsProductGroupFiltersRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request object for updating a product group.
 **/
@ApiModel(description = "Request object for updating a product group.")
public class CatalogsProductGroupUpdateRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("is_featured")
  private Boolean isFeatured = null;
  @SerializedName("filters")
  private CatalogsProductGroupFiltersRequest filters = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   **/
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.name == null ? catalogsProductGroupUpdateRequest.name == null : this.name.equals(catalogsProductGroupUpdateRequest.name)) &&
        (this.description == null ? catalogsProductGroupUpdateRequest.description == null : this.description.equals(catalogsProductGroupUpdateRequest.description)) &&
        (this.isFeatured == null ? catalogsProductGroupUpdateRequest.isFeatured == null : this.isFeatured.equals(catalogsProductGroupUpdateRequest.isFeatured)) &&
        (this.filters == null ? catalogsProductGroupUpdateRequest.filters == null : this.filters.equals(catalogsProductGroupUpdateRequest.filters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.isFeatured == null ? 0: this.isFeatured.hashCode());
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUpdateRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  isFeatured: ").append(isFeatured).append("\n");
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
