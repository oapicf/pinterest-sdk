#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_metadata.h"



integration_metadata_t *integration_metadata_create(
    char *id,
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_user_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    double partner_access_token_expiry,
    double partner_refresh_token_expiry,
    char *scopes,
    double created_timestamp,
    double updated_timestamp,
    char *additional_id_1,
    char *partner_metadata
    ) {
    integration_metadata_t *integration_metadata_local_var = malloc(sizeof(integration_metadata_t));
    if (!integration_metadata_local_var) {
        return NULL;
    }
    integration_metadata_local_var->id = id;
    integration_metadata_local_var->external_business_id = external_business_id;
    integration_metadata_local_var->connected_merchant_id = connected_merchant_id;
    integration_metadata_local_var->connected_user_id = connected_user_id;
    integration_metadata_local_var->connected_advertiser_id = connected_advertiser_id;
    integration_metadata_local_var->connected_lba_id = connected_lba_id;
    integration_metadata_local_var->connected_tag_id = connected_tag_id;
    integration_metadata_local_var->partner_access_token_expiry = partner_access_token_expiry;
    integration_metadata_local_var->partner_refresh_token_expiry = partner_refresh_token_expiry;
    integration_metadata_local_var->scopes = scopes;
    integration_metadata_local_var->created_timestamp = created_timestamp;
    integration_metadata_local_var->updated_timestamp = updated_timestamp;
    integration_metadata_local_var->additional_id_1 = additional_id_1;
    integration_metadata_local_var->partner_metadata = partner_metadata;

    return integration_metadata_local_var;
}


void integration_metadata_free(integration_metadata_t *integration_metadata) {
    if(NULL == integration_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_metadata->id) {
        free(integration_metadata->id);
        integration_metadata->id = NULL;
    }
    if (integration_metadata->external_business_id) {
        free(integration_metadata->external_business_id);
        integration_metadata->external_business_id = NULL;
    }
    if (integration_metadata->connected_merchant_id) {
        free(integration_metadata->connected_merchant_id);
        integration_metadata->connected_merchant_id = NULL;
    }
    if (integration_metadata->connected_user_id) {
        free(integration_metadata->connected_user_id);
        integration_metadata->connected_user_id = NULL;
    }
    if (integration_metadata->connected_advertiser_id) {
        free(integration_metadata->connected_advertiser_id);
        integration_metadata->connected_advertiser_id = NULL;
    }
    if (integration_metadata->connected_lba_id) {
        free(integration_metadata->connected_lba_id);
        integration_metadata->connected_lba_id = NULL;
    }
    if (integration_metadata->connected_tag_id) {
        free(integration_metadata->connected_tag_id);
        integration_metadata->connected_tag_id = NULL;
    }
    if (integration_metadata->scopes) {
        free(integration_metadata->scopes);
        integration_metadata->scopes = NULL;
    }
    if (integration_metadata->additional_id_1) {
        free(integration_metadata->additional_id_1);
        integration_metadata->additional_id_1 = NULL;
    }
    if (integration_metadata->partner_metadata) {
        free(integration_metadata->partner_metadata);
        integration_metadata->partner_metadata = NULL;
    }
    free(integration_metadata);
}

