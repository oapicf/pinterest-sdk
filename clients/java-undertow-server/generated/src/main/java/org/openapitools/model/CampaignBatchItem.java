/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;



/**
 * Item in a batch campaign response.
 */

@ApiModel(description = "Item in a batch campaign response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchItem   {
  
  private CampaignBatchResponseData data;
  private List<Exception> exceptions = new ArrayList<>();

  /**
   * Campaign data on success.
   */
  public CampaignBatchItem data(CampaignBatchResponseData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "Campaign data on success.")
  @JsonProperty("data")
  public CampaignBatchResponseData getData() {
    return data;
  }
  public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  /**
   * Exceptions on failure.
   */
  public CampaignBatchItem exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "Exceptions on failure.")
  @JsonProperty("exceptions")
  public List<Exception> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBatchItem campaignBatchItem = (CampaignBatchItem) o;
    return Objects.equals(data, campaignBatchItem.data) &&
        Objects.equals(exceptions, campaignBatchItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchItem {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

