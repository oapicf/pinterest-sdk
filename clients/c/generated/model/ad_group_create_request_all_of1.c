#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_create_request_all_of1.h"



static ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_create_internal(
    int *auto_targeting_enabled,
    double *bid_multiplier,
    budget_type_t *budget_type,
    pacing_delivery_type_t *pacing_delivery_type
    ) {
    ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_local_var = malloc(sizeof(ad_group_create_request_all_of1_t));
    if (!ad_group_create_request_all_of1_local_var) {
        return NULL;
    }
    memset(ad_group_create_request_all_of1_local_var, 0, sizeof(ad_group_create_request_all_of1_t));
    ad_group_create_request_all_of1_local_var->_library_owned = 1;
    ad_group_create_request_all_of1_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_create_request_all_of1_local_var->bid_multiplier = bid_multiplier;
    ad_group_create_request_all_of1_local_var->budget_type = budget_type;
    ad_group_create_request_all_of1_local_var->pacing_delivery_type = pacing_delivery_type;
    return ad_group_create_request_all_of1_local_var;
}

__attribute__((deprecated)) ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_create(
    int *auto_targeting_enabled,
    double *bid_multiplier,
    budget_type_t *budget_type,
    pacing_delivery_type_t *pacing_delivery_type
    ) {
    int *auto_targeting_enabled_copy = NULL;
    if (auto_targeting_enabled) {
        auto_targeting_enabled_copy = malloc(sizeof(int));
        if (auto_targeting_enabled_copy) *auto_targeting_enabled_copy = *auto_targeting_enabled;
    }
    double *bid_multiplier_copy = NULL;
    if (bid_multiplier) {
        bid_multiplier_copy = malloc(sizeof(double));
        if (bid_multiplier_copy) *bid_multiplier_copy = *bid_multiplier;
    }
    ad_group_create_request_all_of1_t *result = ad_group_create_request_all_of1_create_internal (
        auto_targeting_enabled_copy,
        bid_multiplier_copy,
        budget_type,
        pacing_delivery_type
        );
    if (!result) {
        free(auto_targeting_enabled_copy);
        free(bid_multiplier_copy);
    }
    return result;
}

void ad_group_create_request_all_of1_free(ad_group_create_request_all_of1_t *ad_group_create_request_all_of1) {
    if(NULL == ad_group_create_request_all_of1){
        return ;
    }
    if(ad_group_create_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_create_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_create_request_all_of1->auto_targeting_enabled) {
        free(ad_group_create_request_all_of1->auto_targeting_enabled);
        ad_group_create_request_all_of1->auto_targeting_enabled = NULL;
    }
    if (ad_group_create_request_all_of1->bid_multiplier) {
        free(ad_group_create_request_all_of1->bid_multiplier);
        ad_group_create_request_all_of1->bid_multiplier = NULL;
    }
    if (ad_group_create_request_all_of1->budget_type) {
        budget_type_free(ad_group_create_request_all_of1->budget_type);
        ad_group_create_request_all_of1->budget_type = NULL;
    }
    if (ad_group_create_request_all_of1->pacing_delivery_type) {
        pacing_delivery_type_free(ad_group_create_request_all_of1->pacing_delivery_type);
        ad_group_create_request_all_of1->pacing_delivery_type = NULL;
    }
    free(ad_group_create_request_all_of1);
}

