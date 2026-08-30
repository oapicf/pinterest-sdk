package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;

@Canonical
class Keywords {
    /* Keyword error */
    List<KeywordError> errors = new ArrayList<>()
    /* Keywords */
    List<Keyword> keywords = new ArrayList<>()
}
