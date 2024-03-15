package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductMetadata;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsProduct   {
  
  private CatalogsProductMetadata metadata;

  private Pin pin;

  /**
   **/
  public CatalogsProduct metadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata")
  @NotNull
  public CatalogsProductMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   **/
  public CatalogsProduct pin(Pin pin) {
    this.pin = pin;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pin")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

