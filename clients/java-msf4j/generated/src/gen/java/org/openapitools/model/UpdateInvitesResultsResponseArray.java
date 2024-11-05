package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateInvitesResultsResponseArrayItemsInner;

/**
 * UpdateInvitesResultsResponseArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateInvitesResultsResponseArray   {
  @JsonProperty("items")
  private List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items = null;

  public UpdateInvitesResultsResponseArray items(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public UpdateInvitesResultsResponseArray addItemsItem(UpdateInvitesResultsResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
   * @return items
  **/
  @ApiModelProperty(value = "List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.")
  public List<@Valid UpdateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
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
    UpdateInvitesResultsResponseArray updateInvitesResultsResponseArray = (UpdateInvitesResultsResponseArray) o;
    return Objects.equals(this.items, updateInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvitesResultsResponseArray {\n");
    
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

