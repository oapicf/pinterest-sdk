package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="catalog product group entity")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")
public class CatalogsProductGroup   {
  

  private String id;

  private String name;

  private String description;

  private CatalogsProductGroupFilters filters;

  private CatalogsProductGroupType type;

  private CatalogsProductGroupStatus status;

  private String feedId;

  private Integer createdAt;

  private Integer updatedAt;

  /**
   * ID of the catalog product group.
   **/
  
  @ApiModelProperty(example = "2680059592705", required = true, value = "ID of the catalog product group.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of catalog product group
   **/
  
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  /**
   * id of the catalogs feed belonging to this catalog product group
   **/
  
  @ApiModelProperty(value = "id of the catalogs feed belonging to this catalog product group")
  @JsonProperty("feed_id")
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   **/
  
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
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
    return Objects.equals(id, catalogsProductGroup.id) &&
        Objects.equals(name, catalogsProductGroup.name) &&
        Objects.equals(description, catalogsProductGroup.description) &&
        Objects.equals(filters, catalogsProductGroup.filters) &&
        Objects.equals(type, catalogsProductGroup.type) &&
        Objects.equals(status, catalogsProductGroup.status) &&
        Objects.equals(feedId, catalogsProductGroup.feedId) &&
        Objects.equals(createdAt, catalogsProductGroup.createdAt) &&
        Objects.equals(updatedAt, catalogsProductGroup.updatedAt);
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

