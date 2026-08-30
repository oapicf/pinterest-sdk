#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_update_request_all_of2.h"



static campaign_update_request_all_of2_t *campaign_update_request_all_of2_create_internal(
    campaign_bid_options_update_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    objective_type_t *objective_type
    ) {
    campaign_update_request_all_of2_t *campaign_update_request_all_of2_local_var = malloc(sizeof(campaign_update_request_all_of2_t));
    if (!campaign_update_request_all_of2_local_var) {
        return NULL;
    }
    memset(campaign_update_request_all_of2_local_var, 0, sizeof(campaign_update_request_all_of2_t));
    campaign_update_request_all_of2_local_var->_library_owned = 1;
    campaign_update_request_all_of2_local_var->bid_options = bid_options;
    campaign_update_request_all_of2_local_var->intended_promotion_type = intended_promotion_type;
    campaign_update_request_all_of2_local_var->is_ltv_optimized = is_ltv_optimized;
    campaign_update_request_all_of2_local_var->is_performance_plus = is_performance_plus;
    campaign_update_request_all_of2_local_var->is_top_of_search = is_top_of_search;
    campaign_update_request_all_of2_local_var->objective_type = objective_type;
    return campaign_update_request_all_of2_local_var;
}

__attribute__((deprecated)) campaign_update_request_all_of2_t *campaign_update_request_all_of2_create(
    campaign_bid_options_update_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    objective_type_t *objective_type
    ) {
    int *is_ltv_optimized_copy = NULL;
    if (is_ltv_optimized) {
        is_ltv_optimized_copy = malloc(sizeof(int));
        if (is_ltv_optimized_copy) *is_ltv_optimized_copy = *is_ltv_optimized;
    }
    int *is_performance_plus_copy = NULL;
    if (is_performance_plus) {
        is_performance_plus_copy = malloc(sizeof(int));
        if (is_performance_plus_copy) *is_performance_plus_copy = *is_performance_plus;
    }
    int *is_top_of_search_copy = NULL;
    if (is_top_of_search) {
        is_top_of_search_copy = malloc(sizeof(int));
        if (is_top_of_search_copy) *is_top_of_search_copy = *is_top_of_search;
    }
    campaign_update_request_all_of2_t *result = campaign_update_request_all_of2_create_internal (
        bid_options,
        intended_promotion_type,
        is_ltv_optimized_copy,
        is_performance_plus_copy,
        is_top_of_search_copy,
        objective_type
        );
    if (!result) {
        free(is_ltv_optimized_copy);
        free(is_performance_plus_copy);
        free(is_top_of_search_copy);
    }
    return result;
}

void campaign_update_request_all_of2_free(campaign_update_request_all_of2_t *campaign_update_request_all_of2) {
    if(NULL == campaign_update_request_all_of2){
        return ;
    }
    if(campaign_update_request_all_of2->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_update_request_all_of2_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_update_request_all_of2->bid_options) {
        campaign_bid_options_update_free(campaign_update_request_all_of2->bid_options);
        campaign_update_request_all_of2->bid_options = NULL;
    }
    if (campaign_update_request_all_of2->is_ltv_optimized) {
        free(campaign_update_request_all_of2->is_ltv_optimized);
        campaign_update_request_all_of2->is_ltv_optimized = NULL;
    }
    if (campaign_update_request_all_of2->is_performance_plus) {
        free(campaign_update_request_all_of2->is_performance_plus);
        campaign_update_request_all_of2->is_performance_plus = NULL;
    }
    if (campaign_update_request_all_of2->is_top_of_search) {
        free(campaign_update_request_all_of2->is_top_of_search);
        campaign_update_request_all_of2->is_top_of_search = NULL;
    }
    if (campaign_update_request_all_of2->objective_type) {
        objective_type_free(campaign_update_request_all_of2->objective_type);
        campaign_update_request_all_of2->objective_type = NULL;
    }
    free(campaign_update_request_all_of2);
}

