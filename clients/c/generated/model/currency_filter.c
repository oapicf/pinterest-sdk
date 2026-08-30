#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "currency_filter.h"



static currency_filter_t *currency_filter_create_internal(
    catalogs_product_group_currency_criteria_t *currency
    ) {
    currency_filter_t *currency_filter_local_var = malloc(sizeof(currency_filter_t));
    if (!currency_filter_local_var) {
        return NULL;
    }
    memset(currency_filter_local_var, 0, sizeof(currency_filter_t));
    currency_filter_local_var->_library_owned = 1;
    currency_filter_local_var->currency = currency;
    return currency_filter_local_var;
}

__attribute__((deprecated)) currency_filter_t *currency_filter_create(
    catalogs_product_group_currency_criteria_t *currency
    ) {
    currency_filter_t *result = currency_filter_create_internal (
        currency
        );
    if (!result) {
    }
    return result;
}

void currency_filter_free(currency_filter_t *currency_filter) {
    if(NULL == currency_filter){
        return ;
    }
    if(currency_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "currency_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (currency_filter->currency) {
        catalogs_product_group_currency_criteria_free(currency_filter->currency);
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
    cJSON *currency_local_JSON = catalogs_product_group_currency_criteria_convertToJSON(currency_filter->currency);
    if(currency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CURRENCY", currency_local_JSON);
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

    // define the local variable for currency_filter->currency
    catalogs_product_group_currency_criteria_t *currency_local_nonprim = NULL;

    // currency_filter->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(currency_filterJSON, "CURRENCY");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = catalogs_product_group_currency_criteria_parseFromJSON(currency); //nonprimitive



    currency_filter_local_var = currency_filter_create_internal (
        currency_local_nonprim
        );

    if (!currency_filter_local_var) {
        goto end;
    }

    return currency_filter_local_var;
end:
    if (currency_local_nonprim) {
        catalogs_product_group_currency_criteria_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
