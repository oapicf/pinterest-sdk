package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FollowUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-07T02:50:03.251555637Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class FollowUser   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("username")
  private String username;

   /**
   * Always 'user'
   * @return type
  **/
  @ApiModelProperty(value = "Always 'user'")
  public String getType() {
    return type;
  }

   /**
   * Username
   * @return username
  **/
  @ApiModelProperty(value = "Username")
  public String getUsername() {
    return username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FollowUser followUser = (FollowUser) o;
    return Objects.equals(this.type, followUser.type) &&
        Objects.equals(this.username, followUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUser {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

