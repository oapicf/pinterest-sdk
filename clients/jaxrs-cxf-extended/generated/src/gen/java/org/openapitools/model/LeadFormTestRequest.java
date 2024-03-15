package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request to create test data for lead data test API.
 */
@ApiModel(description="Request to create test data for lead data test API.")

public class LeadFormTestRequest  {
  
 /**
  * Test lead answers. Should follow the creation order.
  */
  @ApiModelProperty(example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", required = true, value = "Test lead answers. Should follow the creation order.")
  private List<String> answers = new ArrayList<>();
 /**
  * Test lead answers. Should follow the creation order.
  * @return answers
  */
  @JsonProperty("answers")
  @NotNull
  public List<String> getAnswers() {
    return answers;
  }

  /**
   * Sets the <code>answers</code> property.
   */
 public void setAnswers(List<String> answers) {
    this.answers = answers;
  }

  /**
   * Sets the <code>answers</code> property.
   */
  public LeadFormTestRequest answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  /**
   * Adds a new item to the <code>answers</code> list.
   */
  public LeadFormTestRequest addAnswersItem(String answersItem) {
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
    LeadFormTestRequest leadFormTestRequest = (LeadFormTestRequest) o;
    return Objects.equals(this.answers, leadFormTestRequest.answers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

