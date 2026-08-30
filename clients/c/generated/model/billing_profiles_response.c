#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profiles_response.h"



static billing_profiles_response_t *billing_profiles_response_create_internal(
    char *advertiser_id,
    billing_type_t *billing_type,
    billing_profile_card_type_t *card_type,
    char *id,
    billing_profile_payment_method_brand_t *payment_method_brand,
    billing_profile_status_t *status
    ) {
    billing_profiles_response_t *billing_profiles_response_local_var = malloc(sizeof(billing_profiles_response_t));
    if (!billing_profiles_response_local_var) {
        return NULL;
    }
    memset(billing_profiles_response_local_var, 0, sizeof(billing_profiles_response_t));
    billing_profiles_response_local_var->_library_owned = 1;
    billing_profiles_response_local_var->advertiser_id = advertiser_id;
    billing_profiles_response_local_var->billing_type = billing_type;
    billing_profiles_response_local_var->card_type = card_type;
    billing_profiles_response_local_var->id = id;
    billing_profiles_response_local_var->payment_method_brand = payment_method_brand;
    billing_profiles_response_local_var->status = status;
    return billing_profiles_response_local_var;
}

__attribute__((deprecated)) billing_profiles_response_t *billing_profiles_response_create(
    char *advertiser_id,
    billing_type_t *billing_type,
    billing_profile_card_type_t *card_type,
    char *id,
    billing_profile_payment_method_brand_t *payment_method_brand,
    billing_profile_status_t *status
    ) {
    billing_profiles_response_t *result = billing_profiles_response_create_internal (
        advertiser_id,
        billing_type,
        card_type,
        id,
        payment_method_brand,
        status
        );
    if (!result) {
    }
    return result;
}

void billing_profiles_response_free(billing_profiles_response_t *billing_profiles_response) {
    if(NULL == billing_profiles_response){
        return ;
    }
    if(billing_profiles_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "billing_profiles_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (billing_profiles_response->advertiser_id) {
        free(billing_profiles_response->advertiser_id);
        billing_profiles_response->advertiser_id = NULL;
    }
    if (billing_profiles_response->billing_type) {
        billing_type_free(billing_profiles_response->billing_type);
        billing_profiles_response->billing_type = NULL;
    }
    if (billing_profiles_response->card_type) {
        billing_profile_card_type_free(billing_profiles_response->card_type);
        billing_profiles_response->card_type = NULL;
    }
    if (billing_profiles_response->id) {
        free(billing_profiles_response->id);
        billing_profiles_response->id = NULL;
    }
    if (billing_profiles_response->payment_method_brand) {
        billing_profile_payment_method_brand_free(billing_profiles_response->payment_method_brand);
        billing_profiles_response->payment_method_brand = NULL;
    }
    if (billing_profiles_response->status) {
        billing_profile_status_free(billing_profiles_response->status);
        billing_profiles_response->status = NULL;
    }
    free(billing_profiles_response);
}

cJSON *billing_profiles_response_convertToJSON(billing_profiles_response_t *billing_profiles_response) {
    cJSON *item = cJSON_CreateObject();

    // billing_profiles_response->advertiser_id
    if(billing_profiles_response->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", billing_profiles_response->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // billing_profiles_response->billing_type
    if(billing_profiles_response->billing_type) {
    cJSON *billing_type_local_JSON = billing_type_convertToJSON(billing_profiles_response->billing_type);
    if(billing_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billing_type", billing_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_profiles_response->card_type
    if(billing_profiles_response->card_type) {
    cJSON *card_type_local_JSON = billing_profile_card_type_convertToJSON(billing_profiles_response->card_type);
    if(card_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "card_type", card_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_profiles_response->id
    if(billing_profiles_response->id) {
    if(cJSON_AddStringToObject(item, "id", billing_profiles_response->id) == NULL) {
    goto fail; //String
    }
    }


    // billing_profiles_response->payment_method_brand
    if(billing_profiles_response->payment_method_brand) {
    cJSON *payment_method_brand_local_JSON = billing_profile_payment_method_brand_convertToJSON(billing_profiles_response->payment_method_brand);
    if(payment_method_brand_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "payment_method_brand", payment_method_brand_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_profiles_response->status
    if(billing_profiles_response->status) {
    cJSON *status_local_JSON = billing_profile_status_convertToJSON(billing_profiles_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
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

    char *advertiser_id_local_str = NULL;

    // define the local variable for billing_profiles_response->billing_type
    billing_type_t *billing_type_local_nonprim = NULL;

    // define the local variable for billing_profiles_response->card_type
    billing_profile_card_type_t *card_type_local_nonprim = NULL;

    char *id_local_str = NULL;

    // define the local variable for billing_profiles_response->payment_method_brand
    billing_profile_payment_method_brand_t *payment_method_brand_local_nonprim = NULL;

    // define the local variable for billing_profiles_response->status
    billing_profile_status_t *status_local_nonprim = NULL;

    // billing_profiles_response->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "advertiser_id");
    if (cJSON_IsNull(advertiser_id)) {
        advertiser_id = NULL;
    }
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // billing_profiles_response->billing_type
    cJSON *billing_type = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "billing_type");
    if (cJSON_IsNull(billing_type)) {
        billing_type = NULL;
    }
    if (billing_type) { 
    billing_type_local_nonprim = billing_type_parseFromJSON(billing_type); //custom
    }

    // billing_profiles_response->card_type
    cJSON *card_type = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "card_type");
    if (cJSON_IsNull(card_type)) {
        card_type = NULL;
    }
    if (card_type) { 
    card_type_local_nonprim = billing_profile_card_type_parseFromJSON(card_type); //custom
    }

    // billing_profiles_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // billing_profiles_response->payment_method_brand
    cJSON *payment_method_brand = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "payment_method_brand");
    if (cJSON_IsNull(payment_method_brand)) {
        payment_method_brand = NULL;
    }
    if (payment_method_brand) { 
    payment_method_brand_local_nonprim = billing_profile_payment_method_brand_parseFromJSON(payment_method_brand); //custom
    }

    // billing_profiles_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(billing_profiles_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = billing_profile_status_parseFromJSON(status); //custom
    }


    if (advertiser_id && !cJSON_IsNull(advertiser_id)) advertiser_id_local_str = strdup(advertiser_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    billing_profiles_response_local_var = billing_profiles_response_create_internal (
        advertiser_id_local_str,
        billing_type ? billing_type_local_nonprim : NULL,
        card_type ? card_type_local_nonprim : NULL,
        id_local_str,
        payment_method_brand ? payment_method_brand_local_nonprim : NULL,
        status ? status_local_nonprim : NULL
        );

    if (!billing_profiles_response_local_var) {
        goto end;
    }

    return billing_profiles_response_local_var;
end:
    if (advertiser_id_local_str) {
        free(advertiser_id_local_str);
        advertiser_id_local_str = NULL;
    }
    if (billing_type_local_nonprim) {
        billing_type_free(billing_type_local_nonprim);
        billing_type_local_nonprim = NULL;
    }
    if (card_type_local_nonprim) {
        billing_profile_card_type_free(card_type_local_nonprim);
        card_type_local_nonprim = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (payment_method_brand_local_nonprim) {
        billing_profile_payment_method_brand_free(payment_method_brand_local_nonprim);
        payment_method_brand_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        billing_profile_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
