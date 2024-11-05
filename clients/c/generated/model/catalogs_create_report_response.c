#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_report_response.h"



catalogs_create_report_response_t *catalogs_create_report_response_create(
    char *token
    ) {
    catalogs_create_report_response_t *catalogs_create_report_response_local_var = malloc(sizeof(catalogs_create_report_response_t));
    if (!catalogs_create_report_response_local_var) {
        return NULL;
    }
    catalogs_create_report_response_local_var->token = token;

    return catalogs_create_report_response_local_var;
}


void catalogs_create_report_response_free(catalogs_create_report_response_t *catalogs_create_report_response) {
    if(NULL == catalogs_create_report_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_create_report_response->token) {
        free(catalogs_create_report_response->token);
        catalogs_create_report_response->token = NULL;
    }
    free(catalogs_create_report_response);
}

cJSON *catalogs_create_report_response_convertToJSON(catalogs_create_report_response_t *catalogs_create_report_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_create_report_response->token
    if(catalogs_create_report_response->token) {
    if(cJSON_AddStringToObject(item, "token", catalogs_create_report_response->token) == NULL) {
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

catalogs_create_report_response_t *catalogs_create_report_response_parseFromJSON(cJSON *catalogs_create_report_responseJSON){

    catalogs_create_report_response_t *catalogs_create_report_response_local_var = NULL;

    // catalogs_create_report_response->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(catalogs_create_report_responseJSON, "token");
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }


    catalogs_create_report_response_local_var = catalogs_create_report_response_create (
        token && !cJSON_IsNull(token) ? strdup(token->valuestring) : NULL
        );

    return catalogs_create_report_response_local_var;
end:
    return NULL;

}
