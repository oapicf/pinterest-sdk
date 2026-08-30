package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsUpdatableHotelAttributes;

/**
 * Object describing an hotel item batch record
 */
@ApiModel(description = "Object describing an hotel item batch record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsUpdateHotelItem   {
  @JsonProperty("attributes")
  private CatalogsUpdatableHotelAttributes attributes;

  @JsonProperty("hotel_id")
  private String hotelId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    UPDATE("UPDATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  public CatalogsUpdateHotelItem attributes(CatalogsUpdatableHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsUpdatableHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsUpdatableHotelAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsUpdateHotelItem hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * The catalog hotel item id in the merchant namespace
   * @return hotelId
  **/
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog hotel item id in the merchant namespace")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsUpdateHotelItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
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
    return Objects.equals(this.attributes, catalogsUpdateHotelItem.attributes) &&
        Objects.equals(this.hotelId, catalogsUpdateHotelItem.hotelId) &&
        Objects.equals(this.operation, catalogsUpdateHotelItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, hotelId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateHotelItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

