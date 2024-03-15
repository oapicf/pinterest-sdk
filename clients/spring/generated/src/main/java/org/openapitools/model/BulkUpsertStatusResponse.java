package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BulkUpsertStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ID of the bulk request.
 */

@Schema(name = "BulkUpsertStatusResponse", description = "ID of the bulk request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertStatusResponse {

  private BulkUpsertStatus status;

  private String resultUrl;

  public BulkUpsertStatusResponse status(BulkUpsertStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public BulkUpsertStatus getStatus() {
    return status;
  }

  public void setStatus(BulkUpsertStatus status) {
    this.status = status;
  }

  public BulkUpsertStatusResponse resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

  /**
   * Get resultUrl
   * @return resultUrl
  */
  
  @Schema(name = "result_url", example = "https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.status, bulkUpsertStatusResponse.status) &&
        Objects.equals(this.resultUrl, bulkUpsertStatusResponse.resultUrl);
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

