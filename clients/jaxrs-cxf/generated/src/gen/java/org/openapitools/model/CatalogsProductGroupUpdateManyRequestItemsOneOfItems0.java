package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0  {
  
  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsProductGroupFiltersRequest filters;

 /**
  * boolean indicator of whether the product group is being featured or not
  */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")

  private Boolean isFeatured;

  @ApiModelProperty(value = "")

  private String name;

 /**
  * ID of the product group.
  */
  @ApiModelProperty(required = true, value = "ID of the product group.")

  private String id;
 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

 /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 name(String name) {
    this.name = name;
    return this;
  }

 /**
   * ID of the product group.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 id(String id) {
    this.id = id;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

