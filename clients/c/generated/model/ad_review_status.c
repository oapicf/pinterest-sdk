#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_review_status.h"


char* ad_review_status_ad_review_status_ToString(pinterest_rest_api_ad_review_status__e ad_review_status) {
    char *ad_review_statusArray[] =  { "NULL", "OTHER", "PENDING", "REJECTED", "APPROVED" };
    return ad_review_statusArray[ad_review_status];
}

pinterest_rest_api_ad_review_status__e ad_review_status_ad_review_status_FromString(char* ad_review_status) {
    int stringToReturn = 0;
    char *ad_review_statusArray[] =  { "NULL", "OTHER", "PENDING", "REJECTED", "APPROVED" };
    size_t sizeofArray = sizeof(ad_review_statusArray) / sizeof(ad_review_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_review_status, ad_review_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_review_status_convertToJSON(pinterest_rest_api_ad_review_status__e ad_review_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_review_status", ad_review_status_ad_review_status_ToString(ad_review_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_review_status__e ad_review_status_parseFromJSON(cJSON *ad_review_statusJSON) {
    if(!cJSON_IsString(ad_review_statusJSON) || (ad_review_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_review_status_ad_review_status_FromString(ad_review_statusJSON->valuestring);
}
