package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowUserCreate   {
  
  private Boolean autoFollow;

  public FollowUserCreate () {

  }

  public FollowUserCreate (Boolean autoFollow) {
    this.autoFollow = autoFollow;
  }

    
  @JsonProperty("auto_follow")
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
    FollowUserCreate followUserCreate = (FollowUserCreate) o;
    return Objects.equals(autoFollow, followUserCreate.autoFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUserCreate {\n");
    
    sb.append("    autoFollow: ").append(toIndentedString(autoFollow)).append("\n");
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
