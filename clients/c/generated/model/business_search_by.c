#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_search_by.h"


char* business_search_by_business_search_by_ToString(pinterest_rest_api_business_search_by__e business_search_by) {
    char *business_search_byArray[] =  { "NULL", "FULL_NAME", "USERNAME", "BUSINESS_ID", "EMAIL" };
    return business_search_byArray[business_search_by];
}

pinterest_rest_api_business_search_by__e business_search_by_business_search_by_FromString(char* business_search_by) {
    int stringToReturn = 0;
    char *business_search_byArray[] =  { "NULL", "FULL_NAME", "USERNAME", "BUSINESS_ID", "EMAIL" };
    size_t sizeofArray = sizeof(business_search_byArray) / sizeof(business_search_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_search_by, business_search_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_search_by_convertToJSON(pinterest_rest_api_business_search_by__e business_search_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_search_by", business_search_by_business_search_by_ToString(business_search_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_search_by__e business_search_by_parseFromJSON(cJSON *business_search_byJSON) {
    if(!cJSON_IsString(business_search_byJSON) || (business_search_byJSON->valuestring == NULL)) {
        return 0;
    }
    return business_search_by_business_search_by_FromString(business_search_byJSON->valuestring);
}
