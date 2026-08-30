package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsLocale;
import com.prokarma.pkmst.model.CatalogsProductGroupCreateRequest;
import com.prokarma.pkmst.model.CatalogsProductGroupFiltersRequest;
import com.prokarma.pkmst.model.CatalogsVerticalProductGroupCreateRequest;
import com.prokarma.pkmst.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsProductGroupsCreateManyRequestItems
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupsCreateManyRequestItems   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFiltersRequest filters;

  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("name")
  private String name;

  public CatalogsProductGroupsCreateManyRequestItems description(String description) {
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

  public CatalogsProductGroupsCreateManyRequestItems feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group.
   * @return feedId
   */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group.")
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
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
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
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.description, catalogsProductGroupsCreateManyRequestItems.description) &&
        Objects.equals(this.feedId, catalogsProductGroupsCreateManyRequestItems.feedId) &&
        Objects.equals(this.filters, catalogsProductGroupsCreateManyRequestItems.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsCreateManyRequestItems.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupsCreateManyRequestItems.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, filters, isFeatured, name);
  }

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

