#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_reference_filter.h"



product_group_reference_filter_t *product_group_reference_filter_create(
    catalogs_product_group_multiple_string_criteria_t *product_group
    ) {
    product_group_reference_filter_t *product_group_reference_filter_local_var = malloc(sizeof(product_group_reference_filter_t));
    if (!product_group_reference_filter_local_var) {
        return NULL;
    }
    product_group_reference_filter_local_var->product_group = product_group;

    return product_group_reference_filter_local_var;
}


void product_group_reference_filter_free(product_group_reference_filter_t *product_group_reference_filter) {
    if(NULL == product_group_reference_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_reference_filter->product_group) {
        object_free(product_group_reference_filter->product_group);
        product_group_reference_filter->product_group = NULL;
    }
    free(product_group_reference_filter);
}

cJSON *product_group_reference_filter_convertToJSON(product_group_reference_filter_t *product_group_reference_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_group_reference_filter->product_group
    if (!product_group_reference_filter->product_group) {
        goto fail;
    }
    cJSON *product_group_object = object_convertToJSON(product_group_reference_filter->product_group);
    if(product_group_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_GROUP", product_group_object);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_group_reference_filter_t *product_group_reference_filter_parseFromJSON(cJSON *product_group_reference_filterJSON){

    product_group_reference_filter_t *product_group_reference_filter_local_var = NULL;

    // product_group_reference_filter->product_group
    cJSON *product_group = cJSON_GetObjectItemCaseSensitive(product_group_reference_filterJSON, "PRODUCT_GROUP");
    if (!product_group) {
        goto end;
    }

    object_t *product_group_local_object = NULL;
    
    product_group_local_object = object_parseFromJSON(product_group); //object


    product_group_reference_filter_local_var = product_group_reference_filter_create (
        product_group_local_object
        );

    return product_group_reference_filter_local_var;
end:
    return NULL;

}
