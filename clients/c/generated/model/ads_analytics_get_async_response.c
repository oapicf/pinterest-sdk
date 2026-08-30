#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_get_async_response.h"



static ads_analytics_get_async_response_t *ads_analytics_get_async_response_create_internal(
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    double *size,
    char *url
    ) {
    ads_analytics_get_async_response_t *ads_analytics_get_async_response_local_var = malloc(sizeof(ads_analytics_get_async_response_t));
    if (!ads_analytics_get_async_response_local_var) {
        return NULL;
    }
    memset(ads_analytics_get_async_response_local_var, 0, sizeof(ads_analytics_get_async_response_t));
    ads_analytics_get_async_response_local_var->_library_owned = 1;
    ads_analytics_get_async_response_local_var->report_status = report_status;
    ads_analytics_get_async_response_local_var->size = size;
    ads_analytics_get_async_response_local_var->url = url;
    return ads_analytics_get_async_response_local_var;
}

__attribute__((deprecated)) ads_analytics_get_async_response_t *ads_analytics_get_async_response_create(
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    double *size,
    char *url
    ) {
    double *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(double));
        if (size_copy) *size_copy = *size;
    }
    ads_analytics_get_async_response_t *result = ads_analytics_get_async_response_create_internal (
        report_status,
        size_copy,
        url
        );
    if (!result) {
        free(size_copy);
    }
    return result;
}

void ads_analytics_get_async_response_free(ads_analytics_get_async_response_t *ads_analytics_get_async_response) {
    if(NULL == ads_analytics_get_async_response){
        return ;
    }
    if(ads_analytics_get_async_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_analytics_get_async_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_get_async_response->size) {
        free(ads_analytics_get_async_response->size);
        ads_analytics_get_async_response->size = NULL;
    }
    if (ads_analytics_get_async_response->url) {
        free(ads_analytics_get_async_response->url);
        ads_analytics_get_async_response->url = NULL;
    }
    free(ads_analytics_get_async_response);
}

cJSON *ads_analytics_get_async_response_convertToJSON(ads_analytics_get_async_response_t *ads_analytics_get_async_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_get_async_response->report_status
    if(ads_analytics_get_async_response->report_status != pinterest_rest_api_bulk_reporting_job_status__NULL) {
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(ads_analytics_get_async_response->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ads_analytics_get_async_response->size
    if(ads_analytics_get_async_response->size) {
    if(cJSON_AddNumberToObject(item, "size", *ads_analytics_get_async_response->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_analytics_get_async_response->url
    if(ads_analytics_get_async_response->url) {
    if(cJSON_AddStringToObject(item, "url", ads_analytics_get_async_response->url) == NULL) {
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

ads_analytics_get_async_response_t *ads_analytics_get_async_response_parseFromJSON(cJSON *ads_analytics_get_async_responseJSON){

    ads_analytics_get_async_response_t *ads_analytics_get_async_response_local_var = NULL;

    // define the local variable for ads_analytics_get_async_response->report_status
    pinterest_rest_api_bulk_reporting_job_status__e report_status_local_nonprim = 0;

    // define the local variable for ads_analytics_get_async_response->size
    double *size_local_var = NULL;

    char *url_local_str = NULL;

    // ads_analytics_get_async_response->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(ads_analytics_get_async_responseJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // ads_analytics_get_async_response->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(ads_analytics_get_async_responseJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    size_local_var = malloc(sizeof(double));
    if(!size_local_var)
    {
        goto end;
    }
    *size_local_var = size->valuedouble;
    }

    // ads_analytics_get_async_response->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(ads_analytics_get_async_responseJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    ads_analytics_get_async_response_local_var = ads_analytics_get_async_response_create_internal (
        report_status ? report_status_local_nonprim : 0,
        size_local_var,
        url_local_str
        );

    if (!ads_analytics_get_async_response_local_var) {
        goto end;
    }

    return ads_analytics_get_async_response_local_var;
end:
    if (report_status_local_nonprim) {
        report_status_local_nonprim = 0;
    }
    if (size_local_var) {
        free(size_local_var);
        size_local_var = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
