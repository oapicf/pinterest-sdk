package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsType;

/**
 * Catalog entity
 */
@ApiModel(description = "Catalog entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Catalog   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("updated_at")
  private Date updatedAt;

  public Catalog catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public Catalog id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the catalog entity.
   * @return id
  **/
  @ApiModelProperty(example = "864344156814050986", required = true, value = "ID of the catalog entity.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Catalog name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name associated to a catalog entity.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a catalog entity.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.catalogType, catalog.catalogType) &&
        Objects.equals(this.createdAt, catalog.createdAt) &&
        Objects.equals(this.id, catalog.id) &&
        Objects.equals(this.name, catalog.name) &&
        Objects.equals(this.updatedAt, catalog.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, createdAt, id, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

