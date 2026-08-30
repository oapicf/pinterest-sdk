package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConversionApiResponseEventsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Error message containing more information about why the event failed to be processed.
   */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * Whether the event was processed successfully.
   */
  @JsonProperty("status")
  private EventProcessingStatus status;

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   */
  @JsonProperty("warning_message")
  private String warningMessage;

  /**
   * Error message containing more information about why the event failed to be processed.
   * @return errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Whether the event was processed successfully.
   * @return status
   */
  public EventProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   * @return warningMessage
   */
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
