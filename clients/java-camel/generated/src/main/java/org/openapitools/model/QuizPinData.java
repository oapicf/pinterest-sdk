package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This field includes all quiz data including questions, options, and results.
 */

@Schema(name = "QuizPinData", description = "This field includes all quiz data including questions, options, and results.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuizPinData {

  @Valid
  private List<@Valid QuizPinQuestion> questions = new ArrayList<>();

  @Valid
  private List<@Valid QuizPinResult> results = new ArrayList<>();

  /**
   * Quiz ad tie breaker type, default is RANDOM
   */
  public enum TieBreakerTypeEnum {
    RANDOM("RANDOM"),
    
    CUSTOM("CUSTOM");

    private String value;

    TieBreakerTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TieBreakerTypeEnum fromValue(String value) {
      for (TieBreakerTypeEnum b : TieBreakerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TieBreakerTypeEnum tieBreakerType;

  private JsonNullable<QuizPinResult> tieBreakerCustomResult = JsonNullable.<QuizPinResult>undefined();

  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
   */
  @Valid 
  @Schema(name = "questions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questions")
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData tieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

  /**
   * Quiz ad tie breaker type, default is RANDOM
   * @return tieBreakerType
   */
  
  @Schema(name = "tie_breaker_type", description = "Quiz ad tie breaker type, default is RANDOM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tie_breaker_type")
  public TieBreakerTypeEnum getTieBreakerType() {
    return tieBreakerType;
  }

  public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = JsonNullable.of(tieBreakerCustomResult);
    return this;
  }

  /**
   * Get tieBreakerCustomResult
   * @return tieBreakerCustomResult
   */
  @Valid 
  @Schema(name = "tie_breaker_custom_result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tie_breaker_custom_result")
  public JsonNullable<QuizPinResult> getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  public void setTieBreakerCustomResult(JsonNullable<QuizPinResult> tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPinData quizPinData = (QuizPinData) o;
    return Objects.equals(this.questions, quizPinData.questions) &&
        Objects.equals(this.results, quizPinData.results) &&
        Objects.equals(this.tieBreakerType, quizPinData.tieBreakerType) &&
        equalsNullable(this.tieBreakerCustomResult, quizPinData.tieBreakerCustomResult);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results, tieBreakerType, hashCodeNullable(tieBreakerCustomResult));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    tieBreakerType: ").append(toIndentedString(tieBreakerType)).append("\n");
    sb.append("    tieBreakerCustomResult: ").append(toIndentedString(tieBreakerCustomResult)).append("\n");
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

