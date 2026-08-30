package apimodels;

import apimodels.IntegrationLogsInvalidLogResponseRejectedLogsItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Schema describing the response when a log has invalid fields.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationLogsInvalidLogResponse   {
  @JsonProperty("rejected_logs")
  @Valid

  private List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs = null;

  public IntegrationLogsInvalidLogResponse rejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  public IntegrationLogsInvalidLogResponse addRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsItems rejectedLogsItem) {
    if (this.rejectedLogs == null) {
      this.rejectedLogs = new ArrayList<>();
    }
    this.rejectedLogs.add(rejectedLogsItem);
    return this;
  }

   /**
   * Get rejectedLogs
   * @return rejectedLogs
  **/
  public List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> getRejectedLogs() {
    return rejectedLogs;
  }

  public void setRejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

