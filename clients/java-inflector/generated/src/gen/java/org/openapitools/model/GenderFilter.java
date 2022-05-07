package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-07T06:38:14.669946Z[Etc/UTC]")
public class GenderFilter   {
  @JsonProperty("GENDER")
  private CatalogsProductGroupMultipleStringCriteria GENDER;

  /**
   **/
  public GenderFilter GENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleStringCriteria getGENDER() {
    return GENDER;
  }
  public void setGENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
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

