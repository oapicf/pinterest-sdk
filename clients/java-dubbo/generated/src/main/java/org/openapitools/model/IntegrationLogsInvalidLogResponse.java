package org.openapitools.model;

import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsItems;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Schema describing the response when a log has invalid fields.
 */
public class IntegrationLogsInvalidLogResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rejected_logs")
  private List<IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs = new ArrayList<>();

  /**
   * 
   * @return rejectedLogs
   */
  public List<IntegrationLogsInvalidLogResponseRejectedLogsItems> getRejectedLogs() {
    return rejectedLogs;
  }

  public void setRejectedLogs(List<IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponse = (IntegrationLogsInvalidLogResponse) o;
    return Objects.equals(this.rejectedLogs, integrationLogsInvalidLogResponse.rejectedLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponse {\n");
    
    sb.append("    rejectedLogs: ").append(toIndentedString(rejectedLogs)).append("\n");
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
