package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductTagItem;

@Canonical
class ProductTagsBulkDeleteRequest {
    /* List of product tags to delete. */
    List<ProductTagItem> productTags = new ArrayList<>()
}
