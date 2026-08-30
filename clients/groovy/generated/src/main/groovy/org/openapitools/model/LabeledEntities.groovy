package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;

@Canonical
class LabeledEntities {
    
    List<EntityLabel> entitiesLabels = new ArrayList<>()
    /* Labels that were not successfully applied. */
    List<EntityLabelError> errors = new ArrayList<>()
}
