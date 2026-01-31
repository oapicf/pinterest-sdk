package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinOption;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A specific quiz inquiry.
 */

@Schema(name = "QuizPinQuestion", description = "A specific quiz inquiry.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class QuizPinQuestion {

  private @Nullable BigDecimal questionId;

  private @Nullable String questionText;

  @Valid
  private List<@Valid QuizPinOption> options = new ArrayList<>();

  public QuizPinQuestion questionId(@Nullable BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
   */
  @Valid 
  @Schema(name = "question_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_id")
  public @Nullable BigDecimal getQuestionId() {
    return questionId;
  }

  public void setQuestionId(@Nullable BigDecimal questionId) {
    this.questionId = questionId;
  }

  public QuizPinQuestion questionText(@Nullable String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * Get questionText
   * @return questionText
   */
  
  @Schema(name = "question_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_text")
  public @Nullable String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(@Nullable String questionText) {
    this.questionText = questionText;
  }

  public QuizPinQuestion options(List<@Valid QuizPinOption> options) {
    this.options = options;
    return this;
  }

  public QuizPinQuestion addOptionsItem(QuizPinOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid QuizPinOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid QuizPinOption> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPinQuestion quizPinQuestion = (QuizPinQuestion) o;
    return Objects.equals(this.questionId, quizPinQuestion.questionId) &&
        Objects.equals(this.questionText, quizPinQuestion.questionText) &&
        Objects.equals(this.options, quizPinQuestion.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, questionText, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinQuestion {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

