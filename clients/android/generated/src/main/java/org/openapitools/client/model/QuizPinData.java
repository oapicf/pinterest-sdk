/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.QuizPinQuestion;
import org.openapitools.client.model.QuizPinResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This field includes all quiz data including questions, options, and results.
 **/
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")
public class QuizPinData {
  
  @SerializedName("questions")
  private List<QuizPinQuestion> questions = null;
  @SerializedName("results")
  private List<QuizPinResult> results = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.questions == null ? quizPinData.questions == null : this.questions.equals(quizPinData.questions)) &&
        (this.results == null ? quizPinData.results == null : this.results.equals(quizPinData.results));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.questions == null ? 0: this.questions.hashCode());
    result = 31 * result + (this.results == null ? 0: this.results.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("  results: ").append(results).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}