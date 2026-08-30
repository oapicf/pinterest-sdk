package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * System error details included in the log sent by the client.
 */
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
     * Default constructor.
     */
    public IntegrationLogClientError() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogClientError.
     *
     * @param cause Original cause of the error.
     * @param columnNumber Column number in the line of the file that raised the error.
     * @param fileName Filename where the error happened.
     * @param lineNumber Line number where the error happened.
     * @param message Human-readable description of the error.
     * @param messageDetail More detail about the message.
     * @param name Filename where the error happened.
     * @param number Integer that specifies the error code.
     * @param stackTrace Stack trace of where the error happened.
     */
    public IntegrationLogClientError(
        String cause, 
        Integer columnNumber, 
        String fileName, 
        Integer lineNumber, 
        String message, 
        String messageDetail, 
        String name, 
        Integer number, 
        String stackTrace
    ) {
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



    /**
     * Original cause of the error.
     * @return cause
     */
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * Column number in the line of the file that raised the error.
     * @return columnNumber
     */
    public Integer getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(Integer columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * Filename where the error happened.
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Line number where the error happened.
     * @return lineNumber
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Human-readable description of the error.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * More detail about the message.
     * @return messageDetail
     */
    public String getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
    }

    /**
     * Filename where the error happened.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Integer that specifies the error code.
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Stack trace of where the error happened.
     * @return stackTrace
     */
    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

