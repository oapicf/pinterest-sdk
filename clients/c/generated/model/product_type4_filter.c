#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type4_filter.h"



product_type4_filter_t *product_type4_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_4
    ) {
    product_type4_filter_t *product_type4_filter_local_var = malloc(sizeof(product_type4_filter_t));
    if (!product_type4_filter_local_var) {
        return NULL;
    }
    product_type4_filter_local_var->product_type_4 = product_type_4;

    return product_type4_filter_local_var;
}


void product_type4_filter_free(product_type4_filter_t *product_type4_filter) {
    if(NULL == product_type4_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_type4_filter->product_type_4) {
        object_free(product_type4_filter->product_type_4);
        product_type4_filter->product_type_4 = NULL;
    }
    free(product_type4_filter);
}

cJSON *product_type4_filter_convertToJSON(product_type4_filter_t *product_type4_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type4_filter->product_type_4
    if (!product_type4_filter->product_type_4) {
        goto fail;
    }
    cJSON *product_type_4_object = object_convertToJSON(product_type4_filter->product_type_4);
    if(product_type_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_4", product_type_4_object);
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

product_type4_filter_t *product_type4_filter_parseFromJSON(cJSON *product_type4_filterJSON){

    product_type4_filter_t *product_type4_filter_local_var = NULL;

    // product_type4_filter->product_type_4
    cJSON *product_type_4 = cJSON_GetObjectItemCaseSensitive(product_type4_filterJSON, "PRODUCT_TYPE_4");
    if (!product_type_4) {
        goto end;
    }

    object_t *product_type_4_local_object = NULL;
    
    product_type_4_local_object = object_parseFromJSON(product_type_4); //object


    product_type4_filter_local_var = product_type4_filter_create (
        product_type_4_local_object
        );

    return product_type4_filter_local_var;
end:
    return NULL;

}
