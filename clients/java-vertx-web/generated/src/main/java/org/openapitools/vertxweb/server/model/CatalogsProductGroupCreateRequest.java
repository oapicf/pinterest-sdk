package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupFilters;

/**
 * Request object for creating a product group.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupCreateRequest   {
  
  private String feedId;
  private String name;
  private String description;
  private CatalogsProductGroupFilters filters;

  public CatalogsProductGroupCreateRequest () {

  }

  public CatalogsProductGroupCreateRequest (String feedId, String name, String description, CatalogsProductGroupFilters filters) {
    this.feedId = feedId;
    this.name = name;
    this.description = description;
    this.filters = filters;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
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

    
  @JsonProperty("filters")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
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
    CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = (CatalogsProductGroupCreateRequest) o;
    return Objects.equals(feedId, catalogsProductGroupCreateRequest.feedId) &&
        Objects.equals(name, catalogsProductGroupCreateRequest.name) &&
        Objects.equals(description, catalogsProductGroupCreateRequest.description) &&
        Objects.equals(filters, catalogsProductGroupCreateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, name, description, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupCreateRequest {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
