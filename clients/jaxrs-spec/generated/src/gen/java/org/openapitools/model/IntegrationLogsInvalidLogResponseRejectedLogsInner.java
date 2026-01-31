package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("IntegrationLogsInvalidLogResponse_rejected_logs_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class IntegrationLogsInvalidLogResponseRejectedLogsInner   {
  private String field;
  private Integer logIndex;
  private String reason;
  private String value;

  public IntegrationLogsInvalidLogResponseRejectedLogsInner() {
  }

  @JsonCreator
  public IntegrationLogsInvalidLogResponseRejectedLogsInner(
    @JsonProperty(required = true, value = "field") String field,
    @JsonProperty(required = true, value = "reason") String reason,
    @JsonProperty(required = true, value = "value") String value
  ) {
    this.field = field;
    this.reason = reason;
    this.value = value;
  }

  /**
   * The field name containing an invalid value.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsInner field(String field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The field name containing an invalid value.")
  @JsonProperty(required = true, value = "field")
  @NotNull public String getField() {
    return field;
  }

  @JsonProperty(required = true, value = "field")
  public void setField(String field) {
    this.field = field;
  }

  /**
   * Index of the log in the batch.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsInner logIndex(Integer logIndex) {
    this.logIndex = logIndex;
    return this;
  }

  
  @ApiModelProperty(value = "Index of the log in the batch.")
  @JsonProperty("log_index")
  public Integer getLogIndex() {
    return logIndex;
  }

  @JsonProperty("log_index")
  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  /**
   * The reason the value is invalid.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsInner reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The reason the value is invalid.")
  @JsonProperty(required = true, value = "reason")
  @NotNull public String getReason() {
    return reason;
  }

  @JsonProperty(required = true, value = "reason")
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The value that is invalid.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsInner value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The value that is invalid.")
  @JsonProperty(required = true, value = "value")
  @NotNull public String getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
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
    IntegrationLogsInvalidLogResponseRejectedLogsInner integrationLogsInvalidLogResponseRejectedLogsInner = (IntegrationLogsInvalidLogResponseRejectedLogsInner) o;
    return Objects.equals(this.field, integrationLogsInvalidLogResponseRejectedLogsInner.field) &&
        Objects.equals(this.logIndex, integrationLogsInvalidLogResponseRejectedLogsInner.logIndex) &&
        Objects.equals(this.reason, integrationLogsInvalidLogResponseRejectedLogsInner.reason) &&
        Objects.equals(this.value, integrationLogsInvalidLogResponseRejectedLogsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, logIndex, reason, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponseRejectedLogsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

