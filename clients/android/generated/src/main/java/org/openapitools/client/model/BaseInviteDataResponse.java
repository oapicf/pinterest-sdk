/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.BaseInviteDataResponseInviteData;
import org.openapitools.client.model.BusinessAccessUserSummary;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BaseInviteDataResponse {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("invite_data")
  private BaseInviteDataResponseInviteData inviteData = null;
  @SerializedName("is_received_invite")
  private Boolean isReceivedInvite = null;
  @SerializedName("user")
  private BusinessAccessUserSummary user = null;

  /**
   * Unique identifier of the invite/request.
   **/
  @ApiModelProperty(value = "Unique identifier of the invite/request.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Indicates whether the invite/request was received.
   **/
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   **/
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
    BaseInviteDataResponse baseInviteDataResponse = (BaseInviteDataResponse) o;
    return (this.id == null ? baseInviteDataResponse.id == null : this.id.equals(baseInviteDataResponse.id)) &&
        (this.inviteData == null ? baseInviteDataResponse.inviteData == null : this.inviteData.equals(baseInviteDataResponse.inviteData)) &&
        (this.isReceivedInvite == null ? baseInviteDataResponse.isReceivedInvite == null : this.isReceivedInvite.equals(baseInviteDataResponse.isReceivedInvite)) &&
        (this.user == null ? baseInviteDataResponse.user == null : this.user.equals(baseInviteDataResponse.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inviteData == null ? 0: this.inviteData.hashCode());
    result = 31 * result + (this.isReceivedInvite == null ? 0: this.isReceivedInvite.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseInviteDataResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inviteData: ").append(inviteData).append("\n");
    sb.append("  isReceivedInvite: ").append(isReceivedInvite).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
