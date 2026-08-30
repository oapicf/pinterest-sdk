package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdUpdateRequestAllOf1 implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of this ad.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Pin ID. This field may only be updated for draft ads.
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * The ID of this ad.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUpdateRequestAllOf1 adUpdateRequestAllOf1 = (AdUpdateRequestAllOf1) o;
    return Objects.equals(this.id, adUpdateRequestAllOf1.id) &&
        Objects.equals(this.pinId, adUpdateRequestAllOf1.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUpdateRequestAllOf1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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
