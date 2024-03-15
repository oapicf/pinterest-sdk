/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkUpsertStatus;



/**
 * ID of the bulk request.
 */

@ApiModel(description = "ID of the bulk request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertStatusResponse   {
  
  private BulkUpsertStatus status;
  private String resultUrl;

  /**
   */
  public BulkUpsertStatusResponse status(BulkUpsertStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public BulkUpsertStatus getStatus() {
    return status;
  }
  public void setStatus(BulkUpsertStatus status) {
    this.status = status;
  }

  /**
   */
  public BulkUpsertStatusResponse resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)", value = "")
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

