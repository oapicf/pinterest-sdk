#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_category_details.h"



static product_category_details_t *product_category_details_create_internal(
    product_categories_demographic_t *demographics,
    int has_prediction,
    product_categories_metrics_highlights_t *metrics_highlights,
    list_t* predicted_time_series,
    pinterest_rest_api_product_category_enum__e product_category,
    list_t *related_searches,
    list_t* time_series
    ) {
    product_category_details_t *product_category_details_local_var = malloc(sizeof(product_category_details_t));
    if (!product_category_details_local_var) {
        return NULL;
    }
    product_category_details_local_var->demographics = demographics;
    product_category_details_local_var->has_prediction = has_prediction;
    product_category_details_local_var->metrics_highlights = metrics_highlights;
    product_category_details_local_var->predicted_time_series = predicted_time_series;
    product_category_details_local_var->product_category = product_category;
    product_category_details_local_var->related_searches = related_searches;
    product_category_details_local_var->time_series = time_series;

    product_category_details_local_var->_library_owned = 1;
    return product_category_details_local_var;
}

__attribute__((deprecated)) product_category_details_t *product_category_details_create(
    product_categories_demographic_t *demographics,
    int has_prediction,
    product_categories_metrics_highlights_t *metrics_highlights,
    list_t* predicted_time_series,
    pinterest_rest_api_product_category_enum__e product_category,
    list_t *related_searches,
    list_t* time_series
    ) {
    return product_category_details_create_internal (
        demographics,
        has_prediction,
        metrics_highlights,
        predicted_time_series,
        product_category,
        related_searches,
        time_series
        );
}

void product_category_details_free(product_category_details_t *product_category_details) {
    if(NULL == product_category_details){
        return ;
    }
    if(product_category_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_category_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_category_details->demographics) {
        product_categories_demographic_free(product_category_details->demographics);
        product_category_details->demographics = NULL;
    }
    if (product_category_details->metrics_highlights) {
        product_categories_metrics_highlights_free(product_category_details->metrics_highlights);
        product_category_details->metrics_highlights = NULL;
    }
    if (product_category_details->predicted_time_series) {
        list_ForEach(listEntry, product_category_details->predicted_time_series) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(product_category_details->predicted_time_series);
        product_category_details->predicted_time_series = NULL;
    }
    if (product_category_details->related_searches) {
        list_ForEach(listEntry, product_category_details->related_searches) {
            free(listEntry->data);
        }
        list_freeList(product_category_details->related_searches);
        product_category_details->related_searches = NULL;
    }
    if (product_category_details->time_series) {
        list_ForEach(listEntry, product_category_details->time_series) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(product_category_details->time_series);
        product_category_details->time_series = NULL;
    }
    free(product_category_details);
}

