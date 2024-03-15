#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "min_price_filter.h"



min_price_filter_t *min_price_filter_create(
    catalogs_product_group_pricing_criteria_t *min_price
    ) {
    min_price_filter_t *min_price_filter_local_var = malloc(sizeof(min_price_filter_t));
    if (!min_price_filter_local_var) {
        return NULL;
    }
    min_price_filter_local_var->min_price = min_price;

    return min_price_filter_local_var;
}


void min_price_filter_free(min_price_filter_t *min_price_filter) {
    if(NULL == min_price_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (min_price_filter->min_price) {
        object_free(min_price_filter->min_price);
        min_price_filter->min_price = NULL;
    }
    free(min_price_filter);
}

cJSON *min_price_filter_convertToJSON(min_price_filter_t *min_price_filter) {
    cJSON *item = cJSON_CreateObject();

    // min_price_filter->min_price
    if (!min_price_filter->min_price) {
        goto fail;
    }
    cJSON *min_price_object = object_convertToJSON(min_price_filter->min_price);
    if(min_price_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MIN_PRICE", min_price_object);
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

min_price_filter_t *min_price_filter_parseFromJSON(cJSON *min_price_filterJSON){

    min_price_filter_t *min_price_filter_local_var = NULL;

    // min_price_filter->min_price
    cJSON *min_price = cJSON_GetObjectItemCaseSensitive(min_price_filterJSON, "MIN_PRICE");
    if (!min_price) {
        goto end;
    }

    object_t *min_price_local_object = NULL;
    
    min_price_local_object = object_parseFromJSON(min_price); //object


    min_price_filter_local_var = min_price_filter_create (
        min_price_local_object
        );

    return min_price_filter_local_var;
end:
    return NULL;

}
