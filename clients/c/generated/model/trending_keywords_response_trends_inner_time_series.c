#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keywords_response_trends_inner_time_series.h"



trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_create(
    char *date
    ) {
    trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_local_var = malloc(sizeof(trending_keywords_response_trends_inner_time_series_t));
    if (!trending_keywords_response_trends_inner_time_series_local_var) {
        return NULL;
    }
    trending_keywords_response_trends_inner_time_series_local_var->date = date;

    return trending_keywords_response_trends_inner_time_series_local_var;
}


void trending_keywords_response_trends_inner_time_series_free(trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series) {
    if(NULL == trending_keywords_response_trends_inner_time_series){
        return ;
    }
    listEntry_t *listEntry;
    if (trending_keywords_response_trends_inner_time_series->date) {
        free(trending_keywords_response_trends_inner_time_series->date);
        trending_keywords_response_trends_inner_time_series->date = NULL;
    }
    free(trending_keywords_response_trends_inner_time_series);
}

cJSON *trending_keywords_response_trends_inner_time_series_convertToJSON(trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series) {
    cJSON *item = cJSON_CreateObject();

    // trending_keywords_response_trends_inner_time_series->date
    if(trending_keywords_response_trends_inner_time_series->date) {
    if(cJSON_AddStringToObject(item, "date", trending_keywords_response_trends_inner_time_series->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_parseFromJSON(cJSON *trending_keywords_response_trends_inner_time_seriesJSON){

    trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_local_var = NULL;

    // trending_keywords_response_trends_inner_time_series->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(trending_keywords_response_trends_inner_time_seriesJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    trending_keywords_response_trends_inner_time_series_local_var = trending_keywords_response_trends_inner_time_series_create (
        date ? strdup(date->valuestring) : NULL
        );

    return trending_keywords_response_trends_inner_time_series_local_var;
end:
    return NULL;

}
