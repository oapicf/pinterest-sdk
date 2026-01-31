package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetBusinessAssetsResponseCatalogInfo   {
  @JsonProperty("catalog_type")
  
  private String catalogType;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

