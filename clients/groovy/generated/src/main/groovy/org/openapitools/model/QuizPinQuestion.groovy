package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QuizPinOption;

@Canonical
class QuizPinQuestion {
    
    BigDecimal questionId
    
    String questionText
    
    List<QuizPinOption> options = new ArrayList<>()
}
