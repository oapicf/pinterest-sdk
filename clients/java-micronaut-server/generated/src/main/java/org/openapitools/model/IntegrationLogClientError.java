/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * System error details included in the log sent by the client.
 */
@Schema(name = "IntegrationLogClientError", description = "System error details included in the log sent by the client.")
@JsonPropertyOrder({
  IntegrationLogClientError.JSON_PROPERTY_CAUSE,
  IntegrationLogClientError.JSON_PROPERTY_COLUMN_NUMBER,
  IntegrationLogClientError.JSON_PROPERTY_FILE_NAME,
  IntegrationLogClientError.JSON_PROPERTY_LINE_NUMBER,
  IntegrationLogClientError.JSON_PROPERTY_MESSAGE,
  IntegrationLogClientError.JSON_PROPERTY_MESSAGE_DETAIL,
  IntegrationLogClientError.JSON_PROPERTY_NAME,
  IntegrationLogClientError.JSON_PROPERTY_NUMBER,
  IntegrationLogClientError.JSON_PROPERTY_STACK_TRACE
})
@JsonTypeName("IntegrationLogClientError")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class IntegrationLogClientError {
    public static final String JSON_PROPERTY_CAUSE = "cause";
    private String cause;

    public static final String JSON_PROPERTY_COLUMN_NUMBER = "column_number";
    private Integer columnNumber;

    public static final String JSON_PROPERTY_FILE_NAME = "file_name";
    private String fileName;

    public static final String JSON_PROPERTY_LINE_NUMBER = "line_number";
    private Integer lineNumber;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_MESSAGE_DETAIL = "message_detail";
    private String messageDetail;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_NUMBER = "number";
    private Integer number;

    public static final String JSON_PROPERTY_STACK_TRACE = "stack_trace";
    private String stackTrace;

    public IntegrationLogClientError() {
    }

    public IntegrationLogClientError cause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Original cause of the error.
     * @return cause
     */
    @Nullable
    @Size(max=512)
    @Schema(name = "cause", description = "Original cause of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCause() {
        return cause;
    }

    @JsonProperty(JSON_PROPERTY_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "column_number", description = "Column number in the line of the file that raised the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_COLUMN_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getColumnNumber() {
        return columnNumber;
    }

    @JsonProperty(JSON_PROPERTY_COLUMN_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(max=256)
    @Schema(name = "file_name", description = "Filename where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFileName() {
        return fileName;
    }

    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "line_number", description = "Line number where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getLineNumber() {
        return lineNumber;
    }

    @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(max=512)
    @Schema(name = "message", description = "Human-readable description of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(max=1024)
    @Schema(name = "message_detail", description = "More detail about the message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MESSAGE_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessageDetail() {
        return messageDetail;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(max=256)
    @Schema(name = "name", description = "Filename where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "number", description = "Integer that specifies the error code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getNumber() {
        return number;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "stack_trace", description = "Stack trace of where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STACK_TRACE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStackTrace() {
        return stackTrace;
    }

    @JsonProperty(JSON_PROPERTY_STACK_TRACE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

