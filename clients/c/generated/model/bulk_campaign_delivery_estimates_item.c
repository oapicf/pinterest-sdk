#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_campaign_delivery_estimates_item.h"



static bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_create_internal(
    list_t *adgroup_audience_sizes,
    float *conversion_rate,
    list_t *conversion_rates,
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    list_t *errors,
    char *estimate_id,
    int *max_potential_spend
    ) {
    bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_local_var = malloc(sizeof(bulk_campaign_delivery_estimates_item_t));
    if (!bulk_campaign_delivery_estimates_item_local_var) {
        return NULL;
    }
    memset(bulk_campaign_delivery_estimates_item_local_var, 0, sizeof(bulk_campaign_delivery_estimates_item_t));
    bulk_campaign_delivery_estimates_item_local_var->_library_owned = 1;
    bulk_campaign_delivery_estimates_item_local_var->adgroup_audience_sizes = adgroup_audience_sizes;
    bulk_campaign_delivery_estimates_item_local_var->conversion_rate = conversion_rate;
    bulk_campaign_delivery_estimates_item_local_var->conversion_rates = conversion_rates;
    bulk_campaign_delivery_estimates_item_local_var->curves = curves;
    bulk_campaign_delivery_estimates_item_local_var->derived_metrics = derived_metrics;
    bulk_campaign_delivery_estimates_item_local_var->errors = errors;
    bulk_campaign_delivery_estimates_item_local_var->estimate_id = estimate_id;
    bulk_campaign_delivery_estimates_item_local_var->max_potential_spend = max_potential_spend;
    return bulk_campaign_delivery_estimates_item_local_var;
}

__attribute__((deprecated)) bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_create(
    list_t *adgroup_audience_sizes,
    float *conversion_rate,
    list_t *conversion_rates,
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    list_t *errors,
    char *estimate_id,
    int *max_potential_spend
    ) {
    float *conversion_rate_copy = NULL;
    if (conversion_rate) {
        conversion_rate_copy = malloc(sizeof(float));
        if (conversion_rate_copy) *conversion_rate_copy = *conversion_rate;
    }
    int *max_potential_spend_copy = NULL;
    if (max_potential_spend) {
        max_potential_spend_copy = malloc(sizeof(int));
        if (max_potential_spend_copy) *max_potential_spend_copy = *max_potential_spend;
    }
    bulk_campaign_delivery_estimates_item_t *result = bulk_campaign_delivery_estimates_item_create_internal (
        adgroup_audience_sizes,
        conversion_rate_copy,
        conversion_rates,
        curves,
        derived_metrics,
        errors,
        estimate_id,
        max_potential_spend_copy
        );
    if (!result) {
        free(conversion_rate_copy);
        free(max_potential_spend_copy);
    }
    return result;
}

void bulk_campaign_delivery_estimates_item_free(bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item) {
    if(NULL == bulk_campaign_delivery_estimates_item){
        return ;
    }
    if(bulk_campaign_delivery_estimates_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_campaign_delivery_estimates_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_campaign_delivery_estimates_item->adgroup_audience_sizes) {
        list_ForEach(listEntry, bulk_campaign_delivery_estimates_item->adgroup_audience_sizes) {
            campaign_planning_ad_group_audience_size_free(listEntry->data);
        }
        list_freeList(bulk_campaign_delivery_estimates_item->adgroup_audience_sizes);
        bulk_campaign_delivery_estimates_item->adgroup_audience_sizes = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->conversion_rate) {
        free(bulk_campaign_delivery_estimates_item->conversion_rate);
        bulk_campaign_delivery_estimates_item->conversion_rate = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->conversion_rates) {
        list_ForEach(listEntry, bulk_campaign_delivery_estimates_item->conversion_rates) {
            campaign_planning_conversion_rate_free(listEntry->data);
        }
        list_freeList(bulk_campaign_delivery_estimates_item->conversion_rates);
        bulk_campaign_delivery_estimates_item->conversion_rates = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->curves) {
        list_ForEach(listEntry, bulk_campaign_delivery_estimates_item->curves) {
            campaign_planning_curve_estimate_free(listEntry->data);
        }
        list_freeList(bulk_campaign_delivery_estimates_item->curves);
        bulk_campaign_delivery_estimates_item->curves = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->derived_metrics) {
        campaign_delivery_estimates_derived_metrics_free(bulk_campaign_delivery_estimates_item->derived_metrics);
        bulk_campaign_delivery_estimates_item->derived_metrics = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->errors) {
        list_ForEach(listEntry, bulk_campaign_delivery_estimates_item->errors) {
            campaign_planning_response_error_free(listEntry->data);
        }
        list_freeList(bulk_campaign_delivery_estimates_item->errors);
        bulk_campaign_delivery_estimates_item->errors = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->estimate_id) {
        free(bulk_campaign_delivery_estimates_item->estimate_id);
        bulk_campaign_delivery_estimates_item->estimate_id = NULL;
    }
    if (bulk_campaign_delivery_estimates_item->max_potential_spend) {
        free(bulk_campaign_delivery_estimates_item->max_potential_spend);
        bulk_campaign_delivery_estimates_item->max_potential_spend = NULL;
    }
    free(bulk_campaign_delivery_estimates_item);
}

