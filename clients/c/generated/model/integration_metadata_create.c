#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_metadata_create.h"



static integration_metadata_create_t *integration_metadata_create_create_internal(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *external_business_id,
    char *partner_access_token,
    double *partner_access_token_expiry,
    char *partner_metadata,
    char *partner_primary_email,
    char *partner_refresh_token,
    double *partner_refresh_token_expiry,
    char *scopes
    ) {
    integration_metadata_create_t *integration_metadata_create_local_var = malloc(sizeof(integration_metadata_create_t));
    if (!integration_metadata_create_local_var) {
        return NULL;
    }
    memset(integration_metadata_create_local_var, 0, sizeof(integration_metadata_create_t));
    integration_metadata_create_local_var->_library_owned = 1;
    integration_metadata_create_local_var->additional_id_1 = additional_id_1;
    integration_metadata_create_local_var->connected_advertiser_id = connected_advertiser_id;
    integration_metadata_create_local_var->connected_lba_id = connected_lba_id;
    integration_metadata_create_local_var->connected_merchant_id = connected_merchant_id;
    integration_metadata_create_local_var->connected_tag_id = connected_tag_id;
    integration_metadata_create_local_var->external_business_id = external_business_id;
    integration_metadata_create_local_var->partner_access_token = partner_access_token;
    integration_metadata_create_local_var->partner_access_token_expiry = partner_access_token_expiry;
    integration_metadata_create_local_var->partner_metadata = partner_metadata;
    integration_metadata_create_local_var->partner_primary_email = partner_primary_email;
    integration_metadata_create_local_var->partner_refresh_token = partner_refresh_token;
    integration_metadata_create_local_var->partner_refresh_token_expiry = partner_refresh_token_expiry;
    integration_metadata_create_local_var->scopes = scopes;
    return integration_metadata_create_local_var;
}

__attribute__((deprecated)) integration_metadata_create_t *integration_metadata_create_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *external_business_id,
    char *partner_access_token,
    double *partner_access_token_expiry,
    char *partner_metadata,
    char *partner_primary_email,
    char *partner_refresh_token,
    double *partner_refresh_token_expiry,
    char *scopes
    ) {
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
    integration_metadata_create_t *result = integration_metadata_create_create_internal (
        additional_id_1,
        connected_advertiser_id,
        connected_lba_id,
        connected_merchant_id,
        connected_tag_id,
        external_business_id,
        partner_access_token,
        partner_access_token_expiry_copy,
        partner_metadata,
        partner_primary_email,
        partner_refresh_token,
        partner_refresh_token_expiry_copy,
        scopes
        );
    if (!result) {
        free(partner_access_token_expiry_copy);
        free(partner_refresh_token_expiry_copy);
    }
    return result;
}

void integration_metadata_create_free(integration_metadata_create_t *integration_metadata_create) {
    if(NULL == integration_metadata_create){
        return ;
    }
    if(integration_metadata_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_metadata_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_metadata_create->additional_id_1) {
        free(integration_metadata_create->additional_id_1);
        integration_metadata_create->additional_id_1 = NULL;
    }
    if (integration_metadata_create->connected_advertiser_id) {
        free(integration_metadata_create->connected_advertiser_id);
        integration_metadata_create->connected_advertiser_id = NULL;
    }
    if (integration_metadata_create->connected_lba_id) {
        free(integration_metadata_create->connected_lba_id);
        integration_metadata_create->connected_lba_id = NULL;
    }
    if (integration_metadata_create->connected_merchant_id) {
        free(integration_metadata_create->connected_merchant_id);
        integration_metadata_create->connected_merchant_id = NULL;
    }
    if (integration_metadata_create->connected_tag_id) {
        free(integration_metadata_create->connected_tag_id);
        integration_metadata_create->connected_tag_id = NULL;
    }
    if (integration_metadata_create->external_business_id) {
        free(integration_metadata_create->external_business_id);
        integration_metadata_create->external_business_id = NULL;
    }
    if (integration_metadata_create->partner_access_token) {
        free(integration_metadata_create->partner_access_token);
        integration_metadata_create->partner_access_token = NULL;
    }
    if (integration_metadata_create->partner_access_token_expiry) {
        free(integration_metadata_create->partner_access_token_expiry);
        integration_metadata_create->partner_access_token_expiry = NULL;
    }
    if (integration_metadata_create->partner_metadata) {
        free(integration_metadata_create->partner_metadata);
        integration_metadata_create->partner_metadata = NULL;
    }
    if (integration_metadata_create->partner_primary_email) {
        free(integration_metadata_create->partner_primary_email);
        integration_metadata_create->partner_primary_email = NULL;
    }
    if (integration_metadata_create->partner_refresh_token) {
        free(integration_metadata_create->partner_refresh_token);
        integration_metadata_create->partner_refresh_token = NULL;
    }
    if (integration_metadata_create->partner_refresh_token_expiry) {
        free(integration_metadata_create->partner_refresh_token_expiry);
        integration_metadata_create->partner_refresh_token_expiry = NULL;
    }
    if (integration_metadata_create->scopes) {
        free(integration_metadata_create->scopes);
        integration_metadata_create->scopes = NULL;
    }
    free(integration_metadata_create);
}

