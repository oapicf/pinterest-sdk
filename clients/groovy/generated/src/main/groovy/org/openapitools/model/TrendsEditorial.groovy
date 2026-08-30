package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.KeywordInfo;

@Canonical
class TrendsEditorial {
    /* URL of the editorial board */
    String boardUrl
    /* Description of the editorial article */
    String description
    /* List of interests related to the editorial article */
    List<String> interests = new ArrayList<>()
    /* URL of the pins related to the editorial article */
    List<String> pinsUrl = new ArrayList<>()
    /* List of keywords related to the editorial article */
    List<KeywordInfo> relatedKeywords = new ArrayList<>()
    /* Title of the editorial article */
    String title
}
