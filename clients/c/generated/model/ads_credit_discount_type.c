#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_discount_type.h"


char* ads_credit_discount_type_ads_credit_discount_type_ToString(pinterest_rest_api_ads_credit_discount_type__e ads_credit_discount_type) {
    char *ads_credit_discount_typeArray[] =  { "NULL", "COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "" };
    return ads_credit_discount_typeArray[ads_credit_discount_type];
}

pinterest_rest_api_ads_credit_discount_type__e ads_credit_discount_type_ads_credit_discount_type_FromString(char* ads_credit_discount_type) {
    int stringToReturn = 0;
    char *ads_credit_discount_typeArray[] =  { "NULL", "COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "" };
    size_t sizeofArray = sizeof(ads_credit_discount_typeArray) / sizeof(ads_credit_discount_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ads_credit_discount_type, ads_credit_discount_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ads_credit_discount_type_convertToJSON(pinterest_rest_api_ads_credit_discount_type__e ads_credit_discount_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ads_credit_discount_type", ads_credit_discount_type_ads_credit_discount_type_ToString(ads_credit_discount_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ads_credit_discount_type__e ads_credit_discount_type_parseFromJSON(cJSON *ads_credit_discount_typeJSON) {
    if(!cJSON_IsString(ads_credit_discount_typeJSON) || (ads_credit_discount_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return ads_credit_discount_type_ads_credit_discount_type_FromString(ads_credit_discount_typeJSON->valuestring);
}
