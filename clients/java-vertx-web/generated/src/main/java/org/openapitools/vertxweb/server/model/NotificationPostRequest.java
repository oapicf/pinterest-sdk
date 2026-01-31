package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Any valid JSON object
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPostRequest extends HashMap<String, Object>  {
  

  public NotificationPostRequest () {

  }

  public NotificationPostRequest () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPostRequest notificationPostRequest = (NotificationPostRequest) o;return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPostRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
