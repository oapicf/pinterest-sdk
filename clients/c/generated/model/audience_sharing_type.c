#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_sharing_type.h"


char* audience_sharing_type_audience_sharing_type_ToString(pinterest_rest_api_audience_sharing_type__e audience_sharing_type) {
    char *audience_sharing_typeArray[] =  { "NULL", "CUSTOM", "SYNDICATED" };
    return audience_sharing_typeArray[audience_sharing_type];
}

pinterest_rest_api_audience_sharing_type__e audience_sharing_type_audience_sharing_type_FromString(char* audience_sharing_type) {
    int stringToReturn = 0;
    char *audience_sharing_typeArray[] =  { "NULL", "CUSTOM", "SYNDICATED" };
    size_t sizeofArray = sizeof(audience_sharing_typeArray) / sizeof(audience_sharing_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_sharing_type, audience_sharing_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_sharing_type_audience_sharing_type_convertToJSON(pinterest_rest_api_audience_sharing_type__e audience_sharing_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_sharing_type", audience_sharing_type_audience_sharing_type_ToString(audience_sharing_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_sharing_type__e audience_sharing_type_audience_sharing_type_parseFromJSON(cJSON *audience_sharing_typeJSON) {
    pinterest_rest_api_audience_sharing_type__e *audience_sharing_type = NULL;
    pinterest_rest_api_audience_sharing_type__e audience_sharing_typeVariable;
    cJSON *audience_sharing_typeVar = cJSON_GetObjectItemCaseSensitive(audience_sharing_typeJSON, "audience_sharing_type");
    if(!cJSON_IsString(audience_sharing_typeVar) || (audience_sharing_typeVar->valuestring == NULL)){
        goto end;
    }
    audience_sharing_typeVariable = audience_sharing_type_audience_sharing_type_FromString(audience_sharing_typeVar->valuestring);
    return audience_sharing_typeVariable;
end:
    return 0;
}
