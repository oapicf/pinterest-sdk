package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AiDisclosureItem;



/**
 * AI disclosure declarations the creator has made about the Pin.
 **/

@ApiModel(description = "AI disclosure declarations the creator has made about the Pin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AiDisclosures   {
  @JsonProperty("values")
  private List<AiDisclosureItem> values = new ArrayList<>();

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   **/
  public AiDisclosures values(List<AiDisclosureItem> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of AI disclosure declarations the creator has made about this Pin.")
  @JsonProperty("values")
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
    return Objects.equals(values, aiDisclosures.values);
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

