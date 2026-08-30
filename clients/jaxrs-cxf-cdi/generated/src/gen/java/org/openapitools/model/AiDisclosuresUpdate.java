package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AiDisclosureItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AI disclosure declarations the creator has made about the Pin.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "AI disclosure declarations the creator has made about the Pin.")
public class AiDisclosuresUpdate   {
  
  private List<AiDisclosureItem> values = new ArrayList<>();

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   **/
  public AiDisclosuresUpdate values(List<AiDisclosureItem> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "List of AI disclosure declarations the creator has made about this Pin.")
  @JsonProperty("values")
  public List<AiDisclosureItem> getValues() {
    return values;
  }
  public void setValues(List<AiDisclosureItem> values) {
    this.values = values;
  }

  public AiDisclosuresUpdate addValuesItem(AiDisclosureItem valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiDisclosuresUpdate aiDisclosuresUpdate = (AiDisclosuresUpdate) o;
    return Objects.equals(this.values, aiDisclosuresUpdate.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDisclosuresUpdate {\n");
    
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

