package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.KeywordsCommon;

@Canonical
class KeywordsRequest {
    /* Keyword JSON array. Each array element has 3 fields */
    List<KeywordsCommon> keywords = new ArrayList<>()
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    String parentId
}
