package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object describing an item processing record
 **/
@ApiModel(description = "Object describing an item processing record")
@JsonTypeName("HotelProcessingRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class HotelProcessingRecord   {
  private @Valid String hotelId;
  private @Valid List<@Valid ItemValidationEvent> errors;
  private @Valid List<@Valid ItemValidationEvent> warnings;
  private @Valid ItemProcessingStatus status;

  /**
   * The catalog hotel id in the merchant namespace
   **/
  public HotelProcessingRecord hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  @JsonProperty("hotel_id")
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public HotelProcessingRecord errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public HotelProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public HotelProcessingRecord removeErrorsItem(ItemValidationEvent errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Array with the validation warnings for the item processing record
   **/
  public HotelProcessingRecord warnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public HotelProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }

    this.warnings.add(warningsItem);
    return this;
  }

  public HotelProcessingRecord removeWarningsItem(ItemValidationEvent warningsItem) {
    if (warningsItem != null && this.warnings != null) {
      this.warnings.remove(warningsItem);
    }

    return this;
  }
  /**
   **/
  public HotelProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelProcessingRecord hotelProcessingRecord = (HotelProcessingRecord) o;
    return Objects.equals(this.hotelId, hotelProcessingRecord.hotelId) &&
        Objects.equals(this.errors, hotelProcessingRecord.errors) &&
        Objects.equals(this.warnings, hotelProcessingRecord.warnings) &&
        Objects.equals(this.status, hotelProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, errors, warnings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelProcessingRecord {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

