package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AiDisclosureItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AI disclosure declarations the creator has made about the Pin.
 */
@ApiModel(description = "AI disclosure declarations the creator has made about the Pin.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AiDisclosuresUpdate   {
  @JsonProperty("values")
  
  private List<AiDisclosureItem> values = null;

  public AiDisclosuresUpdate values(List<AiDisclosureItem> values) {
    this.values = values;
    return this;
  }

  public AiDisclosuresUpdate addValuesItem(AiDisclosureItem valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   * @return values
   */
  @ApiModelProperty(value = "List of AI disclosure declarations the creator has made about this Pin.")
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

