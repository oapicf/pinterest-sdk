#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keyword.h"



static trending_keyword_t *trending_keyword_create_internal(
    trending_keyword_demographics_t *demographics,
    int has_prediction,
    char *keyword,
    int pct_growth_mom,
    int pct_growth_wow,
    int pct_growth_yoy,
    predicted_time_series_t *predicted_time_series,
    time_series_t *time_series
    ) {
    trending_keyword_t *trending_keyword_local_var = malloc(sizeof(trending_keyword_t));
    if (!trending_keyword_local_var) {
        return NULL;
    }
    trending_keyword_local_var->demographics = demographics;
    trending_keyword_local_var->has_prediction = has_prediction;
    trending_keyword_local_var->keyword = keyword;
    trending_keyword_local_var->pct_growth_mom = pct_growth_mom;
    trending_keyword_local_var->pct_growth_wow = pct_growth_wow;
    trending_keyword_local_var->pct_growth_yoy = pct_growth_yoy;
    trending_keyword_local_var->predicted_time_series = predicted_time_series;
    trending_keyword_local_var->time_series = time_series;

    trending_keyword_local_var->_library_owned = 1;
    return trending_keyword_local_var;
}

__attribute__((deprecated)) trending_keyword_t *trending_keyword_create(
    trending_keyword_demographics_t *demographics,
    int has_prediction,
    char *keyword,
    int pct_growth_mom,
    int pct_growth_wow,
    int pct_growth_yoy,
    predicted_time_series_t *predicted_time_series,
    time_series_t *time_series
    ) {
    return trending_keyword_create_internal (
        demographics,
        has_prediction,
        keyword,
        pct_growth_mom,
        pct_growth_wow,
        pct_growth_yoy,
        predicted_time_series,
        time_series
        );
}

void trending_keyword_free(trending_keyword_t *trending_keyword) {
    if(NULL == trending_keyword){
        return ;
    }
    if(trending_keyword->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_keyword_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trending_keyword->demographics) {
        trending_keyword_demographics_free(trending_keyword->demographics);
        trending_keyword->demographics = NULL;
    }
    if (trending_keyword->keyword) {
        free(trending_keyword->keyword);
        trending_keyword->keyword = NULL;
    }
    if (trending_keyword->predicted_time_series) {
        predicted_time_series_free(trending_keyword->predicted_time_series);
        trending_keyword->predicted_time_series = NULL;
    }
    if (trending_keyword->time_series) {
        time_series_free(trending_keyword->time_series);
        trending_keyword->time_series = NULL;
    }
    free(trending_keyword);
}

