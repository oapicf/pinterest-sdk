#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_request.h"



integration_request_t *integration_request_create(
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    char *partner_access_token,
    char *partner_refresh_token,
    char *partner_primary_email,
    int partner_access_token_expiry,
    int partner_refresh_token_expiry,
    char *scopes,
    char *additional_id_1,
    char *partner_metadata
    ) {
    integration_request_t *integration_request_local_var = malloc(sizeof(integration_request_t));
    if (!integration_request_local_var) {
        return NULL;
    }
    integration_request_local_var->external_business_id = external_business_id;
    integration_request_local_var->connected_merchant_id = connected_merchant_id;
    integration_request_local_var->connected_advertiser_id = connected_advertiser_id;
    integration_request_local_var->connected_lba_id = connected_lba_id;
    integration_request_local_var->connected_tag_id = connected_tag_id;
    integration_request_local_var->partner_access_token = partner_access_token;
    integration_request_local_var->partner_refresh_token = partner_refresh_token;
    integration_request_local_var->partner_primary_email = partner_primary_email;
    integration_request_local_var->partner_access_token_expiry = partner_access_token_expiry;
    integration_request_local_var->partner_refresh_token_expiry = partner_refresh_token_expiry;
    integration_request_local_var->scopes = scopes;
    integration_request_local_var->additional_id_1 = additional_id_1;
    integration_request_local_var->partner_metadata = partner_metadata;

    return integration_request_local_var;
}


void integration_request_free(integration_request_t *integration_request) {
    if(NULL == integration_request){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_request->external_business_id) {
        free(integration_request->external_business_id);
        integration_request->external_business_id = NULL;
    }
    if (integration_request->connected_merchant_id) {
        free(integration_request->connected_merchant_id);
        integration_request->connected_merchant_id = NULL;
    }
    if (integration_request->connected_advertiser_id) {
        free(integration_request->connected_advertiser_id);
        integration_request->connected_advertiser_id = NULL;
    }
    if (integration_request->connected_lba_id) {
        free(integration_request->connected_lba_id);
        integration_request->connected_lba_id = NULL;
    }
    if (integration_request->connected_tag_id) {
        free(integration_request->connected_tag_id);
        integration_request->connected_tag_id = NULL;
    }
    if (integration_request->partner_access_token) {
        free(integration_request->partner_access_token);
        integration_request->partner_access_token = NULL;
    }
    if (integration_request->partner_refresh_token) {
        free(integration_request->partner_refresh_token);
        integration_request->partner_refresh_token = NULL;
    }
    if (integration_request->partner_primary_email) {
        free(integration_request->partner_primary_email);
        integration_request->partner_primary_email = NULL;
    }
    if (integration_request->scopes) {
        free(integration_request->scopes);
        integration_request->scopes = NULL;
    }
    if (integration_request->additional_id_1) {
        free(integration_request->additional_id_1);
        integration_request->additional_id_1 = NULL;
    }
    if (integration_request->partner_metadata) {
        free(integration_request->partner_metadata);
        integration_request->partner_metadata = NULL;
    }
    free(integration_request);
}

