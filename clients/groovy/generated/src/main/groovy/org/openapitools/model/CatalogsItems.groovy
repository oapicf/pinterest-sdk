package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemResponse;

@Canonical
class CatalogsItems {
    /* Array with catalogs items */
    List<ItemResponse> items = new ArrayList<>()
}
