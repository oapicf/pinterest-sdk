#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_ownership_type.h"


char* audience_ownership_type_audience_ownership_type_ToString(pinterest_rest_api_audience_ownership_type__e audience_ownership_type) {
    char *audience_ownership_typeArray[] =  { "NULL", "OWNED", "RECEIVED" };
    return audience_ownership_typeArray[audience_ownership_type];
}

pinterest_rest_api_audience_ownership_type__e audience_ownership_type_audience_ownership_type_FromString(char* audience_ownership_type) {
    int stringToReturn = 0;
    char *audience_ownership_typeArray[] =  { "NULL", "OWNED", "RECEIVED" };
    size_t sizeofArray = sizeof(audience_ownership_typeArray) / sizeof(audience_ownership_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_ownership_type, audience_ownership_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_ownership_type_convertToJSON(pinterest_rest_api_audience_ownership_type__e audience_ownership_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_ownership_type", audience_ownership_type_audience_ownership_type_ToString(audience_ownership_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_ownership_type__e audience_ownership_type_parseFromJSON(cJSON *audience_ownership_typeJSON) {
    if(!cJSON_IsString(audience_ownership_typeJSON) || (audience_ownership_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return audience_ownership_type_audience_ownership_type_FromString(audience_ownership_typeJSON->valuestring);
}
