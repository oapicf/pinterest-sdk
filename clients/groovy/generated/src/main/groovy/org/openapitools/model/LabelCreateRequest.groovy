package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LabelCreateItem;

@Canonical
class LabelCreateRequest {
    /* Labels that you are applying to the campaign. */
    List<LabelCreateItem> labels = new ArrayList<>()
}
