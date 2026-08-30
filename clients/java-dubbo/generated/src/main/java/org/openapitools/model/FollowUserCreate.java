package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class FollowUserCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   *   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
   */
  @JsonProperty("auto_follow")
  private Boolean autoFollow;

  /**
   *   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
   * @return autoFollow
   */
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
    return Objects.equals(this.autoFollow, followUserCreate.autoFollow);
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
