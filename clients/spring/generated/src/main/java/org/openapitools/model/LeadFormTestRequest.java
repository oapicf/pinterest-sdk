package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request to create test data for lead data test API.
 */

@Schema(name = "LeadFormTestRequest", description = "Request to create test data for lead data test API.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormTestRequest {

  @Valid
  private List<String> answers = new ArrayList<>();

  public LeadFormTestRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadFormTestRequest(List<String> answers) {
    this.answers = answers;
  }

  public LeadFormTestRequest answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  public LeadFormTestRequest addAnswersItem(String answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Test lead answers. Should follow the creation order.
   * @return answers
   */
  @NotNull 
  @Schema(name = "answers", example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", description = "Test lead answers. Should follow the creation order.", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

