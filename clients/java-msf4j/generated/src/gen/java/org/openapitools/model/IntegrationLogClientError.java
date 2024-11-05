package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * System error details included in the log sent by the client.
 */
@ApiModel(description = "System error details included in the log sent by the client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationLogClientError   {
  @JsonProperty("cause")
  private String cause;

  @JsonProperty("column_number")
  private Integer columnNumber;

  @JsonProperty("file_name")
  private String fileName;

  @JsonProperty("line_number")
  private Integer lineNumber;

  @JsonProperty("message")
  private String message;

  @JsonProperty("message_detail")
  private String messageDetail;

  @JsonProperty("name")
  private String name;

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("stack_trace")
  private String stackTrace;

  public IntegrationLogClientError cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Original cause of the error.
   * @return cause
  **/
  @ApiModelProperty(value = "Original cause of the error.")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

   /**
   * Column number in the line of the file that raised the error.
   * @return columnNumber
  **/
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  public IntegrationLogClientError fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Filename where the error happened.
   * @return fileName
  **/
  @ApiModelProperty(value = "Filename where the error happened.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Line number where the error happened.
   * @return lineNumber
  **/
  @ApiModelProperty(value = "Line number where the error happened.")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human-readable description of the error.
   * @return message
  **/
  @ApiModelProperty(value = "Human-readable description of the error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLogClientError messageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

   /**
   * More detail about the message.
   * @return messageDetail
  **/
  @ApiModelProperty(value = "More detail about the message.")
  public String getMessageDetail() {
    return messageDetail;
  }

  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  public IntegrationLogClientError name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Filename where the error happened.
   * @return name
  **/
  @ApiModelProperty(value = "Filename where the error happened.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Integer that specifies the error code.
   * @return number
  **/
  @ApiModelProperty(value = "Integer that specifies the error code.")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Stack trace of where the error happened.
   * @return stackTrace
  **/
  @ApiModelProperty(value = "Stack trace of where the error happened.")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogClientError integrationLogClientError = (IntegrationLogClientError) o;
    return Objects.equals(this.cause, integrationLogClientError.cause) &&
        Objects.equals(this.columnNumber, integrationLogClientError.columnNumber) &&
        Objects.equals(this.fileName, integrationLogClientError.fileName) &&
        Objects.equals(this.lineNumber, integrationLogClientError.lineNumber) &&
        Objects.equals(this.message, integrationLogClientError.message) &&
        Objects.equals(this.messageDetail, integrationLogClientError.messageDetail) &&
        Objects.equals(this.name, integrationLogClientError.name) &&
        Objects.equals(this.number, integrationLogClientError.number) &&
        Objects.equals(this.stackTrace, integrationLogClientError.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, columnNumber, fileName, lineNumber, message, messageDetail, name, number, stackTrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogClientError {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    columnNumber: ").append(toIndentedString(columnNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageDetail: ").append(toIndentedString(messageDetail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

