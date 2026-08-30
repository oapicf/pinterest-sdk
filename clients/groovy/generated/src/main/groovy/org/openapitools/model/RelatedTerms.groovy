package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RelatedTermsRelatedTermsListItems;

@Canonical
class RelatedTerms {
    /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */
    String id
    /* Total number of related terms returned */
    Integer relatedTermCount
    /* The id of the advertiser. */
    List<RelatedTermsRelatedTermsListItems> relatedTermsList = new ArrayList<>()
}
