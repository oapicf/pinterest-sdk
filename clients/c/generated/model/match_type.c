#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "match_type.h"


char* match_type_match_type_ToString(pinterest_rest_api_match_type__e match_type) {
    char *match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE" };
    return match_typeArray[match_type];
}

pinterest_rest_api_match_type__e match_type_match_type_FromString(char* match_type) {
    int stringToReturn = 0;
    char *match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE" };
    size_t sizeofArray = sizeof(match_typeArray) / sizeof(match_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(match_type, match_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *match_type_match_type_convertToJSON(pinterest_rest_api_match_type__e match_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "match_type", match_type_match_type_ToString(match_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_match_type__e match_type_match_type_parseFromJSON(cJSON *match_typeJSON) {
    pinterest_rest_api_match_type__e *match_type = NULL;
    pinterest_rest_api_match_type__e match_typeVariable;
    cJSON *match_typeVar = cJSON_GetObjectItemCaseSensitive(match_typeJSON, "match_type");
    if(!cJSON_IsString(match_typeVar) || (match_typeVar->valuestring == NULL)){
        goto end;
    }
    match_typeVariable = match_type_match_type_FromString(match_typeVar->valuestring);
    return match_typeVariable;
end:
    return 0;
}
