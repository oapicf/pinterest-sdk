package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * System error details included in the log sent by the client.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public IntegrationLogClientError () {

  }

  public IntegrationLogClientError (String cause, Integer columnNumber, String fileName, Integer lineNumber, String message, String messageDetail, String name, Integer number, String stackTrace) {
    this.cause = cause;
    this.columnNumber = columnNumber;
    this.fileName = fileName;
    this.lineNumber = lineNumber;
    this.message = message;
    this.messageDetail = messageDetail;
    this.name = name;
    this.number = number;
    this.stackTrace = stackTrace;
  }

    
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

    
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

    
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

    
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("message_detail")
  public String getMessageDetail() {
    return messageDetail;
  }
  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

    
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
    return Objects.equals(cause, integrationLogClientError.cause) &&
        Objects.equals(columnNumber, integrationLogClientError.columnNumber) &&
        Objects.equals(fileName, integrationLogClientError.fileName) &&
        Objects.equals(lineNumber, integrationLogClientError.lineNumber) &&
        Objects.equals(message, integrationLogClientError.message) &&
        Objects.equals(messageDetail, integrationLogClientError.messageDetail) &&
        Objects.equals(name, integrationLogClientError.name) &&
        Objects.equals(number, integrationLogClientError.number) &&
        Objects.equals(stackTrace, integrationLogClientError.stackTrace);
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
