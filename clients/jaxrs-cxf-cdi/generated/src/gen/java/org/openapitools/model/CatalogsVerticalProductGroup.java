package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
import java.util.Objects;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelProductGroup.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroup.class, name = "RETAIL"),
})

public class CatalogsVerticalProductGroup   {
  

public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
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


public enum FeedIdEnum {

    @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    FeedIdEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedIdEnum fromValue(String value) {
        for (FeedIdEnum b : FeedIdEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  private FeedIdEnum feedId;

  /**
   **/
  public CatalogsVerticalProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup id(String id) {
    this.id = id;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup name(String name) {
    this.name = name;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup description(String description) {
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
  public CatalogsVerticalProductGroup filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
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
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  public CatalogsVerticalProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

  
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
  public CatalogsVerticalProductGroup status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }


  /**
   **/
  public CatalogsVerticalProductGroup feedId(FeedIdEnum feedId) {
    this.feedId = feedId;
    return this;
  }

  
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

