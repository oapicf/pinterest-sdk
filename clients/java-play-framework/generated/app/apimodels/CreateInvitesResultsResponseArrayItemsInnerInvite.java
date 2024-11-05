package apimodels;

import apimodels.BusinessAccessUserSummary;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateInvitesResultsResponseArrayItemsInnerInvite   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("user")
  @Valid

  private BusinessAccessUserSummary user;

  public CreateInvitesResultsResponseArrayItemsInnerInvite id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the invite/request.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateInvitesResultsResponseArrayItemsInnerInvite user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

   /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

