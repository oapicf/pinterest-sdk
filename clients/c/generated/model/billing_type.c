#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_type.h"


char* billing_type_billing_type_ToString(pinterest_rest_api_billing_type__e billing_type) {
    char *billing_typeArray[] =  { "NULL", "CREDIT_CARD", "INVOICE", "INTERNAL", "RECURRING", "PREPAID" };
    return billing_typeArray[billing_type];
}

pinterest_rest_api_billing_type__e billing_type_billing_type_FromString(char* billing_type) {
    int stringToReturn = 0;
    char *billing_typeArray[] =  { "NULL", "CREDIT_CARD", "INVOICE", "INTERNAL", "RECURRING", "PREPAID" };
    size_t sizeofArray = sizeof(billing_typeArray) / sizeof(billing_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_type, billing_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_type_convertToJSON(pinterest_rest_api_billing_type__e billing_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_type", billing_type_billing_type_ToString(billing_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_type__e billing_type_parseFromJSON(cJSON *billing_typeJSON) {
    if(!cJSON_IsString(billing_typeJSON) || (billing_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_type_billing_type_FromString(billing_typeJSON->valuestring);
}
