#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token_request_refresh.h"


char* oauth_access_token_request_refresh_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_type) {
    char* grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token" };
    return grant_typeArray[grant_type];
}

pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e oauth_access_token_request_refresh_grant_type_FromString(char* grant_type){
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

oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_create(
    pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_type,
    char *refresh_token,
    char *scope,
    int refresh_on
    ) {
    oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_local_var = malloc(sizeof(oauth_access_token_request_refresh_t));
    if (!oauth_access_token_request_refresh_local_var) {
        return NULL;
    }
    oauth_access_token_request_refresh_local_var->grant_type = grant_type;
    oauth_access_token_request_refresh_local_var->refresh_token = refresh_token;
    oauth_access_token_request_refresh_local_var->scope = scope;
    oauth_access_token_request_refresh_local_var->refresh_on = refresh_on;

    return oauth_access_token_request_refresh_local_var;
}


void oauth_access_token_request_refresh_free(oauth_access_token_request_refresh_t *oauth_access_token_request_refresh) {
    if(NULL == oauth_access_token_request_refresh){
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token_request_refresh->refresh_token) {
        free(oauth_access_token_request_refresh->refresh_token);
        oauth_access_token_request_refresh->refresh_token = NULL;
    }
    if (oauth_access_token_request_refresh->scope) {
        free(oauth_access_token_request_refresh->scope);
        oauth_access_token_request_refresh->scope = NULL;
    }
    free(oauth_access_token_request_refresh);
}

cJSON *oauth_access_token_request_refresh_convertToJSON(oauth_access_token_request_refresh_t *oauth_access_token_request_refresh) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token_request_refresh->grant_type
    if (pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_NULL == oauth_access_token_request_refresh->grant_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "grant_type", grant_typeoauth_access_token_request_refresh_ToString(oauth_access_token_request_refresh->grant_type)) == NULL)
    {
    goto fail; //Enum
    }


    // oauth_access_token_request_refresh->refresh_token
    if (!oauth_access_token_request_refresh->refresh_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "refresh_token", oauth_access_token_request_refresh->refresh_token) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_request_refresh->scope
    if(oauth_access_token_request_refresh->scope) {
    if(cJSON_AddStringToObject(item, "scope", oauth_access_token_request_refresh->scope) == NULL) {
    goto fail; //String
    }
    }


    // oauth_access_token_request_refresh->refresh_on
    if(oauth_access_token_request_refresh->refresh_on) {
    if(cJSON_AddBoolToObject(item, "refresh_on", oauth_access_token_request_refresh->refresh_on) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_parseFromJSON(cJSON *oauth_access_token_request_refreshJSON){

    oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_local_var = NULL;

    // oauth_access_token_request_refresh->grant_type
    cJSON *grant_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_refreshJSON, "grant_type");
    if (!grant_type) {
        goto end;
    }

    pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_typeVariable;
    
    if(!cJSON_IsString(grant_type))
    {
    goto end; //Enum
    }
    grant_typeVariable = oauth_access_token_request_refresh_grant_type_FromString(grant_type->valuestring);

    // oauth_access_token_request_refresh->refresh_token
    cJSON *refresh_token = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_refreshJSON, "refresh_token");
    if (!refresh_token) {
        goto end;
    }

    
    if(!cJSON_IsString(refresh_token))
    {
    goto end; //String
    }

    // oauth_access_token_request_refresh->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_refreshJSON, "scope");
    if (scope) { 
    if(!cJSON_IsString(scope) && !cJSON_IsNull(scope))
    {
    goto end; //String
    }
    }

    // oauth_access_token_request_refresh->refresh_on
    cJSON *refresh_on = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_refreshJSON, "refresh_on");
    if (refresh_on) { 
    if(!cJSON_IsBool(refresh_on))
    {
    goto end; //Bool
    }
    }


    oauth_access_token_request_refresh_local_var = oauth_access_token_request_refresh_create (
        grant_typeVariable,
        strdup(refresh_token->valuestring),
        scope && !cJSON_IsNull(scope) ? strdup(scope->valuestring) : NULL,
        refresh_on ? refresh_on->valueint : 0
        );

    return oauth_access_token_request_refresh_local_var;
end:
    return NULL;

}
