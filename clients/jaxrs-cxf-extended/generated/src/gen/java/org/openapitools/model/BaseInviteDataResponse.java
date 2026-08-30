package org.openapitools.model;

import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteDataResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Common invite/request data returned by the business access endpoints.
 */
@ApiModel(description="Common invite/request data returned by the business access endpoints.")

public class BaseInviteDataResponse  {
  
 /**
  * Unique identifier of the invite/request.
  */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private InviteDataResponse inviteData;

 /**
  * Indicates whether the invite/request was received.
  */
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  private Boolean isReceivedInvite;

 /**
  * Metadata for the member/partner that was sent the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @Valid
  private BusinessAccessUserSummary user;
 /**
  * Unique identifier of the invite/request.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public BaseInviteDataResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get inviteData
  * @return inviteData
  */
  @JsonProperty("invite_data")
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
 public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
  public BaseInviteDataResponse inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
  * Indicates whether the invite/request was received.
  * @return isReceivedInvite
  */
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
 public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
  public BaseInviteDataResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

 /**
  * Metadata for the member/partner that was sent the invite/request.
  * @return user
  */
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public BaseInviteDataResponse user(BusinessAccessUserSummary user) {
    this.user = user;
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
    BaseInviteDataResponse baseInviteDataResponse = (BaseInviteDataResponse) o;
    return Objects.equals(this.id, baseInviteDataResponse.id) &&
        Objects.equals(this.inviteData, baseInviteDataResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, baseInviteDataResponse.isReceivedInvite) &&
        Objects.equals(this.user, baseInviteDataResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseInviteDataResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

