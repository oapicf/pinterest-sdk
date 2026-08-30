#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "discount_status.h"


char* discount_status_discount_status_ToString(pinterest_rest_api_discount_status__e discount_status) {
    char *discount_statusArray[] =  { "NULL", "OTHER", "ACTIVE", "PAUSED", "SCHEDULED", "EXPIRED" };
    return discount_statusArray[discount_status];
}

pinterest_rest_api_discount_status__e discount_status_discount_status_FromString(char* discount_status) {
    int stringToReturn = 0;
    char *discount_statusArray[] =  { "NULL", "OTHER", "ACTIVE", "PAUSED", "SCHEDULED", "EXPIRED" };
    size_t sizeofArray = sizeof(discount_statusArray) / sizeof(discount_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(discount_status, discount_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *discount_status_convertToJSON(pinterest_rest_api_discount_status__e discount_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "discount_status", discount_status_discount_status_ToString(discount_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_discount_status__e discount_status_parseFromJSON(cJSON *discount_statusJSON) {
    if(!cJSON_IsString(discount_statusJSON) || (discount_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return discount_status_discount_status_FromString(discount_statusJSON->valuestring);
}
