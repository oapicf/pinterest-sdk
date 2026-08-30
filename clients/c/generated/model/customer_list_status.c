#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_status.h"


char* customer_list_status_customer_list_status_ToString(pinterest_rest_api_customer_list_status__e customer_list_status) {
    char *customer_list_statusArray[] =  { "NULL", "PROCESSING", "READY", "TOO_SMALL", "UPLOADING" };
    return customer_list_statusArray[customer_list_status];
}

pinterest_rest_api_customer_list_status__e customer_list_status_customer_list_status_FromString(char* customer_list_status) {
    int stringToReturn = 0;
    char *customer_list_statusArray[] =  { "NULL", "PROCESSING", "READY", "TOO_SMALL", "UPLOADING" };
    size_t sizeofArray = sizeof(customer_list_statusArray) / sizeof(customer_list_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(customer_list_status, customer_list_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *customer_list_status_convertToJSON(pinterest_rest_api_customer_list_status__e customer_list_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "customer_list_status", customer_list_status_customer_list_status_ToString(customer_list_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_customer_list_status__e customer_list_status_parseFromJSON(cJSON *customer_list_statusJSON) {
    if(!cJSON_IsString(customer_list_statusJSON) || (customer_list_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return customer_list_status_customer_list_status_FromString(customer_list_statusJSON->valuestring);
}
