#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullalble_match_type.h"


char* nullalble_match_type_nullalble_match_type_ToString(pinterest_rest_api_nullalble_match_type__e nullalble_match_type) {
    char *nullalble_match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    return nullalble_match_typeArray[nullalble_match_type];
}

pinterest_rest_api_nullalble_match_type__e nullalble_match_type_nullalble_match_type_FromString(char* nullalble_match_type) {
    int stringToReturn = 0;
    char *nullalble_match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    size_t sizeofArray = sizeof(nullalble_match_typeArray) / sizeof(nullalble_match_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullalble_match_type, nullalble_match_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullalble_match_type_convertToJSON(pinterest_rest_api_nullalble_match_type__e nullalble_match_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullalble_match_type", nullalble_match_type_nullalble_match_type_ToString(nullalble_match_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullalble_match_type__e nullalble_match_type_parseFromJSON(cJSON *nullalble_match_typeJSON) {
    if(!cJSON_IsString(nullalble_match_typeJSON) || (nullalble_match_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return nullalble_match_type_nullalble_match_type_FromString(nullalble_match_typeJSON->valuestring);
}
