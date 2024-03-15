#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profiles_response.h"


char* billing_profiles_response_card_type_ToString(pinterest_rest_api_billing_profiles_response_CARDTYPE_e card_type) {
    char* card_typeArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO" };
    return card_typeArray[card_type];
}

pinterest_rest_api_billing_profiles_response_CARDTYPE_e billing_profiles_response_card_type_FromString(char* card_type){
    int stringToReturn = 0;
    char *card_typeArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "ELO" };
    size_t sizeofArray = sizeof(card_typeArray) / sizeof(card_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(card_type, card_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* billing_profiles_response_status_ToString(pinterest_rest_api_billing_profiles_response_STATUS_e status) {
    char* statusArray[] =  { "NULL", "UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY" };
    return statusArray[status];
}

pinterest_rest_api_billing_profiles_response_STATUS_e billing_profiles_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* billing_profiles_response_payment_method_brand_ToString(pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_e payment_method_brand) {
    char* payment_method_brandArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE" };
    return payment_method_brandArray[payment_method_brand];
}

pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_e billing_profiles_response_payment_method_brand_FromString(char* payment_method_brand){
    int stringToReturn = 0;
    char *payment_method_brandArray[] =  { "NULL", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "SOFORT", "DINERS_CLUB", "ELO", "CARTE_BANCAIRE" };
    size_t sizeofArray = sizeof(payment_method_brandArray) / sizeof(payment_method_brandArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(payment_method_brand, payment_method_brandArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

billing_profiles_response_t *billing_profiles_response_create(
    char *id,
    pinterest_rest_api_billing_profiles_response_CARDTYPE_e card_type,
    pinterest_rest_api_billing_profiles_response_STATUS_e status,
    char *advertiser_id,
    pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_e payment_method_brand
    ) {
    billing_profiles_response_t *billing_profiles_response_local_var = malloc(sizeof(billing_profiles_response_t));
    if (!billing_profiles_response_local_var) {
        return NULL;
    }
    billing_profiles_response_local_var->id = id;
    billing_profiles_response_local_var->card_type = card_type;
    billing_profiles_response_local_var->status = status;
    billing_profiles_response_local_var->advertiser_id = advertiser_id;
    billing_profiles_response_local_var->payment_method_brand = payment_method_brand;

    return billing_profiles_response_local_var;
}


void billing_profiles_response_free(billing_profiles_response_t *billing_profiles_response) {
    if(NULL == billing_profiles_response){
        return ;
    }
    listEntry_t *listEntry;
    if (billing_profiles_response->id) {
        free(billing_profiles_response->id);
        billing_profiles_response->id = NULL;
    }
    if (billing_profiles_response->advertiser_id) {
        free(billing_profiles_response->advertiser_id);
        billing_profiles_response->advertiser_id = NULL;
    }
    free(billing_profiles_response);
}

cJSON *billing_profiles_response_convertToJSON(billing_profiles_response_t *billing_profiles_response) {
    cJSON *item = cJSON_CreateObject();

    // billing_profiles_response->id
    if(billing_profiles_response->id) {
    if(cJSON_AddStringToObject(item, "id", billing_profiles_response->id) == NULL) {
    goto fail; //String
    }
    }


    // billing_profiles_response->card_type
    if(billing_profiles_response->card_type != pinterest_rest_api_billing_profiles_response_CARDTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "card_type", card_typebilling_profiles_response_ToString(billing_profiles_response->card_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // billing_profiles_response->status
    if(billing_profiles_response->status != pinterest_rest_api_billing_profiles_response_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", statusbilling_profiles_response_ToString(billing_profiles_response->status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // billing_profiles_response->advertiser_id
    if(billing_profiles_response->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", billing_profiles_response->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // billing_profiles_response->payment_method_brand
    if(billing_profiles_response->payment_method_brand != pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_NULL) {
    if(cJSON_AddStringToObject(item, "payment_method_brand", payment_method_brandbilling_profiles_response_ToString(billing_profiles_response->payment_method_brand)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

billing_profiles_response_t *billing_profiles_response_parseFromJSON(cJSON *billing_profiles_responseJSON){

    billing_profiles_response_t *billing_profiles_response_local_var = NULL;

    // billing_profiles_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // billing_profiles_response->card_type
    cJSON *card_type = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "card_type");
    pinterest_rest_api_billing_profiles_response_CARDTYPE_e card_typeVariable;
    if (card_type) { 
    if(!cJSON_IsString(card_type))
    {
    goto end; //Enum
    }
    card_typeVariable = billing_profiles_response_card_type_FromString(card_type->valuestring);
    }

    // billing_profiles_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "status");
    pinterest_rest_api_billing_profiles_response_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = billing_profiles_response_status_FromString(status->valuestring);
    }

    // billing_profiles_response->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "advertiser_id");
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // billing_profiles_response->payment_method_brand
    cJSON *payment_method_brand = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "payment_method_brand");
    pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_e payment_method_brandVariable;
    if (payment_method_brand) { 
    if(!cJSON_IsString(payment_method_brand))
    {
    goto end; //Enum
    }
    payment_method_brandVariable = billing_profiles_response_payment_method_brand_FromString(payment_method_brand->valuestring);
    }


    billing_profiles_response_local_var = billing_profiles_response_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        card_type ? card_typeVariable : pinterest_rest_api_billing_profiles_response_CARDTYPE_NULL,
        status ? statusVariable : pinterest_rest_api_billing_profiles_response_STATUS_NULL,
        advertiser_id && !cJSON_IsNull(advertiser_id) ? strdup(advertiser_id->valuestring) : NULL,
        payment_method_brand ? payment_method_brandVariable : pinterest_rest_api_billing_profiles_response_PAYMENTMETHODBRAND_NULL
        );

    return billing_profiles_response_local_var;
end:
    return NULL;

}
