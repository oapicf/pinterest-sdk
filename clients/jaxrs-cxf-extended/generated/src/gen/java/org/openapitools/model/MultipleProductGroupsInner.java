package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.CatalogsVerticalProductGroupCreateRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MultipleProductGroupsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

 /**
  * boolean indicator of whether the product group is being featured or not
  */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  private Boolean isFeatured = false;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupFiltersRequest filters;

 /**
  * Catalog Feed id pertaining to the catalog product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group.")
  private String feedId;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
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
  public MultipleProductGroupsInner name(String name) {
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
  public MultipleProductGroupsInner description(String description) {
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
  public MultipleProductGroupsInner isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
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
  public MultipleProductGroupsInner filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

 /**
  * Catalog Feed id pertaining to the catalog product group.
  * @return feedId
  */
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
 public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
  public MultipleProductGroupsInner feedId(String feedId) {
    this.feedId = feedId;
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
    MultipleProductGroupsInner multipleProductGroupsInner = (MultipleProductGroupsInner) o;
    return Objects.equals(this.name, multipleProductGroupsInner.name) &&
        Objects.equals(this.description, multipleProductGroupsInner.description) &&
        Objects.equals(this.isFeatured, multipleProductGroupsInner.isFeatured) &&
        Objects.equals(this.filters, multipleProductGroupsInner.filters) &&
        Objects.equals(this.feedId, multipleProductGroupsInner.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isFeatured, filters, feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleProductGroupsInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

