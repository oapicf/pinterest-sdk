/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;



/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 */

@ApiModel(description = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdCommonQuizPinData   {
  
  private List<QuizPinQuestion> questions;
  private List<QuizPinResult> results;

  /**
   */
  public AdCommonQuizPinData questions(List<QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questions")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   */
  public AdCommonQuizPinData results(List<QuizPinResult> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<QuizPinResult> getResults() {
    return results;
  }
  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCommonQuizPinData adCommonQuizPinData = (AdCommonQuizPinData) o;
    return Objects.equals(questions, adCommonQuizPinData.questions) &&
        Objects.equals(results, adCommonQuizPinData.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCommonQuizPinData {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

