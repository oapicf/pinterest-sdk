package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsProductGroupFiltersRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsProductGroupFiltersRequest filters;

  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @ApiModelProperty(value = "")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the product group.
   * @return id
   */
  @ApiModelProperty(required = true, value = "ID of the product group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 catalogsProductGroupUpdateManyRequestItemsOneOfItems0 = (CatalogsProductGroupUpdateManyRequestItemsOneOfItems0) o;
    return Objects.equals(this.description, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.description) &&
        Objects.equals(this.filters, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.name) &&
        Objects.equals(this.id, catalogsProductGroupUpdateManyRequestItemsOneOfItems0.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, filters, isFeatured, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

