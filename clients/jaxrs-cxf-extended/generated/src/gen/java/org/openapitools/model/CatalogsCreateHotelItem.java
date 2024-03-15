package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsHotelAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A hotel item to be created.
 */
@ApiModel(description="A hotel item to be created.")

public class CatalogsCreateHotelItem  {
  
 /**
  * The catalog hotel id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog hotel id in the merchant namespace")
  private String hotelId;

public enum OperationEnum {

    @JsonProperty("CREATE") CREATE(String.valueOf("CREATE"));

    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsHotelAttributes attributes;
 /**
  * The catalog hotel id in the merchant namespace
  * @return hotelId
  */
  @JsonProperty("hotel_id")
  @NotNull
  public String getHotelId() {
    return hotelId;
  }

  /**
   * Sets the <code>hotelId</code> property.
   */
 public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * Sets the <code>hotelId</code> property.
   */
  public CatalogsCreateHotelItem hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation == null ? null : operation.value();
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CatalogsCreateHotelItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get attributes
  * @return attributes
  */
  @JsonProperty("attributes")
  @NotNull
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
 public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
  public CatalogsCreateHotelItem attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
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
    CatalogsCreateHotelItem catalogsCreateHotelItem = (CatalogsCreateHotelItem) o;
    return Objects.equals(this.hotelId, catalogsCreateHotelItem.hotelId) &&
        Objects.equals(this.operation, catalogsCreateHotelItem.operation) &&
        Objects.equals(this.attributes, catalogsCreateHotelItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateHotelItem {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

