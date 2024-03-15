#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "match_type_response.h"


char* match_type_response_match_type_response_ToString(pinterest_rest_api_match_type_response__e match_type_response) {
    char *match_type_responseArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    return match_type_responseArray[match_type_response];
}

pinterest_rest_api_match_type_response__e match_type_response_match_type_response_FromString(char* match_type_response) {
    int stringToReturn = 0;
    char *match_type_responseArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    size_t sizeofArray = sizeof(match_type_responseArray) / sizeof(match_type_responseArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(match_type_response, match_type_responseArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *match_type_response_match_type_response_convertToJSON(pinterest_rest_api_match_type_response__e match_type_response) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "match_type_response", match_type_response_match_type_response_ToString(match_type_response)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_match_type_response__e match_type_response_match_type_response_parseFromJSON(cJSON *match_type_responseJSON) {
    pinterest_rest_api_match_type_response__e *match_type_response = NULL;
    pinterest_rest_api_match_type_response__e match_type_responseVariable;
    cJSON *match_type_responseVar = cJSON_GetObjectItemCaseSensitive(match_type_responseJSON, "match_type_response");
    if(!cJSON_IsString(match_type_responseVar) || (match_type_responseVar->valuestring == NULL)){
        goto end;
    }
    match_type_responseVariable = match_type_response_match_type_response_FromString(match_type_responseVar->valuestring);
    return match_type_responseVariable;
end:
    return 0;
}
