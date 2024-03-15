package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.IntegrationLogsInvalidLogResponseRejectedLogsInner;

/**
 * Schema describing the response when a log has invalid fields.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationLogsInvalidLogResponse   {
  
  private List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs;

  public IntegrationLogsInvalidLogResponse () {

  }

  public IntegrationLogsInvalidLogResponse (List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
  }

    
  @JsonProperty("rejected_logs")
  public List<IntegrationLogsInvalidLogResponseRejectedLogsInner> getRejectedLogs() {
    return rejectedLogs;
  }
  public void setRejectedLogs(List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
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
    return Objects.equals(rejectedLogs, integrationLogsInvalidLogResponse.rejectedLogs);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
