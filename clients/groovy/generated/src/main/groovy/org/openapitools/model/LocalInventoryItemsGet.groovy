package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocalInventoryItemResponse;

@Canonical
class LocalInventoryItemsGet {
    /* Array of local inventory items */
    List<LocalInventoryItemResponse> items = new ArrayList<>()
}
