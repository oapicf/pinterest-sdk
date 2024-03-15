#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_metrics_response.h"



keyword_metrics_response_t *keyword_metrics_response_create(
    char *keyword,
    keyword_metrics_t *metrics
    ) {
    keyword_metrics_response_t *keyword_metrics_response_local_var = malloc(sizeof(keyword_metrics_response_t));
    if (!keyword_metrics_response_local_var) {
        return NULL;
    }
    keyword_metrics_response_local_var->keyword = keyword;
    keyword_metrics_response_local_var->metrics = metrics;

    return keyword_metrics_response_local_var;
}


void keyword_metrics_response_free(keyword_metrics_response_t *keyword_metrics_response) {
    if(NULL == keyword_metrics_response){
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_metrics_response->keyword) {
        free(keyword_metrics_response->keyword);
        keyword_metrics_response->keyword = NULL;
    }
    if (keyword_metrics_response->metrics) {
        keyword_metrics_free(keyword_metrics_response->metrics);
        keyword_metrics_response->metrics = NULL;
    }
    free(keyword_metrics_response);
}

cJSON *keyword_metrics_response_convertToJSON(keyword_metrics_response_t *keyword_metrics_response) {
    cJSON *item = cJSON_CreateObject();

    // keyword_metrics_response->keyword
    if(keyword_metrics_response->keyword) {
    if(cJSON_AddStringToObject(item, "keyword", keyword_metrics_response->keyword) == NULL) {
    goto fail; //String
    }
    }


    // keyword_metrics_response->metrics
    if(keyword_metrics_response->metrics) {
    cJSON *metrics_local_JSON = keyword_metrics_convertToJSON(keyword_metrics_response->metrics);
    if(metrics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metrics", metrics_local_JSON);
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

keyword_metrics_response_t *keyword_metrics_response_parseFromJSON(cJSON *keyword_metrics_responseJSON){

    keyword_metrics_response_t *keyword_metrics_response_local_var = NULL;

    // define the local variable for keyword_metrics_response->metrics
    keyword_metrics_t *metrics_local_nonprim = NULL;

    // keyword_metrics_response->keyword
    cJSON *keyword = cJSON_GetObjectItemCaseSensitive(keyword_metrics_responseJSON, "keyword");
    if (keyword) { 
    if(!cJSON_IsString(keyword) && !cJSON_IsNull(keyword))
    {
    goto end; //String
    }
    }

    // keyword_metrics_response->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(keyword_metrics_responseJSON, "metrics");
    if (metrics) { 
    metrics_local_nonprim = keyword_metrics_parseFromJSON(metrics); //nonprimitive
    }


    keyword_metrics_response_local_var = keyword_metrics_response_create (
        keyword && !cJSON_IsNull(keyword) ? strdup(keyword->valuestring) : NULL,
        metrics ? metrics_local_nonprim : NULL
        );

    return keyword_metrics_response_local_var;
end:
    if (metrics_local_nonprim) {
        keyword_metrics_free(metrics_local_nonprim);
        metrics_local_nonprim = NULL;
    }
    return NULL;

}
