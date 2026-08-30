package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.KeywordCreateItem;

@Canonical
class KeywordsCreate {
    /* Keywords */
    List<KeywordCreateItem> keywords = new ArrayList<>()
    /* Keyword data */
    String parentId
}
