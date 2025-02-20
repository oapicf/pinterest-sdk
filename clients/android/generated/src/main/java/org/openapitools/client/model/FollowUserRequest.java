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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class FollowUserRequest {
  
  @SerializedName("auto_follow")
  private Boolean autoFollow = false;

  /**
   * Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
   **/
  @ApiModelProperty(value = "Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.")
  public Boolean getAutoFollow() {
    return autoFollow;
  }
  public void setAutoFollow(Boolean autoFollow) {
    this.autoFollow = autoFollow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FollowUserRequest followUserRequest = (FollowUserRequest) o;
    return (this.autoFollow == null ? followUserRequest.autoFollow == null : this.autoFollow.equals(followUserRequest.autoFollow));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.autoFollow == null ? 0: this.autoFollow.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUserRequest {\n");
    
    sb.append("  autoFollow: ").append(autoFollow).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
