package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="System error details included in the log sent by the client.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationLogClientError   {
  
  private String cause;
  private Integer columnNumber;
  private String fileName;
  private Integer lineNumber;
  private String message;
  private String messageDetail;
  private String name;
  private Integer number;
  private String stackTrace;

  /**
   * Original cause of the error.
   **/
  
  @ApiModelProperty(value = "Original cause of the error.")
  @JsonProperty("cause")
 @Size(max=512)  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Column number in the line of the file that raised the error.
   **/
  
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  @JsonProperty("column_number")
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
  @JsonProperty("file_name")
 @Size(max=256)  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Line number where the error happened.
   **/
  
  @ApiModelProperty(value = "Line number where the error happened.")
  @JsonProperty("line_number")
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
  @JsonProperty("message")
 @Size(max=512)  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * More detail about the message.
   **/
  
  @ApiModelProperty(value = "More detail about the message.")
  @JsonProperty("message_detail")
 @Size(max=1024)  public String getMessageDetail() {
    return messageDetail;
  }
  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  /**
   * Filename where the error happened.
   **/
  
  @ApiModelProperty(value = "Filename where the error happened.")
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Integer that specifies the error code.
   **/
  
  @ApiModelProperty(value = "Integer that specifies the error code.")
  @JsonProperty("number")
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
  @JsonProperty("stack_trace")
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

