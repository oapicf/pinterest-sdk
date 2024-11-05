package apimodels;

import apimodels.CreateAssetInvitesRequestItem;
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
 * Request body for updating asset roles for existing invites.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssetInvitesRequest   {
  @JsonProperty("invites")
  @NotNull
@Size(min=1,max=50)
@Valid

  private List<@Valid CreateAssetInvitesRequestItem> invites = new ArrayList<>();

  public CreateAssetInvitesRequest invites(List<@Valid CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetInvitesRequest addInvitesItem(CreateAssetInvitesRequestItem invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  public List<@Valid CreateAssetInvitesRequestItem> getInvites() {
    return invites;
  }

  public void setInvites(List<@Valid CreateAssetInvitesRequestItem> invites) {
    this.invites = invites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetInvitesRequest createAssetInvitesRequest = (CreateAssetInvitesRequest) o;
    return Objects.equals(invites, createAssetInvitesRequest.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetInvitesRequest {\n");
    
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

