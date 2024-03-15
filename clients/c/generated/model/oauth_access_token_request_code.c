#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token_request_code.h"


char* oauth_access_token_request_code_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_type) {
    char* grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token" };
    return grant_typeArray[grant_type];
}

pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e oauth_access_token_request_code_grant_type_FromString(char* grant_type){
    int stringToReturn = 0;
    char *grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token" };
    size_t sizeofArray = sizeof(grant_typeArray) / sizeof(grant_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(grant_type, grant_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

oauth_access_token_request_code_t *oauth_access_token_request_code_create(
    pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_type,
    char *code,
    char *redirect_uri
    ) {
    oauth_access_token_request_code_t *oauth_access_token_request_code_local_var = malloc(sizeof(oauth_access_token_request_code_t));
    if (!oauth_access_token_request_code_local_var) {
        return NULL;
    }
    oauth_access_token_request_code_local_var->grant_type = grant_type;
    oauth_access_token_request_code_local_var->code = code;
    oauth_access_token_request_code_local_var->redirect_uri = redirect_uri;

    return oauth_access_token_request_code_local_var;
}


void oauth_access_token_request_code_free(oauth_access_token_request_code_t *oauth_access_token_request_code) {
    if(NULL == oauth_access_token_request_code){
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token_request_code->code) {
        free(oauth_access_token_request_code->code);
        oauth_access_token_request_code->code = NULL;
    }
    if (oauth_access_token_request_code->redirect_uri) {
        free(oauth_access_token_request_code->redirect_uri);
        oauth_access_token_request_code->redirect_uri = NULL;
    }
    free(oauth_access_token_request_code);
}

cJSON *oauth_access_token_request_code_convertToJSON(oauth_access_token_request_code_t *oauth_access_token_request_code) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token_request_code->grant_type
    if (pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_NULL == oauth_access_token_request_code->grant_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "grant_type", grant_typeoauth_access_token_request_code_ToString(oauth_access_token_request_code->grant_type)) == NULL)
    {
    goto fail; //Enum
    }


    // oauth_access_token_request_code->code
    if (!oauth_access_token_request_code->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", oauth_access_token_request_code->code) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_request_code->redirect_uri
    if (!oauth_access_token_request_code->redirect_uri) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "redirect_uri", oauth_access_token_request_code->redirect_uri) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_request_code_t *oauth_access_token_request_code_parseFromJSON(cJSON *oauth_access_token_request_codeJSON){

    oauth_access_token_request_code_t *oauth_access_token_request_code_local_var = NULL;

    // oauth_access_token_request_code->grant_type
    cJSON *grant_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_codeJSON, "grant_type");
    if (!grant_type) {
        goto end;
    }

    pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_typeVariable;
    
    if(!cJSON_IsString(grant_type))
    {
    goto end; //Enum
    }
    grant_typeVariable = oauth_access_token_request_code_grant_type_FromString(grant_type->valuestring);

    // oauth_access_token_request_code->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_codeJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // oauth_access_token_request_code->redirect_uri
    cJSON *redirect_uri = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_codeJSON, "redirect_uri");
    if (!redirect_uri) {
        goto end;
    }

    
    if(!cJSON_IsString(redirect_uri))
    {
    goto end; //String
    }


    oauth_access_token_request_code_local_var = oauth_access_token_request_code_create (
        grant_typeVariable,
        strdup(code->valuestring),
        strdup(redirect_uri->valuestring)
        );

    return oauth_access_token_request_code_local_var;
end:
    return NULL;

}
