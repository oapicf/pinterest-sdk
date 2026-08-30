package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class IntegrationLogsInvalidLogResponseRejectedLogsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The field name containing an invalid value.
   */
  @JsonProperty("field")
  private String field;

  /**
   * Index of the log in the batch.
   */
  @JsonProperty("log_index")
  private Integer logIndex;

  /**
   * The reason the value is invalid.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * The value that is invalid.
   */
  @JsonProperty("value")
  private String value;

  /**
   * The field name containing an invalid value.
   * @return field
   */
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  /**
   * Index of the log in the batch.
   * @return logIndex
   */
  public Integer getLogIndex() {
    return logIndex;
  }

  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  /**
   * The reason the value is invalid.
   * @return reason
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The value that is invalid.
   * @return value
   */
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
