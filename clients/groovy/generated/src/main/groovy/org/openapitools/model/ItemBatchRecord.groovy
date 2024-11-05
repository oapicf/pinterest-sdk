package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ItemAttributesRequest;
import org.openapitools.model.ItemCreateBatchRecord;
import org.openapitools.model.ItemDeleteBatchRecord;
import org.openapitools.model.ItemDeleteDiscontinuedBatchRecord;
import org.openapitools.model.ItemUpdateBatchRecord;
import org.openapitools.model.ItemUpsertBatchRecord;
import org.openapitools.model.UpdateMaskFieldType;

@Canonical
class ItemBatchRecord {
    /* The catalog item id in the merchant namespace */
    String itemId
    
    ItemAttributesRequest attributes
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    List<UpdateMaskFieldType> updateMask
}
