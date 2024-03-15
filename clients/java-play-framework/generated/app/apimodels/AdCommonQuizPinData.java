package apimodels;

import apimodels.QuizPinQuestion;
import apimodels.QuizPinResult;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdCommonQuizPinData   {
  @JsonProperty("questions")
  @Valid

  private List<@Valid QuizPinQuestion> questions = null;

  @JsonProperty("results")
  @Valid

  private List<@Valid QuizPinResult> results = null;

  public AdCommonQuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public AdCommonQuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public AdCommonQuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public AdCommonQuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<@Valid QuizPinResult> results) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

