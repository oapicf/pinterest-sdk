package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LabelCreateRequestLabelsInner;

@Canonical
class LabelCreateRequest {
    /* Labels that you are applying to the campaign. */
    List<LabelCreateRequestLabelsInner> labels = new ArrayList<>()
    /* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    String parentId
}
