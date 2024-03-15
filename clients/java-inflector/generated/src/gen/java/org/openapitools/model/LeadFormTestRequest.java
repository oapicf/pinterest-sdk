package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Request to create test data for lead data test API.
 **/

@ApiModel(description = "Request to create test data for lead data test API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LeadFormTestRequest   {
  @JsonProperty("answers")
  private List<String> answers = new ArrayList<>();

  /**
   * Test lead answers. Should follow the creation order.
   **/
  public LeadFormTestRequest answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  
  @ApiModelProperty(example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", required = true, value = "Test lead answers. Should follow the creation order.")
  @JsonProperty("answers")
  public List<String> getAnswers() {
    return answers;
  }
  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormTestRequest leadFormTestRequest = (LeadFormTestRequest) o;
    return Objects.equals(answers, leadFormTestRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTestRequest {\n");
    
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

