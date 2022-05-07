package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardOwner  {
  
  @ApiModelProperty(value = "")
  private String username;
 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardOwner {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

