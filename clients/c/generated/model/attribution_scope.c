#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attribution_scope.h"


char* attribution_scope_attribution_scope_ToString(pinterest_rest_api_attribution_scope__e attribution_scope) {
    char *attribution_scopeArray[] =  { "NULL", "view", "engagement", "click" };
    return attribution_scopeArray[attribution_scope];
}

pinterest_rest_api_attribution_scope__e attribution_scope_attribution_scope_FromString(char* attribution_scope) {
    int stringToReturn = 0;
    char *attribution_scopeArray[] =  { "NULL", "view", "engagement", "click" };
    size_t sizeofArray = sizeof(attribution_scopeArray) / sizeof(attribution_scopeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_scope, attribution_scopeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *attribution_scope_convertToJSON(pinterest_rest_api_attribution_scope__e attribution_scope) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "attribution_scope", attribution_scope_attribution_scope_ToString(attribution_scope)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_attribution_scope__e attribution_scope_parseFromJSON(cJSON *attribution_scopeJSON) {
    if(!cJSON_IsString(attribution_scopeJSON) || (attribution_scopeJSON->valuestring == NULL)) {
        return 0;
    }
    return attribution_scope_attribution_scope_FromString(attribution_scopeJSON->valuestring);
}
