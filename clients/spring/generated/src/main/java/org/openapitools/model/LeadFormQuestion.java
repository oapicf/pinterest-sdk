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
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeadFormQuestion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormQuestion {

  private LeadFormQuestionType questionType;

  private JsonNullable<LeadFormQuestionFieldType> customQuestionFieldType = JsonNullable.<LeadFormQuestionFieldType>undefined();

  private JsonNullable<String> customQuestionLabel = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> customQuestionOptions = JsonNullable.<List<String>>undefined();

  public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

  /**
   * Get questionType
   * @return questionType
   */
  @Valid 
  @Schema(name = "question_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_type")
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

  public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
  }

  public LeadFormQuestion customQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = JsonNullable.of(customQuestionFieldType);
    return this;
  }

  /**
   * Get customQuestionFieldType
   * @return customQuestionFieldType
   */
  @Valid 
  @Schema(name = "custom_question_field_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_question_field_type")
  public JsonNullable<LeadFormQuestionFieldType> getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }

  public void setCustomQuestionFieldType(JsonNullable<LeadFormQuestionFieldType> customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
  }

  public LeadFormQuestion customQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = JsonNullable.of(customQuestionLabel);
    return this;
  }

  /**
   * Question label for a custom question.
   * @return customQuestionLabel
   */
  
  @Schema(name = "custom_question_label", description = "Question label for a custom question.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_question_label")
  public JsonNullable<String> getCustomQuestionLabel() {
    return customQuestionLabel;
  }

  public void setCustomQuestionLabel(JsonNullable<String> customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
  }

  public LeadFormQuestion customQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = JsonNullable.of(customQuestionOptions);
    return this;
  }

  public LeadFormQuestion addCustomQuestionOptionsItem(String customQuestionOptionsItem) {
    if (this.customQuestionOptions == null || !this.customQuestionOptions.isPresent()) {
      this.customQuestionOptions = JsonNullable.of(new ArrayList<>());
    }
    this.customQuestionOptions.get().add(customQuestionOptionsItem);
    return this;
  }

  /**
   * Question options for a custom question.
   * @return customQuestionOptions
   */
  @Size(min = 0, max = 5) 
  @Schema(name = "custom_question_options", description = "Question options for a custom question.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_question_options")
  public JsonNullable<List<String>> getCustomQuestionOptions() {
    return customQuestionOptions;
  }

  public void setCustomQuestionOptions(JsonNullable<List<String>> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormQuestion leadFormQuestion = (LeadFormQuestion) o;
    return Objects.equals(this.questionType, leadFormQuestion.questionType) &&
        equalsNullable(this.customQuestionFieldType, leadFormQuestion.customQuestionFieldType) &&
        equalsNullable(this.customQuestionLabel, leadFormQuestion.customQuestionLabel) &&
        equalsNullable(this.customQuestionOptions, leadFormQuestion.customQuestionOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionType, hashCodeNullable(customQuestionFieldType), hashCodeNullable(customQuestionLabel), hashCodeNullable(customQuestionOptions));
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
    sb.append("class LeadFormQuestion {\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    customQuestionFieldType: ").append(toIndentedString(customQuestionFieldType)).append("\n");
    sb.append("    customQuestionLabel: ").append(toIndentedString(customQuestionLabel)).append("\n");
    sb.append("    customQuestionOptions: ").append(toIndentedString(customQuestionOptions)).append("\n");
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

