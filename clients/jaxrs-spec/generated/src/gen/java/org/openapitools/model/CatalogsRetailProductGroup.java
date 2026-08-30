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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsRetailProductGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailProductGroup   {
  private String catalogId;
  public enum CatalogTypeEnum {

    RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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
  private String country;
  private Integer createdAt;
  private String description;
  private String feedId;
  private CatalogsProductGroupFilters filters;
  private String id;
  @Deprecated
  private Boolean isFeatured;
  private String locale;
  private String name;
  private CatalogsProductGroupStatus status;
  private CatalogsProductGroupType type;
  private Integer updatedAt;

  public CatalogsRetailProductGroup() {
  }

  @JsonCreator
  public CatalogsRetailProductGroup(
    @JsonProperty(required = true, value = "catalog_id") String catalogId,
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType,
    @JsonProperty(required = true, value = "feed_id") String feedId,
    @JsonProperty(required = true, value = "filters") CatalogsProductGroupFilters filters,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "type") CatalogsProductGroupType type
  ) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.feedId = feedId;
    this.filters = filters;
    this.id = id;
    this.type = type;
  }

  /**
   * Catalog ID pertaining to the product group.
   **/
  public CatalogsRetailProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog ID pertaining to the product group.")
  @JsonProperty(required = true, value = "catalog_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty(required = true, value = "catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   **/
  public CatalogsRetailProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsRetailProductGroup country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   **/
  public CatalogsRetailProductGroup createdAt(Integer createdAt) {
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
   **/
  public CatalogsRetailProductGroup description(String description) {
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
   * id of the catalogs feed belonging to this catalog product group
   **/
  public CatalogsRetailProductGroup feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
  @JsonProperty(required = true, value = "feed_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getFeedId() {
    return feedId;
  }

  @JsonProperty(required = true, value = "feed_id")
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  public CatalogsRetailProductGroup filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "filters")
  @NotNull @Valid public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  @JsonProperty(required = true, value = "filters")
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * ID of the catalog product group.
   **/
  public CatalogsRetailProductGroup id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @deprecated
   **/
  @Deprecated
  public CatalogsRetailProductGroup isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * @deprecated
   */
  @Deprecated
  
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * @deprecated
   */
  @Deprecated
  @JsonProperty("is_featured")
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   **/
  public CatalogsRetailProductGroup locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Name of catalog product group
   **/
  public CatalogsRetailProductGroup name(String name) {
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
  public CatalogsRetailProductGroup status(CatalogsProductGroupStatus status) {
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
   **/
  public CatalogsRetailProductGroup type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull public CatalogsProductGroupType getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   **/
  public CatalogsRetailProductGroup updatedAt(Integer updatedAt) {
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
    CatalogsRetailProductGroup catalogsRetailProductGroup = (CatalogsRetailProductGroup) o;
    return Objects.equals(this.catalogId, catalogsRetailProductGroup.catalogId) &&
        Objects.equals(this.catalogType, catalogsRetailProductGroup.catalogType) &&
        Objects.equals(this.country, catalogsRetailProductGroup.country) &&
        Objects.equals(this.createdAt, catalogsRetailProductGroup.createdAt) &&
        Objects.equals(this.description, catalogsRetailProductGroup.description) &&
        Objects.equals(this.feedId, catalogsRetailProductGroup.feedId) &&
        Objects.equals(this.filters, catalogsRetailProductGroup.filters) &&
        Objects.equals(this.id, catalogsRetailProductGroup.id) &&
        Objects.equals(this.isFeatured, catalogsRetailProductGroup.isFeatured) &&
        Objects.equals(this.locale, catalogsRetailProductGroup.locale) &&
        Objects.equals(this.name, catalogsRetailProductGroup.name) &&
        Objects.equals(this.status, catalogsRetailProductGroup.status) &&
        Objects.equals(this.type, catalogsRetailProductGroup.type) &&
        Objects.equals(this.updatedAt, catalogsRetailProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, createdAt, description, feedId, filters, id, isFeatured, locale, name, status, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroup {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
