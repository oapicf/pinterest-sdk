package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionApiResponseEventsInner   {
  /**
   * Whether the event was processed successfully.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("warning_message")
  private String warningMessage;

  /**
   * Whether the event was processed successfully.
   **/
  public ConversionApiResponseEventsInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "processed", required = true, value = "Whether the event was processed successfully.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Error message containing more information about why the event failed to be processed.
   **/
  public ConversionApiResponseEventsInner errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Error message containing more information about why the event failed to be processed.")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   **/
  public ConversionApiResponseEventsInner warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.")
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

