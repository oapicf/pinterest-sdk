package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem;



/**
 * Bulk campaign delivery estimates response.
 **/

@ApiModel(description = "Bulk campaign delivery estimates response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesResponse   {
  @JsonProperty("data")
  private List<BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();

  /**
   * Per-campaign delivery estimate results, in the same order as the request.
   **/
  public BulkCampaignDeliveryEstimatesResponse data(List<BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Per-campaign delivery estimate results, in the same order as the request.")
  @JsonProperty("data")
  public List<BulkCampaignDeliveryEstimatesItem> getData() {
    return data;
  }
  public void setData(List<BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
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
    return Objects.equals(data, bulkCampaignDeliveryEstimatesResponse.data);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

