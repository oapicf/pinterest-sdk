#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "token_grant_type.h"


char* token_grant_type_token_grant_type_ToString(pinterest_rest_api_token_grant_type__e token_grant_type) {
    char *token_grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return token_grant_typeArray[token_grant_type];
}

pinterest_rest_api_token_grant_type__e token_grant_type_token_grant_type_FromString(char* token_grant_type) {
    int stringToReturn = 0;
    char *token_grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    size_t sizeofArray = sizeof(token_grant_typeArray) / sizeof(token_grant_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(token_grant_type, token_grant_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *token_grant_type_convertToJSON(pinterest_rest_api_token_grant_type__e token_grant_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "token_grant_type", token_grant_type_token_grant_type_ToString(token_grant_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_token_grant_type__e token_grant_type_parseFromJSON(cJSON *token_grant_typeJSON) {
    if(!cJSON_IsString(token_grant_typeJSON) || (token_grant_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return token_grant_type_token_grant_type_FromString(token_grant_typeJSON->valuestring);
}
