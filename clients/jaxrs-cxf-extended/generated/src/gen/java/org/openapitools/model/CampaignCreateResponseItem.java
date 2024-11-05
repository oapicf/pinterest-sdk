package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignCreateResponseData;
import org.openapitools.model.Exception;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignCreateResponseItem  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CampaignCreateResponseData data;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid Exception> exceptions = new ArrayList<>();
 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public CampaignCreateResponseData getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(CampaignCreateResponseData data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public CampaignCreateResponseItem data(CampaignCreateResponseData data) {
    this.data = data;
    return this;
  }

 /**
  * Get exceptions
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
  public CampaignCreateResponseItem exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Adds a new item to the <code>exceptions</code> list.
   */
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

