package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;

/**
 * ConversionApiResponseEventsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionApiResponseEventsItems   {
  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("status")
  private EventProcessingStatus status;

  @JsonProperty("warning_message")
  private String warningMessage;

  public ConversionApiResponseEventsItems errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message containing more information about why the event failed to be processed.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "", value = "Error message containing more information about why the event failed to be processed.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ConversionApiResponseEventsItems status(EventProcessingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Whether the event was processed successfully.
   * @return status
  **/
  @ApiModelProperty(example = "processed", required = true, value = "Whether the event was processed successfully.")
  public EventProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

  public ConversionApiResponseEventsItems warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   * @return warningMessage
  **/
  @ApiModelProperty(example = "", value = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")
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

