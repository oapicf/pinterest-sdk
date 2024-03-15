package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UpdatableItemAttributes;
import org.openapitools.model.UpdateMaskFieldType;

@Canonical
class ItemUpdateBatchRecord {
    /* The catalog item id in the merchant namespace */
    String itemId
    
    UpdatableItemAttributes attributes
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    List<UpdateMaskFieldType> updateMask
}
