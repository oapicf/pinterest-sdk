package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Bulk campaign delivery estimates response.
 */

@Schema(name = "BulkCampaignDeliveryEstimatesResponse", description = "Bulk campaign delivery estimates response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesResponse {

  private List<@Valid BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();

  public BulkCampaignDeliveryEstimatesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkCampaignDeliveryEstimatesResponse(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
    this.data = data;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "data", description = "Per-campaign delivery estimate results, in the same order as the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid BulkCampaignDeliveryEstimatesItem> getData() {
    return data;
  }

  @JsonProperty("data")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

