#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_metrics_response.h"



static keyword_metrics_response_t *keyword_metrics_response_create_internal(
    char *keyword,
    keyword_metrics_t *metrics
    ) {
    keyword_metrics_response_t *keyword_metrics_response_local_var = malloc(sizeof(keyword_metrics_response_t));
    if (!keyword_metrics_response_local_var) {
        return NULL;
    }
    memset(keyword_metrics_response_local_var, 0, sizeof(keyword_metrics_response_t));
    keyword_metrics_response_local_var->_library_owned = 1;
    keyword_metrics_response_local_var->keyword = keyword;
    keyword_metrics_response_local_var->metrics = metrics;
    return keyword_metrics_response_local_var;
}

__attribute__((deprecated)) keyword_metrics_response_t *keyword_metrics_response_create(
    char *keyword,
    keyword_metrics_t *metrics
    ) {
    keyword_metrics_response_t *result = keyword_metrics_response_create_internal (
        keyword,
        metrics
        );
    if (!result) {
    }
    return result;
}

void keyword_metrics_response_free(keyword_metrics_response_t *keyword_metrics_response) {
    if(NULL == keyword_metrics_response){
        return ;
    }
    if(keyword_metrics_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_metrics_response_free");
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

    char *keyword_local_str = NULL;

    // define the local variable for keyword_metrics_response->metrics
    keyword_metrics_t *metrics_local_nonprim = NULL;

    // keyword_metrics_response->keyword
    cJSON *keyword = cJSON_GetObjectItemCaseSensitive(keyword_metrics_responseJSON, "keyword");
    if (cJSON_IsNull(keyword)) {
        keyword = NULL;
    }
    if (keyword) { 
    if(!cJSON_IsString(keyword) && !cJSON_IsNull(keyword))
    {
    goto end; //String
    }
    }

    // keyword_metrics_response->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(keyword_metrics_responseJSON, "metrics");
    if (cJSON_IsNull(metrics)) {
        metrics = NULL;
    }
    if (metrics) { 
    metrics_local_nonprim = keyword_metrics_parseFromJSON(metrics); //nonprimitive
    }


    if (keyword && !cJSON_IsNull(keyword)) keyword_local_str = strdup(keyword->valuestring);

    keyword_metrics_response_local_var = keyword_metrics_response_create_internal (
        keyword_local_str,
        metrics ? metrics_local_nonprim : NULL
        );

    if (!keyword_metrics_response_local_var) {
        goto end;
    }

    return keyword_metrics_response_local_var;
end:
    if (keyword_local_str) {
        free(keyword_local_str);
        keyword_local_str = NULL;
    }
    if (metrics_local_nonprim) {
        keyword_metrics_free(metrics_local_nonprim);
        metrics_local_nonprim = NULL;
    }
    return NULL;

}
