package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.IneligibleProductTagErrorItem;

@Canonical
class IneligibleProductTagsErrorDetails {
    /* List of product tags that failed eligibility check. */
    List<IneligibleProductTagErrorItem> productTags = new ArrayList<>()
}
