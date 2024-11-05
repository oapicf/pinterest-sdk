#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_account_type.h"


char* audience_account_type_audience_account_type_ToString(pinterest_rest_api_audience_account_type__e audience_account_type) {
    char *audience_account_typeArray[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    return audience_account_typeArray[audience_account_type];
}

pinterest_rest_api_audience_account_type__e audience_account_type_audience_account_type_FromString(char* audience_account_type) {
    int stringToReturn = 0;
    char *audience_account_typeArray[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    size_t sizeofArray = sizeof(audience_account_typeArray) / sizeof(audience_account_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_account_type, audience_account_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_account_type_audience_account_type_convertToJSON(pinterest_rest_api_audience_account_type__e audience_account_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_account_type", audience_account_type_audience_account_type_ToString(audience_account_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_account_type__e audience_account_type_audience_account_type_parseFromJSON(cJSON *audience_account_typeJSON) {
    pinterest_rest_api_audience_account_type__e *audience_account_type = NULL;
    pinterest_rest_api_audience_account_type__e audience_account_typeVariable;
    cJSON *audience_account_typeVar = cJSON_GetObjectItemCaseSensitive(audience_account_typeJSON, "audience_account_type");
    if(!cJSON_IsString(audience_account_typeVar) || (audience_account_typeVar->valuestring == NULL)){
        goto end;
    }
    audience_account_typeVariable = audience_account_type_audience_account_type_FromString(audience_account_typeVar->valuestring);
    return audience_account_typeVariable;
end:
    return 0;
}
