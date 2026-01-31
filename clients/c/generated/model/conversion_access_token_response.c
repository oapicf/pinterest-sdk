#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_access_token_response.h"



static conversion_access_token_response_t *conversion_access_token_response_create_internal(
    char *access_token,
    char *token_type
    ) {
    conversion_access_token_response_t *conversion_access_token_response_local_var = malloc(sizeof(conversion_access_token_response_t));
    if (!conversion_access_token_response_local_var) {
        return NULL;
    }
    conversion_access_token_response_local_var->access_token = access_token;
    conversion_access_token_response_local_var->token_type = token_type;

    conversion_access_token_response_local_var->_library_owned = 1;
    return conversion_access_token_response_local_var;
}

__attribute__((deprecated)) conversion_access_token_response_t *conversion_access_token_response_create(
    char *access_token,
    char *token_type
    ) {
    return conversion_access_token_response_create_internal (
        access_token,
        token_type
        );
}

void conversion_access_token_response_free(conversion_access_token_response_t *conversion_access_token_response) {
    if(NULL == conversion_access_token_response){
        return ;
    }
    if(conversion_access_token_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_access_token_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_access_token_response->access_token) {
        free(conversion_access_token_response->access_token);
        conversion_access_token_response->access_token = NULL;
    }
    if (conversion_access_token_response->token_type) {
        free(conversion_access_token_response->token_type);
        conversion_access_token_response->token_type = NULL;
    }
    free(conversion_access_token_response);
}

cJSON *conversion_access_token_response_convertToJSON(conversion_access_token_response_t *conversion_access_token_response) {
    cJSON *item = cJSON_CreateObject();

    // conversion_access_token_response->access_token
    if (!conversion_access_token_response->access_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "access_token", conversion_access_token_response->access_token) == NULL) {
    goto fail; //String
    }


    // conversion_access_token_response->token_type
    if(conversion_access_token_response->token_type) {
    if(cJSON_AddStringToObject(item, "token_type", conversion_access_token_response->token_type) == NULL) {
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

conversion_access_token_response_t *conversion_access_token_response_parseFromJSON(cJSON *conversion_access_token_responseJSON){

    conversion_access_token_response_t *conversion_access_token_response_local_var = NULL;

    // conversion_access_token_response->access_token
    cJSON *access_token = cJSON_GetObjectItemCaseSensitive(conversion_access_token_responseJSON, "access_token");
    if (cJSON_IsNull(access_token)) {
        access_token = NULL;
    }
    if (!access_token) {
        goto end;
    }

    
    if(!cJSON_IsString(access_token))
    {
    goto end; //String
    }

    // conversion_access_token_response->token_type
    cJSON *token_type = cJSON_GetObjectItemCaseSensitive(conversion_access_token_responseJSON, "token_type");
    if (cJSON_IsNull(token_type)) {
        token_type = NULL;
    }
    if (token_type) { 
    if(!cJSON_IsString(token_type) && !cJSON_IsNull(token_type))
    {
    goto end; //String
    }
    }


    conversion_access_token_response_local_var = conversion_access_token_response_create_internal (
        strdup(access_token->valuestring),
        token_type && !cJSON_IsNull(token_type) ? strdup(token_type->valuestring) : NULL
        );

    return conversion_access_token_response_local_var;
end:
    return NULL;

}
