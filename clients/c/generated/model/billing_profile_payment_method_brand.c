#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profile_payment_method_brand.h"


char* billing_profile_payment_method_brand_billing_profile_payment_method_brand_ToString(pinterest_rest_api_billing_profile_payment_method_brand__e billing_profile_payment_method_brand) {
    char *billing_profile_payment_method_brandArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE" };
    return billing_profile_payment_method_brandArray[billing_profile_payment_method_brand];
}

pinterest_rest_api_billing_profile_payment_method_brand__e billing_profile_payment_method_brand_billing_profile_payment_method_brand_FromString(char* billing_profile_payment_method_brand) {
    int stringToReturn = 0;
    char *billing_profile_payment_method_brandArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE" };
    size_t sizeofArray = sizeof(billing_profile_payment_method_brandArray) / sizeof(billing_profile_payment_method_brandArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_profile_payment_method_brand, billing_profile_payment_method_brandArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_profile_payment_method_brand_convertToJSON(pinterest_rest_api_billing_profile_payment_method_brand__e billing_profile_payment_method_brand) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_profile_payment_method_brand", billing_profile_payment_method_brand_billing_profile_payment_method_brand_ToString(billing_profile_payment_method_brand)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_profile_payment_method_brand__e billing_profile_payment_method_brand_parseFromJSON(cJSON *billing_profile_payment_method_brandJSON) {
    if(!cJSON_IsString(billing_profile_payment_method_brandJSON) || (billing_profile_payment_method_brandJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_profile_payment_method_brand_billing_profile_payment_method_brand_FromString(billing_profile_payment_method_brandJSON->valuestring);
}