cJSON *integration_metadata_create_convertToJSON(integration_metadata_create_t *integration_metadata_create) {
    cJSON *item = cJSON_CreateObject();

    // integration_metadata_create->additional_id_1
    if(integration_metadata_create->additional_id_1) {
    if(cJSON_AddStringToObject(item, "additional_id_1", integration_metadata_create->additional_id_1) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->connected_advertiser_id
    if(integration_metadata_create->connected_advertiser_id) {
    if(cJSON_AddStringToObject(item, "connected_advertiser_id", integration_metadata_create->connected_advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->connected_lba_id
    if(integration_metadata_create->connected_lba_id) {
    if(cJSON_AddStringToObject(item, "connected_lba_id", integration_metadata_create->connected_lba_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->connected_merchant_id
    if(integration_metadata_create->connected_merchant_id) {
    if(cJSON_AddStringToObject(item, "connected_merchant_id", integration_metadata_create->connected_merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->connected_tag_id
    if(integration_metadata_create->connected_tag_id) {
    if(cJSON_AddStringToObject(item, "connected_tag_id", integration_metadata_create->connected_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->external_business_id
    if(integration_metadata_create->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_metadata_create->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->partner_access_token
    if(integration_metadata_create->partner_access_token) {
    if(cJSON_AddStringToObject(item, "partner_access_token", integration_metadata_create->partner_access_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->partner_access_token_expiry
    if(integration_metadata_create->partner_access_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_access_token_expiry", *integration_metadata_create->partner_access_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata_create->partner_metadata
    if(integration_metadata_create->partner_metadata) {
    if(cJSON_AddStringToObject(item, "partner_metadata", integration_metadata_create->partner_metadata) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->partner_primary_email
    if(integration_metadata_create->partner_primary_email) {
    if(cJSON_AddStringToObject(item, "partner_primary_email", integration_metadata_create->partner_primary_email) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->partner_refresh_token
    if(integration_metadata_create->partner_refresh_token) {
    if(cJSON_AddStringToObject(item, "partner_refresh_token", integration_metadata_create->partner_refresh_token) == NULL) {
    goto fail; //String
    }
    }


    // integration_metadata_create->partner_refresh_token_expiry
    if(integration_metadata_create->partner_refresh_token_expiry) {
    if(cJSON_AddNumberToObject(item, "partner_refresh_token_expiry", *integration_metadata_create->partner_refresh_token_expiry) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_metadata_create->scopes
    if(integration_metadata_create->scopes) {
    if(cJSON_AddStringToObject(item, "scopes", integration_metadata_create->scopes) == NULL) {
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

integration_metadata_create_t *integration_metadata_create_parseFromJSON(cJSON *integration_metadata_createJSON){

    integration_metadata_create_t *integration_metadata_create_local_var = NULL;

    char *additional_id_1_local_str = NULL;

    char *connected_advertiser_id_local_str = NULL;

    char *connected_lba_id_local_str = NULL;

    char *connected_merchant_id_local_str = NULL;

    char *connected_tag_id_local_str = NULL;

    char *external_business_id_local_str = NULL;

    char *partner_access_token_local_str = NULL;

    // define the local variable for integration_metadata_create->partner_access_token_expiry
    double *partner_access_token_expiry_local_var = NULL;

    char *partner_metadata_local_str = NULL;

    char *partner_primary_email_local_str = NULL;

    char *partner_refresh_token_local_str = NULL;

    // define the local variable for integration_metadata_create->partner_refresh_token_expiry
    double *partner_refresh_token_expiry_local_var = NULL;

    char *scopes_local_str = NULL;

    // integration_metadata_create->additional_id_1
    cJSON *additional_id_1 = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "additional_id_1");
    if (cJSON_IsNull(additional_id_1)) {
        additional_id_1 = NULL;
    }
    if (additional_id_1) { 
    if(!cJSON_IsString(additional_id_1) && !cJSON_IsNull(additional_id_1))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->connected_advertiser_id
    cJSON *connected_advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "connected_advertiser_id");
    if (cJSON_IsNull(connected_advertiser_id)) {
        connected_advertiser_id = NULL;
    }
    if (connected_advertiser_id) { 
    if(!cJSON_IsString(connected_advertiser_id) && !cJSON_IsNull(connected_advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->connected_lba_id
    cJSON *connected_lba_id = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "connected_lba_id");
    if (cJSON_IsNull(connected_lba_id)) {
        connected_lba_id = NULL;
    }
    if (connected_lba_id) { 
    if(!cJSON_IsString(connected_lba_id) && !cJSON_IsNull(connected_lba_id))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->connected_merchant_id
    cJSON *connected_merchant_id = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "connected_merchant_id");
    if (cJSON_IsNull(connected_merchant_id)) {
        connected_merchant_id = NULL;
    }
    if (connected_merchant_id) { 
    if(!cJSON_IsString(connected_merchant_id) && !cJSON_IsNull(connected_merchant_id))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->connected_tag_id
    cJSON *connected_tag_id = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "connected_tag_id");
    if (cJSON_IsNull(connected_tag_id)) {
        connected_tag_id = NULL;
    }
    if (connected_tag_id) { 
    if(!cJSON_IsString(connected_tag_id) && !cJSON_IsNull(connected_tag_id))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "external_business_id");
    if (cJSON_IsNull(external_business_id)) {
        external_business_id = NULL;
    }
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->partner_access_token
    cJSON *partner_access_token = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_access_token");
    if (cJSON_IsNull(partner_access_token)) {
        partner_access_token = NULL;
    }
    if (partner_access_token) { 
    if(!cJSON_IsString(partner_access_token) && !cJSON_IsNull(partner_access_token))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->partner_access_token_expiry
    cJSON *partner_access_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_access_token_expiry");
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

    // integration_metadata_create->partner_metadata
    cJSON *partner_metadata = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_metadata");
    if (cJSON_IsNull(partner_metadata)) {
        partner_metadata = NULL;
    }
    if (partner_metadata) { 
    if(!cJSON_IsString(partner_metadata) && !cJSON_IsNull(partner_metadata))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->partner_primary_email
    cJSON *partner_primary_email = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_primary_email");
    if (cJSON_IsNull(partner_primary_email)) {
        partner_primary_email = NULL;
    }
    if (partner_primary_email) { 
    if(!cJSON_IsString(partner_primary_email) && !cJSON_IsNull(partner_primary_email))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->partner_refresh_token
    cJSON *partner_refresh_token = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_refresh_token");
    if (cJSON_IsNull(partner_refresh_token)) {
        partner_refresh_token = NULL;
    }
    if (partner_refresh_token) { 
    if(!cJSON_IsString(partner_refresh_token) && !cJSON_IsNull(partner_refresh_token))
    {
    goto end; //String
    }
    }

    // integration_metadata_create->partner_refresh_token_expiry
    cJSON *partner_refresh_token_expiry = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "partner_refresh_token_expiry");
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

    // integration_metadata_create->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(integration_metadata_createJSON, "scopes");
    if (cJSON_IsNull(scopes)) {
        scopes = NULL;
    }
    if (scopes) { 
    if(!cJSON_IsString(scopes) && !cJSON_IsNull(scopes))
    {
    goto end; //String
    }
    }


    if (additional_id_1 && !cJSON_IsNull(additional_id_1)) additional_id_1_local_str = strdup(additional_id_1->valuestring);
    if (connected_advertiser_id && !cJSON_IsNull(connected_advertiser_id)) connected_advertiser_id_local_str = strdup(connected_advertiser_id->valuestring);
    if (connected_lba_id && !cJSON_IsNull(connected_lba_id)) connected_lba_id_local_str = strdup(connected_lba_id->valuestring);
    if (connected_merchant_id && !cJSON_IsNull(connected_merchant_id)) connected_merchant_id_local_str = strdup(connected_merchant_id->valuestring);
    if (connected_tag_id && !cJSON_IsNull(connected_tag_id)) connected_tag_id_local_str = strdup(connected_tag_id->valuestring);
    if (external_business_id && !cJSON_IsNull(external_business_id)) external_business_id_local_str = strdup(external_business_id->valuestring);
    if (partner_access_token && !cJSON_IsNull(partner_access_token)) partner_access_token_local_str = strdup(partner_access_token->valuestring);
    if (partner_metadata && !cJSON_IsNull(partner_metadata)) partner_metadata_local_str = strdup(partner_metadata->valuestring);
    if (partner_primary_email && !cJSON_IsNull(partner_primary_email)) partner_primary_email_local_str = strdup(partner_primary_email->valuestring);
    if (partner_refresh_token && !cJSON_IsNull(partner_refresh_token)) partner_refresh_token_local_str = strdup(partner_refresh_token->valuestring);
    if (scopes && !cJSON_IsNull(scopes)) scopes_local_str = strdup(scopes->valuestring);

    integration_metadata_create_local_var = integration_metadata_create_create_internal (
        additional_id_1_local_str,
        connected_advertiser_id_local_str,
        connected_lba_id_local_str,
        connected_merchant_id_local_str,
        connected_tag_id_local_str,
        external_business_id_local_str,
        partner_access_token_local_str,
        partner_access_token_expiry_local_var,
        partner_metadata_local_str,
        partner_primary_email_local_str,
        partner_refresh_token_local_str,
        partner_refresh_token_expiry_local_var,
        scopes_local_str
        );

    if (!integration_metadata_create_local_var) {
        goto end;
    }

    return integration_metadata_create_local_var;
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
    if (external_business_id_local_str) {
        free(external_business_id_local_str);
        external_business_id_local_str = NULL;
    }
    if (partner_access_token_local_str) {
        free(partner_access_token_local_str);
        partner_access_token_local_str = NULL;
    }
    if (partner_access_token_expiry_local_var) {
        free(partner_access_token_expiry_local_var);
        partner_access_token_expiry_local_var = NULL;
    }
    if (partner_metadata_local_str) {
        free(partner_metadata_local_str);
        partner_metadata_local_str = NULL;
    }
    if (partner_primary_email_local_str) {
        free(partner_primary_email_local_str);
        partner_primary_email_local_str = NULL;
    }
    if (partner_refresh_token_local_str) {
        free(partner_refresh_token_local_str);
        partner_refresh_token_local_str = NULL;
    }
    if (partner_refresh_token_expiry_local_var) {
        free(partner_refresh_token_expiry_local_var);
        partner_refresh_token_expiry_local_var = NULL;
    }
    if (scopes_local_str) {
        free(scopes_local_str);
        scopes_local_str = NULL;
    }
    return NULL;

}
