package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.CatalogsVerticalProductGroupCreateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("catalogs_product_groups_create_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupsCreateRequest   {
  private @Valid String name;
  private @Valid String description;
  private @Valid Boolean isFeatured = false;
  private @Valid CatalogsProductGroupFiltersRequest filters;
  private @Valid String feedId;

  /**
   **/
  public CatalogsProductGroupsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsProductGroupsCreateRequest description(String description) {
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
   * boolean indicator of whether the product group is being featured or not
   **/
  public CatalogsProductGroupsCreateRequest isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  @JsonProperty("is_featured")
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  public CatalogsProductGroupsCreateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  @JsonProperty("filters")
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group.
   **/
  public CatalogsProductGroupsCreateRequest feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group.")
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  @JsonProperty("feed_id")
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
    CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest = (CatalogsProductGroupsCreateRequest) o;
    return Objects.equals(this.name, catalogsProductGroupsCreateRequest.name) &&
        Objects.equals(this.description, catalogsProductGroupsCreateRequest.description) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsCreateRequest.isFeatured) &&
        Objects.equals(this.filters, catalogsProductGroupsCreateRequest.filters) &&
        Objects.equals(this.feedId, catalogsProductGroupsCreateRequest.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isFeatured, filters, feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsCreateRequest {\n");
    
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

