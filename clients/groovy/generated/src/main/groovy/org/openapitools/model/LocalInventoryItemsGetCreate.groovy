package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemIdStoreCodePair;

@Canonical
class LocalInventoryItemsGetCreate {
    /* Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. */
    List<ItemIdStoreCodePair> itemFilters = new ArrayList<>()
}
