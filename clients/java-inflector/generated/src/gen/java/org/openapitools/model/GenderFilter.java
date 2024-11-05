package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GenderFilter   {
  @JsonProperty("GENDER")
  private CatalogsProductGroupMultipleGenderCriteria GENDER;

  /**
   **/
  public GenderFilter GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }
  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderFilter genderFilter = (GenderFilter) o;
    return Objects.equals(GENDER, genderFilter.GENDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GENDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderFilter {\n");
    
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

