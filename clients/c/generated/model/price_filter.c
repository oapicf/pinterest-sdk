#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_filter.h"



static price_filter_t *price_filter_create_internal(
    price_filter_price_t *price
    ) {
    price_filter_t *price_filter_local_var = malloc(sizeof(price_filter_t));
    if (!price_filter_local_var) {
        return NULL;
    }
    memset(price_filter_local_var, 0, sizeof(price_filter_t));
    price_filter_local_var->_library_owned = 1;
    price_filter_local_var->price = price;
    return price_filter_local_var;
}

__attribute__((deprecated)) price_filter_t *price_filter_create(
    price_filter_price_t *price
    ) {
    price_filter_t *result = price_filter_create_internal (
        price
        );
    if (!result) {
    }
    return result;
}

void price_filter_free(price_filter_t *price_filter) {
    if(NULL == price_filter){
        return ;
    }
    if(price_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "price_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (price_filter->price) {
        price_filter_price_free(price_filter->price);
        price_filter->price = NULL;
    }
    free(price_filter);
}

cJSON *price_filter_convertToJSON(price_filter_t *price_filter) {
    cJSON *item = cJSON_CreateObject();

    // price_filter->price
    if (!price_filter->price) {
        goto fail;
    }
    cJSON *price_local_JSON = price_filter_price_convertToJSON(price_filter->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRICE", price_local_JSON);
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

price_filter_t *price_filter_parseFromJSON(cJSON *price_filterJSON){

    price_filter_t *price_filter_local_var = NULL;

    // define the local variable for price_filter->price
    price_filter_price_t *price_local_nonprim = NULL;

    // price_filter->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(price_filterJSON, "PRICE");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (!price) {
        goto end;
    }

    
    price_local_nonprim = price_filter_price_parseFromJSON(price); //nonprimitive



    price_filter_local_var = price_filter_create_internal (
        price_local_nonprim
        );

    if (!price_filter_local_var) {
        goto end;
    }

    return price_filter_local_var;
end:
    if (price_local_nonprim) {
        price_filter_price_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    return NULL;

}
