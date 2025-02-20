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

/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 **/
@ApiModel(description = "This field is **OPTIONAL**. Use this if your feed file requires username and password.")
public class CatalogsFeedCredentials {
  
  @SerializedName("password")
  private String password = null;
  @SerializedName("username")
  private String username = null;

  /**
   * The required password for downloading a feed.
   **/
  @ApiModelProperty(required = true, value = "The required password for downloading a feed.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * The required username for downloading a feed.
   **/
  @ApiModelProperty(required = true, value = "The required username for downloading a feed.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedCredentials catalogsFeedCredentials = (CatalogsFeedCredentials) o;
    return (this.password == null ? catalogsFeedCredentials.password == null : this.password.equals(catalogsFeedCredentials.password)) &&
        (this.username == null ? catalogsFeedCredentials.username == null : this.username.equals(catalogsFeedCredentials.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedCredentials {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
