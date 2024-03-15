package apimodels;

import apimodels.CatalogsProductMetadata;
import apimodels.Pin;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProduct   {
  @JsonProperty("metadata")
  @NotNull
@Valid

  private CatalogsProductMetadata metadata;

  @JsonProperty("pin")
  @NotNull
@Valid

  private Pin pin;

  public CatalogsProduct metadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  public CatalogsProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsProductMetadata metadata) {
    this.metadata = metadata;
  }

  public CatalogsProduct pin(Pin pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

