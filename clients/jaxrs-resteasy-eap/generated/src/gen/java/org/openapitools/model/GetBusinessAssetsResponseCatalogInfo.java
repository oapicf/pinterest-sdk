package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GetBusinessAssetsResponseCatalogInfo   {
  
  private String catalogType;
  private String id;
  private String name;

  /**
   * Catalog type
   **/
  
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

