package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.BusinessAccessUserSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */
@ApiModel(description = "An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateInvitesResultsResponseArrayItemsInnerInvite   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("user")
  private BusinessAccessUserSummary user;

  public CreateInvitesResultsResponseArrayItemsInnerInvite id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
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
   */
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
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
    return Objects.equals(this.id, createInvitesResultsResponseArrayItemsInnerInvite.id) &&
        Objects.equals(this.user, createInvitesResultsResponseArrayItemsInnerInvite.user);
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

