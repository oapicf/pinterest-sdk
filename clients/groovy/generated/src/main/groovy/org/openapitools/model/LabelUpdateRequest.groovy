package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LabelUpdateRequestLabelsInner;

@Canonical
class LabelUpdateRequest {
    /* Labels that you are applying to the campaign. */
    List<LabelUpdateRequestLabelsInner> labels = new ArrayList<>()
}
