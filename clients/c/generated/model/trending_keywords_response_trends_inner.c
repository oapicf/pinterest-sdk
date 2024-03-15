#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keywords_response_trends_inner.h"



trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_create(
    char *keyword,
    int pct_growth_wow,
    int pct_growth_mom,
    int pct_growth_yoy,
    trending_keywords_response_trends_inner_time_series_t *time_series
    ) {
    trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_local_var = malloc(sizeof(trending_keywords_response_trends_inner_t));
    if (!trending_keywords_response_trends_inner_local_var) {
        return NULL;
    }
    trending_keywords_response_trends_inner_local_var->keyword = keyword;
    trending_keywords_response_trends_inner_local_var->pct_growth_wow = pct_growth_wow;
    trending_keywords_response_trends_inner_local_var->pct_growth_mom = pct_growth_mom;
    trending_keywords_response_trends_inner_local_var->pct_growth_yoy = pct_growth_yoy;
    trending_keywords_response_trends_inner_local_var->time_series = time_series;

    return trending_keywords_response_trends_inner_local_var;
}


void trending_keywords_response_trends_inner_free(trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner) {
    if(NULL == trending_keywords_response_trends_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (trending_keywords_response_trends_inner->keyword) {
        free(trending_keywords_response_trends_inner->keyword);
        trending_keywords_response_trends_inner->keyword = NULL;
    }
    if (trending_keywords_response_trends_inner->time_series) {
        trending_keywords_response_trends_inner_time_series_free(trending_keywords_response_trends_inner->time_series);
        trending_keywords_response_trends_inner->time_series = NULL;
    }
    free(trending_keywords_response_trends_inner);
}

cJSON *trending_keywords_response_trends_inner_convertToJSON(trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner) {
    cJSON *item = cJSON_CreateObject();

    // trending_keywords_response_trends_inner->keyword
    if(trending_keywords_response_trends_inner->keyword) {
    if(cJSON_AddStringToObject(item, "keyword", trending_keywords_response_trends_inner->keyword) == NULL) {
    goto fail; //String
    }
    }


    // trending_keywords_response_trends_inner->pct_growth_wow
    if(trending_keywords_response_trends_inner->pct_growth_wow) {
    if(cJSON_AddNumberToObject(item, "pct_growth_wow", trending_keywords_response_trends_inner->pct_growth_wow) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keywords_response_trends_inner->pct_growth_mom
    if(trending_keywords_response_trends_inner->pct_growth_mom) {
    if(cJSON_AddNumberToObject(item, "pct_growth_mom", trending_keywords_response_trends_inner->pct_growth_mom) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keywords_response_trends_inner->pct_growth_yoy
    if(trending_keywords_response_trends_inner->pct_growth_yoy) {
    if(cJSON_AddNumberToObject(item, "pct_growth_yoy", trending_keywords_response_trends_inner->pct_growth_yoy) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_keywords_response_trends_inner->time_series
    if(trending_keywords_response_trends_inner->time_series) {
    cJSON *time_series_local_JSON = trending_keywords_response_trends_inner_time_series_convertToJSON(trending_keywords_response_trends_inner->time_series);
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

trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_parseFromJSON(cJSON *trending_keywords_response_trends_innerJSON){

    trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_local_var = NULL;

    // define the local variable for trending_keywords_response_trends_inner->time_series
    trending_keywords_response_trends_inner_time_series_t *time_series_local_nonprim = NULL;

    // trending_keywords_response_trends_inner->keyword
    cJSON *keyword = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_innerJSON, "keyword");
    if (keyword) { 
    if(!cJSON_IsString(keyword) && !cJSON_IsNull(keyword))
    {
    goto end; //String
    }
    }

    // trending_keywords_response_trends_inner->pct_growth_wow
    cJSON *pct_growth_wow = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_innerJSON, "pct_growth_wow");
    if (pct_growth_wow) { 
    if(!cJSON_IsNumber(pct_growth_wow))
    {
    goto end; //Numeric
    }
    }

    // trending_keywords_response_trends_inner->pct_growth_mom
    cJSON *pct_growth_mom = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_innerJSON, "pct_growth_mom");
    if (pct_growth_mom) { 
    if(!cJSON_IsNumber(pct_growth_mom))
    {
    goto end; //Numeric
    }
    }

    // trending_keywords_response_trends_inner->pct_growth_yoy
    cJSON *pct_growth_yoy = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_innerJSON, "pct_growth_yoy");
    if (pct_growth_yoy) { 
    if(!cJSON_IsNumber(pct_growth_yoy))
    {
    goto end; //Numeric
    }
    }

    // trending_keywords_response_trends_inner->time_series
    cJSON *time_series = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_innerJSON, "time_series");
    if (time_series) { 
    time_series_local_nonprim = trending_keywords_response_trends_inner_time_series_parseFromJSON(time_series); //custom
    }


    trending_keywords_response_trends_inner_local_var = trending_keywords_response_trends_inner_create (
        keyword && !cJSON_IsNull(keyword) ? strdup(keyword->valuestring) : NULL,
        pct_growth_wow ? pct_growth_wow->valuedouble : 0,
        pct_growth_mom ? pct_growth_mom->valuedouble : 0,
        pct_growth_yoy ? pct_growth_yoy->valuedouble : 0,
        time_series ? time_series_local_nonprim : NULL
        );

    return trending_keywords_response_trends_inner_local_var;
end:
    if (time_series_local_nonprim) {
        trending_keywords_response_trends_inner_time_series_free(time_series_local_nonprim);
        time_series_local_nonprim = NULL;
    }
    return NULL;

}
