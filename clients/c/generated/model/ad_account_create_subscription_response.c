#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_subscription_response.h"



static ad_account_create_subscription_response_t *ad_account_create_subscription_response_create_internal(
    char *ad_account_id,
    char *api_version,
    int created_time,
    char *cryptographic_algorithm,
    char *cryptographic_key,
    char *id,
    char *lead_form_id,
    char *user_account_id,
    char *webhook_url
    ) {
    ad_account_create_subscription_response_t *ad_account_create_subscription_response_local_var = malloc(sizeof(ad_account_create_subscription_response_t));
    if (!ad_account_create_subscription_response_local_var) {
        return NULL;
    }
    ad_account_create_subscription_response_local_var->ad_account_id = ad_account_id;
    ad_account_create_subscription_response_local_var->api_version = api_version;
    ad_account_create_subscription_response_local_var->created_time = created_time;
    ad_account_create_subscription_response_local_var->cryptographic_algorithm = cryptographic_algorithm;
    ad_account_create_subscription_response_local_var->cryptographic_key = cryptographic_key;
    ad_account_create_subscription_response_local_var->id = id;
    ad_account_create_subscription_response_local_var->lead_form_id = lead_form_id;
    ad_account_create_subscription_response_local_var->user_account_id = user_account_id;
    ad_account_create_subscription_response_local_var->webhook_url = webhook_url;

    ad_account_create_subscription_response_local_var->_library_owned = 1;
    return ad_account_create_subscription_response_local_var;
}

__attribute__((deprecated)) ad_account_create_subscription_response_t *ad_account_create_subscription_response_create(
    char *ad_account_id,
    char *api_version,
    int created_time,
    char *cryptographic_algorithm,
    char *cryptographic_key,
    char *id,
    char *lead_form_id,
    char *user_account_id,
    char *webhook_url
    ) {
    return ad_account_create_subscription_response_create_internal (
        ad_account_id,
        api_version,
        created_time,
        cryptographic_algorithm,
        cryptographic_key,
        id,
        lead_form_id,
        user_account_id,
        webhook_url
        );
}

void ad_account_create_subscription_response_free(ad_account_create_subscription_response_t *ad_account_create_subscription_response) {
    if(NULL == ad_account_create_subscription_response){
        return ;
    }
    if(ad_account_create_subscription_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_create_subscription_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_subscription_response->ad_account_id) {
        free(ad_account_create_subscription_response->ad_account_id);
        ad_account_create_subscription_response->ad_account_id = NULL;
    }
    if (ad_account_create_subscription_response->api_version) {
        free(ad_account_create_subscription_response->api_version);
        ad_account_create_subscription_response->api_version = NULL;
    }
    if (ad_account_create_subscription_response->cryptographic_algorithm) {
        free(ad_account_create_subscription_response->cryptographic_algorithm);
        ad_account_create_subscription_response->cryptographic_algorithm = NULL;
    }
    if (ad_account_create_subscription_response->cryptographic_key) {
        free(ad_account_create_subscription_response->cryptographic_key);
        ad_account_create_subscription_response->cryptographic_key = NULL;
    }
    if (ad_account_create_subscription_response->id) {
        free(ad_account_create_subscription_response->id);
        ad_account_create_subscription_response->id = NULL;
    }
    if (ad_account_create_subscription_response->lead_form_id) {
        free(ad_account_create_subscription_response->lead_form_id);
        ad_account_create_subscription_response->lead_form_id = NULL;
    }
    if (ad_account_create_subscription_response->user_account_id) {
        free(ad_account_create_subscription_response->user_account_id);
        ad_account_create_subscription_response->user_account_id = NULL;
    }
    if (ad_account_create_subscription_response->webhook_url) {
        free(ad_account_create_subscription_response->webhook_url);
        ad_account_create_subscription_response->webhook_url = NULL;
    }
    free(ad_account_create_subscription_response);
}

