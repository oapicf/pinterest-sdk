package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocalInventoryOperation;

@Canonical
class LocalInventoryItemsBatchCreate {
    /* Array of inventory operations. Up to 1000 items per request. */
    List<LocalInventoryOperation> operations = new ArrayList<>()
}
