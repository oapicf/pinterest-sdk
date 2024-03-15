package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IntegrationLogsInvalidLogResponseRejectedLogsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationLogsInvalidLogResponseRejectedLogsInner   {
  @JsonProperty("log_index")
  
  private Integer logIndex;

  @JsonProperty("field")
  @NotNull

  private String field;

  @JsonProperty("value")
  @NotNull

  private String value;

  @JsonProperty("reason")
  @NotNull

  private String reason;

  public IntegrationLogsInvalidLogResponseRejectedLogsInner logIndex(Integer logIndex) {
    this.logIndex = logIndex;
    return this;
  }

   /**
   * Index of the log in the batch.
   * @return logIndex
  **/
  public Integer getLogIndex() {
    return logIndex;
  }

  public void setLogIndex(Integer logIndex) {
    this.logIndex = logIndex;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsInner field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field name containing an invalid value.
   * @return field
  **/
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value that is invalid.
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IntegrationLogsInvalidLogResponseRejectedLogsInner reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason the value is invalid.
   * @return reason
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

