package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object for updating a product group.
 **/
@ApiModel(description = "Request object for updating a product group.")
@JsonTypeName("CatalogsProductGroupUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class CatalogsProductGroupUpdateRequest   {
  
  private @Valid String feedId;
  private @Valid String name;
  private @Valid String description;
  private @Valid CatalogsProductGroupFilters filters;

  /**
   * Catalog Feed id pertaining to the catalog product group.
   **/
  public CatalogsProductGroupUpdateRequest feedId(String feedId) {
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

/**
   **/
  public CatalogsProductGroupUpdateRequest name(String name) {
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
  public CatalogsProductGroupUpdateRequest description(String description) {
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
  public CatalogsProductGroupUpdateRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  @JsonProperty("filters")
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
    CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = (CatalogsProductGroupUpdateRequest) o;
    return Objects.equals(this.feedId, catalogsProductGroupUpdateRequest.feedId) &&
        Objects.equals(this.name, catalogsProductGroupUpdateRequest.name) &&
        Objects.equals(this.description, catalogsProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsProductGroupUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, name, description, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUpdateRequest {\n");
    
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

