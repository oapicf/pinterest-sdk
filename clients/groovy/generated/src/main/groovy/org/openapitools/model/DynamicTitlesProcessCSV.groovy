package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DynamicTitlesProcessCSVError;

@Canonical
class DynamicTitlesProcessCSV {
    /* List of validation errors. Empty on success. */
    List<DynamicTitlesProcessCSVError> errors = new ArrayList<>()
    /* Processing status. Present on success. */
    String status
}
