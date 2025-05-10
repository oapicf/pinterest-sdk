#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "max_price_filter.h"



static max_price_filter_t *max_price_filter_create_internal(
    catalogs_product_group_pricing_criteria_t *max_price
    ) {
    max_price_filter_t *max_price_filter_local_var = malloc(sizeof(max_price_filter_t));
    if (!max_price_filter_local_var) {
        return NULL;
    }
    max_price_filter_local_var->max_price = max_price;

    max_price_filter_local_var->_library_owned = 1;
    return max_price_filter_local_var;
}

__attribute__((deprecated)) max_price_filter_t *max_price_filter_create(
    catalogs_product_group_pricing_criteria_t *max_price
    ) {
    return max_price_filter_create_internal (
        max_price
        );
}

void max_price_filter_free(max_price_filter_t *max_price_filter) {
    if(NULL == max_price_filter){
        return ;
    }
    if(max_price_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "max_price_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (max_price_filter->max_price) {
        object_free(max_price_filter->max_price);
        max_price_filter->max_price = NULL;
    }
    free(max_price_filter);
}

cJSON *max_price_filter_convertToJSON(max_price_filter_t *max_price_filter) {
    cJSON *item = cJSON_CreateObject();

    // max_price_filter->max_price
    if (!max_price_filter->max_price) {
        goto fail;
    }
    cJSON *max_price_object = object_convertToJSON(max_price_filter->max_price);
    if(max_price_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MAX_PRICE", max_price_object);
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

max_price_filter_t *max_price_filter_parseFromJSON(cJSON *max_price_filterJSON){

    max_price_filter_t *max_price_filter_local_var = NULL;

    // max_price_filter->max_price
    cJSON *max_price = cJSON_GetObjectItemCaseSensitive(max_price_filterJSON, "MAX_PRICE");
    if (cJSON_IsNull(max_price)) {
        max_price = NULL;
    }
    if (!max_price) {
        goto end;
    }

    object_t *max_price_local_object = NULL;
    
    max_price_local_object = object_parseFromJSON(max_price); //object


    max_price_filter_local_var = max_price_filter_create_internal (
        max_price_local_object
        );

    return max_price_filter_local_var;
end:
    return NULL;

}
