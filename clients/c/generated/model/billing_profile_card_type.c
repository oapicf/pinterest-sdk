#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profile_card_type.h"


char* billing_profile_card_type_billing_profile_card_type_ToString(pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type) {
    char *billing_profile_card_typeArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO" };
    return billing_profile_card_typeArray[billing_profile_card_type];
}

pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type_billing_profile_card_type_FromString(char* billing_profile_card_type) {
    int stringToReturn = 0;
    char *billing_profile_card_typeArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO" };
    size_t sizeofArray = sizeof(billing_profile_card_typeArray) / sizeof(billing_profile_card_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_profile_card_type, billing_profile_card_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_profile_card_type_convertToJSON(pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_profile_card_type", billing_profile_card_type_billing_profile_card_type_ToString(billing_profile_card_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type_parseFromJSON(cJSON *billing_profile_card_typeJSON) {
    if(!cJSON_IsString(billing_profile_card_typeJSON) || (billing_profile_card_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_profile_card_type_billing_profile_card_type_FromString(billing_profile_card_typeJSON->valuestring);
}
