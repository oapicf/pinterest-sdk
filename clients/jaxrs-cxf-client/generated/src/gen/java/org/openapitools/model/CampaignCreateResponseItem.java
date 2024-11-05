package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignCreateResponseData;
import org.openapitools.model.Exception;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignCreateResponseItem  {
  
  @ApiModelProperty(value = "")
  private CampaignCreateResponseData data;

  @ApiModelProperty(value = "")
  private List<Exception> exceptions = new ArrayList<>();
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public CampaignCreateResponseData getData() {
    return data;
  }

  public void setData(CampaignCreateResponseData data) {
    this.data = data;
  }

  public CampaignCreateResponseItem data(CampaignCreateResponseData data) {
    this.data = data;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public CampaignCreateResponseItem exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CampaignCreateResponseItem addExceptionsItem(Exception exceptionsItem) {
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
    CampaignCreateResponseItem campaignCreateResponseItem = (CampaignCreateResponseItem) o;
    return Objects.equals(this.data, campaignCreateResponseItem.data) &&
        Objects.equals(this.exceptions, campaignCreateResponseItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateResponseItem {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