cJSON *bulk_campaign_delivery_estimates_item_convertToJSON(bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item) {
    cJSON *item = cJSON_CreateObject();

    // bulk_campaign_delivery_estimates_item->adgroup_audience_sizes
    if(bulk_campaign_delivery_estimates_item->adgroup_audience_sizes) {
    cJSON *adgroup_audience_sizes = cJSON_AddArrayToObject(item, "adgroup_audience_sizes");
    if(adgroup_audience_sizes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *adgroup_audience_sizesListEntry;
    if (bulk_campaign_delivery_estimates_item->adgroup_audience_sizes) {
    list_ForEach(adgroup_audience_sizesListEntry, bulk_campaign_delivery_estimates_item->adgroup_audience_sizes) {
    cJSON *itemLocal = campaign_planning_ad_group_audience_size_convertToJSON(adgroup_audience_sizesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(adgroup_audience_sizes, itemLocal);
    }
    }
    }


    // bulk_campaign_delivery_estimates_item->conversion_rate
    if(bulk_campaign_delivery_estimates_item->conversion_rate) {
    if(cJSON_AddNumberToObject(item, "conversion_rate", *bulk_campaign_delivery_estimates_item->conversion_rate) == NULL) {
    goto fail; //Numeric
    }
    }


    // bulk_campaign_delivery_estimates_item->conversion_rates
    if(bulk_campaign_delivery_estimates_item->conversion_rates) {
    cJSON *conversion_rates = cJSON_AddArrayToObject(item, "conversion_rates");
    if(conversion_rates == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *conversion_ratesListEntry;
    if (bulk_campaign_delivery_estimates_item->conversion_rates) {
    list_ForEach(conversion_ratesListEntry, bulk_campaign_delivery_estimates_item->conversion_rates) {
    cJSON *itemLocal = campaign_planning_conversion_rate_convertToJSON(conversion_ratesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(conversion_rates, itemLocal);
    }
    }
    }


    // bulk_campaign_delivery_estimates_item->curves
    if(bulk_campaign_delivery_estimates_item->curves) {
    cJSON *curves = cJSON_AddArrayToObject(item, "curves");
    if(curves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *curvesListEntry;
    if (bulk_campaign_delivery_estimates_item->curves) {
    list_ForEach(curvesListEntry, bulk_campaign_delivery_estimates_item->curves) {
    cJSON *itemLocal = campaign_planning_curve_estimate_convertToJSON(curvesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(curves, itemLocal);
    }
    }
    }


    // bulk_campaign_delivery_estimates_item->derived_metrics
    if(bulk_campaign_delivery_estimates_item->derived_metrics) {
    cJSON *derived_metrics_local_JSON = campaign_delivery_estimates_derived_metrics_convertToJSON(bulk_campaign_delivery_estimates_item->derived_metrics);
    if(derived_metrics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "derived_metrics", derived_metrics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // bulk_campaign_delivery_estimates_item->errors
    if(bulk_campaign_delivery_estimates_item->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (bulk_campaign_delivery_estimates_item->errors) {
    list_ForEach(errorsListEntry, bulk_campaign_delivery_estimates_item->errors) {
    cJSON *itemLocal = campaign_planning_response_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // bulk_campaign_delivery_estimates_item->estimate_id
    if(bulk_campaign_delivery_estimates_item->estimate_id) {
    if(cJSON_AddStringToObject(item, "estimate_id", bulk_campaign_delivery_estimates_item->estimate_id) == NULL) {
    goto fail; //String
    }
    }


    // bulk_campaign_delivery_estimates_item->max_potential_spend
    if(bulk_campaign_delivery_estimates_item->max_potential_spend) {
    if(cJSON_AddNumberToObject(item, "max_potential_spend", *bulk_campaign_delivery_estimates_item->max_potential_spend) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_parseFromJSON(cJSON *bulk_campaign_delivery_estimates_itemJSON){

    bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_local_var = NULL;

    // define the local list for bulk_campaign_delivery_estimates_item->adgroup_audience_sizes
    list_t *adgroup_audience_sizesList = NULL;

    // define the local variable for bulk_campaign_delivery_estimates_item->conversion_rate
    float *conversion_rate_local_var = NULL;

    // define the local list for bulk_campaign_delivery_estimates_item->conversion_rates
    list_t *conversion_ratesList = NULL;

    // define the local list for bulk_campaign_delivery_estimates_item->curves
    list_t *curvesList = NULL;

    // define the local variable for bulk_campaign_delivery_estimates_item->derived_metrics
    campaign_delivery_estimates_derived_metrics_t *derived_metrics_local_nonprim = NULL;

    // define the local list for bulk_campaign_delivery_estimates_item->errors
    list_t *errorsList = NULL;

    char *estimate_id_local_str = NULL;

    // define the local variable for bulk_campaign_delivery_estimates_item->max_potential_spend
    int *max_potential_spend_local_var = NULL;

    // bulk_campaign_delivery_estimates_item->adgroup_audience_sizes
    cJSON *adgroup_audience_sizes = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "adgroup_audience_sizes");
    if (cJSON_IsNull(adgroup_audience_sizes)) {
        adgroup_audience_sizes = NULL;
    }
    if (adgroup_audience_sizes) { 
    cJSON *adgroup_audience_sizes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(adgroup_audience_sizes)){
        goto end; //nonprimitive container
    }

    adgroup_audience_sizesList = list_createList();

    cJSON_ArrayForEach(adgroup_audience_sizes_local_nonprimitive,adgroup_audience_sizes )
    {
        if(!cJSON_IsObject(adgroup_audience_sizes_local_nonprimitive)){
            goto end;
        }
        campaign_planning_ad_group_audience_size_t *adgroup_audience_sizesItem = campaign_planning_ad_group_audience_size_parseFromJSON(adgroup_audience_sizes_local_nonprimitive);

        list_addElement(adgroup_audience_sizesList, adgroup_audience_sizesItem);
    }
    }

    // bulk_campaign_delivery_estimates_item->conversion_rate
    cJSON *conversion_rate = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "conversion_rate");
    if (cJSON_IsNull(conversion_rate)) {
        conversion_rate = NULL;
    }
    if (conversion_rate) { 
    if(!cJSON_IsNumber(conversion_rate))
    {
    goto end; //Numeric
    }
    conversion_rate_local_var = malloc(sizeof(float));
    if(!conversion_rate_local_var)
    {
        goto end;
    }
    *conversion_rate_local_var = conversion_rate->valuedouble;
    }

    // bulk_campaign_delivery_estimates_item->conversion_rates
    cJSON *conversion_rates = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "conversion_rates");
    if (cJSON_IsNull(conversion_rates)) {
        conversion_rates = NULL;
    }
    if (conversion_rates) { 
    cJSON *conversion_rates_local_nonprimitive = NULL;
    if(!cJSON_IsArray(conversion_rates)){
        goto end; //nonprimitive container
    }

    conversion_ratesList = list_createList();

    cJSON_ArrayForEach(conversion_rates_local_nonprimitive,conversion_rates )
    {
        if(!cJSON_IsObject(conversion_rates_local_nonprimitive)){
            goto end;
        }
        campaign_planning_conversion_rate_t *conversion_ratesItem = campaign_planning_conversion_rate_parseFromJSON(conversion_rates_local_nonprimitive);

        list_addElement(conversion_ratesList, conversion_ratesItem);
    }
    }

    // bulk_campaign_delivery_estimates_item->curves
    cJSON *curves = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "curves");
    if (cJSON_IsNull(curves)) {
        curves = NULL;
    }
    if (curves) { 
    cJSON *curves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(curves)){
        goto end; //nonprimitive container
    }

    curvesList = list_createList();

    cJSON_ArrayForEach(curves_local_nonprimitive,curves )
    {
        if(!cJSON_IsObject(curves_local_nonprimitive)){
            goto end;
        }
        campaign_planning_curve_estimate_t *curvesItem = campaign_planning_curve_estimate_parseFromJSON(curves_local_nonprimitive);

        list_addElement(curvesList, curvesItem);
    }
    }

    // bulk_campaign_delivery_estimates_item->derived_metrics
    cJSON *derived_metrics = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "derived_metrics");
    if (cJSON_IsNull(derived_metrics)) {
        derived_metrics = NULL;
    }
    if (derived_metrics) { 
    derived_metrics_local_nonprim = campaign_delivery_estimates_derived_metrics_parseFromJSON(derived_metrics); //nonprimitive
    }

    // bulk_campaign_delivery_estimates_item->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        campaign_planning_response_error_t *errorsItem = campaign_planning_response_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // bulk_campaign_delivery_estimates_item->estimate_id
    cJSON *estimate_id = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "estimate_id");
    if (cJSON_IsNull(estimate_id)) {
        estimate_id = NULL;
    }
    if (estimate_id) { 
    if(!cJSON_IsString(estimate_id) && !cJSON_IsNull(estimate_id))
    {
    goto end; //String
    }
    }

    // bulk_campaign_delivery_estimates_item->max_potential_spend
    cJSON *max_potential_spend = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_itemJSON, "max_potential_spend");
    if (cJSON_IsNull(max_potential_spend)) {
        max_potential_spend = NULL;
    }
    if (max_potential_spend) { 
    if(!cJSON_IsNumber(max_potential_spend))
    {
    goto end; //Numeric
    }
    max_potential_spend_local_var = malloc(sizeof(int));
    if(!max_potential_spend_local_var)
    {
        goto end;
    }
    *max_potential_spend_local_var = max_potential_spend->valuedouble;
    }


    if (estimate_id && !cJSON_IsNull(estimate_id)) estimate_id_local_str = strdup(estimate_id->valuestring);

    bulk_campaign_delivery_estimates_item_local_var = bulk_campaign_delivery_estimates_item_create_internal (
        adgroup_audience_sizes ? adgroup_audience_sizesList : NULL,
        conversion_rate_local_var,
        conversion_rates ? conversion_ratesList : NULL,
        curves ? curvesList : NULL,
        derived_metrics ? derived_metrics_local_nonprim : NULL,
        errors ? errorsList : NULL,
        estimate_id_local_str,
        max_potential_spend_local_var
        );

    if (!bulk_campaign_delivery_estimates_item_local_var) {
        goto end;
    }

    return bulk_campaign_delivery_estimates_item_local_var;
end:
    if (adgroup_audience_sizesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, adgroup_audience_sizesList) {
            campaign_planning_ad_group_audience_size_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(adgroup_audience_sizesList);
        adgroup_audience_sizesList = NULL;
    }
    if (conversion_rate_local_var) {
        free(conversion_rate_local_var);
        conversion_rate_local_var = NULL;
    }
    if (conversion_ratesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, conversion_ratesList) {
            campaign_planning_conversion_rate_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(conversion_ratesList);
        conversion_ratesList = NULL;
    }
    if (curvesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, curvesList) {
            campaign_planning_curve_estimate_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(curvesList);
        curvesList = NULL;
    }
    if (derived_metrics_local_nonprim) {
        campaign_delivery_estimates_derived_metrics_free(derived_metrics_local_nonprim);
        derived_metrics_local_nonprim = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            campaign_planning_response_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (estimate_id_local_str) {
        free(estimate_id_local_str);
        estimate_id_local_str = NULL;
    }
    if (max_potential_spend_local_var) {
        free(max_potential_spend_local_var);
        max_potential_spend_local_var = NULL;
    }
    return NULL;

}
