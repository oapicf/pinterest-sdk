package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Bulk campaign delivery estimates response.
 */
@ApiModel(description="Bulk campaign delivery estimates response.")

public class BulkCampaignDeliveryEstimatesResponse  {
  
 /**
  * Per-campaign delivery estimate results, in the same order as the request.
  */
  @ApiModelProperty(required = true, value = "Per-campaign delivery estimate results, in the same order as the request.")

  @Valid

  private List<@Valid BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();
 /**
   * Per-campaign delivery estimate results, in the same order as the request.
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid BulkCampaignDeliveryEstimatesItem> getData() {
    return data;
  }

  public void setData(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
  }

  public BulkCampaignDeliveryEstimatesResponse data(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
    return this;
  }

  public BulkCampaignDeliveryEstimatesResponse addDataItem(BulkCampaignDeliveryEstimatesItem dataItem) {
    this.data.add(dataItem);
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
    BulkCampaignDeliveryEstimatesResponse bulkCampaignDeliveryEstimatesResponse = (BulkCampaignDeliveryEstimatesResponse) o;
    return Objects.equals(this.data, bulkCampaignDeliveryEstimatesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCampaignDeliveryEstimatesResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

