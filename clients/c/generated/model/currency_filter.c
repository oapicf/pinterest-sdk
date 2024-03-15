#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "currency_filter.h"



currency_filter_t *currency_filter_create(
    catalogs_product_group_currency_criteria_t *currency
    ) {
    currency_filter_t *currency_filter_local_var = malloc(sizeof(currency_filter_t));
    if (!currency_filter_local_var) {
        return NULL;
    }
    currency_filter_local_var->currency = currency;

    return currency_filter_local_var;
}


void currency_filter_free(currency_filter_t *currency_filter) {
    if(NULL == currency_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (currency_filter->currency) {
        object_free(currency_filter->currency);
        currency_filter->currency = NULL;
    }
    free(currency_filter);
}

cJSON *currency_filter_convertToJSON(currency_filter_t *currency_filter) {
    cJSON *item = cJSON_CreateObject();

    // currency_filter->currency
    if (!currency_filter->currency) {
        goto fail;
    }
    cJSON *currency_object = object_convertToJSON(currency_filter->currency);
    if(currency_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CURRENCY", currency_object);
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

currency_filter_t *currency_filter_parseFromJSON(cJSON *currency_filterJSON){

    currency_filter_t *currency_filter_local_var = NULL;

    // currency_filter->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(currency_filterJSON, "CURRENCY");
    if (!currency) {
        goto end;
    }

    object_t *currency_local_object = NULL;
    
    currency_local_object = object_parseFromJSON(currency); //object


    currency_filter_local_var = currency_filter_create (
        currency_local_object
        );

    return currency_filter_local_var;
end:
    return NULL;

}
