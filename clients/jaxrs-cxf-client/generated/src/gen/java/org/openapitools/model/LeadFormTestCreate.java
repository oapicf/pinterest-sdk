package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LeadFormTestCreate  {
  
 /**
  * Test lead answers. Should follow the creation order.
  */
  @ApiModelProperty(example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", required = true, value = "Test lead answers. Should follow the creation order.")

  private List<String> answers = new ArrayList<>();
 /**
   * Test lead answers. Should follow the creation order.
   * @return answers
  **/
  @JsonProperty("answers")
  public List<String> getAnswers() {
    return answers;
  }

  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }

  public LeadFormTestCreate answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  public LeadFormTestCreate addAnswersItem(String answersItem) {
    this.answers.add(answersItem);
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
    LeadFormTestCreate leadFormTestCreate = (LeadFormTestCreate) o;
    return Objects.equals(this.answers, leadFormTestCreate.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTestCreate {\n");
    
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

