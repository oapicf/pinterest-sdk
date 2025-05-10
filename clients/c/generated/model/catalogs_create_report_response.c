#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_report_response.h"



static catalogs_create_report_response_t *catalogs_create_report_response_create_internal(
    char *token
    ) {
    catalogs_create_report_response_t *catalogs_create_report_response_local_var = malloc(sizeof(catalogs_create_report_response_t));
    if (!catalogs_create_report_response_local_var) {
        return NULL;
    }
    catalogs_create_report_response_local_var->token = token;

    catalogs_create_report_response_local_var->_library_owned = 1;
    return catalogs_create_report_response_local_var;
}

__attribute__((deprecated)) catalogs_create_report_response_t *catalogs_create_report_response_create(
    char *token
    ) {
    return catalogs_create_report_response_create_internal (
        token
        );
}

void catalogs_create_report_response_free(catalogs_create_report_response_t *catalogs_create_report_response) {
    if(NULL == catalogs_create_report_response){
        return ;
    }
    if(catalogs_create_report_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_create_report_response_free");
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
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }


    catalogs_create_report_response_local_var = catalogs_create_report_response_create_internal (
        token && !cJSON_IsNull(token) ? strdup(token->valuestring) : NULL
        );

    return catalogs_create_report_response_local_var;
end:
    return NULL;

}
