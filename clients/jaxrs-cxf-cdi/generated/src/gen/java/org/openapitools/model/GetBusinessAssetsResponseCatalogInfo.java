package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")
public class GetBusinessAssetsResponseCatalogInfo   {
  
  private String catalogType;

  private String id;

  private String name;

  /**
   * Catalog type
   **/
  public GetBusinessAssetsResponseCatalogInfo catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(example = "PRODUCT", value = "Catalog type")
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
  public GetBusinessAssetsResponseCatalogInfo id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "4836859046874", value = "Catalog ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Catalog name
   **/
  public GetBusinessAssetsResponseCatalogInfo name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Catalog", value = "Catalog name")
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
    GetBusinessAssetsResponseCatalogInfo getBusinessAssetsResponseCatalogInfo = (GetBusinessAssetsResponseCatalogInfo) o;
    return Objects.equals(this.catalogType, getBusinessAssetsResponseCatalogInfo.catalogType) &&
        Objects.equals(this.id, getBusinessAssetsResponseCatalogInfo.id) &&
        Objects.equals(this.name, getBusinessAssetsResponseCatalogInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessAssetsResponseCatalogInfo {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