cJSON *integration_request_convertToJSON(integration_request_t *integration_request) {
    cJSON *item = cJSON_CreateObject();

    // integration_request->external_business_id
    if(integration_request->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_request->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->connected_merchant_id
    if(integration_request->connected_merchant_id) {
    if(cJSON_AddStringToObject(item, "connected_merchant_id", integration_request->connected_merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->connected_advertiser_id
    if(integration_request->connected_advertiser_id) {
    if(cJSON_AddStringToObject(item, "connected_advertiser_id", integration_request->connected_advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->connected_lba_id
    if(integration_request->connected_lba_id) {
    if(cJSON_AddStringToObject(item, "connected_lba_id", integration_request->connected_lba_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->connected_tag_id
    if(integration_request->connected_tag_id) {
    if(cJSON_AddStringToObject(item, "connected_tag_id", integration_request->connected_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->partner_access_token
    if(integration_request->partner_access_token) {
    if(cJSON_AddStringToObject(item, "partner_access_token", integration_request->partner_access_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->partner_refresh_token
    if(integration_request->partner_refresh_token) {
    if(cJSON_AddStringToObject(item, "partner_refresh_token", integration_request->partner_refresh_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->partner_primary_email
    if(integration_request->partner_primary_email) {
    if(cJSON_AddStringToObject(item, "partner_primary_email", integration_request->partner_primary_email) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->partner_access_token_expiry
    if(integration_request->partner_access_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_access_token_expiry", integration_request->partner_access_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_request->partner_refresh_token_expiry
    if(integration_request->partner_refresh_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_refresh_token_expiry", integration_request->partner_refresh_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_request->scopes
    if(integration_request->scopes) {
    if(cJSON_AddStringToObject(item, "scopes", integration_request->scopes) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->additional_id_1
    if(integration_request->additional_id_1) {
    if(cJSON_AddStringToObject(item, "additional_id_1", integration_request->additional_id_1) == NULL) {
    goto fail; //String
    }
    }


    // integration_request->partner_metadata
    if(integration_request->partner_metadata) {
    if(cJSON_AddStringToObject(item, "partner_metadata", integration_request->partner_metadata) == NULL) {
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

integration_request_t *integration_request_parseFromJSON(cJSON *integration_requestJSON){

    integration_request_t *integration_request_local_var = NULL;

    // integration_request->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "external_business_id");
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_request->connected_merchant_id
    cJSON *connected_merchant_id = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "connected_merchant_id");
    if (connected_merchant_id) { 
    if(!cJSON_IsString(connected_merchant_id) && !cJSON_IsNull(connected_merchant_id))
    {
    goto end; //String
    }
    }

    // integration_request->connected_advertiser_id
    cJSON *connected_advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "connected_advertiser_id");
    if (connected_advertiser_id) { 
    if(!cJSON_IsString(connected_advertiser_id) && !cJSON_IsNull(connected_advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_request->connected_lba_id
    cJSON *connected_lba_id = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "connected_lba_id");
    if (connected_lba_id) { 
    if(!cJSON_IsString(connected_lba_id) && !cJSON_IsNull(connected_lba_id))
    {
    goto end; //String
    }
    }

    // integration_request->connected_tag_id
    cJSON *connected_tag_id = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "connected_tag_id");
    if (connected_tag_id) { 
    if(!cJSON_IsString(connected_tag_id) && !cJSON_IsNull(connected_tag_id))
    {
    goto end; //String
    }
    }

    // integration_request->partner_access_token
    cJSON *partner_access_token = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_access_token");
    if (partner_access_token) { 
    if(!cJSON_IsString(partner_access_token) && !cJSON_IsNull(partner_access_token))
    {
    goto end; //String
    }
    }

    // integration_request->partner_refresh_token
    cJSON *partner_refresh_token = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_refresh_token");
    if (partner_refresh_token) { 
    if(!cJSON_IsString(partner_refresh_token) && !cJSON_IsNull(partner_refresh_token))
    {
    goto end; //String
    }
    }

    // integration_request->partner_primary_email
    cJSON *partner_primary_email = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_primary_email");
    if (partner_primary_email) { 
    if(!cJSON_IsString(partner_primary_email) && !cJSON_IsNull(partner_primary_email))
    {
    goto end; //String
    }
    }

    // integration_request->partner_access_token_expiry
    cJSON *partner_access_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_access_token_expiry");
    if (partner_access_token_expiry) { 
    if(!cJSON_IsNumber(partner_access_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_request->partner_refresh_token_expiry
    cJSON *partner_refresh_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_refresh_token_expiry");
    if (partner_refresh_token_expiry) { 
    if(!cJSON_IsNumber(partner_refresh_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_request->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "scopes");
    if (scopes) { 
    if(!cJSON_IsString(scopes) && !cJSON_IsNull(scopes))
    {
    goto end; //String
    }
    }

    // integration_request->additional_id_1
    cJSON *additional_id_1 = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "additional_id_1");
    if (additional_id_1) { 
    if(!cJSON_IsString(additional_id_1) && !cJSON_IsNull(additional_id_1))
    {
    goto end; //String
    }
    }

    // integration_request->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(integration_requestJSON, "partner_metadata");
    if (partner_metadata) { 
    if(!cJSON_IsString(partner_metadata) && !cJSON_IsNull(partner_metadata))
    {
    goto end; //String
    }
    }


    integration_request_local_var = integration_request_create (
        external_business_id && !cJSON_IsNull(external_business_id) ? strdup(external_business_id->valuestring) : NULL,
        connected_merchant_id && !cJSON_IsNull(connected_merchant_id) ? strdup(connected_merchant_id->valuestring) : NULL,
        connected_advertiser_id && !cJSON_IsNull(connected_advertiser_id) ? strdup(connected_advertiser_id->valuestring) : NULL,
        connected_lba_id && !cJSON_IsNull(connected_lba_id) ? strdup(connected_lba_id->valuestring) : NULL,
        connected_tag_id && !cJSON_IsNull(connected_tag_id) ? strdup(connected_tag_id->valuestring) : NULL,
        partner_access_token && !cJSON_IsNull(partner_access_token) ? strdup(partner_access_token->valuestring) : NULL,
        partner_refresh_token && !cJSON_IsNull(partner_refresh_token) ? strdup(partner_refresh_token->valuestring) : NULL,
        partner_primary_email && !cJSON_IsNull(partner_primary_email) ? strdup(partner_primary_email->valuestring) : NULL,
        partner_access_token_expiry ? partner_access_token_expiry->valuedouble : 0,
        partner_refresh_token_expiry ? partner_refresh_token_expiry->valuedouble : 0,
        scopes && !cJSON_IsNull(scopes) ? strdup(scopes->valuestring) : NULL,
        additional_id_1 && !cJSON_IsNull(additional_id_1) ? strdup(additional_id_1->valuestring) : NULL,
        partner_metadata && !cJSON_IsNull(partner_metadata) ? strdup(partner_metadata->valuestring) : NULL
        );

    return integration_request_local_var;
end:
    return NULL;

}
