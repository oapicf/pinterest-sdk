#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_record.h"



integration_record_t *integration_record_create(
    char *id,
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_user_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    char *partner_access_token,
    char *partner_refresh_token,
    char *partner_primary_email,
    int partner_access_token_expiry,
    int partner_refresh_token_expiry,
    char *scopes,
    char *partner_metadata,
    char *additional_id_1,
    int created_time,
    int updated_time
    ) {
    integration_record_t *integration_record_local_var = malloc(sizeof(integration_record_t));
    if (!integration_record_local_var) {
        return NULL;
    }
    integration_record_local_var->id = id;
    integration_record_local_var->external_business_id = external_business_id;
    integration_record_local_var->connected_merchant_id = connected_merchant_id;
    integration_record_local_var->connected_user_id = connected_user_id;
    integration_record_local_var->connected_advertiser_id = connected_advertiser_id;
    integration_record_local_var->connected_lba_id = connected_lba_id;
    integration_record_local_var->connected_tag_id = connected_tag_id;
    integration_record_local_var->partner_access_token = partner_access_token;
    integration_record_local_var->partner_refresh_token = partner_refresh_token;
    integration_record_local_var->partner_primary_email = partner_primary_email;
    integration_record_local_var->partner_access_token_expiry = partner_access_token_expiry;
    integration_record_local_var->partner_refresh_token_expiry = partner_refresh_token_expiry;
    integration_record_local_var->scopes = scopes;
    integration_record_local_var->partner_metadata = partner_metadata;
    integration_record_local_var->additional_id_1 = additional_id_1;
    integration_record_local_var->created_time = created_time;
    integration_record_local_var->updated_time = updated_time;

    return integration_record_local_var;
}


void integration_record_free(integration_record_t *integration_record) {
    if(NULL == integration_record){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_record->id) {
        free(integration_record->id);
        integration_record->id = NULL;
    }
    if (integration_record->external_business_id) {
        free(integration_record->external_business_id);
        integration_record->external_business_id = NULL;
    }
    if (integration_record->connected_merchant_id) {
        free(integration_record->connected_merchant_id);
        integration_record->connected_merchant_id = NULL;
    }
    if (integration_record->connected_user_id) {
        free(integration_record->connected_user_id);
        integration_record->connected_user_id = NULL;
    }
    if (integration_record->connected_advertiser_id) {
        free(integration_record->connected_advertiser_id);
        integration_record->connected_advertiser_id = NULL;
    }
    if (integration_record->connected_lba_id) {
        free(integration_record->connected_lba_id);
        integration_record->connected_lba_id = NULL;
    }
    if (integration_record->connected_tag_id) {
        free(integration_record->connected_tag_id);
        integration_record->connected_tag_id = NULL;
    }
    if (integration_record->partner_access_token) {
        free(integration_record->partner_access_token);
        integration_record->partner_access_token = NULL;
    }
    if (integration_record->partner_refresh_token) {
        free(integration_record->partner_refresh_token);
        integration_record->partner_refresh_token = NULL;
    }
    if (integration_record->partner_primary_email) {
        free(integration_record->partner_primary_email);
        integration_record->partner_primary_email = NULL;
    }
    if (integration_record->scopes) {
        free(integration_record->scopes);
        integration_record->scopes = NULL;
    }
    if (integration_record->partner_metadata) {
        free(integration_record->partner_metadata);
        integration_record->partner_metadata = NULL;
    }
    if (integration_record->additional_id_1) {
        free(integration_record->additional_id_1);
        integration_record->additional_id_1 = NULL;
    }
    free(integration_record);
}

