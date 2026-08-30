package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */
@ApiModel(description="An object with a list of all the invites the user would like to respond to and the action to take.")

public class AuthRespondInvitesBody  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AuthRespondInvitesBodyItem> invites = new ArrayList<>();
 /**
  * Get invites
  * @return invites
  */
  @JsonProperty("invites")
  @NotNull
 @Size(min=1,max=100)  public List<@Valid AuthRespondInvitesBodyItem> getInvites() {
    return invites;
  }

  /**
   * Sets the <code>invites</code> property.
   */
 public void setInvites(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
  }

  /**
   * Sets the <code>invites</code> property.
   */
  public AuthRespondInvitesBody invites(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
    return this;
  }

  /**
   * Adds a new item to the <code>invites</code> list.
   */
  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyItem invitesItem) {
    this.invites.add(invitesItem);
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
    AuthRespondInvitesBody authRespondInvitesBody = (AuthRespondInvitesBody) o;
    return Objects.equals(this.invites, authRespondInvitesBody.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBody {\n");
    
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