cJSON *integration_metadata_convertToJSON(integration_metadata_t *integration_metadata) {
    cJSON *item = cJSON_CreateObject();

    // integration_metadata->id
    if(integration_metadata->id) {
    if(cJSON_AddStringToObject(item, "id", integration_metadata->id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->external_business_id
    if(integration_metadata->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_metadata->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_merchant_id
    if(integration_metadata->connected_merchant_id) {
    if(cJSON_AddStringToObject(item, "connected_merchant_id", integration_metadata->connected_merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_user_id
    if(integration_metadata->connected_user_id) {
    if(cJSON_AddStringToObject(item, "connected_user_id", integration_metadata->connected_user_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_advertiser_id
    if(integration_metadata->connected_advertiser_id) {
    if(cJSON_AddStringToObject(item, "connected_advertiser_id", integration_metadata->connected_advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_lba_id
    if(integration_metadata->connected_lba_id) {
    if(cJSON_AddStringToObject(item, "connected_lba_id", integration_metadata->connected_lba_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_tag_id
    if(integration_metadata->connected_tag_id) {
    if(cJSON_AddStringToObject(item, "connected_tag_id", integration_metadata->connected_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->partner_access_token_expiry
    if(integration_metadata->partner_access_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_access_token_expiry", integration_metadata->partner_access_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->partner_refresh_token_expiry
    if(integration_metadata->partner_refresh_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_refresh_token_expiry", integration_metadata->partner_refresh_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->scopes
    if(integration_metadata->scopes) {
    if(cJSON_AddStringToObject(item, "scopes", integration_metadata->scopes) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->created_timestamp
    if(integration_metadata->created_timestamp) {
    if(cJSON_AddNumberToObject(item, "created_timestamp", integration_metadata->created_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->updated_timestamp
    if(integration_metadata->updated_timestamp) {
    if(cJSON_AddNumberToObject(item, "updated_timestamp", integration_metadata->updated_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->additional_id_1
    if(integration_metadata->additional_id_1) {
    if(cJSON_AddStringToObject(item, "additional_id_1", integration_metadata->additional_id_1) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->partner_metadata
    if(integration_metadata->partner_metadata) {
    if(cJSON_AddStringToObject(item, "partner_metadata", integration_metadata->partner_metadata) == NULL) {
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

integration_metadata_t *integration_metadata_parseFromJSON(cJSON *integration_metadataJSON){

    integration_metadata_t *integration_metadata_local_var = NULL;

    // integration_metadata->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // integration_metadata->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "external_business_id");
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_merchant_id
    cJSON *connected_merchant_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_merchant_id");
    if (connected_merchant_id) { 
    if(!cJSON_IsString(connected_merchant_id) && !cJSON_IsNull(connected_merchant_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_user_id
    cJSON *connected_user_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_user_id");
    if (connected_user_id) { 
    if(!cJSON_IsString(connected_user_id) && !cJSON_IsNull(connected_user_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_advertiser_id
    cJSON *connected_advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_advertiser_id");
    if (connected_advertiser_id) { 
    if(!cJSON_IsString(connected_advertiser_id) && !cJSON_IsNull(connected_advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_lba_id
    cJSON *connected_lba_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_lba_id");
    if (connected_lba_id) { 
    if(!cJSON_IsString(connected_lba_id) && !cJSON_IsNull(connected_lba_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_tag_id
    cJSON *connected_tag_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_tag_id");
    if (connected_tag_id) { 
    if(!cJSON_IsString(connected_tag_id) && !cJSON_IsNull(connected_tag_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->partner_access_token_expiry
    cJSON *partner_access_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_access_token_expiry");
    if (partner_access_token_expiry) { 
    if(!cJSON_IsNumber(partner_access_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_metadata->partner_refresh_token_expiry
    cJSON *partner_refresh_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_refresh_token_expiry");
    if (partner_refresh_token_expiry) { 
    if(!cJSON_IsNumber(partner_refresh_token_expiry))
    {
    goto end; //Numeric
    }
    }

    // integration_metadata->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "scopes");
    if (scopes) { 
    if(!cJSON_IsString(scopes) && !cJSON_IsNull(scopes))
    {
    goto end; //String
    }
    }

    // integration_metadata->created_timestamp
    cJSON *created_timestamp = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "created_timestamp");
    if (created_timestamp) { 
    if(!cJSON_IsNumber(created_timestamp))
    {
    goto end; //Numeric
    }
    }

    // integration_metadata->updated_timestamp
    cJSON *updated_timestamp = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "updated_timestamp");
    if (updated_timestamp) { 
    if(!cJSON_IsNumber(updated_timestamp))
    {
    goto end; //Numeric
    }
    }

    // integration_metadata->additional_id_1
    cJSON *additional_id_1 = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "additional_id_1");
    if (additional_id_1) { 
    if(!cJSON_IsString(additional_id_1) && !cJSON_IsNull(additional_id_1))
    {
    goto end; //String
    }
    }

    // integration_metadata->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_metadata");
    if (partner_metadata) { 
    if(!cJSON_IsString(partner_metadata) && !cJSON_IsNull(partner_metadata))
    {
    goto end; //String
    }
    }


    integration_metadata_local_var = integration_metadata_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        external_business_id && !cJSON_IsNull(external_business_id) ? strdup(external_business_id->valuestring) : NULL,
        connected_merchant_id && !cJSON_IsNull(connected_merchant_id) ? strdup(connected_merchant_id->valuestring) : NULL,
        connected_user_id && !cJSON_IsNull(connected_user_id) ? strdup(connected_user_id->valuestring) : NULL,
        connected_advertiser_id && !cJSON_IsNull(connected_advertiser_id) ? strdup(connected_advertiser_id->valuestring) : NULL,
        connected_lba_id && !cJSON_IsNull(connected_lba_id) ? strdup(connected_lba_id->valuestring) : NULL,
        connected_tag_id && !cJSON_IsNull(connected_tag_id) ? strdup(connected_tag_id->valuestring) : NULL,
        partner_access_token_expiry ? partner_access_token_expiry->valuedouble : 0,
        partner_refresh_token_expiry ? partner_refresh_token_expiry->valuedouble : 0,
        scopes && !cJSON_IsNull(scopes) ? strdup(scopes->valuestring) : NULL,
        created_timestamp ? created_timestamp->valuedouble : 0,
        updated_timestamp ? updated_timestamp->valuedouble : 0,
        additional_id_1 && !cJSON_IsNull(additional_id_1) ? strdup(additional_id_1->valuestring) : NULL,
        partner_metadata && !cJSON_IsNull(partner_metadata) ? strdup(partner_metadata->valuestring) : NULL
        );

    return integration_metadata_local_var;
end:
    return NULL;

}
