package apimodels;

import apimodels.CatalogsHotelProductGroup;
import apimodels.CatalogsProductGroupFilters;
import apimodels.CatalogsProductGroupStatus;
import apimodels.CatalogsProductGroupType;
import apimodels.CatalogsRetailProductGroup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsVerticalProductGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsVerticalProductGroup   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("filters")
  @NotNull
@Valid

  private CatalogsProductGroupFilters filters;

  @JsonProperty("created_at")
  
  private Integer createdAt;

  @JsonProperty("updated_at")
  
  private Integer updatedAt;

  @JsonProperty("catalog_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("is_featured")
  
  private Boolean isFeatured;

  @JsonProperty("type")
  @Valid

  private CatalogsProductGroupType type;

  @JsonProperty("status")
  @Valid

  private CatalogsProductGroupStatus status;

  /**
   * Gets or Sets feedId
   */
  public enum FeedIdEnum {
    NULL("null");

    private final String value;

    FeedIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeedIdEnum fromValue(String value) {
      for (FeedIdEnum b : FeedIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("feed_id")
  @NotNull

  private FeedIdEnum feedId;

  public CatalogsVerticalProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsVerticalProductGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the catalog product group.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsVerticalProductGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of catalog product group
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsVerticalProductGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsVerticalProductGroup filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsVerticalProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsVerticalProductGroup updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
  **/
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsVerticalProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsVerticalProductGroup isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
  **/
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsVerticalProductGroup type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public CatalogsProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  public CatalogsVerticalProductGroup status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  public CatalogsVerticalProductGroup feedId(FeedIdEnum feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
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
    return Objects.equals(catalogType, catalogsVerticalProductGroup.catalogType) &&
        Objects.equals(id, catalogsVerticalProductGroup.id) &&
        Objects.equals(name, catalogsVerticalProductGroup.name) &&
        Objects.equals(description, catalogsVerticalProductGroup.description) &&
        Objects.equals(filters, catalogsVerticalProductGroup.filters) &&
        Objects.equals(createdAt, catalogsVerticalProductGroup.createdAt) &&
        Objects.equals(updatedAt, catalogsVerticalProductGroup.updatedAt) &&
        Objects.equals(catalogId, catalogsVerticalProductGroup.catalogId) &&
        Objects.equals(isFeatured, catalogsVerticalProductGroup.isFeatured) &&
        Objects.equals(type, catalogsVerticalProductGroup.type) &&
        Objects.equals(status, catalogsVerticalProductGroup.status) &&
        Objects.equals(feedId, catalogsVerticalProductGroup.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, createdAt, updatedAt, catalogId, isFeatured, type, status, feedId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

