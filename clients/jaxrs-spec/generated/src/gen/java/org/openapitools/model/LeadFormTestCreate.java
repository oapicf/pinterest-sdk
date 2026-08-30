package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("LeadFormTestCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormTestCreate   {
  private @Valid List<String> answers = new ArrayList<>();

  public LeadFormTestCreate() {
  }

  @JsonCreator
  public LeadFormTestCreate(
    @JsonProperty(required = true, value = "answers") List<String> answers
  ) {
    this.answers = answers;
  }

  /**
   * Test lead answers. Should follow the creation order.
   **/
  public LeadFormTestCreate answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  
  @ApiModelProperty(example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", required = true, value = "Test lead answers. Should follow the creation order.")
  @JsonProperty(required = true, value = "answers")
  @NotNull public List<String> getAnswers() {
    return answers;
  }

  @JsonProperty(required = true, value = "answers")
  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }

  public LeadFormTestCreate addAnswersItem(String answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }

    this.answers.add(answersItem);
    return this;
  }

  public LeadFormTestCreate removeAnswersItem(String answersItem) {
    if (answersItem != null && this.answers != null) {
      this.answers.remove(answersItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
