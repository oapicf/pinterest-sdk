#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_bid_options.h"



advanced_auction_bid_options_t *advanced_auction_bid_options_create(
    long bid_in_micro_currency,
    app_type_multipliers_t *app_type_multipliers,
    placement_multipliers_t *placement_multipliers
    ) {
    advanced_auction_bid_options_t *advanced_auction_bid_options_local_var = malloc(sizeof(advanced_auction_bid_options_t));
    if (!advanced_auction_bid_options_local_var) {
        return NULL;
    }
    advanced_auction_bid_options_local_var->bid_in_micro_currency = bid_in_micro_currency;
    advanced_auction_bid_options_local_var->app_type_multipliers = app_type_multipliers;
    advanced_auction_bid_options_local_var->placement_multipliers = placement_multipliers;

    return advanced_auction_bid_options_local_var;
}


void advanced_auction_bid_options_free(advanced_auction_bid_options_t *advanced_auction_bid_options) {
    if(NULL == advanced_auction_bid_options){
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_bid_options->app_type_multipliers) {
        app_type_multipliers_free(advanced_auction_bid_options->app_type_multipliers);
        advanced_auction_bid_options->app_type_multipliers = NULL;
    }
    if (advanced_auction_bid_options->placement_multipliers) {
        placement_multipliers_free(advanced_auction_bid_options->placement_multipliers);
        advanced_auction_bid_options->placement_multipliers = NULL;
    }
    free(advanced_auction_bid_options);
}

cJSON *advanced_auction_bid_options_convertToJSON(advanced_auction_bid_options_t *advanced_auction_bid_options) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_bid_options->bid_in_micro_currency
    if(advanced_auction_bid_options->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", advanced_auction_bid_options->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


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

    // define the local variable for advanced_auction_bid_options->placement_multipliers
    placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // advanced_auction_bid_options->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "bid_in_micro_currency");
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // advanced_auction_bid_options->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "app_type_multipliers");
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = app_type_multipliers_parseFromJSON(app_type_multipliers); //custom
    }

    // advanced_auction_bid_options->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(advanced_auction_bid_optionsJSON, "placement_multipliers");
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = placement_multipliers_parseFromJSON(placement_multipliers); //custom
    }


    advanced_auction_bid_options_local_var = advanced_auction_bid_options_create (
        bid_in_micro_currency ? bid_in_micro_currency->valuedouble : 0,
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL
        );

    return advanced_auction_bid_options_local_var;
end:
    if (app_type_multipliers_local_nonprim) {
        app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    return NULL;

}
