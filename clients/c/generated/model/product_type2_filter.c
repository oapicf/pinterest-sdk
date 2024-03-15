#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type2_filter.h"



product_type2_filter_t *product_type2_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_2
    ) {
    product_type2_filter_t *product_type2_filter_local_var = malloc(sizeof(product_type2_filter_t));
    if (!product_type2_filter_local_var) {
        return NULL;
    }
    product_type2_filter_local_var->product_type_2 = product_type_2;

    return product_type2_filter_local_var;
}


void product_type2_filter_free(product_type2_filter_t *product_type2_filter) {
    if(NULL == product_type2_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (product_type2_filter->product_type_2) {
        object_free(product_type2_filter->product_type_2);
        product_type2_filter->product_type_2 = NULL;
    }
    free(product_type2_filter);
}

cJSON *product_type2_filter_convertToJSON(product_type2_filter_t *product_type2_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type2_filter->product_type_2
    if (!product_type2_filter->product_type_2) {
        goto fail;
    }
    cJSON *product_type_2_object = object_convertToJSON(product_type2_filter->product_type_2);
    if(product_type_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_2", product_type_2_object);
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

product_type2_filter_t *product_type2_filter_parseFromJSON(cJSON *product_type2_filterJSON){

    product_type2_filter_t *product_type2_filter_local_var = NULL;

    // product_type2_filter->product_type_2
    cJSON *product_type_2 = cJSON_GetObjectItemCaseSensitive(product_type2_filterJSON, "PRODUCT_TYPE_2");
    if (!product_type_2) {
        goto end;
    }

    object_t *product_type_2_local_object = NULL;
    
    product_type_2_local_object = object_parseFromJSON(product_type_2); //object


    product_type2_filter_local_var = product_type2_filter_create (
        product_type_2_local_object
        );

    return product_type2_filter_local_var;
end:
    return NULL;

}
