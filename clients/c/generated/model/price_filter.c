#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_filter.h"



price_filter_t *price_filter_create(
    catalogs_product_group_pricing_currency_criteria_t *price
    ) {
    price_filter_t *price_filter_local_var = malloc(sizeof(price_filter_t));
    if (!price_filter_local_var) {
        return NULL;
    }
    price_filter_local_var->price = price;

    return price_filter_local_var;
}


void price_filter_free(price_filter_t *price_filter) {
    if(NULL == price_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (price_filter->price) {
        catalogs_product_group_pricing_currency_criteria_free(price_filter->price);
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
    cJSON *price_local_JSON = catalogs_product_group_pricing_currency_criteria_convertToJSON(price_filter->price);
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
    catalogs_product_group_pricing_currency_criteria_t *price_local_nonprim = NULL;

    // price_filter->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(price_filterJSON, "PRICE");
    if (!price) {
        goto end;
    }

    
    price_local_nonprim = catalogs_product_group_pricing_currency_criteria_parseFromJSON(price); //nonprimitive


    price_filter_local_var = price_filter_create (
        price_local_nonprim
        );

    return price_filter_local_var;
end:
    if (price_local_nonprim) {
        catalogs_product_group_pricing_currency_criteria_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    return NULL;

}
