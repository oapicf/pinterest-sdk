#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_export_response_data.h"


char* leads_export_response_data_export_status_ToString(pinterest_rest_api_leads_export_response_data__e export_status) {
    char* export_statusArray[] =  { "NULL", "IN_PROGRESS", "FINISHED", "FAILED" };
    return export_statusArray[export_status];
}

pinterest_rest_api_leads_export_response_data__e leads_export_response_data_export_status_FromString(char* export_status){
    int stringToReturn = 0;
    char *export_statusArray[] =  { "NULL", "IN_PROGRESS", "FINISHED", "FAILED" };
    size_t sizeofArray = sizeof(export_statusArray) / sizeof(export_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(export_status, export_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

leads_export_response_data_t *leads_export_response_data_create(
    leads_export_status_t *export_status,
    char *download_url
    ) {
    leads_export_response_data_t *leads_export_response_data_local_var = malloc(sizeof(leads_export_response_data_t));
    if (!leads_export_response_data_local_var) {
        return NULL;
    }
    leads_export_response_data_local_var->export_status = export_status;
    leads_export_response_data_local_var->download_url = download_url;

    return leads_export_response_data_local_var;
}


void leads_export_response_data_free(leads_export_response_data_t *leads_export_response_data) {
    if(NULL == leads_export_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (leads_export_response_data->export_status) {
        leads_export_status_free(leads_export_response_data->export_status);
        leads_export_response_data->export_status = NULL;
    }
    if (leads_export_response_data->download_url) {
        free(leads_export_response_data->download_url);
        leads_export_response_data->download_url = NULL;
    }
    free(leads_export_response_data);
}

cJSON *leads_export_response_data_convertToJSON(leads_export_response_data_t *leads_export_response_data) {
    cJSON *item = cJSON_CreateObject();

    // leads_export_response_data->export_status
    if(leads_export_response_data->export_status != pinterest_rest_api_leads_export_response_data__NULL) {
    cJSON *export_status_local_JSON = leads_export_status_convertToJSON(leads_export_response_data->export_status);
    if(export_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "export_status", export_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // leads_export_response_data->download_url
    if(leads_export_response_data->download_url) {
    if(cJSON_AddStringToObject(item, "download_url", leads_export_response_data->download_url) == NULL) {
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

leads_export_response_data_t *leads_export_response_data_parseFromJSON(cJSON *leads_export_response_dataJSON){

    leads_export_response_data_t *leads_export_response_data_local_var = NULL;

    // define the local variable for leads_export_response_data->export_status
    leads_export_status_t *export_status_local_nonprim = NULL;

    // leads_export_response_data->export_status
    cJSON *export_status = cJSON_GetObjectItemCaseSensitive(leads_export_response_dataJSON, "export_status");
    if (export_status) { 
    export_status_local_nonprim = leads_export_status_parseFromJSON(export_status); //custom
    }

    // leads_export_response_data->download_url
    cJSON *download_url = cJSON_GetObjectItemCaseSensitive(leads_export_response_dataJSON, "download_url");
    if (download_url) { 
    if(!cJSON_IsString(download_url) && !cJSON_IsNull(download_url))
    {
    goto end; //String
    }
    }


    leads_export_response_data_local_var = leads_export_response_data_create (
        export_status ? export_status_local_nonprim : NULL,
        download_url && !cJSON_IsNull(download_url) ? strdup(download_url->valuestring) : NULL
        );

    return leads_export_response_data_local_var;
end:
    if (export_status_local_nonprim) {
        leads_export_status_free(export_status_local_nonprim);
        export_status_local_nonprim = NULL;
    }
    return NULL;

}
