package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import org.openapitools.model.TieBreakerType;

@Canonical
class QuizPinData {
    
    List<QuizPinQuestion> questions = new ArrayList<>()
    
    List<QuizPinResult> results = new ArrayList<>()
    
    QuizPinResult tieBreakerCustomResult
    
    TieBreakerType tieBreakerType
}
