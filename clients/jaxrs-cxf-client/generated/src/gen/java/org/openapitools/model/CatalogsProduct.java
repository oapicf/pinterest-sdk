package org.openapitools.model;

import org.openapitools.model.CatalogsProductMetadata;
import org.openapitools.model.Pin;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProduct  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductMetadata metadata;

  @ApiModelProperty(required = true, value = "")
  private Pin pin;
 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public CatalogsProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
  }

  public CatalogsProduct metadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Get pin
   * @return pin
  **/
  @JsonProperty("pin")
  public Pin getPin() {
    return pin;
  }

  public void setPin(Pin pin) {
    this.pin = pin;
  }

  public CatalogsProduct pin(Pin pin) {
    this.pin = pin;
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
    CatalogsProduct catalogsProduct = (CatalogsProduct) o;
    return Objects.equals(this.metadata, catalogsProduct.metadata) &&
        Objects.equals(this.pin, catalogsProduct.pin);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

