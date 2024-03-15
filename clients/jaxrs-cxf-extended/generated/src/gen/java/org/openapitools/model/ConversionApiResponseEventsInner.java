package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionApiResponseEventsInner  {
  
public enum StatusEnum {

    @JsonProperty("failed") FAILED(String.valueOf("failed")),
    @JsonProperty("processed") PROCESSED(String.valueOf("processed"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Whether the event was processed successfully.
  */
  @ApiModelProperty(example = "processed", required = true, value = "Whether the event was processed successfully.")
  private StatusEnum status;

 /**
  * Error message containing more information about why the event failed to be processed.
  */
  @ApiModelProperty(value = "Error message containing more information about why the event failed to be processed.")
  private String errorMessage;

 /**
  * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  */
  @ApiModelProperty(value = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")
  private String warningMessage;
 /**
  * Whether the event was processed successfully.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public ConversionApiResponseEventsInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Error message containing more information about why the event failed to be processed.
  * @return errorMessage
  */
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   */
 public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   */
  public ConversionApiResponseEventsInner errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
  * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  * @return warningMessage
  */
  @JsonProperty("warning_message")
  public String getWarningMessage() {
    return warningMessage;
  }

  /**
   * Sets the <code>warningMessage</code> property.
   */
 public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }

  /**
   * Sets the <code>warningMessage</code> property.
   */
  public ConversionApiResponseEventsInner warningMessage(String warningMessage) {
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
    ConversionApiResponseEventsInner conversionApiResponseEventsInner = (ConversionApiResponseEventsInner) o;
    return Objects.equals(this.status, conversionApiResponseEventsInner.status) &&
        Objects.equals(this.errorMessage, conversionApiResponseEventsInner.errorMessage) &&
        Objects.equals(this.warningMessage, conversionApiResponseEventsInner.warningMessage);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

