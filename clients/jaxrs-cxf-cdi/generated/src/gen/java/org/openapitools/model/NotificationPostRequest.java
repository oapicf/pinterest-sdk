package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Notification request body. Can be either a batch of notification objects or a single notification object.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Notification request body. Can be either a batch of notification objects or a single notification object.")
public class NotificationPostRequest   {
  

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

