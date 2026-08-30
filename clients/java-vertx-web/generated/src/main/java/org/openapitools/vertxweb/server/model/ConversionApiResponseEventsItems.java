package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EventProcessingStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionApiResponseEventsItems   {
  
  private String errorMessage;
  private EventProcessingStatus status;
  private String warningMessage;

  public ConversionApiResponseEventsItems () {

  }

  public ConversionApiResponseEventsItems (String errorMessage, EventProcessingStatus status, String warningMessage) {
    this.errorMessage = errorMessage;
    this.status = status;
    this.warningMessage = warningMessage;
  }

    
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

    
  @JsonProperty("status")
  public EventProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

    
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
