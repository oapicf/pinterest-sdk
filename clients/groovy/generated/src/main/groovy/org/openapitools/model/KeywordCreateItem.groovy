package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;

@Canonical
class KeywordCreateItem {
    /* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    Integer bid
    /* Keyword [match type](/docs/api-features/targeting-overview/) */
    MatchType matchType
    /* Keyword value (120 chars max). */
    String value
}
