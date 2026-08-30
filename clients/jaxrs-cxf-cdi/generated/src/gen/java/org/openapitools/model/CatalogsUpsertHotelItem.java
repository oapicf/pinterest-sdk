package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A hotel item to be upserted.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A hotel item to be upserted.")
public class CatalogsUpsertHotelItem   {
  
  private CatalogsHotelAttributes attributes;

  private String hotelId;


public enum OperationEnum {

    @JsonProperty("UPSERT") UPSERT(String.valueOf("UPSERT"));


    private String value;

    OperationEnum(String v) {
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

  private OperationEnum operation;

  /**
   **/
  public CatalogsUpsertHotelItem attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attributes")
  @NotNull
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }


  /**
   * The catalog hotel id in the merchant namespace
   **/
  public CatalogsUpsertHotelItem hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  @NotNull
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }


  /**
   **/
  public CatalogsUpsertHotelItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
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
    CatalogsUpsertHotelItem catalogsUpsertHotelItem = (CatalogsUpsertHotelItem) o;
    return Objects.equals(this.attributes, catalogsUpsertHotelItem.attributes) &&
        Objects.equals(this.hotelId, catalogsUpsertHotelItem.hotelId) &&
        Objects.equals(this.operation, catalogsUpsertHotelItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, hotelId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertHotelItem {\n");
    
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

