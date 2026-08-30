package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.util.List;

/**
 * Notification request body. Can be either a batch of notification objects or a single notification object.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPostRequest   {
  

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
    NotificationPostRequest notificationPostRequest = (NotificationPostRequest) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPostRequest {\n");
    
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
