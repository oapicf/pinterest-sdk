package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBusinessAssetsResponseCatalogInfo   {
  
  private String catalogType;
  private String id;
  private String name;

  public GetBusinessAssetsResponseCatalogInfo () {

  }

  public GetBusinessAssetsResponseCatalogInfo (String catalogType, String id, String name) {
    this.catalogType = catalogType;
    this.id = id;
    this.name = name;
  }

    
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
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
    return Objects.equals(catalogType, getBusinessAssetsResponseCatalogInfo.catalogType) &&
        Objects.equals(id, getBusinessAssetsResponseCatalogInfo.id) &&
        Objects.equals(name, getBusinessAssetsResponseCatalogInfo.name);
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
