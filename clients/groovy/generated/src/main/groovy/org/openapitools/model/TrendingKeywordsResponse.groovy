package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TrendingKeyword;

@Canonical
class TrendingKeywordsResponse {
    /* The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend. */
    List<TrendingKeyword> trends = new ArrayList<>()
}
