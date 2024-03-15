#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type0_filter.h"



product_type0_filter_t *product_type0_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_0
    ) {
    product_type0_filter_t *product_type0_filter_local_var = malloc(sizeof(product_type0_filter_t));
    if (!product_type0_filter_local_var) {
        return NULL;
    }
    product_type0_filter_local_var->product_type_0 = product_type_0;

    return product_type0_filter_local_var;
}


void product_type0_filter_free(product_type0_filter_t *product_type0_filter) {
    if(NULL == product_type0_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_type0_filter->product_type_0) {
        object_free(product_type0_filter->product_type_0);
        product_type0_filter->product_type_0 = NULL;
    }
    free(product_type0_filter);
}

cJSON *product_type0_filter_convertToJSON(product_type0_filter_t *product_type0_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type0_filter->product_type_0
    if (!product_type0_filter->product_type_0) {
        goto fail;
    }
    cJSON *product_type_0_object = object_convertToJSON(product_type0_filter->product_type_0);
    if(product_type_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_0", product_type_0_object);
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

product_type0_filter_t *product_type0_filter_parseFromJSON(cJSON *product_type0_filterJSON){

    product_type0_filter_t *product_type0_filter_local_var = NULL;

    // product_type0_filter->product_type_0
    cJSON *product_type_0 = cJSON_GetObjectItemCaseSensitive(product_type0_filterJSON, "PRODUCT_TYPE_0");
    if (!product_type_0) {
        goto end;
    }

    object_t *product_type_0_local_object = NULL;
    
    product_type_0_local_object = object_parseFromJSON(product_type_0); //object


    product_type0_filter_local_var = product_type0_filter_create (
        product_type_0_local_object
        );

    return product_type0_filter_local_var;
end:
    return NULL;

}
