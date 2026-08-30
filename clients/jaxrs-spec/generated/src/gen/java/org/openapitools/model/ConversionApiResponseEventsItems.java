package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionApiResponseEventsItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionApiResponseEventsItems   {
  private String errorMessage;
  private EventProcessingStatus status;
  private String warningMessage;

  public ConversionApiResponseEventsItems() {
  }

  @JsonCreator
  public ConversionApiResponseEventsItems(
    @JsonProperty(required = true, value = "status") EventProcessingStatus status
  ) {
    this.status = status;
  }

  /**
   * Error message containing more information about why the event failed to be processed.
   **/
  public ConversionApiResponseEventsItems errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Error message containing more information about why the event failed to be processed.")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty("error_message")
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Whether the event was processed successfully.
   **/
  public ConversionApiResponseEventsItems status(EventProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "processed", required = true, value = "Whether the event was processed successfully.")
  @JsonProperty(required = true, value = "status")
  @NotNull public EventProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   **/
  public ConversionApiResponseEventsItems warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")
  @JsonProperty("warning_message")
  public String getWarningMessage() {
    return warningMessage;
  }

  @JsonProperty("warning_message")
  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionApiResponseEventsItems conversionApiResponseEventsItems = (ConversionApiResponseEventsItems) o;
    return Objects.equals(this.errorMessage, conversionApiResponseEventsItems.errorMessage) &&
        Objects.equals(this.status, conversionApiResponseEventsItems.status) &&
        Objects.equals(this.warningMessage, conversionApiResponseEventsItems.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, status, warningMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionApiResponseEventsItems {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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
