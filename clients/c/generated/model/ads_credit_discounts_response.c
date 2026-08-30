#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_discounts_response.h"



static ads_credit_discounts_response_t *ads_credit_discounts_response_create_internal(
    int *active,
    char *advertiser_id,
    char *discount_currency,
    double *discount_in_micro_currency,
    ads_credit_discount_type_t *discount_type,
    double *remaining_discount_in_micro_currency,
    char *title
    ) {
    ads_credit_discounts_response_t *ads_credit_discounts_response_local_var = malloc(sizeof(ads_credit_discounts_response_t));
    if (!ads_credit_discounts_response_local_var) {
        return NULL;
    }
    memset(ads_credit_discounts_response_local_var, 0, sizeof(ads_credit_discounts_response_t));
    ads_credit_discounts_response_local_var->_library_owned = 1;
    ads_credit_discounts_response_local_var->active = active;
    ads_credit_discounts_response_local_var->advertiser_id = advertiser_id;
    ads_credit_discounts_response_local_var->discount_currency = discount_currency;
    ads_credit_discounts_response_local_var->discount_in_micro_currency = discount_in_micro_currency;
    ads_credit_discounts_response_local_var->discount_type = discount_type;
    ads_credit_discounts_response_local_var->remaining_discount_in_micro_currency = remaining_discount_in_micro_currency;
    ads_credit_discounts_response_local_var->title = title;
    return ads_credit_discounts_response_local_var;
}

__attribute__((deprecated)) ads_credit_discounts_response_t *ads_credit_discounts_response_create(
    int *active,
    char *advertiser_id,
    char *discount_currency,
    double *discount_in_micro_currency,
    ads_credit_discount_type_t *discount_type,
    double *remaining_discount_in_micro_currency,
    char *title
    ) {
    int *active_copy = NULL;
    if (active) {
        active_copy = malloc(sizeof(int));
        if (active_copy) *active_copy = *active;
    }
    double *discount_in_micro_currency_copy = NULL;
    if (discount_in_micro_currency) {
        discount_in_micro_currency_copy = malloc(sizeof(double));
        if (discount_in_micro_currency_copy) *discount_in_micro_currency_copy = *discount_in_micro_currency;
    }
    double *remaining_discount_in_micro_currency_copy = NULL;
    if (remaining_discount_in_micro_currency) {
        remaining_discount_in_micro_currency_copy = malloc(sizeof(double));
        if (remaining_discount_in_micro_currency_copy) *remaining_discount_in_micro_currency_copy = *remaining_discount_in_micro_currency;
    }
    ads_credit_discounts_response_t *result = ads_credit_discounts_response_create_internal (
        active_copy,
        advertiser_id,
        discount_currency,
        discount_in_micro_currency_copy,
        discount_type,
        remaining_discount_in_micro_currency_copy,
        title
        );
    if (!result) {
        free(active_copy);
        free(discount_in_micro_currency_copy);
        free(remaining_discount_in_micro_currency_copy);
    }
    return result;
}

