/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * System error details included in the log sent by the client.
 **/
@ApiModel(description = "System error details included in the log sent by the client.")
public class IntegrationLogClientError {
  
  @SerializedName("cause")
  private String cause = null;
  @SerializedName("column_number")
  private Integer columnNumber = null;
  @SerializedName("file_name")
  private String fileName = null;
  @SerializedName("line_number")
  private Integer lineNumber = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("message_detail")
  private String messageDetail = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("stack_trace")
  private String stackTrace = null;

  /**
   * Original cause of the error.
   **/
  @ApiModelProperty(value = "Original cause of the error.")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Column number in the line of the file that raised the error.
   **/
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  public Integer getColumnNumber() {
    return columnNumber;
  }
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Filename where the error happened.
   **/
  @ApiModelProperty(value = "Filename where the error happened.")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Line number where the error happened.
   **/
  @ApiModelProperty(value = "Line number where the error happened.")
  public Integer getLineNumber() {
    return lineNumber;
  }
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Human-readable description of the error.
   **/
  @ApiModelProperty(value = "Human-readable description of the error.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * More detail about the message.
   **/
  @ApiModelProperty(value = "More detail about the message.")
  public String getMessageDetail() {
    return messageDetail;
  }
  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  /**
   * Filename where the error happened.
   **/
  @ApiModelProperty(value = "Filename where the error happened.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Integer that specifies the error code.
   **/
  @ApiModelProperty(value = "Integer that specifies the error code.")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Stack trace of where the error happened.
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
    return (this.cause == null ? integrationLogClientError.cause == null : this.cause.equals(integrationLogClientError.cause)) &&
        (this.columnNumber == null ? integrationLogClientError.columnNumber == null : this.columnNumber.equals(integrationLogClientError.columnNumber)) &&
        (this.fileName == null ? integrationLogClientError.fileName == null : this.fileName.equals(integrationLogClientError.fileName)) &&
        (this.lineNumber == null ? integrationLogClientError.lineNumber == null : this.lineNumber.equals(integrationLogClientError.lineNumber)) &&
        (this.message == null ? integrationLogClientError.message == null : this.message.equals(integrationLogClientError.message)) &&
        (this.messageDetail == null ? integrationLogClientError.messageDetail == null : this.messageDetail.equals(integrationLogClientError.messageDetail)) &&
        (this.name == null ? integrationLogClientError.name == null : this.name.equals(integrationLogClientError.name)) &&
        (this.number == null ? integrationLogClientError.number == null : this.number.equals(integrationLogClientError.number)) &&
        (this.stackTrace == null ? integrationLogClientError.stackTrace == null : this.stackTrace.equals(integrationLogClientError.stackTrace));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cause == null ? 0: this.cause.hashCode());
    result = 31 * result + (this.columnNumber == null ? 0: this.columnNumber.hashCode());
    result = 31 * result + (this.fileName == null ? 0: this.fileName.hashCode());
    result = 31 * result + (this.lineNumber == null ? 0: this.lineNumber.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageDetail == null ? 0: this.messageDetail.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.stackTrace == null ? 0: this.stackTrace.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogClientError {\n");
    
    sb.append("  cause: ").append(cause).append("\n");
    sb.append("  columnNumber: ").append(columnNumber).append("\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  lineNumber: ").append(lineNumber).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageDetail: ").append(messageDetail).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  stackTrace: ").append(stackTrace).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
