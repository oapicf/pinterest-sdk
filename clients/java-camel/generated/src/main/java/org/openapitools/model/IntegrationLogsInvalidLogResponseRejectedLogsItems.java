package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IntegrationLogsInvalidLogResponseRejectedLogsItems
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLogsInvalidLogResponseRejectedLogsItems {

  private String field;

  private Integer logIndex;

  private String reason;

  private String value;

  public IntegrationLogsInvalidLogResponseRejectedLogsItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsItems(String field, String reason, String value) {
    this.field = field;
    this.reason = reason;
    this.value = value;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsItems field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field name containing an invalid value.
   * @return field
   */
  @NotNull 
  @Schema(name = "field", description = "The field name containing an invalid value.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsItems logIndex(Integer logIndex) {
    this.logIndex = logIndex;
    return this;
  }

  /**
   * Index of the log in the batch.
   * @return logIndex
   */
  
  @Schema(name = "log_index", description = "Index of the log in the batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("log_index")
  public Integer getLogIndex() {
    return logIndex;
  }

  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsItems reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason the value is invalid.
   * @return reason
   */
  @NotNull 
  @Schema(name = "reason", description = "The reason the value is invalid.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsItems value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value that is invalid.
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "The value that is invalid.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogsInvalidLogResponseRejectedLogsItems integrationLogsInvalidLogResponseRejectedLogsItems = (IntegrationLogsInvalidLogResponseRejectedLogsItems) o;
    return Objects.equals(this.field, integrationLogsInvalidLogResponseRejectedLogsItems.field) &&
        Objects.equals(this.logIndex, integrationLogsInvalidLogResponseRejectedLogsItems.logIndex) &&
        Objects.equals(this.reason, integrationLogsInvalidLogResponseRejectedLogsItems.reason) &&
        Objects.equals(this.value, integrationLogsInvalidLogResponseRejectedLogsItems.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, logIndex, reason, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponseRejectedLogsItems {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

