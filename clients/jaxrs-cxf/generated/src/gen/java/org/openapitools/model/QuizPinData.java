package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * This field includes all quiz data including questions, options, and results.
 **/
@ApiModel(description="This field includes all quiz data including questions, options, and results.")

public class QuizPinData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinQuestion> questions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinResult> results = new ArrayList<>();

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

  @ApiModelProperty(value = "Quiz ad tie breaker type, default is RANDOM")
 /**
   * Quiz ad tie breaker type, default is RANDOM
  **/
  private TieBreakerTypeEnum tieBreakerType;

  @ApiModelProperty(value = "")
  @Valid
  private QuizPinResult tieBreakerCustomResult;
 /**
   * Get questions
   * @return questions
  **/
  @JsonProperty("questions")
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Quiz ad tie breaker type, default is RANDOM
   * @return tieBreakerType
  **/
  @JsonProperty("tie_breaker_type")
  public String getTieBreakerType() {
    if (tieBreakerType == null) {
      return null;
    }
    return tieBreakerType.value();
  }

  public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

  public QuizPinData tieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

 /**
   * Get tieBreakerCustomResult
   * @return tieBreakerCustomResult
  **/
  @JsonProperty("tie_breaker_custom_result")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

