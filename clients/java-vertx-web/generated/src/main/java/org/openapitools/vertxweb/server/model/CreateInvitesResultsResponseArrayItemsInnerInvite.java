package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;

/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInvitesResultsResponseArrayItemsInnerInvite   {
  
  private String id;
  private BusinessAccessUserSummary user;

  public CreateInvitesResultsResponseArrayItemsInnerInvite () {

  }

  public CreateInvitesResultsResponseArrayItemsInnerInvite (String id, BusinessAccessUserSummary user) {
    this.id = id;
    this.user = user;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvitesResultsResponseArrayItemsInnerInvite createInvitesResultsResponseArrayItemsInnerInvite = (CreateInvitesResultsResponseArrayItemsInnerInvite) o;
    return Objects.equals(id, createInvitesResultsResponseArrayItemsInnerInvite.id) &&
        Objects.equals(user, createInvitesResultsResponseArrayItemsInnerInvite.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArrayItemsInnerInvite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
