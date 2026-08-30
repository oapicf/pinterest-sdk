package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.model.CatalogsVerticalProductGroupUpdateRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BulkUpsertRequestUpdateCatalogProductGroupsItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestUpdateCatalogProductGroupsItems   {
  private String description;
  private CatalogsProductGroupFiltersRequest filters;
  @Deprecated
  private Boolean isFeatured;
  private String name;

  public BulkUpsertRequestUpdateCatalogProductGroupsItems() {
  }

  /**
   **/
  public BulkUpsertRequestUpdateCatalogProductGroupsItems description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public BulkUpsertRequestUpdateCatalogProductGroupsItems filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  @JsonProperty("filters")
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   **/
  @Deprecated
  public BulkUpsertRequestUpdateCatalogProductGroupsItems isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * @deprecated
   */
  @Deprecated
  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * @deprecated
   */
  @Deprecated
  @JsonProperty("is_featured")
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  public BulkUpsertRequestUpdateCatalogProductGroupsItems name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
    BulkUpsertRequestUpdateCatalogProductGroupsItems bulkUpsertRequestUpdateCatalogProductGroupsItems = (BulkUpsertRequestUpdateCatalogProductGroupsItems) o;
    return Objects.equals(this.description, bulkUpsertRequestUpdateCatalogProductGroupsItems.description) &&
        Objects.equals(this.filters, bulkUpsertRequestUpdateCatalogProductGroupsItems.filters) &&
        Objects.equals(this.isFeatured, bulkUpsertRequestUpdateCatalogProductGroupsItems.isFeatured) &&
        Objects.equals(this.name, bulkUpsertRequestUpdateCatalogProductGroupsItems.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, filters, isFeatured, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequestUpdateCatalogProductGroupsItems {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
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
