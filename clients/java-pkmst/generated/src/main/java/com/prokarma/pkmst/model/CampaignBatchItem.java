package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CampaignBatchResponseData;
import com.prokarma.pkmst.model.Exception;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Item in a batch campaign response.
 */
@ApiModel(description = "Item in a batch campaign response.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchItem   {
  @JsonProperty("data")
  private CampaignBatchResponseData data;

  @JsonProperty("exceptions")
  
  private List<Exception> exceptions = null;

  public CampaignBatchItem data(CampaignBatchResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Campaign data on success.
   * @return data
   */
  @ApiModelProperty(value = "Campaign data on success.")
  public CampaignBatchResponseData getData() {
    return data;
  }

  public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  public CampaignBatchItem exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CampaignBatchItem addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * Exceptions on failure.
   * @return exceptions
   */
  @ApiModelProperty(value = "Exceptions on failure.")
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

