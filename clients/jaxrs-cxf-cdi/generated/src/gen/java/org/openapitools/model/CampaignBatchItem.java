package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Item in a batch campaign response.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Item in a batch campaign response.")
public class CampaignBatchItem   {
  
  private CampaignBatchResponseData data;

  private List<@Valid Exception> exceptions = new ArrayList<>();

  /**
   * Campaign data on success.
   **/
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
   **/
  public CampaignBatchItem exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "Exceptions on failure.")
  @JsonProperty("exceptions")
  public List<@Valid Exception> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public CampaignBatchItem addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

