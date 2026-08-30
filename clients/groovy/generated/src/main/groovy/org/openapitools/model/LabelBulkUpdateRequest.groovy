package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LabelStatusBulkUpdate;

@Canonical
class LabelBulkUpdateRequest {
    /* Label ID. */
    String id
    /* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    String parentId
    
    LabelStatusBulkUpdate status
}
