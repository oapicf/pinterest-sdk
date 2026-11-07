package apimodels;

import apimodels.CampaignBatchItem;
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
 * Response model for batch campaign write operations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignBatchWriteResponseModel   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid CampaignBatchItem> items = new ArrayList<>();

  public CampaignBatchWriteResponseModel items(List<@Valid CampaignBatchItem> items) {
    this.items = items;
    return this;
  }

  public CampaignBatchWriteResponseModel addItemsItem(CampaignBatchItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<@Valid CampaignBatchItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CampaignBatchItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBatchWriteResponseModel campaignBatchWriteResponseModel = (CampaignBatchWriteResponseModel) o;
    return Objects.equals(items, campaignBatchWriteResponseModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchWriteResponseModel {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

