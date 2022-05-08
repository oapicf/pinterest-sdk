package apimodels;

import apimodels.CatalogsProductGroupFilters;
import apimodels.CatalogsProductGroupStatus;
import apimodels.CatalogsProductGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * catalog product group entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroup   {
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

  @JsonProperty("type")
  @Valid

  private CatalogsProductGroupType type;

  @JsonProperty("status")
  @Valid

  private CatalogsProductGroupStatus status;

  @JsonProperty("feed_id")
  @Pattern(regexp="^\\d+$")

  private String feedId;

  @JsonProperty("created_at")
  
  private Integer createdAt;

  @JsonProperty("updated_at")
  
  private Integer updatedAt;

  public CatalogsProductGroup id(String id) {
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

  public CatalogsProductGroup name(String name) {
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

  public CatalogsProductGroup description(String description) {
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

  public CatalogsProductGroup filters(CatalogsProductGroupFilters filters) {
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

  public CatalogsProductGroup type(CatalogsProductGroupType type) {
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

  public CatalogsProductGroup status(CatalogsProductGroupStatus status) {
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

  public CatalogsProductGroup feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * id of the catalogs feed belonging to this catalog product group
   * @return feedId
  **/
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsProductGroup createdAt(Integer createdAt) {
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

  public CatalogsProductGroup updatedAt(Integer updatedAt) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

