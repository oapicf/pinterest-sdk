package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "LeadFormTestCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormTestCreate {

  private List<String> answers = new ArrayList<>();

  public LeadFormTestCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadFormTestCreate(List<String> answers) {
    this.answers = answers;
  }

  public LeadFormTestCreate answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  public LeadFormTestCreate addAnswersItem(String answersItem) {
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

  @JsonProperty("answers")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

