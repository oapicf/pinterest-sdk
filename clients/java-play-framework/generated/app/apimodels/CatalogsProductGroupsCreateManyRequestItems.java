package apimodels;

import apimodels.CatalogsLocale;
import apimodels.CatalogsProductGroupCreateRequest;
import apimodels.CatalogsProductGroupFiltersRequest;
import apimodels.CatalogsVerticalProductGroupCreateRequest;
import apimodels.Country;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsProductGroupsCreateManyRequestItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupsCreateManyRequestItems   {
  @JsonProperty("description")
  
  private String description;

  @JsonProperty("feed_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String feedId;

  @JsonProperty("filters")
  @NotNull
@Valid

  private CatalogsProductGroupFiltersRequest filters;

  @JsonProperty("is_featured")
  
  private Boolean isFeatured;

  @JsonProperty("name")
  @NotNull

  private String name;

  public CatalogsProductGroupsCreateManyRequestItems description(String description) {
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

  public CatalogsProductGroupsCreateManyRequestItems feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Catalog Feed id pertaining to the catalog product group.
   * @return feedId
  **/
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsProductGroupsCreateManyRequestItems filters(CatalogsProductGroupFiltersRequest filters) {
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

  public CatalogsProductGroupsCreateManyRequestItems isFeatured(Boolean isFeatured) {
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

  public CatalogsProductGroupsCreateManyRequestItems name(String name) {
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
    CatalogsProductGroupsCreateManyRequestItems catalogsProductGroupsCreateManyRequestItems = (CatalogsProductGroupsCreateManyRequestItems) o;
    return Objects.equals(description, catalogsProductGroupsCreateManyRequestItems.description) &&
        Objects.equals(feedId, catalogsProductGroupsCreateManyRequestItems.feedId) &&
        Objects.equals(filters, catalogsProductGroupsCreateManyRequestItems.filters) &&
        Objects.equals(isFeatured, catalogsProductGroupsCreateManyRequestItems.isFeatured) &&
        Objects.equals(name, catalogsProductGroupsCreateManyRequestItems.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, filters, isFeatured, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsCreateManyRequestItems {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

