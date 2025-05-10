#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_export_create_response.h"



static leads_export_create_response_t *leads_export_create_response_create_internal(
    char *leads_export_id
    ) {
    leads_export_create_response_t *leads_export_create_response_local_var = malloc(sizeof(leads_export_create_response_t));
    if (!leads_export_create_response_local_var) {
        return NULL;
    }
    leads_export_create_response_local_var->leads_export_id = leads_export_id;

    leads_export_create_response_local_var->_library_owned = 1;
    return leads_export_create_response_local_var;
}

__attribute__((deprecated)) leads_export_create_response_t *leads_export_create_response_create(
    char *leads_export_id
    ) {
    return leads_export_create_response_create_internal (
        leads_export_id
        );
}

void leads_export_create_response_free(leads_export_create_response_t *leads_export_create_response) {
    if(NULL == leads_export_create_response){
        return ;
    }
    if(leads_export_create_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "leads_export_create_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (leads_export_create_response->leads_export_id) {
        free(leads_export_create_response->leads_export_id);
        leads_export_create_response->leads_export_id = NULL;
    }
    free(leads_export_create_response);
}

cJSON *leads_export_create_response_convertToJSON(leads_export_create_response_t *leads_export_create_response) {
    cJSON *item = cJSON_CreateObject();

    // leads_export_create_response->leads_export_id
    if(leads_export_create_response->leads_export_id) {
    if(cJSON_AddStringToObject(item, "leads_export_id", leads_export_create_response->leads_export_id) == NULL) {
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

leads_export_create_response_t *leads_export_create_response_parseFromJSON(cJSON *leads_export_create_responseJSON){

    leads_export_create_response_t *leads_export_create_response_local_var = NULL;

    // leads_export_create_response->leads_export_id
    cJSON *leads_export_id = cJSON_GetObjectItemCaseSensitive(leads_export_create_responseJSON, "leads_export_id");
    if (cJSON_IsNull(leads_export_id)) {
        leads_export_id = NULL;
    }
    if (leads_export_id) { 
    if(!cJSON_IsString(leads_export_id) && !cJSON_IsNull(leads_export_id))
    {
    goto end; //String
    }
    }


    leads_export_create_response_local_var = leads_export_create_response_create_internal (
        leads_export_id && !cJSON_IsNull(leads_export_id) ? strdup(leads_export_id->valuestring) : NULL
        );

    return leads_export_create_response_local_var;
end:
    return NULL;

}
