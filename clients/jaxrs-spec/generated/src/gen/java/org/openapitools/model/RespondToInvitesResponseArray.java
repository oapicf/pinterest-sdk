package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RespondToInvitesResponseArrayItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RespondToInvitesResponseArray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RespondToInvitesResponseArray   {
  private @Valid List<@Valid RespondToInvitesResponseArrayItemsInner> items = new ArrayList<>();

  /**
   * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
   **/
  public RespondToInvitesResponseArray items(List<@Valid RespondToInvitesResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.")
  @JsonProperty("items")
  @Valid public List<@Valid RespondToInvitesResponseArrayItemsInner> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid RespondToInvitesResponseArrayItemsInner> items) {
    this.items = items;
  }

  public RespondToInvitesResponseArray addItemsItem(RespondToInvitesResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public RespondToInvitesResponseArray removeItemsItem(RespondToInvitesResponseArrayItemsInner itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
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
    RespondToInvitesResponseArray respondToInvitesResponseArray = (RespondToInvitesResponseArray) o;
    return Objects.equals(this.items, respondToInvitesResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespondToInvitesResponseArray {\n");
    
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

