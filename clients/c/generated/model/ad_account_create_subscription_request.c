#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_subscription_request.h"



ad_account_create_subscription_request_t *ad_account_create_subscription_request_create(
    char *webhook_url,
    char *lead_form_id,
    char *partner_access_token,
    char *partner_refresh_token,
    ad_account_create_subscription_request_partner_metadata_t *partner_metadata
    ) {
    ad_account_create_subscription_request_t *ad_account_create_subscription_request_local_var = malloc(sizeof(ad_account_create_subscription_request_t));
    if (!ad_account_create_subscription_request_local_var) {
        return NULL;
    }
    ad_account_create_subscription_request_local_var->webhook_url = webhook_url;
    ad_account_create_subscription_request_local_var->lead_form_id = lead_form_id;
    ad_account_create_subscription_request_local_var->partner_access_token = partner_access_token;
    ad_account_create_subscription_request_local_var->partner_refresh_token = partner_refresh_token;
    ad_account_create_subscription_request_local_var->partner_metadata = partner_metadata;

    return ad_account_create_subscription_request_local_var;
}


void ad_account_create_subscription_request_free(ad_account_create_subscription_request_t *ad_account_create_subscription_request) {
    if(NULL == ad_account_create_subscription_request){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_subscription_request->webhook_url) {
        free(ad_account_create_subscription_request->webhook_url);
        ad_account_create_subscription_request->webhook_url = NULL;
    }
    if (ad_account_create_subscription_request->lead_form_id) {
        free(ad_account_create_subscription_request->lead_form_id);
        ad_account_create_subscription_request->lead_form_id = NULL;
    }
    if (ad_account_create_subscription_request->partner_access_token) {
        free(ad_account_create_subscription_request->partner_access_token);
        ad_account_create_subscription_request->partner_access_token = NULL;
    }
    if (ad_account_create_subscription_request->partner_refresh_token) {
        free(ad_account_create_subscription_request->partner_refresh_token);
        ad_account_create_subscription_request->partner_refresh_token = NULL;
    }
    if (ad_account_create_subscription_request->partner_metadata) {
        ad_account_create_subscription_request_partner_metadata_free(ad_account_create_subscription_request->partner_metadata);
        ad_account_create_subscription_request->partner_metadata = NULL;
    }
    free(ad_account_create_subscription_request);
}

cJSON *ad_account_create_subscription_request_convertToJSON(ad_account_create_subscription_request_t *ad_account_create_subscription_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_subscription_request->webhook_url
    if (!ad_account_create_subscription_request->webhook_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "webhook_url", ad_account_create_subscription_request->webhook_url) == NULL) {
    goto fail; //String
    }


    // ad_account_create_subscription_request->lead_form_id
    if(ad_account_create_subscription_request->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_account_create_subscription_request->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_request->partner_access_token
    if(ad_account_create_subscription_request->partner_access_token) {
    if(cJSON_AddStringToObject(item, "partner_access_token", ad_account_create_subscription_request->partner_access_token) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_request->partner_refresh_token
    if(ad_account_create_subscription_request->partner_refresh_token) {
    if(cJSON_AddStringToObject(item, "partner_refresh_token", ad_account_create_subscription_request->partner_refresh_token) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_request->partner_metadata
    if(ad_account_create_subscription_request->partner_metadata) {
    cJSON *partner_metadata_local_JSON = ad_account_create_subscription_request_partner_metadata_convertToJSON(ad_account_create_subscription_request->partner_metadata);
    if(partner_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "partner_metadata", partner_metadata_local_JSON);
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

ad_account_create_subscription_request_t *ad_account_create_subscription_request_parseFromJSON(cJSON *ad_account_create_subscription_requestJSON){

    ad_account_create_subscription_request_t *ad_account_create_subscription_request_local_var = NULL;

    // define the local variable for ad_account_create_subscription_request->partner_metadata
    ad_account_create_subscription_request_partner_metadata_t *partner_metadata_local_nonprim = NULL;

    // ad_account_create_subscription_request->webhook_url
    cJSON *webhook_url = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_requestJSON, "webhook_url");
    if (!webhook_url) {
        goto end;
    }

    
    if(!cJSON_IsString(webhook_url))
    {
    goto end; //String
    }

    // ad_account_create_subscription_request->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_requestJSON, "lead_form_id");
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_request->partner_access_token
    cJSON *partner_access_token = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_requestJSON, "partner_access_token");
    if (partner_access_token) { 
    if(!cJSON_IsString(partner_access_token) && !cJSON_IsNull(partner_access_token))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_request->partner_refresh_token
    cJSON *partner_refresh_token = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_requestJSON, "partner_refresh_token");
    if (partner_refresh_token) { 
    if(!cJSON_IsString(partner_refresh_token) && !cJSON_IsNull(partner_refresh_token))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_request->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_requestJSON, "partner_metadata");
    if (partner_metadata) { 
    partner_metadata_local_nonprim = ad_account_create_subscription_request_partner_metadata_parseFromJSON(partner_metadata); //nonprimitive
    }


    ad_account_create_subscription_request_local_var = ad_account_create_subscription_request_create (
        strdup(webhook_url->valuestring),
        lead_form_id && !cJSON_IsNull(lead_form_id) ? strdup(lead_form_id->valuestring) : NULL,
        partner_access_token && !cJSON_IsNull(partner_access_token) ? strdup(partner_access_token->valuestring) : NULL,
        partner_refresh_token && !cJSON_IsNull(partner_refresh_token) ? strdup(partner_refresh_token->valuestring) : NULL,
        partner_metadata ? partner_metadata_local_nonprim : NULL
        );

    return ad_account_create_subscription_request_local_var;
end:
    if (partner_metadata_local_nonprim) {
        ad_account_create_subscription_request_partner_metadata_free(partner_metadata_local_nonprim);
        partner_metadata_local_nonprim = NULL;
    }
    return NULL;

}