cJSON *trending_keyword_convertToJSON(trending_keyword_t *trending_keyword) {
    cJSON *item = cJSON_CreateObject();

    // trending_keyword->demographics
    if(trending_keyword->demographics) {
    cJSON *demographics_local_JSON = trending_keyword_demographics_convertToJSON(trending_keyword->demographics);
    if(demographics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "demographics", demographics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // trending_keyword->has_prediction
    if(trending_keyword->has_prediction) {
    if(cJSON_AddBoolToObject(item, "has_prediction", trending_keyword->has_prediction) == NULL) {
    goto fail; //Bool
    }
    }


    // trending_keyword->keyword
    if(trending_keyword->keyword) {
    if(cJSON_AddStringToObject(item, "keyword", trending_keyword->keyword) == NULL) {
    goto fail; //String
    }
    }


    // trending_keyword->pct_growth_mom
    if(trending_keyword->pct_growth_mom) {
    if(cJSON_AddNumberToObject(item, "pct_growth_mom", trending_keyword->pct_growth_mom) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keyword->pct_growth_wow
    if(trending_keyword->pct_growth_wow) {
    if(cJSON_AddNumberToObject(item, "pct_growth_wow", trending_keyword->pct_growth_wow) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keyword->pct_growth_yoy
    if(trending_keyword->pct_growth_yoy) {
    if(cJSON_AddNumberToObject(item, "pct_growth_yoy", trending_keyword->pct_growth_yoy) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keyword->predicted_time_series
    if(trending_keyword->predicted_time_series) {
    cJSON *predicted_time_series_local_JSON = predicted_time_series_convertToJSON(trending_keyword->predicted_time_series);
    if(predicted_time_series_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "predicted_time_series", predicted_time_series_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // trending_keyword->time_series
    if(trending_keyword->time_series) {
    cJSON *time_series_local_JSON = time_series_convertToJSON(trending_keyword->time_series);
    if(time_series_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "time_series", time_series_local_JSON);
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

trending_keyword_t *trending_keyword_parseFromJSON(cJSON *trending_keywordJSON){

    trending_keyword_t *trending_keyword_local_var = NULL;

    // define the local variable for trending_keyword->demographics
    trending_keyword_demographics_t *demographics_local_nonprim = NULL;

    // define the local variable for trending_keyword->predicted_time_series
    predicted_time_series_t *predicted_time_series_local_nonprim = NULL;

    // define the local variable for trending_keyword->time_series
    time_series_t *time_series_local_nonprim = NULL;

    // trending_keyword->demographics
    cJSON *demographics = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "demographics");
    if (cJSON_IsNull(demographics)) {
        demographics = NULL;
    }
    if (demographics) { 
    demographics_local_nonprim = trending_keyword_demographics_parseFromJSON(demographics); //nonprimitive
    }

    // trending_keyword->has_prediction
    cJSON *has_prediction = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "has_prediction");
    if (cJSON_IsNull(has_prediction)) {
        has_prediction = NULL;
    }
    if (has_prediction) { 
    if(!cJSON_IsBool(has_prediction))
    {
    goto end; //Bool
    }
    }

    // trending_keyword->keyword
    cJSON *keyword = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "keyword");
    if (cJSON_IsNull(keyword)) {
        keyword = NULL;
    }
    if (keyword) { 
    if(!cJSON_IsString(keyword) && !cJSON_IsNull(keyword))
    {
    goto end; //String
    }
    }

    // trending_keyword->pct_growth_mom
    cJSON *pct_growth_mom = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "pct_growth_mom");
    if (cJSON_IsNull(pct_growth_mom)) {
        pct_growth_mom = NULL;
    }
    if (pct_growth_mom) { 
    if(!cJSON_IsNumber(pct_growth_mom))
    {
    goto end; //Numeric
    }
    }

    // trending_keyword->pct_growth_wow
    cJSON *pct_growth_wow = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "pct_growth_wow");
    if (cJSON_IsNull(pct_growth_wow)) {
        pct_growth_wow = NULL;
    }
    if (pct_growth_wow) { 
    if(!cJSON_IsNumber(pct_growth_wow))
    {
    goto end; //Numeric
    }
    }

    // trending_keyword->pct_growth_yoy
    cJSON *pct_growth_yoy = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "pct_growth_yoy");
    if (cJSON_IsNull(pct_growth_yoy)) {
        pct_growth_yoy = NULL;
    }
    if (pct_growth_yoy) { 
    if(!cJSON_IsNumber(pct_growth_yoy))
    {
    goto end; //Numeric
    }
    }

    // trending_keyword->predicted_time_series
    cJSON *predicted_time_series = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "predicted_time_series");
    if (cJSON_IsNull(predicted_time_series)) {
        predicted_time_series = NULL;
    }
    if (predicted_time_series) { 
    predicted_time_series_local_nonprim = predicted_time_series_parseFromJSON(predicted_time_series); //custom
    }

    // trending_keyword->time_series
    cJSON *time_series = cJSON_GetObjectItemCaseSensitive(trending_keywordJSON, "time_series");
    if (cJSON_IsNull(time_series)) {
        time_series = NULL;
    }
    if (time_series) { 
    time_series_local_nonprim = time_series_parseFromJSON(time_series); //custom
    }


    trending_keyword_local_var = trending_keyword_create_internal (
        demographics ? demographics_local_nonprim : NULL,
        has_prediction ? has_prediction->valueint : 0,
        keyword && !cJSON_IsNull(keyword) ? strdup(keyword->valuestring) : NULL,
        pct_growth_mom ? pct_growth_mom->valuedouble : 0,
        pct_growth_wow ? pct_growth_wow->valuedouble : 0,
        pct_growth_yoy ? pct_growth_yoy->valuedouble : 0,
        predicted_time_series ? predicted_time_series_local_nonprim : NULL,
        time_series ? time_series_local_nonprim : NULL
        );

    return trending_keyword_local_var;
end:
    if (demographics_local_nonprim) {
        trending_keyword_demographics_free(demographics_local_nonprim);
        demographics_local_nonprim = NULL;
    }
    if (predicted_time_series_local_nonprim) {
        predicted_time_series_free(predicted_time_series_local_nonprim);
        predicted_time_series_local_nonprim = NULL;
    }
    if (time_series_local_nonprim) {
        time_series_free(time_series_local_nonprim);
        time_series_local_nonprim = NULL;
    }
    return NULL;

}
