package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroup;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.openapitools.model.CatalogsRetailProductGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelProductGroup.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroup.class, name = "RETAIL"),
})

public class CatalogsVerticalProductGroup   {
  

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");
    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CatalogTypeEnum catalogType;
  private String id;
  private String name;
  private String description;
  private CatalogsProductGroupFilters filters;
  private Integer createdAt;
  private Integer updatedAt;
  private String catalogId;
  private Boolean isFeatured;
  private CatalogsProductGroupType type;
  private CatalogsProductGroupStatus status;

  /**
   * Gets or Sets feedId
   */
  public enum FeedIdEnum {
    NULL("null");
    private String value;

    FeedIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FeedIdEnum feedId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * ID of the catalog product group.
   **/
  
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
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
  @Valid
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
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

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   **/
  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
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
  @Valid
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("feed_id")
  @NotNull
  public FeedIdEnum getFeedId() {
    return feedId;
  }
  public void setFeedId(FeedIdEnum feedId) {
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
    CatalogsVerticalProductGroup catalogsVerticalProductGroup = (CatalogsVerticalProductGroup) o;
    return Objects.equals(this.catalogType, catalogsVerticalProductGroup.catalogType) &&
        Objects.equals(this.id, catalogsVerticalProductGroup.id) &&
        Objects.equals(this.name, catalogsVerticalProductGroup.name) &&
        Objects.equals(this.description, catalogsVerticalProductGroup.description) &&
        Objects.equals(this.filters, catalogsVerticalProductGroup.filters) &&
        Objects.equals(this.createdAt, catalogsVerticalProductGroup.createdAt) &&
        Objects.equals(this.updatedAt, catalogsVerticalProductGroup.updatedAt) &&
        Objects.equals(this.catalogId, catalogsVerticalProductGroup.catalogId) &&
        Objects.equals(this.isFeatured, catalogsVerticalProductGroup.isFeatured) &&
        Objects.equals(this.type, catalogsVerticalProductGroup.type) &&
        Objects.equals(this.status, catalogsVerticalProductGroup.status) &&
        Objects.equals(this.feedId, catalogsVerticalProductGroup.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, createdAt, updatedAt, catalogId, isFeatured, type, status, feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroup {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

