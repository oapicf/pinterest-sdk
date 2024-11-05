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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description="This field includes all quiz data including questions, options, and results.")

public class QuizPinData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinQuestion> questions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinResult> results = new ArrayList<>();

public enum TieBreakerTypeEnum {

    @JsonProperty("RANDOM") RANDOM(String.valueOf("RANDOM")),
    @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM"));

    private String value;

    TieBreakerTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TieBreakerTypeEnum fromValue(String value) {
        for (TieBreakerTypeEnum b : TieBreakerTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Quiz ad tie breaker type, default is RANDOM
  */
  @ApiModelProperty(value = "Quiz ad tie breaker type, default is RANDOM")
  private TieBreakerTypeEnum tieBreakerType;

  @ApiModelProperty(value = "")
  @Valid
  private QuizPinResult tieBreakerCustomResult;
 /**
  * Get questions
  * @return questions
  */
  @JsonProperty("questions")
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
 public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Adds a new item to the <code>questions</code> list.
   */
  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
  * Get results
  * @return results
  */
  @JsonProperty("results")
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
  * Quiz ad tie breaker type, default is RANDOM
  * @return tieBreakerType
  */
  @JsonProperty("tie_breaker_type")
  public String getTieBreakerType() {
    return tieBreakerType == null ? null : tieBreakerType.value();
  }

  /**
   * Sets the <code>tieBreakerType</code> property.
   */
 public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

  /**
   * Sets the <code>tieBreakerType</code> property.
   */
  public QuizPinData tieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

 /**
  * Get tieBreakerCustomResult
  * @return tieBreakerCustomResult
  */
  @JsonProperty("tie_breaker_custom_result")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  /**
   * Sets the <code>tieBreakerCustomResult</code> property.
   */
 public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  /**
   * Sets the <code>tieBreakerCustomResult</code> property.
   */
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

