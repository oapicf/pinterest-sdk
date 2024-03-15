#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_type.h"


char* conversion_tag_type_conversion_tag_type_ToString(pinterest_rest_api_conversion_tag_type__e conversion_tag_type) {
    char *conversion_tag_typeArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT" };
    return conversion_tag_typeArray[conversion_tag_type];
}

pinterest_rest_api_conversion_tag_type__e conversion_tag_type_conversion_tag_type_FromString(char* conversion_tag_type) {
    int stringToReturn = 0;
    char *conversion_tag_typeArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT" };
    size_t sizeofArray = sizeof(conversion_tag_typeArray) / sizeof(conversion_tag_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_tag_type, conversion_tag_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_tag_type_conversion_tag_type_convertToJSON(pinterest_rest_api_conversion_tag_type__e conversion_tag_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_tag_type", conversion_tag_type_conversion_tag_type_ToString(conversion_tag_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_tag_type__e conversion_tag_type_conversion_tag_type_parseFromJSON(cJSON *conversion_tag_typeJSON) {
    pinterest_rest_api_conversion_tag_type__e *conversion_tag_type = NULL;
    pinterest_rest_api_conversion_tag_type__e conversion_tag_typeVariable;
    cJSON *conversion_tag_typeVar = cJSON_GetObjectItemCaseSensitive(conversion_tag_typeJSON, "conversion_tag_type");
    if(!cJSON_IsString(conversion_tag_typeVar) || (conversion_tag_typeVar->valuestring == NULL)){
        goto end;
    }
    conversion_tag_typeVariable = conversion_tag_type_conversion_tag_type_FromString(conversion_tag_typeVar->valuestring);
    return conversion_tag_typeVariable;
end:
    return 0;
}
