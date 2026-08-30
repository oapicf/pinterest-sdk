#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_export_response_data.h"



static leads_export_response_data_t *leads_export_response_data_create_internal(
    char *download_url,
    pinterest_rest_api_leads_export_status__e export_status
    ) {
    leads_export_response_data_t *leads_export_response_data_local_var = malloc(sizeof(leads_export_response_data_t));
    if (!leads_export_response_data_local_var) {
        return NULL;
    }
    memset(leads_export_response_data_local_var, 0, sizeof(leads_export_response_data_t));
    leads_export_response_data_local_var->_library_owned = 1;
    leads_export_response_data_local_var->download_url = download_url;
    leads_export_response_data_local_var->export_status = export_status;
    return leads_export_response_data_local_var;
}

__attribute__((deprecated)) leads_export_response_data_t *leads_export_response_data_create(
    char *download_url,
    pinterest_rest_api_leads_export_status__e export_status
    ) {
    leads_export_response_data_t *result = leads_export_response_data_create_internal (
        download_url,
        export_status
        );
    if (!result) {
    }
    return result;
}

void leads_export_response_data_free(leads_export_response_data_t *leads_export_response_data) {
    if(NULL == leads_export_response_data){
        return ;
    }
    if(leads_export_response_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "leads_export_response_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (leads_export_response_data->download_url) {
        free(leads_export_response_data->download_url);
        leads_export_response_data->download_url = NULL;
    }
    free(leads_export_response_data);
}

cJSON *leads_export_response_data_convertToJSON(leads_export_response_data_t *leads_export_response_data) {
    cJSON *item = cJSON_CreateObject();

    // leads_export_response_data->download_url
    if(leads_export_response_data->download_url) {
    if(cJSON_AddStringToObject(item, "download_url", leads_export_response_data->download_url) == NULL) {
    goto fail; //String
    }
    }


    // leads_export_response_data->export_status
    if(leads_export_response_data->export_status != pinterest_rest_api_leads_export_status__NULL) {
    cJSON *export_status_local_JSON = leads_export_status_convertToJSON(leads_export_response_data->export_status);
    if(export_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "export_status", export_status_local_JSON);
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

leads_export_response_data_t *leads_export_response_data_parseFromJSON(cJSON *leads_export_response_dataJSON){

    leads_export_response_data_t *leads_export_response_data_local_var = NULL;

    char *download_url_local_str = NULL;

    // define the local variable for leads_export_response_data->export_status
    pinterest_rest_api_leads_export_status__e export_status_local_nonprim = 0;

    // leads_export_response_data->download_url
    cJSON *download_url = cJSON_GetObjectItemCaseSensitive(leads_export_response_dataJSON, "download_url");
    if (cJSON_IsNull(download_url)) {
        download_url = NULL;
    }
    if (download_url) { 
    if(!cJSON_IsString(download_url) && !cJSON_IsNull(download_url))
    {
    goto end; //String
    }
    }

    // leads_export_response_data->export_status
    cJSON *export_status = cJSON_GetObjectItemCaseSensitive(leads_export_response_dataJSON, "export_status");
    if (cJSON_IsNull(export_status)) {
        export_status = NULL;
    }
    if (export_status) { 
    export_status_local_nonprim = leads_export_status_parseFromJSON(export_status); //custom
    }


    if (download_url && !cJSON_IsNull(download_url)) download_url_local_str = strdup(download_url->valuestring);

    leads_export_response_data_local_var = leads_export_response_data_create_internal (
        download_url_local_str,
        export_status ? export_status_local_nonprim : 0
        );

    if (!leads_export_response_data_local_var) {
        goto end;
    }

    return leads_export_response_data_local_var;
end:
    if (download_url_local_str) {
        free(download_url_local_str);
        download_url_local_str = NULL;
    }
    if (export_status_local_nonprim) {
        export_status_local_nonprim = 0;
    }
    return NULL;

}
