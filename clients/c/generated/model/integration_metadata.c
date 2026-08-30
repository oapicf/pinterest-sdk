#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_metadata.h"



static integration_metadata_t *integration_metadata_create_internal(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *connected_user_id,
    double *created_timestamp,
    char *external_business_id,
    char *id,
    double *partner_access_token_expiry,
    char *partner_metadata,
    double *partner_refresh_token_expiry,
    char *scopes,
    double *updated_timestamp
    ) {
    integration_metadata_t *integration_metadata_local_var = malloc(sizeof(integration_metadata_t));
    if (!integration_metadata_local_var) {
        return NULL;
    }
    memset(integration_metadata_local_var, 0, sizeof(integration_metadata_t));
    integration_metadata_local_var->_library_owned = 1;
    integration_metadata_local_var->additional_id_1 = additional_id_1;
    integration_metadata_local_var->connected_advertiser_id = connected_advertiser_id;
    integration_metadata_local_var->connected_lba_id = connected_lba_id;
    integration_metadata_local_var->connected_merchant_id = connected_merchant_id;
    integration_metadata_local_var->connected_tag_id = connected_tag_id;
    integration_metadata_local_var->connected_user_id = connected_user_id;
    integration_metadata_local_var->created_timestamp = created_timestamp;
    integration_metadata_local_var->external_business_id = external_business_id;
    integration_metadata_local_var->id = id;
    integration_metadata_local_var->partner_access_token_expiry = partner_access_token_expiry;
    integration_metadata_local_var->partner_metadata = partner_metadata;
    integration_metadata_local_var->partner_refresh_token_expiry = partner_refresh_token_expiry;
    integration_metadata_local_var->scopes = scopes;
    integration_metadata_local_var->updated_timestamp = updated_timestamp;
    return integration_metadata_local_var;
}

__attribute__((deprecated)) integration_metadata_t *integration_metadata_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *connected_user_id,
    double *created_timestamp,
    char *external_business_id,
    char *id,
    double *partner_access_token_expiry,
    char *partner_metadata,
    double *partner_refresh_token_expiry,
    char *scopes,
    double *updated_timestamp
    ) {
    double *created_timestamp_copy = NULL;
    if (created_timestamp) {
        created_timestamp_copy = malloc(sizeof(double));
        if (created_timestamp_copy) *created_timestamp_copy = *created_timestamp;
    }
    double *partner_access_token_expiry_copy = NULL;
    if (partner_access_token_expiry) {
        partner_access_token_expiry_copy = malloc(sizeof(double));
        if (partner_access_token_expiry_copy) *partner_access_token_expiry_copy = *partner_access_token_expiry;
    }
    double *partner_refresh_token_expiry_copy = NULL;
    if (partner_refresh_token_expiry) {
        partner_refresh_token_expiry_copy = malloc(sizeof(double));
        if (partner_refresh_token_expiry_copy) *partner_refresh_token_expiry_copy = *partner_refresh_token_expiry;
    }
    double *updated_timestamp_copy = NULL;
    if (updated_timestamp) {
        updated_timestamp_copy = malloc(sizeof(double));
        if (updated_timestamp_copy) *updated_timestamp_copy = *updated_timestamp;
    }
    integration_metadata_t *result = integration_metadata_create_internal (
        additional_id_1,
        connected_advertiser_id,
        connected_lba_id,
        connected_merchant_id,
        connected_tag_id,
        connected_user_id,
        created_timestamp_copy,
        external_business_id,
        id,
        partner_access_token_expiry_copy,
        partner_metadata,
        partner_refresh_token_expiry_copy,
        scopes,
        updated_timestamp_copy
        );
    if (!result) {
        free(created_timestamp_copy);
        free(partner_access_token_expiry_copy);
        free(partner_refresh_token_expiry_copy);
        free(updated_timestamp_copy);
    }
    return result;
}

