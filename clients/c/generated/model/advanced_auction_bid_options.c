#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_bid_options.h"



static advanced_auction_bid_options_t *advanced_auction_bid_options_create_internal(
    app_type_multipliers_t *app_type_multipliers,
    long *bid_in_micro_currency,
    placement_multipliers_t *placement_multipliers
    ) {
    advanced_auction_bid_options_t *advanced_auction_bid_options_local_var = malloc(sizeof(advanced_auction_bid_options_t));
    if (!advanced_auction_bid_options_local_var) {
        return NULL;
    }
    memset(advanced_auction_bid_options_local_var, 0, sizeof(advanced_auction_bid_options_t));
    advanced_auction_bid_options_local_var->_library_owned = 1;
    advanced_auction_bid_options_local_var->app_type_multipliers = app_type_multipliers;
    advanced_auction_bid_options_local_var->bid_in_micro_currency = bid_in_micro_currency;
    advanced_auction_bid_options_local_var->placement_multipliers = placement_multipliers;
    return advanced_auction_bid_options_local_var;
}

__attribute__((deprecated)) advanced_auction_bid_options_t *advanced_auction_bid_options_create(
    app_type_multipliers_t *app_type_multipliers,
    long *bid_in_micro_currency,
    placement_multipliers_t *placement_multipliers
    ) {
    long *bid_in_micro_currency_copy = NULL;
    if (bid_in_micro_currency) {
        bid_in_micro_currency_copy = malloc(sizeof(long));
        if (bid_in_micro_currency_copy) *bid_in_micro_currency_copy = *bid_in_micro_currency;
    }
    advanced_auction_bid_options_t *result = advanced_auction_bid_options_create_internal (
        app_type_multipliers,
        bid_in_micro_currency_copy,
        placement_multipliers
        );
    if (!result) {
        free(bid_in_micro_currency_copy);
    }
    return result;
}

void advanced_auction_bid_options_free(advanced_auction_bid_options_t *advanced_auction_bid_options) {
    if(NULL == advanced_auction_bid_options){
        return ;
    }
    if(advanced_auction_bid_options->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_bid_options_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_bid_options->app_type_multipliers) {
        app_type_multipliers_free(advanced_auction_bid_options->app_type_multipliers);
        advanced_auction_bid_options->app_type_multipliers = NULL;
    }
    if (advanced_auction_bid_options->bid_in_micro_currency) {
        free(advanced_auction_bid_options->bid_in_micro_currency);
        advanced_auction_bid_options->bid_in_micro_currency = NULL;
    }
    if (advanced_auction_bid_options->placement_multipliers) {
        placement_multipliers_free(advanced_auction_bid_options->placement_multipliers);
        advanced_auction_bid_options->placement_multipliers = NULL;
    }
    free(advanced_auction_bid_options);
}

cJSON *advanced_auction_bid_options_convertToJSON(advanced_auction_bid_options_t *advanced_auction_bid_options) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_bid_options->app_type_multipliers
    if(advanced_auction_bid_options->app_type_multipliers) {
    cJSON *app_type_multipliers_local_JSON = app_type_multipliers_convertToJSON(advanced_auction_bid_options->app_type_multipliers);
    if(app_type_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "app_type_multipliers", app_type_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // advanced_auction_bid_options->bid_in_micro_currency
    if(advanced_auction_bid_options->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", *advanced_auction_bid_options->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // advanced_auction_bid_options->placement_multipliers
    if(advanced_auction_bid_options->placement_multipliers) {
    cJSON *placement_multipliers_local_JSON = placement_multipliers_convertToJSON(advanced_auction_bid_options->placement_multipliers);
    if(placement_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_multipliers", placement_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advanced_auction_bid_options_t *advanced_auction_bid_options_parseFromJSON(cJSON *advanced_auction_bid_optionsJSON){

    advanced_auction_bid_options_t *advanced_auction_bid_options_local_var = NULL;

    // define the local variable for advanced_auction_bid_options->app_type_multipliers
    app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local variable for advanced_auction_bid_options->bid_in_micro_currency
    long *bid_in_micro_currency_local_var = NULL;

    // define the local variable for advanced_auction_bid_options->placement_multipliers
    placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // advanced_auction_bid_options->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "app_type_multipliers");
    if (cJSON_IsNull(app_type_multipliers)) {
        app_type_multipliers = NULL;
    }
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = app_type_multipliers_parseFromJSON(app_type_multipliers); //custom
    }

    // advanced_auction_bid_options->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "bid_in_micro_currency");
    if (cJSON_IsNull(bid_in_micro_currency)) {
        bid_in_micro_currency = NULL;
    }
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    bid_in_micro_currency_local_var = malloc(sizeof(long));
    if(!bid_in_micro_currency_local_var)
    {
        goto end;
    }
    *bid_in_micro_currency_local_var = bid_in_micro_currency->valuedouble;
    }

    // advanced_auction_bid_options->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "placement_multipliers");
    if (cJSON_IsNull(placement_multipliers)) {
        placement_multipliers = NULL;
    }
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = placement_multipliers_parseFromJSON(placement_multipliers); //custom
    }



    advanced_auction_bid_options_local_var = advanced_auction_bid_options_create_internal (
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        bid_in_micro_currency_local_var,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL
        );

    if (!advanced_auction_bid_options_local_var) {
        goto end;
    }

    return advanced_auction_bid_options_local_var;
end:
    if (app_type_multipliers_local_nonprim) {
        app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (bid_in_micro_currency_local_var) {
        free(bid_in_micro_currency_local_var);
        bid_in_micro_currency_local_var = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    return NULL;

}