cJSON *product_category_details_convertToJSON(product_category_details_t *product_category_details) {
    cJSON *item = cJSON_CreateObject();

    // product_category_details->demographics
    if(product_category_details->demographics) {
    cJSON *demographics_local_JSON = product_categories_demographic_convertToJSON(product_category_details->demographics);
    if(demographics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "demographics", demographics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_category_details->has_prediction
    if (!product_category_details->has_prediction) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_prediction", product_category_details->has_prediction) == NULL) {
    goto fail; //Bool
    }


    // product_category_details->metrics_highlights
    if(product_category_details->metrics_highlights) {
    cJSON *metrics_highlights_local_JSON = product_categories_metrics_highlights_convertToJSON(product_category_details->metrics_highlights);
    if(metrics_highlights_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metrics_highlights", metrics_highlights_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_category_details->predicted_time_series
    if(product_category_details->predicted_time_series) {
    cJSON *predicted_time_series = cJSON_AddObjectToObject(item, "predicted_time_series");
    if(predicted_time_series == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = predicted_time_series;
    listEntry_t *predicted_time_seriesListEntry;
    if (product_category_details->predicted_time_series) {
    list_ForEach(predicted_time_seriesListEntry, product_category_details->predicted_time_series) {
        keyValuePair_t *localKeyValue = predicted_time_seriesListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // product_category_details->product_category
    if (pinterest_rest_api_product_category_enum__NULL == product_category_details->product_category) {
        goto fail;
    }
    cJSON *product_category_local_JSON = product_category_enum_convertToJSON(product_category_details->product_category);
    if(product_category_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "product_category", product_category_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // product_category_details->related_searches
    if(product_category_details->related_searches) {
    cJSON *related_searches = cJSON_AddArrayToObject(item, "related_searches");
    if(related_searches == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *related_searchesListEntry;
    list_ForEach(related_searchesListEntry, product_category_details->related_searches) {
    if(cJSON_AddStringToObject(related_searches, "", related_searchesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // product_category_details->time_series
    if(product_category_details->time_series) {
    cJSON *time_series = cJSON_AddObjectToObject(item, "time_series");
    if(time_series == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = time_series;
    listEntry_t *time_seriesListEntry;
    if (product_category_details->time_series) {
    list_ForEach(time_seriesListEntry, product_category_details->time_series) {
        keyValuePair_t *localKeyValue = time_seriesListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_category_details_t *product_category_details_parseFromJSON(cJSON *product_category_detailsJSON){

    product_category_details_t *product_category_details_local_var = NULL;

    // define the local variable for product_category_details->demographics
    product_categories_demographic_t *demographics_local_nonprim = NULL;

    // define the local variable for product_category_details->metrics_highlights
    product_categories_metrics_highlights_t *metrics_highlights_local_nonprim = NULL;

    // define the local map for product_category_details->predicted_time_series
    list_t *predicted_time_seriesList = NULL;

    // define the local variable for product_category_details->product_category
    pinterest_rest_api_product_category_enum__e product_category_local_nonprim = 0;

    // define the local list for product_category_details->related_searches
    list_t *related_searchesList = NULL;

    // define the local map for product_category_details->time_series
    list_t *time_seriesList = NULL;

    // product_category_details->demographics
    cJSON *demographics = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "demographics");
    if (cJSON_IsNull(demographics)) {
        demographics = NULL;
    }
    if (demographics) { 
    demographics_local_nonprim = product_categories_demographic_parseFromJSON(demographics); //nonprimitive
    }

    // product_category_details->has_prediction
    cJSON *has_prediction = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "has_prediction");
    if (cJSON_IsNull(has_prediction)) {
        has_prediction = NULL;
    }
    if (!has_prediction) {
        goto end;
    }

    
    if(!cJSON_IsBool(has_prediction))
    {
    goto end; //Bool
    }

    // product_category_details->metrics_highlights
    cJSON *metrics_highlights = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "metrics_highlights");
    if (cJSON_IsNull(metrics_highlights)) {
        metrics_highlights = NULL;
    }
    if (metrics_highlights) { 
    metrics_highlights_local_nonprim = product_categories_metrics_highlights_parseFromJSON(metrics_highlights); //nonprimitive
    }

    // product_category_details->predicted_time_series
    cJSON *predicted_time_series = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "predicted_time_series");
    if (cJSON_IsNull(predicted_time_series)) {
        predicted_time_series = NULL;
    }
    if (predicted_time_series) { 
    cJSON *predicted_time_series_local_map = NULL;
    if(!cJSON_IsObject(predicted_time_series) && !cJSON_IsNull(predicted_time_series))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(predicted_time_series))
    {
        predicted_time_seriesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(predicted_time_series_local_map, predicted_time_series)
        {
            cJSON *localMapObject = predicted_time_series_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(predicted_time_seriesList , localMapKeyPair);
        }
    }
    }

    // product_category_details->product_category
    cJSON *product_category = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "product_category");
    if (cJSON_IsNull(product_category)) {
        product_category = NULL;
    }
    if (!product_category) {
        goto end;
    }

    
    product_category_local_nonprim = product_category_enum_parseFromJSON(product_category); //custom

    // product_category_details->related_searches
    cJSON *related_searches = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "related_searches");
    if (cJSON_IsNull(related_searches)) {
        related_searches = NULL;
    }
    if (related_searches) { 
    cJSON *related_searches_local = NULL;
    if(!cJSON_IsArray(related_searches)) {
        goto end;//primitive container
    }
    related_searchesList = list_createList();

    cJSON_ArrayForEach(related_searches_local, related_searches)
    {
        if(!cJSON_IsString(related_searches_local))
        {
            goto end;
        }
        list_addElement(related_searchesList , strdup(related_searches_local->valuestring));
    }
    }

    // product_category_details->time_series
    cJSON *time_series = cJSON_GetObjectItemCaseSensitive(product_category_detailsJSON, "time_series");
    if (cJSON_IsNull(time_series)) {
        time_series = NULL;
    }
    if (time_series) { 
    cJSON *time_series_local_map = NULL;
    if(!cJSON_IsObject(time_series) && !cJSON_IsNull(time_series))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(time_series))
    {
        time_seriesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(time_series_local_map, time_series)
        {
            cJSON *localMapObject = time_series_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(time_seriesList , localMapKeyPair);
        }
    }
    }


    product_category_details_local_var = product_category_details_create_internal (
        demographics ? demographics_local_nonprim : NULL,
        has_prediction->valueint,
        metrics_highlights ? metrics_highlights_local_nonprim : NULL,
        predicted_time_series ? predicted_time_seriesList : NULL,
        product_category_local_nonprim,
        related_searches ? related_searchesList : NULL,
        time_series ? time_seriesList : NULL
        );

    return product_category_details_local_var;
end:
    if (demographics_local_nonprim) {
        product_categories_demographic_free(demographics_local_nonprim);
        demographics_local_nonprim = NULL;
    }
    if (metrics_highlights_local_nonprim) {
        product_categories_metrics_highlights_free(metrics_highlights_local_nonprim);
        metrics_highlights_local_nonprim = NULL;
    }
    if (predicted_time_seriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, predicted_time_seriesList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(predicted_time_seriesList);
        predicted_time_seriesList = NULL;
    }
    if (product_category_local_nonprim) {
        product_category_local_nonprim = 0;
    }
    if (related_searchesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_searchesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_searchesList);
        related_searchesList = NULL;
    }
    if (time_seriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, time_seriesList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(time_seriesList);
        time_seriesList = NULL;
    }
    return NULL;

}