void integration_metadata_free(integration_metadata_t *integration_metadata) {
    if(NULL == integration_metadata){
        return ;
    }
    if(integration_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_metadata->additional_id_1) {
        free(integration_metadata->additional_id_1);
        integration_metadata->additional_id_1 = NULL;
    }
    if (integration_metadata->connected_advertiser_id) {
        free(integration_metadata->connected_advertiser_id);
        integration_metadata->connected_advertiser_id = NULL;
    }
    if (integration_metadata->connected_lba_id) {
        free(integration_metadata->connected_lba_id);
        integration_metadata->connected_lba_id = NULL;
    }
    if (integration_metadata->connected_merchant_id) {
        free(integration_metadata->connected_merchant_id);
        integration_metadata->connected_merchant_id = NULL;
    }
    if (integration_metadata->connected_tag_id) {
        free(integration_metadata->connected_tag_id);
        integration_metadata->connected_tag_id = NULL;
    }
    if (integration_metadata->connected_user_id) {
        free(integration_metadata->connected_user_id);
        integration_metadata->connected_user_id = NULL;
    }
    if (integration_metadata->created_timestamp) {
        free(integration_metadata->created_timestamp);
        integration_metadata->created_timestamp = NULL;
    }
    if (integration_metadata->external_business_id) {
        free(integration_metadata->external_business_id);
        integration_metadata->external_business_id = NULL;
    }
    if (integration_metadata->id) {
        free(integration_metadata->id);
        integration_metadata->id = NULL;
    }
    if (integration_metadata->partner_access_token_expiry) {
        free(integration_metadata->partner_access_token_expiry);
        integration_metadata->partner_access_token_expiry = NULL;
    }
    if (integration_metadata->partner_metadata) {
        free(integration_metadata->partner_metadata);
        integration_metadata->partner_metadata = NULL;
    }
    if (integration_metadata->partner_refresh_token_expiry) {
        free(integration_metadata->partner_refresh_token_expiry);
        integration_metadata->partner_refresh_token_expiry = NULL;
    }
    if (integration_metadata->scopes) {
        free(integration_metadata->scopes);
        integration_metadata->scopes = NULL;
    }
    if (integration_metadata->updated_timestamp) {
        free(integration_metadata->updated_timestamp);
        integration_metadata->updated_timestamp = NULL;
    }
    free(integration_metadata);
}

