package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This field includes all quiz data including questions, options, and results.
 **/
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")
@JsonTypeName("QuizPinData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuizPinData   {
  private @Valid List<@Valid QuizPinQuestion> questions = new ArrayList<>();
  private @Valid List<@Valid QuizPinResult> results = new ArrayList<>();
  public enum TieBreakerTypeEnum {

    RANDOM(String.valueOf("RANDOM")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    TieBreakerTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TieBreakerTypeEnum fromString(String s) {
        for (TieBreakerTypeEnum b : TieBreakerTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private QuizPinResult tieBreakerCustomResult;

  /**
   **/
  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questions")
  @Valid public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  @JsonProperty("questions")
  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }

    this.questions.add(questionsItem);
    return this;
  }

  public QuizPinData removeQuestionsItem(QuizPinQuestion questionsItem) {
    if (questionsItem != null && this.questions != null) {
      this.questions.remove(questionsItem);
    }

    return this;
  }
  /**
   **/
  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  @Valid public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  @JsonProperty("results")
  public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }

    this.results.add(resultsItem);
    return this;
  }

  public QuizPinData removeResultsItem(QuizPinResult resultsItem) {
    if (resultsItem != null && this.results != null) {
      this.results.remove(resultsItem);
    }

    return this;
  }
  /**
   * Quiz ad tie breaker type, default is RANDOM
   **/
  public QuizPinData tieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

  
  @ApiModelProperty(value = "Quiz ad tie breaker type, default is RANDOM")
  @JsonProperty("tie_breaker_type")
  public TieBreakerTypeEnum getTieBreakerType() {
    return tieBreakerType;
  }

  @JsonProperty("tie_breaker_type")
  public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

  /**
   **/
  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tie_breaker_custom_result")
  @Valid public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  @JsonProperty("tie_breaker_custom_result")
  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
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
        Objects.equals(this.tieBreakerCustomResult, quizPinData.tieBreakerCustomResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results, tieBreakerType, tieBreakerCustomResult);
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

