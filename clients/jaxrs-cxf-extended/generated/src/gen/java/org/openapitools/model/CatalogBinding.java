package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Information about a catalog asset.
 */
@ApiModel(description="Information about a catalog asset.")

public class CatalogBinding  {
  
 /**
  * Catalog type
  */
  @ApiModelProperty(value = "Catalog type")
  private String catalogType;

 /**
  * Catalog ID.
  */
  @ApiModelProperty(value = "Catalog ID.")
  private String id;

 /**
  * Catalog name
  */
  @ApiModelProperty(value = "Catalog name")
  private String name;
 /**
  * Catalog type
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    return catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogBinding catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Catalog ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CatalogBinding id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Catalog name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CatalogBinding name(String name) {
    this.name = name;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

