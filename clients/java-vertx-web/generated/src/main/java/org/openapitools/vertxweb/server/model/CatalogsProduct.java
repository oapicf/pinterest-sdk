package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductMetadata;
import org.openapitools.vertxweb.server.model.Pin;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProduct   {
  
  private CatalogsProductMetadata metadata;
  private Pin pin;

  public CatalogsProduct () {

  }

  public CatalogsProduct (CatalogsProductMetadata metadata, Pin pin) {
    this.metadata = metadata;
    this.pin = pin;
  }

    
  @JsonProperty("metadata")
  public CatalogsProductMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("pin")
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
    CatalogsProduct catalogsProduct = (CatalogsProduct) o;
    return Objects.equals(metadata, catalogsProduct.metadata) &&
        Objects.equals(pin, catalogsProduct.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProduct {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
