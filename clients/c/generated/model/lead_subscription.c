#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_subscription.h"



static lead_subscription_t *lead_subscription_create_internal(
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
    lead_subscription_t *lead_subscription_local_var = malloc(sizeof(lead_subscription_t));
    if (!lead_subscription_local_var) {
        return NULL;
    }
    lead_subscription_local_var->ad_account_id = ad_account_id;
    lead_subscription_local_var->api_version = api_version;
    lead_subscription_local_var->created_time = created_time;
    lead_subscription_local_var->cryptographic_algorithm = cryptographic_algorithm;
    lead_subscription_local_var->cryptographic_key = cryptographic_key;
    lead_subscription_local_var->id = id;
    lead_subscription_local_var->lead_form_id = lead_form_id;
    lead_subscription_local_var->user_account_id = user_account_id;
    lead_subscription_local_var->webhook_url = webhook_url;

    lead_subscription_local_var->_library_owned = 1;
    return lead_subscription_local_var;
}

__attribute__((deprecated)) lead_subscription_t *lead_subscription_create(
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
    return lead_subscription_create_internal (
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

void lead_subscription_free(lead_subscription_t *lead_subscription) {
    if(NULL == lead_subscription){
        return ;
    }
    if(lead_subscription->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_subscription_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_subscription->ad_account_id) {
        free(lead_subscription->ad_account_id);
        lead_subscription->ad_account_id = NULL;
    }
    if (lead_subscription->api_version) {
        free(lead_subscription->api_version);
        lead_subscription->api_version = NULL;
    }
    if (lead_subscription->cryptographic_algorithm) {
        free(lead_subscription->cryptographic_algorithm);
        lead_subscription->cryptographic_algorithm = NULL;
    }
    if (lead_subscription->cryptographic_key) {
        free(lead_subscription->cryptographic_key);
        lead_subscription->cryptographic_key = NULL;
    }
    if (lead_subscription->id) {
        free(lead_subscription->id);
        lead_subscription->id = NULL;
    }
    if (lead_subscription->lead_form_id) {
        free(lead_subscription->lead_form_id);
        lead_subscription->lead_form_id = NULL;
    }
    if (lead_subscription->user_account_id) {
        free(lead_subscription->user_account_id);
        lead_subscription->user_account_id = NULL;
    }
    if (lead_subscription->webhook_url) {
        free(lead_subscription->webhook_url);
        lead_subscription->webhook_url = NULL;
    }
    free(lead_subscription);
}

cJSON *lead_subscription_convertToJSON(lead_subscription_t *lead_subscription) {
    cJSON *item = cJSON_CreateObject();

    // lead_subscription->ad_account_id
    if(lead_subscription->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", lead_subscription->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->api_version
    if(lead_subscription->api_version) {
    if(cJSON_AddStringToObject(item, "api_version", lead_subscription->api_version) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->created_time
    if(lead_subscription->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", lead_subscription->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // lead_subscription->cryptographic_algorithm
    if(lead_subscription->cryptographic_algorithm) {
    if(cJSON_AddStringToObject(item, "cryptographic_algorithm", lead_subscription->cryptographic_algorithm) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->cryptographic_key
    if(lead_subscription->cryptographic_key) {
    if(cJSON_AddStringToObject(item, "cryptographic_key", lead_subscription->cryptographic_key) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->id
    if(lead_subscription->id) {
    if(cJSON_AddStringToObject(item, "id", lead_subscription->id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->lead_form_id
    if(lead_subscription->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", lead_subscription->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->user_account_id
    if(lead_subscription->user_account_id) {
    if(cJSON_AddStringToObject(item, "user_account_id", lead_subscription->user_account_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription->webhook_url
    if(lead_subscription->webhook_url) {
    if(cJSON_AddStringToObject(item, "webhook_url", lead_subscription->webhook_url) == NULL) {
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

lead_subscription_t *lead_subscription_parseFromJSON(cJSON *lead_subscriptionJSON){

    lead_subscription_t *lead_subscription_local_var = NULL;

    // lead_subscription->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // lead_subscription->api_version
    cJSON *api_version = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "api_version");
    if (cJSON_IsNull(api_version)) {
        api_version = NULL;
    }
    if (api_version) { 
    if(!cJSON_IsString(api_version) && !cJSON_IsNull(api_version))
    {
    goto end; //String
    }
    }

    // lead_subscription->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // lead_subscription->cryptographic_algorithm
    cJSON *cryptographic_algorithm = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "cryptographic_algorithm");
    if (cJSON_IsNull(cryptographic_algorithm)) {
        cryptographic_algorithm = NULL;
    }
    if (cryptographic_algorithm) { 
    if(!cJSON_IsString(cryptographic_algorithm) && !cJSON_IsNull(cryptographic_algorithm))
    {
    goto end; //String
    }
    }

    // lead_subscription->cryptographic_key
    cJSON *cryptographic_key = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "cryptographic_key");
    if (cJSON_IsNull(cryptographic_key)) {
        cryptographic_key = NULL;
    }
    if (cryptographic_key) { 
    if(!cJSON_IsString(cryptographic_key) && !cJSON_IsNull(cryptographic_key))
    {
    goto end; //String
    }
    }

    // lead_subscription->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // lead_subscription->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // lead_subscription->user_account_id
    cJSON *user_account_id = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "user_account_id");
    if (cJSON_IsNull(user_account_id)) {
        user_account_id = NULL;
    }
    if (user_account_id) { 
    if(!cJSON_IsString(user_account_id) && !cJSON_IsNull(user_account_id))
    {
    goto end; //String
    }
    }

    // lead_subscription->webhook_url
    cJSON *webhook_url = cJSON_GetObjectItemCaseSensitive(lead_subscriptionJSON, "webhook_url");
    if (cJSON_IsNull(webhook_url)) {
        webhook_url = NULL;
    }
    if (webhook_url) { 
    if(!cJSON_IsString(webhook_url) && !cJSON_IsNull(webhook_url))
    {
    goto end; //String
    }
    }


    lead_subscription_local_var = lead_subscription_create_internal (
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

    return lead_subscription_local_var;
end:
    return NULL;

}
