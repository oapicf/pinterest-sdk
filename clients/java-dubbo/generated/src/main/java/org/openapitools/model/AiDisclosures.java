package org.openapitools.model;

import org.openapitools.model.AiDisclosureItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * AI disclosure declarations the creator has made about the Pin.
 */
public class AiDisclosures implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   */
  @JsonProperty("values")
  private List<AiDisclosureItem> values = new ArrayList<>();

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   * @return values
   */
  public List<AiDisclosureItem> getValues() {
    return values;
  }

  public void setValues(List<AiDisclosureItem> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiDisclosures aiDisclosures = (AiDisclosures) o;
    return Objects.equals(this.values, aiDisclosures.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDisclosures {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
