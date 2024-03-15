package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes;

/**
 * Object describing an hotel item batch record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsUpdateHotelItem   {
  
  private String hotelId;


  public enum OperationEnum {
    UPDATE("UPDATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;
  private CatalogsUpdatableHotelAttributes attributes;

  public CatalogsUpdateHotelItem () {

  }

  public CatalogsUpdateHotelItem (String hotelId, OperationEnum operation, CatalogsUpdatableHotelAttributes attributes) {
    this.hotelId = hotelId;
    this.operation = operation;
    this.attributes = attributes;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

    
  @JsonProperty("attributes")
  public CatalogsUpdatableHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsUpdatableHotelAttributes attributes) {
    this.attributes = attributes;
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
    return Objects.equals(hotelId, catalogsUpdateHotelItem.hotelId) &&
        Objects.equals(operation, catalogsUpdateHotelItem.operation) &&
        Objects.equals(attributes, catalogsUpdateHotelItem.attributes);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
