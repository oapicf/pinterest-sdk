package org.openapitools.model;

import org.openapitools.model.LabelStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabelUpdateItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Label ID.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private LabelStatus status;

  /**
   * Label name. 100-character limit.
   */
  @JsonProperty("value")
  private String value;

  /**
   * Label ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return status
   */
  public LabelStatus getStatus() {
    return status;
  }

  public void setStatus(LabelStatus status) {
    this.status = status;
  }

  /**
   * Label name. 100-character limit.
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelUpdateItem labelUpdateItem = (LabelUpdateItem) o;
    return Objects.equals(this.id, labelUpdateItem.id) &&
        Objects.equals(this.status, labelUpdateItem.status) &&
        Objects.equals(this.value, labelUpdateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
