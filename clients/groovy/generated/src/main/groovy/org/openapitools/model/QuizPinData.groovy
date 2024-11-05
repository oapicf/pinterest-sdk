package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;

@Canonical
class QuizPinData {
    
    List<QuizPinQuestion> questions = new ArrayList<>()
    
    List<QuizPinResult> results = new ArrayList<>()

    enum TieBreakerTypeEnum {
    
        RANDOM("RANDOM"),
        
        CUSTOM("CUSTOM")
    
        private final String value
    
        TieBreakerTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Quiz ad tie breaker type, default is RANDOM */
    TieBreakerTypeEnum tieBreakerType
    
    QuizPinResult tieBreakerCustomResult
}
