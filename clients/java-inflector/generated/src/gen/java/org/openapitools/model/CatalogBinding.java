package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a catalog asset.
 **/

@ApiModel(description = "Information about a catalog asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogBinding   {
  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  /**
   * Catalog type
   **/
  public CatalogBinding catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog type")
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Catalog ID.
   **/
  public CatalogBinding id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Catalog name
   **/
  public CatalogBinding name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog name")
  @JsonProperty("name")
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
    return Objects.equals(catalogType, catalogBinding.catalogType) &&
        Objects.equals(id, catalogBinding.id) &&
        Objects.equals(name, catalogBinding.name);
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

