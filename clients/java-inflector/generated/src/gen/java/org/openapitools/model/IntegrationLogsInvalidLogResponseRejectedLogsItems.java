package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLogsInvalidLogResponseRejectedLogsItems   {
  @JsonProperty("field")
  private String field;

  @JsonProperty("log_index")
  private Integer logIndex;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("value")
  private String value;

  /**
   * The field name containing an invalid value.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsItems field(String field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The field name containing an invalid value.")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * Index of the log in the batch.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsItems logIndex(Integer logIndex) {
    this.logIndex = logIndex;
    return this;
  }

  
  @ApiModelProperty(value = "Index of the log in the batch.")
  @JsonProperty("log_index")
  public Integer getLogIndex() {
    return logIndex;
  }
  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  /**
   * The reason the value is invalid.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsItems reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The reason the value is invalid.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The value that is invalid.
   **/
  public IntegrationLogsInvalidLogResponseRejectedLogsItems value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The value that is invalid.")
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
    return Objects.equals(field, integrationLogsInvalidLogResponseRejectedLogsItems.field) &&
        Objects.equals(logIndex, integrationLogsInvalidLogResponseRejectedLogsItems.logIndex) &&
        Objects.equals(reason, integrationLogsInvalidLogResponseRejectedLogsItems.reason) &&
        Objects.equals(value, integrationLogsInvalidLogResponseRejectedLogsItems.value);
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