cJSON *integration_metadata_convertToJSON(integration_metadata_t *integration_metadata) {
    cJSON *item = cJSON_CreateObject();

    // integration_metadata->additional_id_1
    if(integration_metadata->additional_id_1) {
    if(cJSON_AddStringToObject(item, "additional_id_1", integration_metadata->additional_id_1) == NULL) {
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


    // integration_metadata->connected_merchant_id
    if(integration_metadata->connected_merchant_id) {
    if(cJSON_AddStringToObject(item, "connected_merchant_id", integration_metadata->connected_merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_tag_id
    if(integration_metadata->connected_tag_id) {
    if(cJSON_AddStringToObject(item, "connected_tag_id", integration_metadata->connected_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->connected_user_id
    if(integration_metadata->connected_user_id) {
    if(cJSON_AddStringToObject(item, "connected_user_id", integration_metadata->connected_user_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->created_timestamp
    if(integration_metadata->created_timestamp) {
    if(cJSON_AddNumberToObject(item, "created_timestamp", *integration_metadata->created_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->external_business_id
    if(integration_metadata->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_metadata->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->id
    if(integration_metadata->id) {
    if(cJSON_AddStringToObject(item, "id", integration_metadata->id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->partner_access_token_expiry
    if(integration_metadata->partner_access_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_access_token_expiry", *integration_metadata->partner_access_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->partner_metadata
    if(integration_metadata->partner_metadata) {
    if(cJSON_AddStringToObject(item, "partner_metadata", integration_metadata->partner_metadata) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->partner_refresh_token_expiry
    if(integration_metadata->partner_refresh_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_refresh_token_expiry", *integration_metadata->partner_refresh_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata->scopes
    if(integration_metadata->scopes) {
    if(cJSON_AddStringToObject(item, "scopes", integration_metadata->scopes) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata->updated_timestamp
    if(integration_metadata->updated_timestamp) {
    if(cJSON_AddNumberToObject(item, "updated_timestamp", *integration_metadata->updated_timestamp) == NULL) {
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

integration_metadata_t *integration_metadata_parseFromJSON(cJSON *integration_metadataJSON){

    integration_metadata_t *integration_metadata_local_var = NULL;

    char *additional_id_1_local_str = NULL;

    char *connected_advertiser_id_local_str = NULL;

    char *connected_lba_id_local_str = NULL;

    char *connected_merchant_id_local_str = NULL;

    char *connected_tag_id_local_str = NULL;

    char *connected_user_id_local_str = NULL;

    // define the local variable for integration_metadata->created_timestamp
    double *created_timestamp_local_var = NULL;

    char *external_business_id_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for integration_metadata->partner_access_token_expiry
    double *partner_access_token_expiry_local_var = NULL;

    char *partner_metadata_local_str = NULL;

    // define the local variable for integration_metadata->partner_refresh_token_expiry
    double *partner_refresh_token_expiry_local_var = NULL;

    char *scopes_local_str = NULL;

    // define the local variable for integration_metadata->updated_timestamp
    double *updated_timestamp_local_var = NULL;

    // integration_metadata->additional_id_1
    cJSON *additional_id_1 = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "additional_id_1");
    if (cJSON_IsNull(additional_id_1)) {
        additional_id_1 = NULL;
    }
    if (additional_id_1) { 
    if(!cJSON_IsString(additional_id_1) && !cJSON_IsNull(additional_id_1))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_advertiser_id
    cJSON *connected_advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_advertiser_id");
    if (cJSON_IsNull(connected_advertiser_id)) {
        connected_advertiser_id = NULL;
    }
    if (connected_advertiser_id) { 
    if(!cJSON_IsString(connected_advertiser_id) && !cJSON_IsNull(connected_advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_lba_id
    cJSON *connected_lba_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_lba_id");
    if (cJSON_IsNull(connected_lba_id)) {
        connected_lba_id = NULL;
    }
    if (connected_lba_id) { 
    if(!cJSON_IsString(connected_lba_id) && !cJSON_IsNull(connected_lba_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_merchant_id
    cJSON *connected_merchant_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_merchant_id");
    if (cJSON_IsNull(connected_merchant_id)) {
        connected_merchant_id = NULL;
    }
    if (connected_merchant_id) { 
    if(!cJSON_IsString(connected_merchant_id) && !cJSON_IsNull(connected_merchant_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_tag_id
    cJSON *connected_tag_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_tag_id");
    if (cJSON_IsNull(connected_tag_id)) {
        connected_tag_id = NULL;
    }
    if (connected_tag_id) { 
    if(!cJSON_IsString(connected_tag_id) && !cJSON_IsNull(connected_tag_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->connected_user_id
    cJSON *connected_user_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "connected_user_id");
    if (cJSON_IsNull(connected_user_id)) {
        connected_user_id = NULL;
    }
    if (connected_user_id) { 
    if(!cJSON_IsString(connected_user_id) && !cJSON_IsNull(connected_user_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->created_timestamp
    cJSON *created_timestamp = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "created_timestamp");
    if (cJSON_IsNull(created_timestamp)) {
        created_timestamp = NULL;
    }
    if (created_timestamp) { 
    if(!cJSON_IsNumber(created_timestamp))
    {
    goto end; //Numeric
    }
    created_timestamp_local_var = malloc(sizeof(double));
    if(!created_timestamp_local_var)
    {
        goto end;
    }
    *created_timestamp_local_var = created_timestamp->valuedouble;
    }

    // integration_metadata->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "external_business_id");
    if (cJSON_IsNull(external_business_id)) {
        external_business_id = NULL;
    }
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_metadata->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // integration_metadata->partner_access_token_expiry
    cJSON *partner_access_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_access_token_expiry");
    if (cJSON_IsNull(partner_access_token_expiry)) {
        partner_access_token_expiry = NULL;
    }
    if (partner_access_token_expiry) { 
    if(!cJSON_IsNumber(partner_access_token_expiry))
    {
    goto end; //Numeric
    }
    partner_access_token_expiry_local_var = malloc(sizeof(double));
    if(!partner_access_token_expiry_local_var)
    {
        goto end;
    }
    *partner_access_token_expiry_local_var = partner_access_token_expiry->valuedouble;
    }

    // integration_metadata->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_metadata");
    if (cJSON_IsNull(partner_metadata)) {
        partner_metadata = NULL;
    }
    if (partner_metadata) { 
    if(!cJSON_IsString(partner_metadata) && !cJSON_IsNull(partner_metadata))
    {
    goto end; //String
    }
    }

    // integration_metadata->partner_refresh_token_expiry
    cJSON *partner_refresh_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "partner_refresh_token_expiry");
    if (cJSON_IsNull(partner_refresh_token_expiry)) {
        partner_refresh_token_expiry = NULL;
    }
    if (partner_refresh_token_expiry) { 
    if(!cJSON_IsNumber(partner_refresh_token_expiry))
    {
    goto end; //Numeric
    }
    partner_refresh_token_expiry_local_var = malloc(sizeof(double));
    if(!partner_refresh_token_expiry_local_var)
    {
        goto end;
    }
    *partner_refresh_token_expiry_local_var = partner_refresh_token_expiry->valuedouble;
    }

    // integration_metadata->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "scopes");
    if (cJSON_IsNull(scopes)) {
        scopes = NULL;
    }
    if (scopes) { 
    if(!cJSON_IsString(scopes) && !cJSON_IsNull(scopes))
    {
    goto end; //String
    }
    }

    // integration_metadata->updated_timestamp
    cJSON *updated_timestamp = cJSON_GetObjectItemCaseSensitive(integration_metadataJSON, "updated_timestamp");
    if (cJSON_IsNull(updated_timestamp)) {
        updated_timestamp = NULL;
    }
    if (updated_timestamp) { 
    if(!cJSON_IsNumber(updated_timestamp))
    {
    goto end; //Numeric
    }
    updated_timestamp_local_var = malloc(sizeof(double));
    if(!updated_timestamp_local_var)
    {
        goto end;
    }
    *updated_timestamp_local_var = updated_timestamp->valuedouble;
    }


    if (additional_id_1 && !cJSON_IsNull(additional_id_1)) additional_id_1_local_str = strdup(additional_id_1->valuestring);
    if (connected_advertiser_id && !cJSON_IsNull(connected_advertiser_id)) connected_advertiser_id_local_str = strdup(connected_advertiser_id->valuestring);
    if (connected_lba_id && !cJSON_IsNull(connected_lba_id)) connected_lba_id_local_str = strdup(connected_lba_id->valuestring);
    if (connected_merchant_id && !cJSON_IsNull(connected_merchant_id)) connected_merchant_id_local_str = strdup(connected_merchant_id->valuestring);
    if (connected_tag_id && !cJSON_IsNull(connected_tag_id)) connected_tag_id_local_str = strdup(connected_tag_id->valuestring);
    if (connected_user_id && !cJSON_IsNull(connected_user_id)) connected_user_id_local_str = strdup(connected_user_id->valuestring);
    if (external_business_id && !cJSON_IsNull(external_business_id)) external_business_id_local_str = strdup(external_business_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (partner_metadata && !cJSON_IsNull(partner_metadata)) partner_metadata_local_str = strdup(partner_metadata->valuestring);
    if (scopes && !cJSON_IsNull(scopes)) scopes_local_str = strdup(scopes->valuestring);

    integration_metadata_local_var = integration_metadata_create_internal (
        additional_id_1_local_str,
        connected_advertiser_id_local_str,
        connected_lba_id_local_str,
        connected_merchant_id_local_str,
        connected_tag_id_local_str,
        connected_user_id_local_str,
        created_timestamp_local_var,
        external_business_id_local_str,
        id_local_str,
        partner_access_token_expiry_local_var,
        partner_metadata_local_str,
        partner_refresh_token_expiry_local_var,
        scopes_local_str,
        updated_timestamp_local_var
        );

    if (!integration_metadata_local_var) {
        goto end;
    }

    return integration_metadata_local_var;
end:
    if (additional_id_1_local_str) {
        free(additional_id_1_local_str);
        additional_id_1_local_str = NULL;
    }
    if (connected_advertiser_id_local_str) {
        free(connected_advertiser_id_local_str);
        connected_advertiser_id_local_str = NULL;
    }
    if (connected_lba_id_local_str) {
        free(connected_lba_id_local_str);
        connected_lba_id_local_str = NULL;
    }
    if (connected_merchant_id_local_str) {
        free(connected_merchant_id_local_str);
        connected_merchant_id_local_str = NULL;
    }
    if (connected_tag_id_local_str) {
        free(connected_tag_id_local_str);
        connected_tag_id_local_str = NULL;
    }
    if (connected_user_id_local_str) {
        free(connected_user_id_local_str);
        connected_user_id_local_str = NULL;
    }
    if (created_timestamp_local_var) {
        free(created_timestamp_local_var);
        created_timestamp_local_var = NULL;
    }
    if (external_business_id_local_str) {
        free(external_business_id_local_str);
        external_business_id_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (partner_access_token_expiry_local_var) {
        free(partner_access_token_expiry_local_var);
        partner_access_token_expiry_local_var = NULL;
    }
    if (partner_metadata_local_str) {
        free(partner_metadata_local_str);
        partner_metadata_local_str = NULL;
    }
    if (partner_refresh_token_expiry_local_var) {
        free(partner_refresh_token_expiry_local_var);
        partner_refresh_token_expiry_local_var = NULL;
    }
    if (scopes_local_str) {
        free(scopes_local_str);
        scopes_local_str = NULL;
    }
    if (updated_timestamp_local_var) {
        free(updated_timestamp_local_var);
        updated_timestamp_local_var = NULL;
    }
    return NULL;

}