cJSON *ad_account_create_subscription_response_convertToJSON(ad_account_create_subscription_response_t *ad_account_create_subscription_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_subscription_response->ad_account_id
    if(ad_account_create_subscription_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_account_create_subscription_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->api_version
    if(ad_account_create_subscription_response->api_version) {
    if(cJSON_AddStringToObject(item, "api_version", ad_account_create_subscription_response->api_version) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->created_time
    if(ad_account_create_subscription_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", ad_account_create_subscription_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_account_create_subscription_response->cryptographic_algorithm
    if(ad_account_create_subscription_response->cryptographic_algorithm) {
    if(cJSON_AddStringToObject(item, "cryptographic_algorithm", ad_account_create_subscription_response->cryptographic_algorithm) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->cryptographic_key
    if(ad_account_create_subscription_response->cryptographic_key) {
    if(cJSON_AddStringToObject(item, "cryptographic_key", ad_account_create_subscription_response->cryptographic_key) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->id
    if(ad_account_create_subscription_response->id) {
    if(cJSON_AddStringToObject(item, "id", ad_account_create_subscription_response->id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->lead_form_id
    if(ad_account_create_subscription_response->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_account_create_subscription_response->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->user_account_id
    if(ad_account_create_subscription_response->user_account_id) {
    if(cJSON_AddStringToObject(item, "user_account_id", ad_account_create_subscription_response->user_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->webhook_url
    if(ad_account_create_subscription_response->webhook_url) {
    if(cJSON_AddStringToObject(item, "webhook_url", ad_account_create_subscription_response->webhook_url) == NULL) {
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

ad_account_create_subscription_response_t *ad_account_create_subscription_response_parseFromJSON(cJSON *ad_account_create_subscription_responseJSON){

    ad_account_create_subscription_response_t *ad_account_create_subscription_response_local_var = NULL;

    // ad_account_create_subscription_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->api_version
    cJSON *api_version = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "api_version");
    if (cJSON_IsNull(api_version)) {
        api_version = NULL;
    }
    if (api_version) { 
    if(!cJSON_IsString(api_version) && !cJSON_IsNull(api_version))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // ad_account_create_subscription_response->cryptographic_algorithm
    cJSON *cryptographic_algorithm = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "cryptographic_algorithm");
    if (cJSON_IsNull(cryptographic_algorithm)) {
        cryptographic_algorithm = NULL;
    }
    if (cryptographic_algorithm) { 
    if(!cJSON_IsString(cryptographic_algorithm) && !cJSON_IsNull(cryptographic_algorithm))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->cryptographic_key
    cJSON *cryptographic_key = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "cryptographic_key");
    if (cJSON_IsNull(cryptographic_key)) {
        cryptographic_key = NULL;
    }
    if (cryptographic_key) { 
    if(!cJSON_IsString(cryptographic_key) && !cJSON_IsNull(cryptographic_key))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->user_account_id
    cJSON *user_account_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "user_account_id");
    if (cJSON_IsNull(user_account_id)) {
        user_account_id = NULL;
    }
    if (user_account_id) { 
    if(!cJSON_IsString(user_account_id) && !cJSON_IsNull(user_account_id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->webhook_url
    cJSON *webhook_url = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "webhook_url");
    if (cJSON_IsNull(webhook_url)) {
        webhook_url = NULL;
    }
    if (webhook_url) { 
    if(!cJSON_IsString(webhook_url) && !cJSON_IsNull(webhook_url))
    {
    goto end; //String
    }
    }


    ad_account_create_subscription_response_local_var = ad_account_create_subscription_response_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        api_version && !cJSON_IsNull(api_version) ? strdup(api_version->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        cryptographic_algorithm && !cJSON_IsNull(cryptographic_algorithm) ? strdup(cryptographic_algorithm->valuestring) : NULL,
        cryptographic_key && !cJSON_IsNull(cryptographic_key) ? strdup(cryptographic_key->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        lead_form_id && !cJSON_IsNull(lead_form_id) ? strdup(lead_form_id->valuestring) : NULL,
        user_account_id && !cJSON_IsNull(user_account_id) ? strdup(user_account_id->valuestring) : NULL,
        webhook_url && !cJSON_IsNull(webhook_url) ? strdup(webhook_url->valuestring) : NULL
        );

    return ad_account_create_subscription_response_local_var;
end:
    return NULL;

}
