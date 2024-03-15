#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type1_filter.h"



product_type1_filter_t *product_type1_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1
    ) {
    product_type1_filter_t *product_type1_filter_local_var = malloc(sizeof(product_type1_filter_t));
    if (!product_type1_filter_local_var) {
        return NULL;
    }
    product_type1_filter_local_var->product_type_1 = product_type_1;

    return product_type1_filter_local_var;
}


void product_type1_filter_free(product_type1_filter_t *product_type1_filter) {
    if(NULL == product_type1_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_type1_filter->product_type_1) {
        object_free(product_type1_filter->product_type_1);
        product_type1_filter->product_type_1 = NULL;
    }
    free(product_type1_filter);
}

cJSON *product_type1_filter_convertToJSON(product_type1_filter_t *product_type1_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type1_filter->product_type_1
    if (!product_type1_filter->product_type_1) {
        goto fail;
    }
    cJSON *product_type_1_object = object_convertToJSON(product_type1_filter->product_type_1);
    if(product_type_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_1", product_type_1_object);
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

product_type1_filter_t *product_type1_filter_parseFromJSON(cJSON *product_type1_filterJSON){

    product_type1_filter_t *product_type1_filter_local_var = NULL;

    // product_type1_filter->product_type_1
    cJSON *product_type_1 = cJSON_GetObjectItemCaseSensitive(product_type1_filterJSON, "PRODUCT_TYPE_1");
    if (!product_type_1) {
        goto end;
    }

    object_t *product_type_1_local_object = NULL;
    
    product_type_1_local_object = object_parseFromJSON(product_type_1); //object


    product_type1_filter_local_var = product_type1_filter_create (
        product_type_1_local_object
        );

    return product_type1_filter_local_var;
end:
    return NULL;

}
