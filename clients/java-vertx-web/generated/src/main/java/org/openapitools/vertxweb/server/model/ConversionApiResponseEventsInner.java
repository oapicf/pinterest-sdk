package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionApiResponseEventsInner   {
  


  public enum StatusEnum {
    FAILED("failed"),
    PROCESSED("processed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;
  private String errorMessage;
  private String warningMessage;

  public ConversionApiResponseEventsInner () {

  }

  public ConversionApiResponseEventsInner (StatusEnum status, String errorMessage, String warningMessage) {
    this.status = status;
    this.errorMessage = errorMessage;
    this.warningMessage = warningMessage;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
    ConversionApiResponseEventsInner conversionApiResponseEventsInner = (ConversionApiResponseEventsInner) o;
    return Objects.equals(status, conversionApiResponseEventsInner.status) &&
        Objects.equals(errorMessage, conversionApiResponseEventsInner.errorMessage) &&
        Objects.equals(warningMessage, conversionApiResponseEventsInner.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorMessage, warningMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionApiResponseEventsInner {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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