cJSON *campaign_update_request_all_of2_convertToJSON(campaign_update_request_all_of2_t *campaign_update_request_all_of2) {
    cJSON *item = cJSON_CreateObject();

    // campaign_update_request_all_of2->bid_options
    if(campaign_update_request_all_of2->bid_options) {
    cJSON *bid_options_local_JSON = campaign_bid_options_update_convertToJSON(campaign_update_request_all_of2->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_update_request_all_of2->intended_promotion_type
    if(campaign_update_request_all_of2->intended_promotion_type != pinterest_rest_api_intended_promotion_type__NULL) {
    cJSON *intended_promotion_type_local_JSON = intended_promotion_type_convertToJSON(campaign_update_request_all_of2->intended_promotion_type);
    if(intended_promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "intended_promotion_type", intended_promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_update_request_all_of2->is_ltv_optimized
    if(campaign_update_request_all_of2->is_ltv_optimized) {
    if(cJSON_AddBoolToObject(item, "is_ltv_optimized", *campaign_update_request_all_of2->is_ltv_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_update_request_all_of2->is_performance_plus
    if(campaign_update_request_all_of2->is_performance_plus) {
    if(cJSON_AddBoolToObject(item, "is_performance_plus", *campaign_update_request_all_of2->is_performance_plus) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_update_request_all_of2->is_top_of_search
    if(campaign_update_request_all_of2->is_top_of_search) {
    if(cJSON_AddBoolToObject(item, "is_top_of_search", *campaign_update_request_all_of2->is_top_of_search) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_update_request_all_of2->objective_type
    if(campaign_update_request_all_of2->objective_type) {
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(campaign_update_request_all_of2->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
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

campaign_update_request_all_of2_t *campaign_update_request_all_of2_parseFromJSON(cJSON *campaign_update_request_all_of2JSON){

    campaign_update_request_all_of2_t *campaign_update_request_all_of2_local_var = NULL;

    // define the local variable for campaign_update_request_all_of2->bid_options
    campaign_bid_options_update_t *bid_options_local_nonprim = NULL;

    // define the local variable for campaign_update_request_all_of2->intended_promotion_type
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type_local_nonprim = 0;

    // define the local variable for campaign_update_request_all_of2->is_ltv_optimized
    int *is_ltv_optimized_local_var = NULL;

    // define the local variable for campaign_update_request_all_of2->is_performance_plus
    int *is_performance_plus_local_var = NULL;

    // define the local variable for campaign_update_request_all_of2->is_top_of_search
    int *is_top_of_search_local_var = NULL;

    // define the local variable for campaign_update_request_all_of2->objective_type
    objective_type_t *objective_type_local_nonprim = NULL;

    // campaign_update_request_all_of2->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (bid_options) { 
    bid_options_local_nonprim = campaign_bid_options_update_parseFromJSON(bid_options); //nonprimitive
    }

    // campaign_update_request_all_of2->intended_promotion_type
    cJSON *intended_promotion_type = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "intended_promotion_type");
    if (cJSON_IsNull(intended_promotion_type)) {
        intended_promotion_type = NULL;
    }
    if (intended_promotion_type) { 
    intended_promotion_type_local_nonprim = intended_promotion_type_parseFromJSON(intended_promotion_type); //custom
    }

    // campaign_update_request_all_of2->is_ltv_optimized
    cJSON *is_ltv_optimized = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "is_ltv_optimized");
    if (cJSON_IsNull(is_ltv_optimized)) {
        is_ltv_optimized = NULL;
    }
    if (is_ltv_optimized) { 
    if(!cJSON_IsBool(is_ltv_optimized))
    {
    goto end; //Bool
    }
    is_ltv_optimized_local_var = malloc(sizeof(int));
    if(!is_ltv_optimized_local_var)
    {
        goto end;
    }
    *is_ltv_optimized_local_var = is_ltv_optimized->valueint;
    }

    // campaign_update_request_all_of2->is_performance_plus
    cJSON *is_performance_plus = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "is_performance_plus");
    if (cJSON_IsNull(is_performance_plus)) {
        is_performance_plus = NULL;
    }
    if (is_performance_plus) { 
    if(!cJSON_IsBool(is_performance_plus))
    {
    goto end; //Bool
    }
    is_performance_plus_local_var = malloc(sizeof(int));
    if(!is_performance_plus_local_var)
    {
        goto end;
    }
    *is_performance_plus_local_var = is_performance_plus->valueint;
    }

    // campaign_update_request_all_of2->is_top_of_search
    cJSON *is_top_of_search = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "is_top_of_search");
    if (cJSON_IsNull(is_top_of_search)) {
        is_top_of_search = NULL;
    }
    if (is_top_of_search) { 
    if(!cJSON_IsBool(is_top_of_search))
    {
    goto end; //Bool
    }
    is_top_of_search_local_var = malloc(sizeof(int));
    if(!is_top_of_search_local_var)
    {
        goto end;
    }
    *is_top_of_search_local_var = is_top_of_search->valueint;
    }

    // campaign_update_request_all_of2->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_update_request_all_of2JSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom
    }



    campaign_update_request_all_of2_local_var = campaign_update_request_all_of2_create_internal (
        bid_options ? bid_options_local_nonprim : NULL,
        intended_promotion_type ? intended_promotion_type_local_nonprim : 0,
        is_ltv_optimized_local_var,
        is_performance_plus_local_var,
        is_top_of_search_local_var,
        objective_type ? objective_type_local_nonprim : NULL
        );

    if (!campaign_update_request_all_of2_local_var) {
        goto end;
    }

    return campaign_update_request_all_of2_local_var;
end:
    if (bid_options_local_nonprim) {
        campaign_bid_options_update_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
    }
    if (intended_promotion_type_local_nonprim) {
        intended_promotion_type_local_nonprim = 0;
    }
    if (is_ltv_optimized_local_var) {
        free(is_ltv_optimized_local_var);
        is_ltv_optimized_local_var = NULL;
    }
    if (is_performance_plus_local_var) {
        free(is_performance_plus_local_var);
        is_performance_plus_local_var = NULL;
    }
    if (is_top_of_search_local_var) {
        free(is_top_of_search_local_var);
        is_top_of_search_local_var = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_free(objective_type_local_nonprim);
        objective_type_local_nonprim = NULL;
    }
    return NULL;

}
