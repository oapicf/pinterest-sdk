package org.openapitools.model;

import org.openapitools.model.CatalogsHotelProductMetadata;
import org.openapitools.model.Pin;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsHotelProduct implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("metadata")
  private CatalogsHotelProductMetadata metadata;

  @JsonProperty("pin")
  private Pin pin;

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return metadata
   */
  public CatalogsHotelProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsHotelProductMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * 
   * @return pin
   */
  public Pin getPin() {
    return pin;
  }

  public void setPin(Pin pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelProduct catalogsHotelProduct = (CatalogsHotelProduct) o;
    return Objects.equals(this.catalogType, catalogsHotelProduct.catalogType) &&
        Objects.equals(this.metadata, catalogsHotelProduct.metadata) &&
        Objects.equals(this.pin, catalogsHotelProduct.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, metadata, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProduct {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
