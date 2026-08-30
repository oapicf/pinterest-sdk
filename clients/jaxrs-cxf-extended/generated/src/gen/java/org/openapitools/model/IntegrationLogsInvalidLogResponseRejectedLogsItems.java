package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IntegrationLogsInvalidLogResponseRejectedLogsItems  {
  
 /**
  * The field name containing an invalid value.
  */
  @ApiModelProperty(required = true, value = "The field name containing an invalid value.")
  private String field;

 /**
  * Index of the log in the batch.
  */
  @ApiModelProperty(value = "Index of the log in the batch.")
  private Integer logIndex;

 /**
  * The reason the value is invalid.
  */
  @ApiModelProperty(required = true, value = "The reason the value is invalid.")
  private String reason;

 /**
  * The value that is invalid.
  */
  @ApiModelProperty(required = true, value = "The value that is invalid.")
  private String value;
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
  public IntegrationLogsInvalidLogResponseRejectedLogsItems field(String field) {
    this.field = field;
    return this;
  }

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
  public IntegrationLogsInvalidLogResponseRejectedLogsItems logIndex(Integer logIndex) {
    this.logIndex = logIndex;
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
  public IntegrationLogsInvalidLogResponseRejectedLogsItems reason(String reason) {
    this.reason = reason;
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
  public IntegrationLogsInvalidLogResponseRejectedLogsItems value(String value) {
    this.value = value;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

