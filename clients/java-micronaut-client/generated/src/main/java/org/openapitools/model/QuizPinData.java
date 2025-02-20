/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * This field includes all quiz data including questions, options, and results.
 */
@JsonPropertyOrder({
  QuizPinData.JSON_PROPERTY_QUESTIONS,
  QuizPinData.JSON_PROPERTY_RESULTS,
  QuizPinData.JSON_PROPERTY_TIE_BREAKER_TYPE,
  QuizPinData.JSON_PROPERTY_TIE_BREAKER_CUSTOM_RESULT
})
@JsonTypeName("QuizPinData")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class QuizPinData {
    public static final String JSON_PROPERTY_QUESTIONS = "questions";
    private List<@Valid QuizPinQuestion> questions = null;

    public static final String JSON_PROPERTY_RESULTS = "results";
    private List<@Valid QuizPinResult> results = null;

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
    public static final String JSON_PROPERTY_TIE_BREAKER_TYPE = "tie_breaker_type";
    private TieBreakerTypeEnum tieBreakerType;

    public static final String JSON_PROPERTY_TIE_BREAKER_CUSTOM_RESULT = "tie_breaker_custom_result";
    private QuizPinResult tieBreakerCustomResult;

    public QuizPinData() {
    }

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
    @Nullable
    @JsonProperty(JSON_PROPERTY_QUESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid QuizPinQuestion> getQuestions() {
        return questions;
    }

    @JsonProperty(JSON_PROPERTY_QUESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid QuizPinResult> getResults() {
        return results;
    }

    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_TIE_BREAKER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TieBreakerTypeEnum getTieBreakerType() {
        return tieBreakerType;
    }

    @JsonProperty(JSON_PROPERTY_TIE_BREAKER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
        this.tieBreakerType = tieBreakerType;
    }

    public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
        this.tieBreakerCustomResult = tieBreakerCustomResult;
        return this;
    }

    /**
     * Get tieBreakerCustomResult
     * @return tieBreakerCustomResult
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_TIE_BREAKER_CUSTOM_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public QuizPinResult getTieBreakerCustomResult() {
        return tieBreakerCustomResult;
    }

    @JsonProperty(JSON_PROPERTY_TIE_BREAKER_CUSTOM_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

