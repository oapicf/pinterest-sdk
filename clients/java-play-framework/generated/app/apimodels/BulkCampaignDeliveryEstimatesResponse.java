package apimodels;

import apimodels.BulkCampaignDeliveryEstimatesItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Bulk campaign delivery estimates response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkCampaignDeliveryEstimatesResponse   {
  @JsonProperty("data")
  @NotNull
@Valid

  private List<@Valid BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();

  public BulkCampaignDeliveryEstimatesResponse data(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
    return this;
  }

  public BulkCampaignDeliveryEstimatesResponse addDataItem(BulkCampaignDeliveryEstimatesItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Per-campaign delivery estimate results, in the same order as the request.
   * @return data
  **/
  public List<@Valid BulkCampaignDeliveryEstimatesItem> getData() {
    return data;
  }

  public void setData(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

