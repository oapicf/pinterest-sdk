package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * System error details included in the log sent by the client.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationLogClientError   {
  @JsonProperty("cause")
  @Size(max=512)

  private String cause;

  @JsonProperty("column_number")
  
  private Integer columnNumber;

  @JsonProperty("file_name")
  @Size(max=256)

  private String fileName;

  @JsonProperty("line_number")
  
  private Integer lineNumber;

  @JsonProperty("message")
  @Size(max=512)

  private String message;

  @JsonProperty("message_detail")
  @Size(max=1024)

  private String messageDetail;

  @JsonProperty("name")
  @Size(max=256)

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

