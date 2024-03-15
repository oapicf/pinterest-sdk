#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_discounts_response.h"


char* ads_credit_discounts_response_discount_type_ToString(pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_e discount_type) {
    char* discount_typeArray[] =  { "NULL", "COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "" };
    return discount_typeArray[discount_type];
}

pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_e ads_credit_discounts_response_discount_type_FromString(char* discount_type){
    int stringToReturn = 0;
    char *discount_typeArray[] =  { "NULL", "COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND", "" };
    size_t sizeofArray = sizeof(discount_typeArray) / sizeof(discount_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(discount_type, discount_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ads_credit_discounts_response_t *ads_credit_discounts_response_create(
    int active,
    char *advertiser_id,
    pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_e discount_type,
    double discount_in_micro_currency,
    char *discount_currency,
    char *title,
    double remaining_discount_in_micro_currency
    ) {
    ads_credit_discounts_response_t *ads_credit_discounts_response_local_var = malloc(sizeof(ads_credit_discounts_response_t));
    if (!ads_credit_discounts_response_local_var) {
        return NULL;
    }
    ads_credit_discounts_response_local_var->active = active;
    ads_credit_discounts_response_local_var->advertiser_id = advertiser_id;
    ads_credit_discounts_response_local_var->discount_type = discount_type;
    ads_credit_discounts_response_local_var->discount_in_micro_currency = discount_in_micro_currency;
    ads_credit_discounts_response_local_var->discount_currency = discount_currency;
    ads_credit_discounts_response_local_var->title = title;
    ads_credit_discounts_response_local_var->remaining_discount_in_micro_currency = remaining_discount_in_micro_currency;

    return ads_credit_discounts_response_local_var;
}


void ads_credit_discounts_response_free(ads_credit_discounts_response_t *ads_credit_discounts_response) {
    if(NULL == ads_credit_discounts_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_discounts_response->advertiser_id) {
        free(ads_credit_discounts_response->advertiser_id);
        ads_credit_discounts_response->advertiser_id = NULL;
    }
    if (ads_credit_discounts_response->discount_currency) {
        free(ads_credit_discounts_response->discount_currency);
        ads_credit_discounts_response->discount_currency = NULL;
    }
    if (ads_credit_discounts_response->title) {
        free(ads_credit_discounts_response->title);
        ads_credit_discounts_response->title = NULL;
    }
    free(ads_credit_discounts_response);
}

cJSON *ads_credit_discounts_response_convertToJSON(ads_credit_discounts_response_t *ads_credit_discounts_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_credit_discounts_response->active
    if(ads_credit_discounts_response->active) {
    if(cJSON_AddBoolToObject(item, "active", ads_credit_discounts_response->active) == NULL) {
    goto fail; //Bool
    }
    }


    // ads_credit_discounts_response->advertiser_id
    if(ads_credit_discounts_response->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", ads_credit_discounts_response->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_discounts_response->discount_type
    if(ads_credit_discounts_response->discount_type != pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "discountType", discount_typeads_credit_discounts_response_ToString(ads_credit_discounts_response->discount_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ads_credit_discounts_response->discount_in_micro_currency
    if(ads_credit_discounts_response->discount_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "discountInMicroCurrency", ads_credit_discounts_response->discount_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_credit_discounts_response->discount_currency
    if(ads_credit_discounts_response->discount_currency) {
    if(cJSON_AddStringToObject(item, "discountCurrency", ads_credit_discounts_response->discount_currency) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_discounts_response->title
    if(ads_credit_discounts_response->title) {
    if(cJSON_AddStringToObject(item, "title", ads_credit_discounts_response->title) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_discounts_response->remaining_discount_in_micro_currency
    if(ads_credit_discounts_response->remaining_discount_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "remainingDiscountInMicroCurrency", ads_credit_discounts_response->remaining_discount_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ads_credit_discounts_response_t *ads_credit_discounts_response_parseFromJSON(cJSON *ads_credit_discounts_responseJSON){

    ads_credit_discounts_response_t *ads_credit_discounts_response_local_var = NULL;

    // ads_credit_discounts_response->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "active");
    if (active) { 
    if(!cJSON_IsBool(active))
    {
    goto end; //Bool
    }
    }

    // ads_credit_discounts_response->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "advertiser_id");
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // ads_credit_discounts_response->discount_type
    cJSON *discount_type = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountType");
    pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_e discount_typeVariable;
    if (discount_type) { 
    if(!cJSON_IsString(discount_type))
    {
    goto end; //Enum
    }
    discount_typeVariable = ads_credit_discounts_response_discount_type_FromString(discount_type->valuestring);
    }

    // ads_credit_discounts_response->discount_in_micro_currency
    cJSON *discount_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountInMicroCurrency");
    if (discount_in_micro_currency) { 
    if(!cJSON_IsNumber(discount_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // ads_credit_discounts_response->discount_currency
    cJSON *discount_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountCurrency");
    if (discount_currency) { 
    if(!cJSON_IsString(discount_currency) && !cJSON_IsNull(discount_currency))
    {
    goto end; //String
    }
    }

    // ads_credit_discounts_response->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // ads_credit_discounts_response->remaining_discount_in_micro_currency
    cJSON *remaining_discount_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "remainingDiscountInMicroCurrency");
    if (remaining_discount_in_micro_currency) { 
    if(!cJSON_IsNumber(remaining_discount_in_micro_currency))
    {
    goto end; //Numeric
    }
    }


    ads_credit_discounts_response_local_var = ads_credit_discounts_response_create (
        active ? active->valueint : 0,
        advertiser_id && !cJSON_IsNull(advertiser_id) ? strdup(advertiser_id->valuestring) : NULL,
        discount_type ? discount_typeVariable : pinterest_rest_api_ads_credit_discounts_response_DISCOUNTTYPE_NULL,
        discount_in_micro_currency ? discount_in_micro_currency->valuedouble : 0,
        discount_currency && !cJSON_IsNull(discount_currency) ? strdup(discount_currency->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        remaining_discount_in_micro_currency ? remaining_discount_in_micro_currency->valuedouble : 0
        );

    return ads_credit_discounts_response_local_var;
end:
    return NULL;

}
