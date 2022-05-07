package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * catalog product group entity
 **/
@ApiModel(description = "catalog product group entity")
@JsonTypeName("CatalogsProductGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class CatalogsProductGroup   {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid String description;
  private @Valid CatalogsProductGroupFilters filters;
  private @Valid CatalogsProductGroupType type;
  private @Valid CatalogsProductGroupStatus status;
  private @Valid String feedId;
  private @Valid Integer createdAt;
  private @Valid Integer updatedAt;

  /**
   * ID of the catalog product group.
   **/
  public CatalogsProductGroup id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the catalog product group.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   * Name of catalog product group
   **/
  public CatalogsProductGroup name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public CatalogsProductGroup description(String description) {
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
  public CatalogsProductGroup filters(CatalogsProductGroupFilters filters) {
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

/**
   **/
  public CatalogsProductGroup type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

/**
   **/
  public CatalogsProductGroup status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

/**
   * id of the catalogs feed belonging to this catalog product group
   **/
  public CatalogsProductGroup feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  

  
  @ApiModelProperty(value = "id of the catalogs feed belonging to this catalog product group")
  @JsonProperty("feed_id")
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  @JsonProperty("feed_id")
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

/**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  public CatalogsProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

/**
   * Unix timestamp in seconds of last time catalog product group was updated.
   **/
  public CatalogsProductGroup updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroup catalogsProductGroup = (CatalogsProductGroup) o;
    return Objects.equals(this.id, catalogsProductGroup.id) &&
        Objects.equals(this.name, catalogsProductGroup.name) &&
        Objects.equals(this.description, catalogsProductGroup.description) &&
        Objects.equals(this.filters, catalogsProductGroup.filters) &&
        Objects.equals(this.type, catalogsProductGroup.type) &&
        Objects.equals(this.status, catalogsProductGroup.status) &&
        Objects.equals(this.feedId, catalogsProductGroup.feedId) &&
        Objects.equals(this.createdAt, catalogsProductGroup.createdAt) &&
        Objects.equals(this.updatedAt, catalogsProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, filters, type, status, feedId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