cJSON *integration_record_convertToJSON(integration_record_t *integration_record) {
    cJSON *item = cJSON_CreateObject();

    // integration_record->id
    if(integration_record->id) {
    if(cJSON_AddStringToObject(item, "id", integration_record->id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->external_business_id
    if(integration_record->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_record->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->connected_merchant_id
    if(integration_record->connected_merchant_id) {
    if(cJSON_AddStringToObject(item, "connected_merchant_id", integration_record->connected_merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->connected_user_id
    if(integration_record->connected_user_id) {
    if(cJSON_AddStringToObject(item, "connected_user_id", integration_record->connected_user_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->connected_advertiser_id
    if(integration_record->connected_advertiser_id) {
    if(cJSON_AddStringToObject(item, "connected_advertiser_id", integration_record->connected_advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->connected_lba_id
    if(integration_record->connected_lba_id) {
    if(cJSON_AddStringToObject(item, "connected_lba_id", integration_record->connected_lba_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->connected_tag_id
    if(integration_record->connected_tag_id) {
    if(cJSON_AddStringToObject(item, "connected_tag_id", integration_record->connected_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->partner_access_token
    if(integration_record->partner_access_token) {
    if(cJSON_AddStringToObject(item, "partner_access_token", integration_record->partner_access_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->partner_refresh_token
    if(integration_record->partner_refresh_token) {
    if(cJSON_AddStringToObject(item, "partner_refresh_token", integration_record->partner_refresh_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->partner_primary_email
    if(integration_record->partner_primary_email) {
    if(cJSON_AddStringToObject(item, "partner_primary_email", integration_record->partner_primary_email) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->partner_access_token_expiry
    if(integration_record->partner_access_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_access_token_expiry", integration_record->partner_access_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_record->partner_refresh_token_expiry
    if(integration_record->partner_refresh_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_refresh_token_expiry", integration_record->partner_refresh_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_record->scopes
    if(integration_record->scopes) {
    if(cJSON_AddStringToObject(item, "scopes", integration_record->scopes) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->partner_metadata
    if(integration_record->partner_metadata) {
    if(cJSON_AddStringToObject(item, "partner_metadata", integration_record->partner_metadata) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->additional_id_1
    if(integration_record->additional_id_1) {
    if(cJSON_AddStringToObject(item, "additional_id_1", integration_record->additional_id_1) == NULL) {
    goto fail; //String
    }
    }


    // integration_record->created_time
    if(integration_record->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", integration_record->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_record->updated_time
    if(integration_record->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", integration_record->updated_time) == NULL) {
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

integration_record_t *integration_record_parseFromJSON(cJSON *integration_recordJSON){

    integration_record_t *integration_record_local_var = NULL;

    // integration_record->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // integration_record->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "external_business_id");
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_record->connected_merchant_id
    cJSON *connected_merchant_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "connected_merchant_id");
    if (connected_merchant_id) { 
    if(!cJSON_IsString(connected_merchant_id) && !cJSON_IsNull(connected_merchant_id))
    {
    goto end; //String
    }
    }

    // integration_record->connected_user_id
    cJSON *connected_user_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "connected_user_id");
    if (connected_user_id) { 
    if(!cJSON_IsString(connected_user_id) && !cJSON_IsNull(connected_user_id))
    {
    goto end; //String
    }
    }

    // integration_record->connected_advertiser_id
    cJSON *connected_advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "connected_advertiser_id");
    if (connected_advertiser_id) { 
    if(!cJSON_IsString(connected_advertiser_id) && !cJSON_IsNull(connected_advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_record->connected_lba_id
    cJSON *connected_lba_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "connected_lba_id");
    if (connected_lba_id) { 
    if(!cJSON_IsString(connected_lba_id) && !cJSON_IsNull(connected_lba_id))
    {
    goto end; //String
    }
    }

    // integration_record->connected_tag_id
    cJSON *connected_tag_id = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "connected_tag_id");
    if (connected_tag_id) { 
    if(!cJSON_IsString(connected_tag_id) && !cJSON_IsNull(connected_tag_id))
    {
    goto end; //String
    }
    }

    // integration_record->partner_access_token
    cJSON *partner_access_token = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_access_token");
    if (partner_access_token) { 
    if(!cJSON_IsString(partner_access_token) && !cJSON_IsNull(partner_access_token))
    {
    goto end; //String
    }
    }

    // integration_record->partner_refresh_token
    cJSON *partner_refresh_token = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_refresh_token");
    if (partner_refresh_token) { 
    if(!cJSON_IsString(partner_refresh_token) && !cJSON_IsNull(partner_refresh_token))
    {
    goto end; //String
    }
    }

    // integration_record->partner_primary_email
    cJSON *partner_primary_email = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_primary_email");
    if (partner_primary_email) { 
    if(!cJSON_IsString(partner_primary_email) && !cJSON_IsNull(partner_primary_email))
    {
    goto end; //String
    }
    }

    // integration_record->partner_access_token_expiry
    cJSON *partner_access_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_access_token_expiry");
    if (partner_access_token_expiry) { 
    if(!cJSON_IsNumber(partner_access_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_record->partner_refresh_token_expiry
    cJSON *partner_refresh_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_refresh_token_expiry");
    if (partner_refresh_token_expiry) { 
    if(!cJSON_IsNumber(partner_refresh_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_record->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "scopes");
    if (scopes) { 
    if(!cJSON_IsString(scopes) && !cJSON_IsNull(scopes))
    {
    goto end; //String
    }
    }

    // integration_record->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "partner_metadata");
    if (partner_metadata) { 
    if(!cJSON_IsString(partner_metadata) && !cJSON_IsNull(partner_metadata))
    {
    goto end; //String
    }
    }

    // integration_record->additional_id_1
    cJSON *additional_id_1 = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "additional_id_1");
    if (additional_id_1) { 
    if(!cJSON_IsString(additional_id_1) && !cJSON_IsNull(additional_id_1))
    {
    goto end; //String
    }
    }

    // integration_record->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // integration_record->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(integration_recordJSON, "updated_time");
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    integration_record_local_var = integration_record_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        external_business_id && !cJSON_IsNull(external_business_id) ? strdup(external_business_id->valuestring) : NULL,
        connected_merchant_id && !cJSON_IsNull(connected_merchant_id) ? strdup(connected_merchant_id->valuestring) : NULL,
        connected_user_id && !cJSON_IsNull(connected_user_id) ? strdup(connected_user_id->valuestring) : NULL,
        connected_advertiser_id && !cJSON_IsNull(connected_advertiser_id) ? strdup(connected_advertiser_id->valuestring) : NULL,
        connected_lba_id && !cJSON_IsNull(connected_lba_id) ? strdup(connected_lba_id->valuestring) : NULL,
        connected_tag_id && !cJSON_IsNull(connected_tag_id) ? strdup(connected_tag_id->valuestring) : NULL,
        partner_access_token && !cJSON_IsNull(partner_access_token) ? strdup(partner_access_token->valuestring) : NULL,
        partner_refresh_token && !cJSON_IsNull(partner_refresh_token) ? strdup(partner_refresh_token->valuestring) : NULL,
        partner_primary_email && !cJSON_IsNull(partner_primary_email) ? strdup(partner_primary_email->valuestring) : NULL,
        partner_access_token_expiry ? partner_access_token_expiry->valuedouble : 0,
        partner_refresh_token_expiry ? partner_refresh_token_expiry->valuedouble : 0,
        scopes && !cJSON_IsNull(scopes) ? strdup(scopes->valuestring) : NULL,
        partner_metadata && !cJSON_IsNull(partner_metadata) ? strdup(partner_metadata->valuestring) : NULL,
        additional_id_1 && !cJSON_IsNull(additional_id_1) ? strdup(additional_id_1->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        updated_time ? updated_time->valuedouble : 0
        );

    return integration_record_local_var;
end:
    return NULL;

}
