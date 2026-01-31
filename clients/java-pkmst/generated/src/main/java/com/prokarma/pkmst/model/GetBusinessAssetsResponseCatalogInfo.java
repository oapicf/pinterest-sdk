package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 */
@ApiModel(description = "An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GetBusinessAssetsResponseCatalogInfo   {
  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public GetBusinessAssetsResponseCatalogInfo catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Catalog type
   * @return catalogType
   */
  @ApiModelProperty(example = "PRODUCT", value = "Catalog type")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public GetBusinessAssetsResponseCatalogInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Catalog ID.
   * @return id
   */
  @ApiModelProperty(example = "4836859046874", value = "Catalog ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetBusinessAssetsResponseCatalogInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Catalog name
   * @return name
   */
  @ApiModelProperty(example = "Canada Catalog", value = "Catalog name")
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

