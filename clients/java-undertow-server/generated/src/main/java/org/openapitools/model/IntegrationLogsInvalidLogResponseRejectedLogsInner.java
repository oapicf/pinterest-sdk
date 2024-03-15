/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogsInvalidLogResponseRejectedLogsInner   {
  
  private Integer logIndex;
  private String field;
  private String value;
  private String reason;

  /**
   * Index of the log in the batch.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner logIndex(Integer logIndex) {
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
   * The field name containing an invalid value.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner field(String field) {
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
   * The value that is invalid.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner value(String value) {
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

  /**
   * The reason the value is invalid.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner reason(String reason) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogsInvalidLogResponseRejectedLogsInner integrationLogsInvalidLogResponseRejectedLogsInner = (IntegrationLogsInvalidLogResponseRejectedLogsInner) o;
    return Objects.equals(logIndex, integrationLogsInvalidLogResponseRejectedLogsInner.logIndex) &&
        Objects.equals(field, integrationLogsInvalidLogResponseRejectedLogsInner.field) &&
        Objects.equals(value, integrationLogsInvalidLogResponseRejectedLogsInner.value) &&
        Objects.equals(reason, integrationLogsInvalidLogResponseRejectedLogsInner.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logIndex, field, value, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponseRejectedLogsInner {\n");
    
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

