#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_subscription_create.h"



static lead_subscription_create_t *lead_subscription_create_create_internal(
    char *lead_form_id,
    char *webhook_url
    ) {
    lead_subscription_create_t *lead_subscription_create_local_var = malloc(sizeof(lead_subscription_create_t));
    if (!lead_subscription_create_local_var) {
        return NULL;
    }
    memset(lead_subscription_create_local_var, 0, sizeof(lead_subscription_create_t));
    lead_subscription_create_local_var->_library_owned = 1;
    lead_subscription_create_local_var->lead_form_id = lead_form_id;
    lead_subscription_create_local_var->webhook_url = webhook_url;
    return lead_subscription_create_local_var;
}

__attribute__((deprecated)) lead_subscription_create_t *lead_subscription_create_create(
    char *lead_form_id,
    char *webhook_url
    ) {
    lead_subscription_create_t *result = lead_subscription_create_create_internal (
        lead_form_id,
        webhook_url
        );
    if (!result) {
    }
    return result;
}

void lead_subscription_create_free(lead_subscription_create_t *lead_subscription_create) {
    if(NULL == lead_subscription_create){
        return ;
    }
    if(lead_subscription_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_subscription_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_subscription_create->lead_form_id) {
        free(lead_subscription_create->lead_form_id);
        lead_subscription_create->lead_form_id = NULL;
    }
    if (lead_subscription_create->webhook_url) {
        free(lead_subscription_create->webhook_url);
        lead_subscription_create->webhook_url = NULL;
    }
    free(lead_subscription_create);
}

cJSON *lead_subscription_create_convertToJSON(lead_subscription_create_t *lead_subscription_create) {
    cJSON *item = cJSON_CreateObject();

    // lead_subscription_create->lead_form_id
    if(lead_subscription_create->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", lead_subscription_create->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_subscription_create->webhook_url
    if (!lead_subscription_create->webhook_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "webhook_url", lead_subscription_create->webhook_url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

lead_subscription_create_t *lead_subscription_create_parseFromJSON(cJSON *lead_subscription_createJSON){

    lead_subscription_create_t *lead_subscription_create_local_var = NULL;

    char *lead_form_id_local_str = NULL;

    char *webhook_url_local_str = NULL;

    // lead_subscription_create->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(lead_subscription_createJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // lead_subscription_create->webhook_url
    cJSON *webhook_url = cJSON_GetObjectItemCaseSensitive(lead_subscription_createJSON, "webhook_url");
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


    if (lead_form_id && !cJSON_IsNull(lead_form_id)) lead_form_id_local_str = strdup(lead_form_id->valuestring);
    if (webhook_url && !cJSON_IsNull(webhook_url)) webhook_url_local_str = strdup(webhook_url->valuestring);

    lead_subscription_create_local_var = lead_subscription_create_create_internal (
        lead_form_id_local_str,
        webhook_url_local_str
        );

    if (!lead_subscription_create_local_var) {
        goto end;
    }

    return lead_subscription_create_local_var;
end:
    if (lead_form_id_local_str) {
        free(lead_form_id_local_str);
        lead_form_id_local_str = NULL;
    }
    if (webhook_url_local_str) {
        free(webhook_url_local_str);
        webhook_url_local_str = NULL;
    }
    return NULL;

}
