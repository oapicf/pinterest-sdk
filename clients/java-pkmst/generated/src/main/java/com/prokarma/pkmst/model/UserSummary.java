package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UserSummary
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserSummary   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("type")
  private String type;

  public UserSummary username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username
   * @return username
   */
  @ApiModelProperty(example = "username", value = "Username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserSummary type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"user\"
   * @return type
   */
  @ApiModelProperty(example = "user", value = "Always \"user\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSummary userSummary = (UserSummary) o;
    return Objects.equals(this.username, userSummary.username) &&
        Objects.equals(this.type, userSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummary {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