void ads_credit_discounts_response_free(ads_credit_discounts_response_t *ads_credit_discounts_response) {
    if(NULL == ads_credit_discounts_response){
        return ;
    }
    if(ads_credit_discounts_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_credit_discounts_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_discounts_response->active) {
        free(ads_credit_discounts_response->active);
        ads_credit_discounts_response->active = NULL;
    }
    if (ads_credit_discounts_response->advertiser_id) {
        free(ads_credit_discounts_response->advertiser_id);
        ads_credit_discounts_response->advertiser_id = NULL;
    }
    if (ads_credit_discounts_response->discount_currency) {
        free(ads_credit_discounts_response->discount_currency);
        ads_credit_discounts_response->discount_currency = NULL;
    }
    if (ads_credit_discounts_response->discount_in_micro_currency) {
        free(ads_credit_discounts_response->discount_in_micro_currency);
        ads_credit_discounts_response->discount_in_micro_currency = NULL;
    }
    if (ads_credit_discounts_response->discount_type) {
        ads_credit_discount_type_free(ads_credit_discounts_response->discount_type);
        ads_credit_discounts_response->discount_type = NULL;
    }
    if (ads_credit_discounts_response->remaining_discount_in_micro_currency) {
        free(ads_credit_discounts_response->remaining_discount_in_micro_currency);
        ads_credit_discounts_response->remaining_discount_in_micro_currency = NULL;
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
    if(cJSON_AddBoolToObject(item, "active", *ads_credit_discounts_response->active) == NULL) {
    goto fail; //Bool
    }
    }


    // ads_credit_discounts_response->advertiser_id
    if(ads_credit_discounts_response->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", ads_credit_discounts_response->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_discounts_response->discount_currency
    if(ads_credit_discounts_response->discount_currency) {
    if(cJSON_AddStringToObject(item, "discountCurrency", ads_credit_discounts_response->discount_currency) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_discounts_response->discount_in_micro_currency
    if(ads_credit_discounts_response->discount_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "discountInMicroCurrency", *ads_credit_discounts_response->discount_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_credit_discounts_response->discount_type
    if(ads_credit_discounts_response->discount_type) {
    cJSON *discount_type_local_JSON = ads_credit_discount_type_convertToJSON(ads_credit_discounts_response->discount_type);
    if(discount_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "discountType", discount_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ads_credit_discounts_response->remaining_discount_in_micro_currency
    if(ads_credit_discounts_response->remaining_discount_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "remainingDiscountInMicroCurrency", *ads_credit_discounts_response->remaining_discount_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_credit_discounts_response->title
    if(ads_credit_discounts_response->title) {
    if(cJSON_AddStringToObject(item, "title", ads_credit_discounts_response->title) == NULL) {
    goto fail; //String
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

    // define the local variable for ads_credit_discounts_response->active
    int *active_local_var = NULL;

    char *advertiser_id_local_str = NULL;

    char *discount_currency_local_str = NULL;

    // define the local variable for ads_credit_discounts_response->discount_in_micro_currency
    double *discount_in_micro_currency_local_var = NULL;

    // define the local variable for ads_credit_discounts_response->discount_type
    ads_credit_discount_type_t *discount_type_local_nonprim = NULL;

    // define the local variable for ads_credit_discounts_response->remaining_discount_in_micro_currency
    double *remaining_discount_in_micro_currency_local_var = NULL;

    char *title_local_str = NULL;

    // ads_credit_discounts_response->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "active");
    if (cJSON_IsNull(active)) {
        active = NULL;
    }
    if (active) { 
    if(!cJSON_IsBool(active))
    {
    goto end; //Bool
    }
    active_local_var = malloc(sizeof(int));
    if(!active_local_var)
    {
        goto end;
    }
    *active_local_var = active->valueint;
    }

    // ads_credit_discounts_response->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "advertiser_id");
    if (cJSON_IsNull(advertiser_id)) {
        advertiser_id = NULL;
    }
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // ads_credit_discounts_response->discount_currency
    cJSON *discount_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountCurrency");
    if (cJSON_IsNull(discount_currency)) {
        discount_currency = NULL;
    }
    if (discount_currency) { 
    if(!cJSON_IsString(discount_currency) && !cJSON_IsNull(discount_currency))
    {
    goto end; //String
    }
    }

    // ads_credit_discounts_response->discount_in_micro_currency
    cJSON *discount_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountInMicroCurrency");
    if (cJSON_IsNull(discount_in_micro_currency)) {
        discount_in_micro_currency = NULL;
    }
    if (discount_in_micro_currency) { 
    if(!cJSON_IsNumber(discount_in_micro_currency))
    {
    goto end; //Numeric
    }
    discount_in_micro_currency_local_var = malloc(sizeof(double));
    if(!discount_in_micro_currency_local_var)
    {
        goto end;
    }
    *discount_in_micro_currency_local_var = discount_in_micro_currency->valuedouble;
    }

    // ads_credit_discounts_response->discount_type
    cJSON *discount_type = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "discountType");
    if (cJSON_IsNull(discount_type)) {
        discount_type = NULL;
    }
    if (discount_type) { 
    discount_type_local_nonprim = ads_credit_discount_type_parseFromJSON(discount_type); //custom
    }

    // ads_credit_discounts_response->remaining_discount_in_micro_currency
    cJSON *remaining_discount_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "remainingDiscountInMicroCurrency");
    if (cJSON_IsNull(remaining_discount_in_micro_currency)) {
        remaining_discount_in_micro_currency = NULL;
    }
    if (remaining_discount_in_micro_currency) { 
    if(!cJSON_IsNumber(remaining_discount_in_micro_currency))
    {
    goto end; //Numeric
    }
    remaining_discount_in_micro_currency_local_var = malloc(sizeof(double));
    if(!remaining_discount_in_micro_currency_local_var)
    {
        goto end;
    }
    *remaining_discount_in_micro_currency_local_var = remaining_discount_in_micro_currency->valuedouble;
    }

    // ads_credit_discounts_response->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ads_credit_discounts_responseJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (advertiser_id && !cJSON_IsNull(advertiser_id)) advertiser_id_local_str = strdup(advertiser_id->valuestring);
    if (discount_currency && !cJSON_IsNull(discount_currency)) discount_currency_local_str = strdup(discount_currency->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    ads_credit_discounts_response_local_var = ads_credit_discounts_response_create_internal (
        active_local_var,
        advertiser_id_local_str,
        discount_currency_local_str,
        discount_in_micro_currency_local_var,
        discount_type ? discount_type_local_nonprim : NULL,
        remaining_discount_in_micro_currency_local_var,
        title_local_str
        );

    if (!ads_credit_discounts_response_local_var) {
        goto end;
    }

    return ads_credit_discounts_response_local_var;
end:
    if (active_local_var) {
        free(active_local_var);
        active_local_var = NULL;
    }
    if (advertiser_id_local_str) {
        free(advertiser_id_local_str);
        advertiser_id_local_str = NULL;
    }
    if (discount_currency_local_str) {
        free(discount_currency_local_str);
        discount_currency_local_str = NULL;
    }
    if (discount_in_micro_currency_local_var) {
        free(discount_in_micro_currency_local_var);
        discount_in_micro_currency_local_var = NULL;
    }
    if (discount_type_local_nonprim) {
        ads_credit_discount_type_free(discount_type_local_nonprim);
        discount_type_local_nonprim = NULL;
    }
    if (remaining_discount_in_micro_currency_local_var) {
        free(remaining_discount_in_micro_currency_local_var);
        remaining_discount_in_micro_currency_local_var = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
