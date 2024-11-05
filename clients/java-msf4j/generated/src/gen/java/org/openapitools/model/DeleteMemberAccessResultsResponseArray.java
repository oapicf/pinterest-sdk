package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteMemberAccessResult;

/**
 * DeleteMemberAccessResultsResponseArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteMemberAccessResultsResponseArray   {
  @JsonProperty("items")
  private List<@Valid DeleteMemberAccessResult> items = null;

  public DeleteMemberAccessResultsResponseArray items(List<@Valid DeleteMemberAccessResult> items) {
    this.items = items;
    return this;
  }

  public DeleteMemberAccessResultsResponseArray addItemsItem(DeleteMemberAccessResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of member asset permissions that were deleted.
   * @return items
  **/
  @ApiModelProperty(value = "List of member asset permissions that were deleted.")
  public List<@Valid DeleteMemberAccessResult> getItems() {
    return items;
  }

  public void setItems(List<@Valid DeleteMemberAccessResult> items) {
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
    DeleteMemberAccessResultsResponseArray deleteMemberAccessResultsResponseArray = (DeleteMemberAccessResultsResponseArray) o;
    return Objects.equals(this.items, deleteMemberAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMemberAccessResultsResponseArray {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

