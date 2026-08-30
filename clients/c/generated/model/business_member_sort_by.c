#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_member_sort_by.h"


char* business_member_sort_by_business_member_sort_by_ToString(pinterest_rest_api_business_member_sort_by__e business_member_sort_by) {
    char *business_member_sort_byArray[] =  { "NULL", "FULL_NAME", "BUSINESS_ROLES", "CREATED_TIME" };
    return business_member_sort_byArray[business_member_sort_by];
}

pinterest_rest_api_business_member_sort_by__e business_member_sort_by_business_member_sort_by_FromString(char* business_member_sort_by) {
    int stringToReturn = 0;
    char *business_member_sort_byArray[] =  { "NULL", "FULL_NAME", "BUSINESS_ROLES", "CREATED_TIME" };
    size_t sizeofArray = sizeof(business_member_sort_byArray) / sizeof(business_member_sort_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_member_sort_by, business_member_sort_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_member_sort_by_convertToJSON(pinterest_rest_api_business_member_sort_by__e business_member_sort_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_member_sort_by", business_member_sort_by_business_member_sort_by_ToString(business_member_sort_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_member_sort_by__e business_member_sort_by_parseFromJSON(cJSON *business_member_sort_byJSON) {
    if(!cJSON_IsString(business_member_sort_byJSON) || (business_member_sort_byJSON->valuestring == NULL)) {
        return 0;
    }
    return business_member_sort_by_business_member_sort_by_FromString(business_member_sort_byJSON->valuestring);
}
