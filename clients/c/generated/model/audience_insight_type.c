#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_insight_type.h"


char* audience_insight_type_audience_insight_type_ToString(pinterest_rest_api_audience_insight_type__e audience_insight_type) {
    char *audience_insight_typeArray[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
    return audience_insight_typeArray[audience_insight_type];
}

pinterest_rest_api_audience_insight_type__e audience_insight_type_audience_insight_type_FromString(char* audience_insight_type) {
    int stringToReturn = 0;
    char *audience_insight_typeArray[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
    size_t sizeofArray = sizeof(audience_insight_typeArray) / sizeof(audience_insight_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_insight_type, audience_insight_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_insight_type_audience_insight_type_convertToJSON(pinterest_rest_api_audience_insight_type__e audience_insight_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_insight_type", audience_insight_type_audience_insight_type_ToString(audience_insight_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_insight_type__e audience_insight_type_audience_insight_type_parseFromJSON(cJSON *audience_insight_typeJSON) {
    pinterest_rest_api_audience_insight_type__e *audience_insight_type = NULL;
    pinterest_rest_api_audience_insight_type__e audience_insight_typeVariable;
    cJSON *audience_insight_typeVar = cJSON_GetObjectItemCaseSensitive(audience_insight_typeJSON, "audience_insight_type");
    if(!cJSON_IsString(audience_insight_typeVar) || (audience_insight_typeVar->valuestring == NULL)){
        goto end;
    }
    audience_insight_typeVariable = audience_insight_type_audience_insight_type_FromString(audience_insight_typeVar->valuestring);
    return audience_insight_typeVariable;
end:
    return 0;
}
