package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionApiResponseEventsItems  {
  
 /**
  * Error message containing more information about why the event failed to be processed.
  */
  @ApiModelProperty(example = "", value = "Error message containing more information about why the event failed to be processed.")

  private String errorMessage;

 /**
  * Whether the event was processed successfully.
  */
  @ApiModelProperty(example = "processed", required = true, value = "Whether the event was processed successfully.")

  @Valid

  private EventProcessingStatus status;

 /**
  * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  */
  @ApiModelProperty(example = "", value = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")

  private String warningMessage;
 /**
   * Error message containing more information about why the event failed to be processed.
   * @return errorMessage
  **/
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ConversionApiResponseEventsItems errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Whether the event was processed successfully.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public EventProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

  public ConversionApiResponseEventsItems status(EventProcessingStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   * @return warningMessage
  **/
  @JsonProperty("warning_message")
  public String getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }

  public ConversionApiResponseEventsItems warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

