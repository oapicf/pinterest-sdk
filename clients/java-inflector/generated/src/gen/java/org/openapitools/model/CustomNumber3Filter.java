package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupUint32Criteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomNumber3Filter   {
  @JsonProperty("CUSTOM_NUMBER_3")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;

  /**
   **/
  public CustomNumber3Filter CUSTOM_NUMBER_3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_3")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }
  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber3Filter customNumber3Filter = (CustomNumber3Filter) o;
    return Objects.equals(CUSTOM_NUMBER_3, customNumber3Filter.CUSTOM_NUMBER_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber3Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_3: ").append(toIndentedString(CUSTOM_NUMBER_3)).append("\n");
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

