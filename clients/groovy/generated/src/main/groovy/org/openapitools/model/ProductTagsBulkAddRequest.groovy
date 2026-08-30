package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductTagItem;

@Canonical
class ProductTagsBulkAddRequest {
    /* List of product tags to add. Maximum 24 items allowed. */
    List<ProductTagItem> productTags = new ArrayList<>()
}
