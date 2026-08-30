package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Bulk campaign delivery estimates response.
 **/
@ApiModel(description = "Bulk campaign delivery estimates response.")
@JsonTypeName("BulkCampaignDeliveryEstimatesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesResponse   {
  private @Valid List<@Valid BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();

  public BulkCampaignDeliveryEstimatesResponse() {
  }

  @JsonCreator
  public BulkCampaignDeliveryEstimatesResponse(
    @JsonProperty(required = true, value = "data") List<@Valid BulkCampaignDeliveryEstimatesItem> data
  ) {
    this.data = data;
  }

  /**
   * Per-campaign delivery estimate results, in the same order as the request.
   **/
  public BulkCampaignDeliveryEstimatesResponse data(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Per-campaign delivery estimate results, in the same order as the request.")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public List<@Valid BulkCampaignDeliveryEstimatesItem> getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
  }

  public BulkCampaignDeliveryEstimatesResponse addDataItem(BulkCampaignDeliveryEstimatesItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public BulkCampaignDeliveryEstimatesResponse removeDataItem(BulkCampaignDeliveryEstimatesItem dataItem) {
    if (dataItem != null && this.data != null) {
      this.data.remove(dataItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
