package apimodels;

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
 * Request body used to cancel invites
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CancelInvitesBody   {
  @JsonProperty("invite_ids")
  @NotNull
@Size(min=1,max=50)

  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds = new ArrayList<>();

  public CancelInvitesBody inviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
    return this;
  }

  public CancelInvitesBody addInviteIdsItem(String inviteIdsItem) {
    if (this.inviteIds == null) {
      this.inviteIds = new ArrayList<>();
    }
    this.inviteIds.add(inviteIdsItem);
    return this;
  }

   /**
   * List of invite/request ids to be cancelled
   * @return inviteIds
  **/
  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getInviteIds() {
    return inviteIds;
  }

  public void setInviteIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> inviteIds) {
    this.inviteIds = inviteIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelInvitesBody cancelInvitesBody = (CancelInvitesBody) o;
    return Objects.equals(inviteIds, cancelInvitesBody.inviteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInvitesBody {\n");
    
    sb.append("    inviteIds: ").append(toIndentedString(inviteIds)).append("\n");
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

