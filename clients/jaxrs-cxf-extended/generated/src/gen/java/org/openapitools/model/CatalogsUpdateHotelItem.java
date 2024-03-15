package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsUpdatableHotelAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing an hotel item batch record
 */
@ApiModel(description="Object describing an hotel item batch record")

public class CatalogsUpdateHotelItem  {
  
 /**
  * The catalog hotel item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog hotel item id in the merchant namespace")
  private String hotelId;

public enum OperationEnum {

    @JsonProperty("UPDATE") UPDATE(String.valueOf("UPDATE"));

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
  private CatalogsUpdatableHotelAttributes attributes;
 /**
  * The catalog hotel item id in the merchant namespace
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
  public CatalogsUpdateHotelItem hotelId(String hotelId) {
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
  public CatalogsUpdateHotelItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get attributes
  * @return attributes
  */
  @JsonProperty("attributes")
  @NotNull
  public CatalogsUpdatableHotelAttributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
 public void setAttributes(CatalogsUpdatableHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
  public CatalogsUpdateHotelItem attributes(CatalogsUpdatableHotelAttributes attributes) {
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
    CatalogsUpdateHotelItem catalogsUpdateHotelItem = (CatalogsUpdateHotelItem) o;
    return Objects.equals(this.hotelId, catalogsUpdateHotelItem.hotelId) &&
        Objects.equals(this.operation, catalogsUpdateHotelItem.operation) &&
        Objects.equals(this.attributes, catalogsUpdateHotelItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateHotelItem {\n");
    
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

