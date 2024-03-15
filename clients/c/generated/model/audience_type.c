#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_type.h"


char* audience_type_audience_type_ToString(pinterest_rest_api_audience_type__e audience_type) {
    char *audience_typeArray[] =  { "NULL", "CUSTOMER_LIST", "VISITOR", "ENGAGEMENT", "ACTALIKE", "PERSONA" };
    return audience_typeArray[audience_type];
}

pinterest_rest_api_audience_type__e audience_type_audience_type_FromString(char* audience_type) {
    int stringToReturn = 0;
    char *audience_typeArray[] =  { "NULL", "CUSTOMER_LIST", "VISITOR", "ENGAGEMENT", "ACTALIKE", "PERSONA" };
    size_t sizeofArray = sizeof(audience_typeArray) / sizeof(audience_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_type, audience_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_type_audience_type_convertToJSON(pinterest_rest_api_audience_type__e audience_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_type", audience_type_audience_type_ToString(audience_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_type__e audience_type_audience_type_parseFromJSON(cJSON *audience_typeJSON) {
    pinterest_rest_api_audience_type__e *audience_type = NULL;
    pinterest_rest_api_audience_type__e audience_typeVariable;
    cJSON *audience_typeVar = cJSON_GetObjectItemCaseSensitive(audience_typeJSON, "audience_type");
    if(!cJSON_IsString(audience_typeVar) || (audience_typeVar->valuestring == NULL)){
        goto end;
    }
    audience_typeVariable = audience_type_audience_type_FromString(audience_typeVar->valuestring);
    return audience_typeVariable;
end:
    return 0;
}
