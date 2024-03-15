package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationLogsInvalidLogResponseRejectedLogsInner   {
  
  private Integer logIndex;
  private String field;
  private String value;
  private String reason;

  public IntegrationLogsInvalidLogResponseRejectedLogsInner () {

  }

  public IntegrationLogsInvalidLogResponseRejectedLogsInner (Integer logIndex, String field, String value, String reason) {
    this.logIndex = logIndex;
    this.field = field;
    this.value = value;
    this.reason = reason;
  }

    
  @JsonProperty("log_index")
  public Integer getLogIndex() {
    return logIndex;
  }
  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

    
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

    
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
