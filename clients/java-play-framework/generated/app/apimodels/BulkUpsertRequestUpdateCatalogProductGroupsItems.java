package apimodels;

import apimodels.CatalogsLocale;
import apimodels.CatalogsProductGroupFiltersRequest;
import apimodels.CatalogsProductGroupUpdateRequest;
import apimodels.CatalogsVerticalProductGroupUpdateRequest;
import apimodels.Country;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BulkUpsertRequestUpdateCatalogProductGroupsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkUpsertRequestUpdateCatalogProductGroupsItems   {
  @JsonProperty("description")
  
  private String description;

  @JsonProperty("filters")
  @Valid

  private CatalogsProductGroupFiltersRequest filters;

  @JsonProperty("is_featured")
  
  private Boolean isFeatured;

  @JsonProperty("name")
  
  private String name;

  public BulkUpsertRequestUpdateCatalogProductGroupsItems description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BulkUpsertRequestUpdateCatalogProductGroupsItems filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public BulkUpsertRequestUpdateCatalogProductGroupsItems isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public BulkUpsertRequestUpdateCatalogProductGroupsItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
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
    BulkUpsertRequestUpdateCatalogProductGroupsItems bulkUpsertRequestUpdateCatalogProductGroupsItems = (BulkUpsertRequestUpdateCatalogProductGroupsItems) o;
    return Objects.equals(description, bulkUpsertRequestUpdateCatalogProductGroupsItems.description) &&
        Objects.equals(filters, bulkUpsertRequestUpdateCatalogProductGroupsItems.filters) &&
        Objects.equals(isFeatured, bulkUpsertRequestUpdateCatalogProductGroupsItems.isFeatured) &&
        Objects.equals(name, bulkUpsertRequestUpdateCatalogProductGroupsItems.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, filters, isFeatured, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