cJSON *ad_group_create_request_all_of1_convertToJSON(ad_group_create_request_all_of1_t *ad_group_create_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_create_request_all_of1->auto_targeting_enabled
    if(ad_group_create_request_all_of1->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", *ad_group_create_request_all_of1->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_create_request_all_of1->bid_multiplier
    if(ad_group_create_request_all_of1->bid_multiplier) {
    if(cJSON_AddNumberToObject(item, "bid_multiplier", *ad_group_create_request_all_of1->bid_multiplier) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_create_request_all_of1->budget_type
    if(ad_group_create_request_all_of1->budget_type) {
    cJSON *budget_type_local_JSON = budget_type_convertToJSON(ad_group_create_request_all_of1->budget_type);
    if(budget_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "budget_type", budget_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_create_request_all_of1->pacing_delivery_type
    if(ad_group_create_request_all_of1->pacing_delivery_type) {
    cJSON *pacing_delivery_type_local_JSON = pacing_delivery_type_convertToJSON(ad_group_create_request_all_of1->pacing_delivery_type);
    if(pacing_delivery_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "pacing_delivery_type", pacing_delivery_type_local_JSON);
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

ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_parseFromJSON(cJSON *ad_group_create_request_all_of1JSON){

    ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_local_var = NULL;

    // define the local variable for ad_group_create_request_all_of1->auto_targeting_enabled
    int *auto_targeting_enabled_local_var = NULL;

    // define the local variable for ad_group_create_request_all_of1->bid_multiplier
    double *bid_multiplier_local_var = NULL;

    // define the local variable for ad_group_create_request_all_of1->budget_type
    budget_type_t *budget_type_local_nonprim = NULL;

    // define the local variable for ad_group_create_request_all_of1->pacing_delivery_type
    pacing_delivery_type_t *pacing_delivery_type_local_nonprim = NULL;

    // ad_group_create_request_all_of1->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_create_request_all_of1JSON, "auto_targeting_enabled");
    if (cJSON_IsNull(auto_targeting_enabled)) {
        auto_targeting_enabled = NULL;
    }
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    auto_targeting_enabled_local_var = malloc(sizeof(int));
    if(!auto_targeting_enabled_local_var)
    {
        goto end;
    }
    *auto_targeting_enabled_local_var = auto_targeting_enabled->valueint;
    }

    // ad_group_create_request_all_of1->bid_multiplier
    cJSON *bid_multiplier = cJSON_GetObjectItemCaseSensitive(ad_group_create_request_all_of1JSON, "bid_multiplier");
    if (cJSON_IsNull(bid_multiplier)) {
        bid_multiplier = NULL;
    }
    if (bid_multiplier) { 
    if(!cJSON_IsNumber(bid_multiplier))
    {
    goto end; //Numeric
    }
    bid_multiplier_local_var = malloc(sizeof(double));
    if(!bid_multiplier_local_var)
    {
        goto end;
    }
    *bid_multiplier_local_var = bid_multiplier->valuedouble;
    }

    // ad_group_create_request_all_of1->budget_type
    cJSON *budget_type = cJSON_GetObjectItemCaseSensitive(ad_group_create_request_all_of1JSON, "budget_type");
    if (cJSON_IsNull(budget_type)) {
        budget_type = NULL;
    }
    if (budget_type) { 
    budget_type_local_nonprim = budget_type_parseFromJSON(budget_type); //custom
    }

    // ad_group_create_request_all_of1->pacing_delivery_type
    cJSON *pacing_delivery_type = cJSON_GetObjectItemCaseSensitive(ad_group_create_request_all_of1JSON, "pacing_delivery_type");
    if (cJSON_IsNull(pacing_delivery_type)) {
        pacing_delivery_type = NULL;
    }
    if (pacing_delivery_type) { 
    pacing_delivery_type_local_nonprim = pacing_delivery_type_parseFromJSON(pacing_delivery_type); //custom
    }



    ad_group_create_request_all_of1_local_var = ad_group_create_request_all_of1_create_internal (
        auto_targeting_enabled_local_var,
        bid_multiplier_local_var,
        budget_type ? budget_type_local_nonprim : NULL,
        pacing_delivery_type ? pacing_delivery_type_local_nonprim : NULL
        );

    if (!ad_group_create_request_all_of1_local_var) {
        goto end;
    }

    return ad_group_create_request_all_of1_local_var;
end:
    if (auto_targeting_enabled_local_var) {
        free(auto_targeting_enabled_local_var);
        auto_targeting_enabled_local_var = NULL;
    }
    if (bid_multiplier_local_var) {
        free(bid_multiplier_local_var);
        bid_multiplier_local_var = NULL;
    }
    if (budget_type_local_nonprim) {
        budget_type_free(budget_type_local_nonprim);
        budget_type_local_nonprim = NULL;
    }
    if (pacing_delivery_type_local_nonprim) {
        pacing_delivery_type_free(pacing_delivery_type_local_nonprim);
        pacing_delivery_type_local_nonprim = NULL;
    }
    return NULL;

}
