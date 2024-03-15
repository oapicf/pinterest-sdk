package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;

@Canonical
class LeadFormQuestion {
    
    LeadFormQuestionType questionType
    
    LeadFormQuestionFieldType customQuestionFieldType
    /* Question label for a custom question. */
    String customQuestionLabel
    /* Question options for a custom question. */
    List<String> customQuestionOptions
}
