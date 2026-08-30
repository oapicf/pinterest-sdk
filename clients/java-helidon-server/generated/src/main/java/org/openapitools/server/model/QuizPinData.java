package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.QuizPinQuestion;
import org.openapitools.server.model.QuizPinResult;
import org.openapitools.server.model.TieBreakerType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This field includes all quiz data including questions, options, and results.
 */
public class QuizPinData   {

    private List<@Valid QuizPinQuestion> questions = new ArrayList<>();
    private List<@Valid QuizPinResult> results = new ArrayList<>();
    private QuizPinResult tieBreakerCustomResult;
    private TieBreakerType tieBreakerType;

    /**
     * Default constructor.
     */
    public QuizPinData() {
    // JSON-B / Jackson
    }

    /**
     * Create QuizPinData.
     *
     * @param questions questions
     * @param results results
     * @param tieBreakerCustomResult tieBreakerCustomResult
     * @param tieBreakerType tieBreakerType
     */
    public QuizPinData(
        List<@Valid QuizPinQuestion> questions, 
        List<@Valid QuizPinResult> results, 
        QuizPinResult tieBreakerCustomResult, 
        TieBreakerType tieBreakerType
    ) {
        this.questions = questions;
        this.results = results;
        this.tieBreakerCustomResult = tieBreakerCustomResult;
        this.tieBreakerType = tieBreakerType;
    }



    /**
     * Get questions
     * @return questions
     */
    public List<@Valid QuizPinQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<@Valid QuizPinQuestion> questions) {
        this.questions = questions;
    }

    /**
     * Get results
     * @return results
     */
    public List<@Valid QuizPinResult> getResults() {
        return results;
    }

    public void setResults(List<@Valid QuizPinResult> results) {
        this.results = results;
    }

    /**
     * Get tieBreakerCustomResult
     * @return tieBreakerCustomResult
     */
    public QuizPinResult getTieBreakerCustomResult() {
        return tieBreakerCustomResult;
    }

    public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
        this.tieBreakerCustomResult = tieBreakerCustomResult;
    }

    /**
     * Get tieBreakerType
     * @return tieBreakerType
     */
    public TieBreakerType getTieBreakerType() {
        return tieBreakerType;
    }

    public void setTieBreakerType(TieBreakerType tieBreakerType) {
        this.tieBreakerType = tieBreakerType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuizPinData {\n");
        
        sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    tieBreakerCustomResult: ").append(toIndentedString(tieBreakerCustomResult)).append("\n");
        sb.append("    tieBreakerType: ").append(toIndentedString(tieBreakerType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

