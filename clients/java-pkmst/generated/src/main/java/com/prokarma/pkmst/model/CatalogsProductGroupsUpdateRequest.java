package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsProductGroupFiltersRequest;
import com.prokarma.pkmst.model.CatalogsProductGroupUpdateRequest;
import com.prokarma.pkmst.model.CatalogsVerticalProductGroupUpdateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsProductGroupsUpdateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupsUpdateRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("filters")
  private CatalogsProductGroupFiltersRequest filters;

  public CatalogsProductGroupsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsProductGroupsUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsProductGroupsUpdateRequest isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupsUpdateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
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
    CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = (CatalogsProductGroupsUpdateRequest) o;
    return Objects.equals(this.name, catalogsProductGroupsUpdateRequest.name) &&
        Objects.equals(this.description, catalogsProductGroupsUpdateRequest.description) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsUpdateRequest.isFeatured) &&
        Objects.equals(this.filters, catalogsProductGroupsUpdateRequest.filters);
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

