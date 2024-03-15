package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;

@Canonical
class AdCommonQuizPinData {
    
    List<QuizPinQuestion> questions
    
    List<QuizPinResult> results
}
