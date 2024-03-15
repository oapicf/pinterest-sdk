#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type3_filter.h"



product_type3_filter_t *product_type3_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_3
    ) {
    product_type3_filter_t *product_type3_filter_local_var = malloc(sizeof(product_type3_filter_t));
    if (!product_type3_filter_local_var) {
        return NULL;
    }
    product_type3_filter_local_var->product_type_3 = product_type_3;

    return product_type3_filter_local_var;
}


void product_type3_filter_free(product_type3_filter_t *product_type3_filter) {
    if(NULL == product_type3_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_type3_filter->product_type_3) {
        object_free(product_type3_filter->product_type_3);
        product_type3_filter->product_type_3 = NULL;
    }
    free(product_type3_filter);
}

cJSON *product_type3_filter_convertToJSON(product_type3_filter_t *product_type3_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type3_filter->product_type_3
    if (!product_type3_filter->product_type_3) {
        goto fail;
    }
    cJSON *product_type_3_object = object_convertToJSON(product_type3_filter->product_type_3);
    if(product_type_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_3", product_type_3_object);
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

product_type3_filter_t *product_type3_filter_parseFromJSON(cJSON *product_type3_filterJSON){

    product_type3_filter_t *product_type3_filter_local_var = NULL;

    // product_type3_filter->product_type_3
    cJSON *product_type_3 = cJSON_GetObjectItemCaseSensitive(product_type3_filterJSON, "PRODUCT_TYPE_3");
    if (!product_type_3) {
        goto end;
    }

    object_t *product_type_3_local_object = NULL;
    
    product_type_3_local_object = object_parseFromJSON(product_type_3); //object


    product_type3_filter_local_var = product_type3_filter_create (
        product_type_3_local_object
        );

    return product_type3_filter_local_var;
end:
    return NULL;

}
