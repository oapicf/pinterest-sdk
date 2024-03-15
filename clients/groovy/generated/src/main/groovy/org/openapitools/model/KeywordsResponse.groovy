package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;

@Canonical
class KeywordsResponse {
    
    List<KeywordError> errors
    
    List<Keyword> keywords
}
