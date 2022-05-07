package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemBatchRecord;

@Canonical
class CatalogsItems {
    /* Array with catalogs items */
    List<ItemBatchRecord> items = new ArrayList<ItemBatchRecord>()
}
