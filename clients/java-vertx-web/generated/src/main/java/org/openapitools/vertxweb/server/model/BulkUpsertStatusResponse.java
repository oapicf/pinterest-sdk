package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BulkUpsertStatus;

/**
 * ID of the bulk request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkUpsertStatusResponse   {
  
  private BulkUpsertStatus status;
  private String resultUrl;

  public BulkUpsertStatusResponse () {

  }

  public BulkUpsertStatusResponse (BulkUpsertStatus status, String resultUrl) {
    this.status = status;
    this.resultUrl = resultUrl;
  }

    
  @JsonProperty("status")
  public BulkUpsertStatus getStatus() {
    return status;
  }
  public void setStatus(BulkUpsertStatus status) {
    this.status = status;
  }

    
  @JsonProperty("result_url")
  public String getResultUrl() {
    return resultUrl;
  }
  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpsertStatusResponse bulkUpsertStatusResponse = (BulkUpsertStatusResponse) o;
    return Objects.equals(status, bulkUpsertStatusResponse.status) &&
        Objects.equals(resultUrl, bulkUpsertStatusResponse.resultUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, resultUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertStatusResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
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
