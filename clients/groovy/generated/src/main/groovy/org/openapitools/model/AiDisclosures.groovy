package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AiDisclosureItem;

@Canonical
class AiDisclosures {
    /* List of AI disclosure declarations the creator has made about this Pin. */
    List<AiDisclosureItem> values = new ArrayList<>()
}
