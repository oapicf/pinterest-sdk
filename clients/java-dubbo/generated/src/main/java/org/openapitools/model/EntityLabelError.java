package org.openapitools.model;

import org.openapitools.model.EntityLabel;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class EntityLabelError implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private EntityLabel data;

  @JsonProperty("error_messages")
  private List<String> errorMessages = new ArrayList<>();

  /**
   * 
   * @return data
   */
  public EntityLabel getData() {
    return data;
  }

  public void setData(EntityLabel data) {
    this.data = data;
  }

  /**
   * 
   * @return errorMessages
   */
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLabelError entityLabelError = (EntityLabelError) o;
    return Objects.equals(this.data, entityLabelError.data) &&
        Objects.equals(this.errorMessages, entityLabelError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLabelError {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
