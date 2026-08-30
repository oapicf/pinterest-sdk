package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private CampaignBatchResponseData data;

 /**
  * Exceptions on failure.
  */
  @ApiModelProperty(value = "Exceptions on failure.")
  @Valid
  private List<@Valid Exception> exceptions = new ArrayList<>();
 /**
  * Campaign data on success.
  * @return data
  */
  @JsonProperty("data")
  public CampaignBatchResponseData getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public CampaignBatchItem data(CampaignBatchResponseData data) {
    this.data = data;
    return this;
  }

 /**
  * Exceptions on failure.
  * @return exceptions
  */
  @JsonProperty("exceptions")
  public List<@Valid Exception> getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public CampaignBatchItem exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Adds a new item to the <code>exceptions</code> list.
   */
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

