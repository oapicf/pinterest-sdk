package apimodels;

import apimodels.CreateInvitesResultsResponseArrayItemsInner;
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
 * CreateInvitesResultsResponseArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateInvitesResultsResponseArray   {
  @JsonProperty("items")
  @Valid

  private List<@Valid CreateInvitesResultsResponseArrayItemsInner> items = null;

  public CreateInvitesResultsResponseArray items(List<@Valid CreateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public CreateInvitesResultsResponseArray addItemsItem(CreateInvitesResultsResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
   * @return items
  **/
  public List<@Valid CreateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid CreateInvitesResultsResponseArrayItemsInner> items) {
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
    CreateInvitesResultsResponseArray createInvitesResultsResponseArray = (CreateInvitesResultsResponseArray) o;
    return Objects.equals(items, createInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArray {\n");
    
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

