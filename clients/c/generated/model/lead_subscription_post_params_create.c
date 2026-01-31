#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_subscription_post_params_create.h"



static lead_subscription_post_params_create_t *lead_subscription_post_params_create_create_internal(
    char *lead_form_id,
    char *webhook_url,
    char *partner_access_token,
    lead_subscription_post_params_create_all_of_partner_metadata_t *partner_metadata,
    char *partner_refresh_token
    ) {
    lead_subscription_post_params_create_t *lead_subscription_post_params_create_local_var = malloc(sizeof(lead_subscription_post_params_create_t));
    if (!lead_subscription_post_params_create_local_var) {
        return NULL;
    }
    lead_subscription_post_params_create_local_var->lead_form_id = lead_form_id;
    lead_subscription_post_params_create_local_var->webhook_url = webhook_url;
    lead_subscription_post_params_create_local_var->partner_access_token = partner_access_token;
    lead_subscription_post_params_create_local_var->partner_metadata = partner_metadata;
    lead_subscription_post_params_create_local_var->partner_refresh_token = partner_refresh_token;

    lead_subscription_post_params_create_local_var->_library_owned = 1;
    return lead_subscription_post_params_create_local_var;
}

__attribute__((deprecated)) lead_subscription_post_params_create_t *lead_subscription_post_params_create_create(
    char *lead_form_id,
    char *webhook_url,
    char *partner_access_token,
    lead_subscription_post_params_create_all_of_partner_metadata_t *partner_metadata,
    char *partner_refresh_token
    ) {
    return lead_subscription_post_params_create_create_internal (
        lead_form_id,
        webhook_url,
        partner_access_token,
        partner_metadata,
        partner_refresh_token
        );
}

void lead_subscription_post_params_create_free(lead_subscription_post_params_create_t *lead_subscription_post_params_create) {
    if(NULL == lead_subscription_post_params_create){
        return ;
    }
    if(lead_subscription_post_params_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_subscription_post_params_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_subscription_post_params_create->lead_form_id) {
        free(lead_subscription_post_params_create->lead_form_id);
        lead_subscription_post_params_create->lead_form_id = NULL;
    }
    if (lead_subscription_post_params_create->webhook_url) {
        free(lead_subscription_post_params_create->webhook_url);
        lead_subscription_post_params_create->webhook_url = NULL;
    }
    if (lead_subscription_post_params_create->partner_access_token) {
        free(lead_subscription_post_params_create->partner_access_token);
        lead_subscription_post_params_create->partner_access_token = NULL;
    }
    if (lead_subscription_post_params_create->partner_metadata) {
        lead_subscription_post_params_create_all_of_partner_metadata_free(lead_subscription_post_params_create->partner_metadata);
        lead_subscription_post_params_create->partner_metadata = NULL;
    }
    if (lead_subscription_post_params_create->partner_refresh_token) {
        free(lead_subscription_post_params_create->partner_refresh_token);
        lead_subscription_post_params_create->partner_refresh_token = NULL;
    }
    free(lead_subscription_post_params_create);
}

cJSON *lead_subscription_post_params_create_convertToJSON(lead_subscription_post_params_create_t *lead_subscription_post_params_create) {
    cJSON *item = cJSON_CreateObject();

    // lead_subscription_post_params_create->lead_form_id
    if(lead_subscription_post_params_create->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", lead_subscription_post_params_create->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription_post_params_create->webhook_url
    if (!lead_subscription_post_params_create->webhook_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "webhook_url", lead_subscription_post_params_create->webhook_url) == NULL) {
    goto fail; //String
    }


    // lead_subscription_post_params_create->partner_access_token
    if(lead_subscription_post_params_create->partner_access_token) {
    if(cJSON_AddStringToObject(item, "partner_access_token", lead_subscription_post_params_create->partner_access_token) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription_post_params_create->partner_metadata
    if(lead_subscription_post_params_create->partner_metadata) {
    cJSON *partner_metadata_local_JSON = lead_subscription_post_params_create_all_of_partner_metadata_convertToJSON(lead_subscription_post_params_create->partner_metadata);
    if(partner_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "partner_metadata", partner_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // lead_subscription_post_params_create->partner_refresh_token
    if(lead_subscription_post_params_create->partner_refresh_token) {
    if(cJSON_AddStringToObject(item, "partner_refresh_token", lead_subscription_post_params_create->partner_refresh_token) == NULL) {
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

lead_subscription_post_params_create_t *lead_subscription_post_params_create_parseFromJSON(cJSON *lead_subscription_post_params_createJSON){

    lead_subscription_post_params_create_t *lead_subscription_post_params_create_local_var = NULL;

    // define the local variable for lead_subscription_post_params_create->partner_metadata
    lead_subscription_post_params_create_all_of_partner_metadata_t *partner_metadata_local_nonprim = NULL;

    // lead_subscription_post_params_create->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_createJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // lead_subscription_post_params_create->webhook_url
    cJSON *webhook_url = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_createJSON, "webhook_url");
    if (cJSON_IsNull(webhook_url)) {
        webhook_url = NULL;
    }
    if (!webhook_url) {
        goto end;
    }

    
    if(!cJSON_IsString(webhook_url))
    {
    goto end; //String
    }

    // lead_subscription_post_params_create->partner_access_token
    cJSON *partner_access_token = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_createJSON, "partner_access_token");
    if (cJSON_IsNull(partner_access_token)) {
        partner_access_token = NULL;
    }
    if (partner_access_token) { 
    if(!cJSON_IsString(partner_access_token) && !cJSON_IsNull(partner_access_token))
    {
    goto end; //String
    }
    }

    // lead_subscription_post_params_create->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_createJSON, "partner_metadata");
    if (cJSON_IsNull(partner_metadata)) {
        partner_metadata = NULL;
    }
    if (partner_metadata) { 
    partner_metadata_local_nonprim = lead_subscription_post_params_create_all_of_partner_metadata_parseFromJSON(partner_metadata); //nonprimitive
    }

    // lead_subscription_post_params_create->partner_refresh_token
    cJSON *partner_refresh_token = cJSON_GetObjectItemCaseSensitive(lead_subscription_post_params_createJSON, "partner_refresh_token");
    if (cJSON_IsNull(partner_refresh_token)) {
        partner_refresh_token = NULL;
    }
    if (partner_refresh_token) { 
    if(!cJSON_IsString(partner_refresh_token) && !cJSON_IsNull(partner_refresh_token))
    {
    goto end; //String
    }
    }


    lead_subscription_post_params_create_local_var = lead_subscription_post_params_create_create_internal (
        lead_form_id && !cJSON_IsNull(lead_form_id) ? strdup(lead_form_id->valuestring) : NULL,
        strdup(webhook_url->valuestring),
        partner_access_token && !cJSON_IsNull(partner_access_token) ? strdup(partner_access_token->valuestring) : NULL,
        partner_metadata ? partner_metadata_local_nonprim : NULL,
        partner_refresh_token && !cJSON_IsNull(partner_refresh_token) ? strdup(partner_refresh_token->valuestring) : NULL
        );

    return lead_subscription_post_params_create_local_var;
end:
    if (partner_metadata_local_nonprim) {
        lead_subscription_post_params_create_all_of_partner_metadata_free(partner_metadata_local_nonprim);
        partner_metadata_local_nonprim = NULL;
    }
    return NULL;

}
