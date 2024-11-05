package apimodels;

import apimodels.DeleteInvitesResultsResponseArrayItemsInner;
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
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteInvitesResultsResponseArray   {
  @JsonProperty("items")
  @Valid

  private List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items = null;

  public DeleteInvitesResultsResponseArray items(List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public DeleteInvitesResultsResponseArray addItemsItem(DeleteInvitesResultsResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
   * @return items
  **/
  public List<@Valid DeleteInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items) {
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
    DeleteInvitesResultsResponseArray deleteInvitesResultsResponseArray = (DeleteInvitesResultsResponseArray) o;
    return Objects.equals(items, deleteInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInvitesResultsResponseArray {\n");
    
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

