#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_promotion_summary_status.h"


char* pin_promotion_summary_status_pin_promotion_summary_status_ToString(pinterest_rest_api_pin_promotion_summary_status__e pin_promotion_summary_status) {
    char *pin_promotion_summary_statusArray[] =  { "NULL", "APPROVED", "PAUSED", "PENDING", "REJECTED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return pin_promotion_summary_statusArray[pin_promotion_summary_status];
}

pinterest_rest_api_pin_promotion_summary_status__e pin_promotion_summary_status_pin_promotion_summary_status_FromString(char* pin_promotion_summary_status) {
    int stringToReturn = 0;
    char *pin_promotion_summary_statusArray[] =  { "NULL", "APPROVED", "PAUSED", "PENDING", "REJECTED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(pin_promotion_summary_statusArray) / sizeof(pin_promotion_summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pin_promotion_summary_status, pin_promotion_summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pin_promotion_summary_status_convertToJSON(pinterest_rest_api_pin_promotion_summary_status__e pin_promotion_summary_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_promotion_summary_status", pin_promotion_summary_status_pin_promotion_summary_status_ToString(pin_promotion_summary_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pin_promotion_summary_status__e pin_promotion_summary_status_parseFromJSON(cJSON *pin_promotion_summary_statusJSON) {
    if(!cJSON_IsString(pin_promotion_summary_statusJSON) || (pin_promotion_summary_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return pin_promotion_summary_status_pin_promotion_summary_status_FromString(pin_promotion_summary_statusJSON->valuestring);
}
