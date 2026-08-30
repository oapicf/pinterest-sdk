package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsLocale;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroupCreateRequest;
import org.openapitools.vertxweb.server.model.Country;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupsCreateManyRequestItems   {
  
  private String description;
  private String feedId;
  private CatalogsProductGroupFiltersRequest filters;
  private Boolean isFeatured;
  private String name;

  public CatalogsProductGroupsCreateManyRequestItems () {

  }

  public CatalogsProductGroupsCreateManyRequestItems (String description, String feedId, CatalogsProductGroupFiltersRequest filters, Boolean isFeatured, String name) {
    this.description = description;
    this.feedId = feedId;
    this.filters = filters;
    this.isFeatured = isFeatured;
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

    
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

    
  @JsonProperty("name")
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
