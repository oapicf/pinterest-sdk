package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Information about a catalog asset.
 */
@ApiModel(description = "Information about a catalog asset.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogBinding   {
  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public CatalogBinding catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Catalog type
   * @return catalogType
   */
  @ApiModelProperty(value = "Catalog type")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Catalog ID.
   * @return id
   */
  @ApiModelProperty(value = "Catalog ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogBinding name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Catalog name
   * @return name
   */
  @ApiModelProperty(value = "Catalog name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogBinding catalogBinding = (CatalogBinding) o;
    return Objects.equals(this.catalogType, catalogBinding.catalogType) &&
        Objects.equals(this.id, catalogBinding.id) &&
        Objects.equals(this.name, catalogBinding.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogBinding {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

