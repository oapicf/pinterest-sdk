package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RespondToInviteResultItem;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-07T04:05:13.632954680Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class RespondToInvitesResponseArray   {
  @JsonProperty("items")
  private List<RespondToInviteResultItem> items = null;

  /**
   * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
   **/
  public RespondToInvitesResponseArray items(List<RespondToInviteResultItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.")
  @JsonProperty("items")
  public List<RespondToInviteResultItem> getItems() {
    return items;
  }
  public void setItems(List<RespondToInviteResultItem> items) {
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
    RespondToInvitesResponseArray respondToInvitesResponseArray = (RespondToInvitesResponseArray) o;
    return Objects.equals(items, respondToInvitesResponseArray.items);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

