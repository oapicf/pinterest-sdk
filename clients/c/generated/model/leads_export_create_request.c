#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_export_create_request.h"



static leads_export_create_request_t *leads_export_create_request_create_internal(
    char *ad_id,
    char *end_date,
    char *start_date
    ) {
    leads_export_create_request_t *leads_export_create_request_local_var = malloc(sizeof(leads_export_create_request_t));
    if (!leads_export_create_request_local_var) {
        return NULL;
    }
    leads_export_create_request_local_var->ad_id = ad_id;
    leads_export_create_request_local_var->end_date = end_date;
    leads_export_create_request_local_var->start_date = start_date;

    leads_export_create_request_local_var->_library_owned = 1;
    return leads_export_create_request_local_var;
}

__attribute__((deprecated)) leads_export_create_request_t *leads_export_create_request_create(
    char *ad_id,
    char *end_date,
    char *start_date
    ) {
    return leads_export_create_request_create_internal (
        ad_id,
        end_date,
        start_date
        );
}

void leads_export_create_request_free(leads_export_create_request_t *leads_export_create_request) {
    if(NULL == leads_export_create_request){
        return ;
    }
    if(leads_export_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "leads_export_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (leads_export_create_request->ad_id) {
        free(leads_export_create_request->ad_id);
        leads_export_create_request->ad_id = NULL;
    }
    if (leads_export_create_request->end_date) {
        free(leads_export_create_request->end_date);
        leads_export_create_request->end_date = NULL;
    }
    if (leads_export_create_request->start_date) {
        free(leads_export_create_request->start_date);
        leads_export_create_request->start_date = NULL;
    }
    free(leads_export_create_request);
}

cJSON *leads_export_create_request_convertToJSON(leads_export_create_request_t *leads_export_create_request) {
    cJSON *item = cJSON_CreateObject();

    // leads_export_create_request->ad_id
    if (!leads_export_create_request->ad_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_id", leads_export_create_request->ad_id) == NULL) {
    goto fail; //String
    }


    // leads_export_create_request->end_date
    if (!leads_export_create_request->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", leads_export_create_request->end_date) == NULL) {
    goto fail; //String
    }


    // leads_export_create_request->start_date
    if (!leads_export_create_request->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", leads_export_create_request->start_date) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

leads_export_create_request_t *leads_export_create_request_parseFromJSON(cJSON *leads_export_create_requestJSON){

    leads_export_create_request_t *leads_export_create_request_local_var = NULL;

    // leads_export_create_request->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(leads_export_create_requestJSON, "ad_id");
    if (cJSON_IsNull(ad_id)) {
        ad_id = NULL;
    }
    if (!ad_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_id))
    {
    goto end; //String
    }

    // leads_export_create_request->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(leads_export_create_requestJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (!end_date) {
        goto end;
    }

    
    if(!cJSON_IsString(end_date))
    {
    goto end; //String
    }

    // leads_export_create_request->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(leads_export_create_requestJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }


    leads_export_create_request_local_var = leads_export_create_request_create_internal (
        strdup(ad_id->valuestring),
        strdup(end_date->valuestring),
        strdup(start_date->valuestring)
        );

    return leads_export_create_request_local_var;
end:
    return NULL;

}
