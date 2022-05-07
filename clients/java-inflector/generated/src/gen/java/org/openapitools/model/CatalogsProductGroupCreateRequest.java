package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;



/**
 * Request object for creating a product group.
 **/

@ApiModel(description = "Request object for creating a product group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-07T06:38:14.669946Z[Etc/UTC]")
public class CatalogsProductGroupCreateRequest   {
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  /**
   * Catalog Feed id pertaining to the catalog product group.
   **/
  public CatalogsProductGroupCreateRequest feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group.")
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  public CatalogsProductGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsProductGroupCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public CatalogsProductGroupCreateRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

