package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionApiResponseEventsItems   {
  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("status")
  private EventProcessingStatus status;

  @JsonProperty("warning_message")
  private String warningMessage;

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
  @JsonProperty("status")
  public EventProcessingStatus getStatus() {
    return status;
  }
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
    return Objects.equals(errorMessage, conversionApiResponseEventsItems.errorMessage) &&
        Objects.equals(status, conversionApiResponseEventsItems.status) &&
        Objects.equals(warningMessage, conversionApiResponseEventsItems.warningMessage);
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

