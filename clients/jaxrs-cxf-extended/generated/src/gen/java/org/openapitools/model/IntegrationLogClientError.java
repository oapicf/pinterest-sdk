package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * System error details included in the log sent by the client.
 */
@ApiModel(description="System error details included in the log sent by the client.")

public class IntegrationLogClientError  {
  
 /**
  * Original cause of the error.
  */
  @ApiModelProperty(value = "Original cause of the error.")
  private String cause;

 /**
  * Column number in the line of the file that raised the error.
  */
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  private Integer columnNumber;

 /**
  * Filename where the error happened.
  */
  @ApiModelProperty(value = "Filename where the error happened.")
  private String fileName;

 /**
  * Line number where the error happened.
  */
  @ApiModelProperty(value = "Line number where the error happened.")
  private Integer lineNumber;

 /**
  * Human-readable description of the error.
  */
  @ApiModelProperty(value = "Human-readable description of the error.")
  private String message;

 /**
  * More detail about the message.
  */
  @ApiModelProperty(value = "More detail about the message.")
  private String messageDetail;

 /**
  * Filename where the error happened.
  */
  @ApiModelProperty(value = "Filename where the error happened.")
  private String name;

 /**
  * Integer that specifies the error code.
  */
  @ApiModelProperty(value = "Integer that specifies the error code.")
  private Integer number;

 /**
  * Stack trace of where the error happened.
  */
  @ApiModelProperty(value = "Stack trace of where the error happened.")
  private String stackTrace;
 /**
  * Original cause of the error.
  * @return cause
  */
  @JsonProperty("cause")
 @Size(max=512)  public String getCause() {
    return cause;
  }

  /**
   * Sets the <code>cause</code> property.
   */
 public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Sets the <code>cause</code> property.
   */
  public IntegrationLogClientError cause(String cause) {
    this.cause = cause;
    return this;
  }

 /**
  * Column number in the line of the file that raised the error.
  * @return columnNumber
  */
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Sets the <code>columnNumber</code> property.
   */
 public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Sets the <code>columnNumber</code> property.
   */
  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

 /**
  * Filename where the error happened.
  * @return fileName
  */
  @JsonProperty("file_name")
 @Size(max=256)  public String getFileName() {
    return fileName;
  }

  /**
   * Sets the <code>fileName</code> property.
   */
 public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Sets the <code>fileName</code> property.
   */
  public IntegrationLogClientError fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
  * Line number where the error happened.
  * @return lineNumber
  */
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Sets the <code>lineNumber</code> property.
   */
 public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Sets the <code>lineNumber</code> property.
   */
  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

 /**
  * Human-readable description of the error.
  * @return message
  */
  @JsonProperty("message")
 @Size(max=512)  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

 /**
  * More detail about the message.
  * @return messageDetail
  */
  @JsonProperty("message_detail")
 @Size(max=1024)  public String getMessageDetail() {
    return messageDetail;
  }

  /**
   * Sets the <code>messageDetail</code> property.
   */
 public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  /**
   * Sets the <code>messageDetail</code> property.
   */
  public IntegrationLogClientError messageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

 /**
  * Filename where the error happened.
  * @return name
  */
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public IntegrationLogClientError name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Integer that specifies the error code.
  * @return number
  */
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  /**
   * Sets the <code>number</code> property.
   */
 public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Sets the <code>number</code> property.
   */
  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

 /**
  * Stack trace of where the error happened.
  * @return stackTrace
  */
  @JsonProperty("stack_trace")
  public String getStackTrace() {
    return stackTrace;
  }

  /**
   * Sets the <code>stackTrace</code> property.
   */
 public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Sets the <code>stackTrace</code> property.
   */
  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

