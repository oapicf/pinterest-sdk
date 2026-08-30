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
    memset(max_price_filter_local_var, 0, sizeof(max_price_filter_t));
    max_price_filter_local_var->_library_owned = 1;
    max_price_filter_local_var->max_price = max_price;
    return max_price_filter_local_var;
}

__attribute__((deprecated)) max_price_filter_t *max_price_filter_create(
    catalogs_product_group_pricing_criteria_t *max_price
    ) {
    max_price_filter_t *result = max_price_filter_create_internal (
        max_price
        );
    if (!result) {
    }
    return result;
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
        catalogs_product_group_pricing_criteria_free(max_price_filter->max_price);
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
    cJSON *max_price_local_JSON = catalogs_product_group_pricing_criteria_convertToJSON(max_price_filter->max_price);
    if(max_price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MAX_PRICE", max_price_local_JSON);
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

    // define the local variable for max_price_filter->max_price
    catalogs_product_group_pricing_criteria_t *max_price_local_nonprim = NULL;

    // max_price_filter->max_price
    cJSON *max_price = cJSON_GetObjectItemCaseSensitive(max_price_filterJSON, "MAX_PRICE");
    if (cJSON_IsNull(max_price)) {
        max_price = NULL;
    }
    if (!max_price) {
        goto end;
    }

    
    max_price_local_nonprim = catalogs_product_group_pricing_criteria_parseFromJSON(max_price); //nonprimitive



    max_price_filter_local_var = max_price_filter_create_internal (
        max_price_local_nonprim
        );

    if (!max_price_filter_local_var) {
        goto end;
    }

    return max_price_filter_local_var;
end:
    if (max_price_local_nonprim) {
        catalogs_product_group_pricing_criteria_free(max_price_local_nonprim);
        max_price_local_nonprim = NULL;
    }
    return NULL;

}
