package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinOption;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A specific quiz inquiry.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuizPinQuestion   {
  
  private BigDecimal questionId;
  private String questionText;
  private List<@Valid QuizPinOption> options = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("question_id")
  public BigDecimal getQuestionId() {
    return questionId;
  }
  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("question_text")
  public String getQuestionText() {
    return questionText;
  }
  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

