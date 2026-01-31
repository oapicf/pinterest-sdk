#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_metrics.h"



static keyword_metrics_t *keyword_metrics_create_internal(
    char *keyword_query_volume
    ) {
    keyword_metrics_t *keyword_metrics_local_var = malloc(sizeof(keyword_metrics_t));
    if (!keyword_metrics_local_var) {
        return NULL;
    }
    keyword_metrics_local_var->keyword_query_volume = keyword_query_volume;

    keyword_metrics_local_var->_library_owned = 1;
    return keyword_metrics_local_var;
}

__attribute__((deprecated)) keyword_metrics_t *keyword_metrics_create(
    char *keyword_query_volume
    ) {
    return keyword_metrics_create_internal (
        keyword_query_volume
        );
}

void keyword_metrics_free(keyword_metrics_t *keyword_metrics) {
    if(NULL == keyword_metrics){
        return ;
    }
    if(keyword_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_metrics->keyword_query_volume) {
        free(keyword_metrics->keyword_query_volume);
        keyword_metrics->keyword_query_volume = NULL;
    }
    free(keyword_metrics);
}

cJSON *keyword_metrics_convertToJSON(keyword_metrics_t *keyword_metrics) {
    cJSON *item = cJSON_CreateObject();

    // keyword_metrics->keyword_query_volume
    if(keyword_metrics->keyword_query_volume) {
    if(cJSON_AddStringToObject(item, "keyword_query_volume", keyword_metrics->keyword_query_volume) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_metrics_t *keyword_metrics_parseFromJSON(cJSON *keyword_metricsJSON){

    keyword_metrics_t *keyword_metrics_local_var = NULL;

    // keyword_metrics->keyword_query_volume
    cJSON *keyword_query_volume = cJSON_GetObjectItemCaseSensitive(keyword_metricsJSON, "keyword_query_volume");
    if (cJSON_IsNull(keyword_query_volume)) {
        keyword_query_volume = NULL;
    }
    if (keyword_query_volume) { 
    if(!cJSON_IsString(keyword_query_volume) && !cJSON_IsNull(keyword_query_volume))
    {
    goto end; //String
    }
    }


    keyword_metrics_local_var = keyword_metrics_create_internal (
        keyword_query_volume && !cJSON_IsNull(keyword_query_volume) ? strdup(keyword_query_volume->valuestring) : NULL
        );

    return keyword_metrics_local_var;
end:
    return NULL;

}
