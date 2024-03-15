package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IntegrationLogsInvalidLogResponseRejectedLogsInner  {
  
 /**
  * Index of the log in the batch.
  */
  @ApiModelProperty(value = "Index of the log in the batch.")
  private Integer logIndex;

 /**
  * The field name containing an invalid value.
  */
  @ApiModelProperty(required = true, value = "The field name containing an invalid value.")
  private String field;

 /**
  * The value that is invalid.
  */
  @ApiModelProperty(required = true, value = "The value that is invalid.")
  private String value;

 /**
  * The reason the value is invalid.
  */
  @ApiModelProperty(required = true, value = "The reason the value is invalid.")
  private String reason;
 /**
  * Index of the log in the batch.
  * @return logIndex
  */
  @JsonProperty("log_index")
  public Integer getLogIndex() {
    return logIndex;
  }

  /**
   * Sets the <code>logIndex</code> property.
   */
 public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  /**
   * Sets the <code>logIndex</code> property.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner logIndex(Integer logIndex) {
    this.logIndex = logIndex;
    return this;
  }

 /**
  * The field name containing an invalid value.
  * @return field
  */
  @JsonProperty("field")
  @NotNull
  public String getField() {
    return field;
  }

  /**
   * Sets the <code>field</code> property.
   */
 public void setField(String field) {
    this.field = field;
  }

  /**
   * Sets the <code>field</code> property.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner field(String field) {
    this.field = field;
    return this;
  }

 /**
  * The value that is invalid.
  * @return value
  */
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner value(String value) {
    this.value = value;
    return this;
  }

 /**
  * The reason the value is invalid.
  * @return reason
  */
  @JsonProperty("reason")
  @NotNull
  public String getReason() {
    return reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
 public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
  public IntegrationLogsInvalidLogResponseRejectedLogsInner reason(String reason) {
    this.reason = reason;
    return this;
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
    return Objects.equals(this.logIndex, integrationLogsInvalidLogResponseRejectedLogsInner.logIndex) &&
        Objects.equals(this.field, integrationLogsInvalidLogResponseRejectedLogsInner.field) &&
        Objects.equals(this.value, integrationLogsInvalidLogResponseRejectedLogsInner.value) &&
        Objects.equals(this.reason, integrationLogsInvalidLogResponseRejectedLogsInner.reason);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

