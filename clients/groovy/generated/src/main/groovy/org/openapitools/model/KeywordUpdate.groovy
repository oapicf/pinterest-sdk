package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class KeywordUpdate {
    /* Keyword ID. */
    String id
    /* Is keyword archived? */
    Boolean archived
    /* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    Integer bid
}
