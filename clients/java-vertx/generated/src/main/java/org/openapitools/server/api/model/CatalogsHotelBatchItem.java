package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CatalogsCreateHotelItem;
import org.openapitools.server.api.model.CatalogsDeleteHotelItem;
import org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes;
import org.openapitools.server.api.model.CatalogsUpdateHotelItem;
import org.openapitools.server.api.model.CatalogsUpsertHotelItem;

/**
 * Hotel batch item
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelBatchItem   {
  
  private String hotelId;


  public enum OperationEnum {
    DELETE("DELETE");

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

  public CatalogsHotelBatchItem () {

  }

  public CatalogsHotelBatchItem (String hotelId, OperationEnum operation, CatalogsUpdatableHotelAttributes attributes) {
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
    CatalogsHotelBatchItem catalogsHotelBatchItem = (CatalogsHotelBatchItem) o;
    return Objects.equals(hotelId, catalogsHotelBatchItem.hotelId) &&
        Objects.equals(operation, catalogsHotelBatchItem.operation) &&
        Objects.equals(attributes, catalogsHotelBatchItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchItem {\n");
    
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
