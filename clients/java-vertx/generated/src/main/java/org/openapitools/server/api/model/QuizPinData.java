package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.QuizPinQuestion;
import org.openapitools.server.api.model.QuizPinResult;

/**
 * This field includes all quiz data including questions, options, and results.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizPinData   {
  
  private List<QuizPinQuestion> questions;
  private List<QuizPinResult> results;

  public QuizPinData () {

  }

  public QuizPinData (List<QuizPinQuestion> questions, List<QuizPinResult> results) {
    this.questions = questions;
    this.results = results;
  }

    
  @JsonProperty("questions")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

    
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
    QuizPinData quizPinData = (QuizPinData) o;
    return Objects.equals(questions, quizPinData.questions) &&
        Objects.equals(results, quizPinData.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    
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
