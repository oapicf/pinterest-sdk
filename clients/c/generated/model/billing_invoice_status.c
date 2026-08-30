#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice_status.h"


char* billing_invoice_status_billing_invoice_status_ToString(pinterest_rest_api_billing_invoice_status__e billing_invoice_status) {
    char *billing_invoice_statusArray[] =  { "NULL", "OPEN", "CLOSED" };
    return billing_invoice_statusArray[billing_invoice_status];
}

pinterest_rest_api_billing_invoice_status__e billing_invoice_status_billing_invoice_status_FromString(char* billing_invoice_status) {
    int stringToReturn = 0;
    char *billing_invoice_statusArray[] =  { "NULL", "OPEN", "CLOSED" };
    size_t sizeofArray = sizeof(billing_invoice_statusArray) / sizeof(billing_invoice_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_invoice_status, billing_invoice_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_invoice_status_convertToJSON(pinterest_rest_api_billing_invoice_status__e billing_invoice_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_invoice_status", billing_invoice_status_billing_invoice_status_ToString(billing_invoice_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_invoice_status__e billing_invoice_status_parseFromJSON(cJSON *billing_invoice_statusJSON) {
    if(!cJSON_IsString(billing_invoice_statusJSON) || (billing_invoice_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_invoice_status_billing_invoice_status_FromString(billing_invoice_statusJSON->valuestring);
}
