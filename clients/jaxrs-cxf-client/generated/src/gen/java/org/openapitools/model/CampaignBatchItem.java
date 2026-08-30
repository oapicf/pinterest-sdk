package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Item in a batch campaign response.
 */
@ApiModel(description="Item in a batch campaign response.")

public class CampaignBatchItem  {
  
 /**
  * Campaign data on success.
  */
  @ApiModelProperty(value = "Campaign data on success.")

  private CampaignBatchResponseData data;

 /**
  * Exceptions on failure.
  */
  @ApiModelProperty(value = "Exceptions on failure.")

  private List<Exception> exceptions = new ArrayList<>();
 /**
   * Campaign data on success.
   * @return data
  **/
  @JsonProperty("data")
  public CampaignBatchResponseData getData() {
    return data;
  }

  public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  public CampaignBatchItem data(CampaignBatchResponseData data) {
    this.data = data;
    return this;
  }

 /**
   * Exceptions on failure.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public CampaignBatchItem exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CampaignBatchItem addExceptionsItem(Exception exceptionsItem) {
    this.exceptions.add(exceptionsItem);
    return this;
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
    return Objects.equals(this.data, campaignBatchItem.data) &&
        Objects.equals(this.exceptions, campaignBatchItem.exceptions);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

