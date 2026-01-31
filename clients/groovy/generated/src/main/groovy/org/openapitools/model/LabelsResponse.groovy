package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Label;
import org.openapitools.model.LabelError;

@Canonical
class LabelsResponse {
    /* Labels that were not successfully applied. */
    List<LabelError> errors = new ArrayList<>()
    
    List<Label> labels = new ArrayList<>()
}
