package org.openapitools.model;

import org.openapitools.model.CatalogsProductMetadata;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProduct  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductMetadata metadata;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Pin pin;
 /**
  * Get metadata
  * @return metadata
  */
  @JsonProperty("metadata")
  @NotNull
  public CatalogsProductMetadata getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public CatalogsProduct metadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
  * Get pin
  * @return pin
  */
  @JsonProperty("pin")
  @NotNull
  public Pin getPin() {
    return pin;
  }

  /**
   * Sets the <code>pin</code> property.
   */
 public void setPin(Pin pin) {
    this.pin = pin;
  }

  /**
   * Sets the <code>pin</code> property.
   */
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

