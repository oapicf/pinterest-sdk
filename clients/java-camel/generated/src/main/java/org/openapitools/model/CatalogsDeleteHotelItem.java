package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A hotel item to be deleted
 */

@Schema(name = "CatalogsDeleteHotelItem", description = "A hotel item to be deleted")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsDeleteHotelItem {

  private String hotelId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  public CatalogsDeleteHotelItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsDeleteHotelItem(String hotelId, OperationEnum operation) {
    this.hotelId = hotelId;
    this.operation = operation;
  }

  public CatalogsDeleteHotelItem hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  */
  @NotNull 
  @Schema(name = "hotel_id", example = "DS0294-M", description = "The catalog hotel id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsDeleteHotelItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
  @NotNull 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
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
    CatalogsDeleteHotelItem catalogsDeleteHotelItem = (CatalogsDeleteHotelItem) o;
    return Objects.equals(this.hotelId, catalogsDeleteHotelItem.hotelId) &&
        Objects.equals(this.operation, catalogsDeleteHotelItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsDeleteHotelItem {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

