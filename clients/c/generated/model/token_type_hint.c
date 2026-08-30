#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "token_type_hint.h"


char* token_type_hint_token_type_hint_ToString(pinterest_rest_api_token_type_hint__e token_type_hint) {
    char *token_type_hintArray[] =  { "NULL", "access_token", "refresh_token" };
    return token_type_hintArray[token_type_hint];
}

pinterest_rest_api_token_type_hint__e token_type_hint_token_type_hint_FromString(char* token_type_hint) {
    int stringToReturn = 0;
    char *token_type_hintArray[] =  { "NULL", "access_token", "refresh_token" };
    size_t sizeofArray = sizeof(token_type_hintArray) / sizeof(token_type_hintArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(token_type_hint, token_type_hintArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *token_type_hint_convertToJSON(pinterest_rest_api_token_type_hint__e token_type_hint) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "token_type_hint", token_type_hint_token_type_hint_ToString(token_type_hint)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_token_type_hint__e token_type_hint_parseFromJSON(cJSON *token_type_hintJSON) {
    if(!cJSON_IsString(token_type_hintJSON) || (token_type_hintJSON->valuestring == NULL)) {
        return 0;
    }
    return token_type_hint_token_type_hint_FromString(token_type_hintJSON->valuestring);
}
