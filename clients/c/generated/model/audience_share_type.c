#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_share_type.h"


char* audience_share_type_audience_share_type_ToString(pinterest_rest_api_audience_share_type__e audience_share_type) {
    char *audience_share_typeArray[] =  { "NULL", "SHARED", "RECEIVED" };
    return audience_share_typeArray[audience_share_type];
}

pinterest_rest_api_audience_share_type__e audience_share_type_audience_share_type_FromString(char* audience_share_type) {
    int stringToReturn = 0;
    char *audience_share_typeArray[] =  { "NULL", "SHARED", "RECEIVED" };
    size_t sizeofArray = sizeof(audience_share_typeArray) / sizeof(audience_share_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_share_type, audience_share_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_share_type_convertToJSON(pinterest_rest_api_audience_share_type__e audience_share_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_share_type", audience_share_type_audience_share_type_ToString(audience_share_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_share_type__e audience_share_type_parseFromJSON(cJSON *audience_share_typeJSON) {
    if(!cJSON_IsString(audience_share_typeJSON) || (audience_share_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return audience_share_type_audience_share_type_FromString(audience_share_typeJSON->valuestring);
}
