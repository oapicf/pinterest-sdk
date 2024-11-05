package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsLocale;
import org.openapitools.server.api.model.CatalogsProductGroupCreateRequest;
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.server.api.model.CatalogsVerticalProductGroupCreateRequest;
import org.openapitools.server.api.model.Country;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultipleProductGroupsInner   {
  
  private String name;
  private String description;
  private Boolean isFeatured = false;
  private CatalogsProductGroupFiltersRequest filters;
  private String feedId;

  public MultipleProductGroupsInner () {

  }

  public MultipleProductGroupsInner (String name, String description, Boolean isFeatured, CatalogsProductGroupFiltersRequest filters, String feedId) {
    this.name = name;
    this.description = description;
    this.isFeatured = isFeatured;
    this.filters = filters;
    this.feedId = feedId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

    
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
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
    return Objects.equals(name, multipleProductGroupsInner.name) &&
        Objects.equals(description, multipleProductGroupsInner.description) &&
        Objects.equals(isFeatured, multipleProductGroupsInner.isFeatured) &&
        Objects.equals(filters, multipleProductGroupsInner.filters) &&
        Objects.equals(feedId, multipleProductGroupsInner.feedId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
