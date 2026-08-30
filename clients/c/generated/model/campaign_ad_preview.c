#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview.h"



static campaign_ad_preview_t *campaign_ad_preview_create_internal(
    char *ad_account_id,
    char *ad_group_id,
    int *client_id,
    int *expires_at,
    int *is_active,
    int *pin_id,
    int *pin_promotion_id,
    int *promoted_product_group_id,
    char *url,
    int *user_id,
    char *uuid
    ) {
    campaign_ad_preview_t *campaign_ad_preview_local_var = malloc(sizeof(campaign_ad_preview_t));
    if (!campaign_ad_preview_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_local_var, 0, sizeof(campaign_ad_preview_t));
    campaign_ad_preview_local_var->_library_owned = 1;
    campaign_ad_preview_local_var->ad_account_id = ad_account_id;
    campaign_ad_preview_local_var->ad_group_id = ad_group_id;
    campaign_ad_preview_local_var->client_id = client_id;
    campaign_ad_preview_local_var->expires_at = expires_at;
    campaign_ad_preview_local_var->is_active = is_active;
    campaign_ad_preview_local_var->pin_id = pin_id;
    campaign_ad_preview_local_var->pin_promotion_id = pin_promotion_id;
    campaign_ad_preview_local_var->promoted_product_group_id = promoted_product_group_id;
    campaign_ad_preview_local_var->url = url;
    campaign_ad_preview_local_var->user_id = user_id;
    campaign_ad_preview_local_var->uuid = uuid;
    return campaign_ad_preview_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_t *campaign_ad_preview_create(
    char *ad_account_id,
    char *ad_group_id,
    int *client_id,
    int *expires_at,
    int *is_active,
    int *pin_id,
    int *pin_promotion_id,
    int *promoted_product_group_id,
    char *url,
    int *user_id,
    char *uuid
    ) {
    int *client_id_copy = NULL;
    if (client_id) {
        client_id_copy = malloc(sizeof(int));
        if (client_id_copy) *client_id_copy = *client_id;
    }
    int *expires_at_copy = NULL;
    if (expires_at) {
        expires_at_copy = malloc(sizeof(int));
        if (expires_at_copy) *expires_at_copy = *expires_at;
    }
    int *is_active_copy = NULL;
    if (is_active) {
        is_active_copy = malloc(sizeof(int));
        if (is_active_copy) *is_active_copy = *is_active;
    }
    int *pin_id_copy = NULL;
    if (pin_id) {
        pin_id_copy = malloc(sizeof(int));
        if (pin_id_copy) *pin_id_copy = *pin_id;
    }
    int *pin_promotion_id_copy = NULL;
    if (pin_promotion_id) {
        pin_promotion_id_copy = malloc(sizeof(int));
        if (pin_promotion_id_copy) *pin_promotion_id_copy = *pin_promotion_id;
    }
    int *promoted_product_group_id_copy = NULL;
    if (promoted_product_group_id) {
        promoted_product_group_id_copy = malloc(sizeof(int));
        if (promoted_product_group_id_copy) *promoted_product_group_id_copy = *promoted_product_group_id;
    }
    int *user_id_copy = NULL;
    if (user_id) {
        user_id_copy = malloc(sizeof(int));
        if (user_id_copy) *user_id_copy = *user_id;
    }
    campaign_ad_preview_t *result = campaign_ad_preview_create_internal (
        ad_account_id,
        ad_group_id,
        client_id_copy,
        expires_at_copy,
        is_active_copy,
        pin_id_copy,
        pin_promotion_id_copy,
        promoted_product_group_id_copy,
        url,
        user_id_copy,
        uuid
        );
    if (!result) {
        free(client_id_copy);
        free(expires_at_copy);
        free(is_active_copy);
        free(pin_id_copy);
        free(pin_promotion_id_copy);
        free(promoted_product_group_id_copy);
        free(user_id_copy);
    }
    return result;
}

void campaign_ad_preview_free(campaign_ad_preview_t *campaign_ad_preview) {
    if(NULL == campaign_ad_preview){
        return ;
    }
    if(campaign_ad_preview->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview->ad_account_id) {
        free(campaign_ad_preview->ad_account_id);
        campaign_ad_preview->ad_account_id = NULL;
    }
    if (campaign_ad_preview->ad_group_id) {
        free(campaign_ad_preview->ad_group_id);
        campaign_ad_preview->ad_group_id = NULL;
    }
    if (campaign_ad_preview->client_id) {
        free(campaign_ad_preview->client_id);
        campaign_ad_preview->client_id = NULL;
    }
    if (campaign_ad_preview->expires_at) {
        free(campaign_ad_preview->expires_at);
        campaign_ad_preview->expires_at = NULL;
    }
    if (campaign_ad_preview->is_active) {
        free(campaign_ad_preview->is_active);
        campaign_ad_preview->is_active = NULL;
    }
    if (campaign_ad_preview->pin_id) {
        free(campaign_ad_preview->pin_id);
        campaign_ad_preview->pin_id = NULL;
    }
    if (campaign_ad_preview->pin_promotion_id) {
        free(campaign_ad_preview->pin_promotion_id);
        campaign_ad_preview->pin_promotion_id = NULL;
    }
    if (campaign_ad_preview->promoted_product_group_id) {
        free(campaign_ad_preview->promoted_product_group_id);
        campaign_ad_preview->promoted_product_group_id = NULL;
    }
    if (campaign_ad_preview->url) {
        free(campaign_ad_preview->url);
        campaign_ad_preview->url = NULL;
    }
    if (campaign_ad_preview->user_id) {
        free(campaign_ad_preview->user_id);
        campaign_ad_preview->user_id = NULL;
    }
    if (campaign_ad_preview->uuid) {
        free(campaign_ad_preview->uuid);
        campaign_ad_preview->uuid = NULL;
    }
    free(campaign_ad_preview);
}

cJSON *campaign_ad_preview_convertToJSON(campaign_ad_preview_t *campaign_ad_preview) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview->ad_account_id
    if (!campaign_ad_preview->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_ad_preview->ad_account_id) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview->ad_group_id
    if (!campaign_ad_preview->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", campaign_ad_preview->ad_group_id) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview->client_id
    if(campaign_ad_preview->client_id) {
    if(cJSON_AddNumberToObject(item, "client_id", *campaign_ad_preview->client_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview->expires_at
    if (!campaign_ad_preview->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", *campaign_ad_preview->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview->is_active
    if (!campaign_ad_preview->is_active) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_active", *campaign_ad_preview->is_active) == NULL) {
    goto fail; //Bool
    }


    // campaign_ad_preview->pin_id
    if(campaign_ad_preview->pin_id) {
    if(cJSON_AddNumberToObject(item, "pin_id", *campaign_ad_preview->pin_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview->pin_promotion_id
    if(campaign_ad_preview->pin_promotion_id) {
    if(cJSON_AddNumberToObject(item, "pin_promotion_id", *campaign_ad_preview->pin_promotion_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview->promoted_product_group_id
    if(campaign_ad_preview->promoted_product_group_id) {
    if(cJSON_AddNumberToObject(item, "promoted_product_group_id", *campaign_ad_preview->promoted_product_group_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview->url
    if (!campaign_ad_preview->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", campaign_ad_preview->url) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview->user_id
    if (!campaign_ad_preview->user_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "user_id", *campaign_ad_preview->user_id) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview->uuid
    if (!campaign_ad_preview->uuid) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "uuid", campaign_ad_preview->uuid) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_ad_preview_t *campaign_ad_preview_parseFromJSON(cJSON *campaign_ad_previewJSON){

    campaign_ad_preview_t *campaign_ad_preview_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *ad_group_id_local_str = NULL;

    // define the local variable for campaign_ad_preview->client_id
    int *client_id_local_var = NULL;

    // define the local variable for campaign_ad_preview->expires_at
    int *expires_at_local_var = NULL;

    // define the local variable for campaign_ad_preview->is_active
    int *is_active_local_var = NULL;

    // define the local variable for campaign_ad_preview->pin_id
    int *pin_id_local_var = NULL;

    // define the local variable for campaign_ad_preview->pin_promotion_id
    int *pin_promotion_id_local_var = NULL;

    // define the local variable for campaign_ad_preview->promoted_product_group_id
    int *promoted_product_group_id_local_var = NULL;

    char *url_local_str = NULL;

    // define the local variable for campaign_ad_preview->user_id
    int *user_id_local_var = NULL;

    char *uuid_local_str = NULL;

    // campaign_ad_preview->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // campaign_ad_preview->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // campaign_ad_preview->client_id
    cJSON *client_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "client_id");
    if (cJSON_IsNull(client_id)) {
        client_id = NULL;
    }
    if (client_id) { 
    if(!cJSON_IsNumber(client_id))
    {
    goto end; //Numeric
    }
    client_id_local_var = malloc(sizeof(int));
    if(!client_id_local_var)
    {
        goto end;
    }
    *client_id_local_var = client_id->valuedouble;
    }

    // campaign_ad_preview->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (!expires_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    expires_at_local_var = malloc(sizeof(int));
    if(!expires_at_local_var)
    {
        goto end;
    }
    *expires_at_local_var = expires_at->valuedouble;

    // campaign_ad_preview->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "is_active");
    if (cJSON_IsNull(is_active)) {
        is_active = NULL;
    }
    if (!is_active) {
        goto end;
    }

    
    if(!cJSON_IsBool(is_active))
    {
    goto end; //Bool
    }
    is_active_local_var = malloc(sizeof(int));
    if(!is_active_local_var)
    {
        goto end;
    }
    *is_active_local_var = is_active->valueint;

    // campaign_ad_preview->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsNumber(pin_id))
    {
    goto end; //Numeric
    }
    pin_id_local_var = malloc(sizeof(int));
    if(!pin_id_local_var)
    {
        goto end;
    }
    *pin_id_local_var = pin_id->valuedouble;
    }

    // campaign_ad_preview->pin_promotion_id
    cJSON *pin_promotion_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "pin_promotion_id");
    if (cJSON_IsNull(pin_promotion_id)) {
        pin_promotion_id = NULL;
    }
    if (pin_promotion_id) { 
    if(!cJSON_IsNumber(pin_promotion_id))
    {
    goto end; //Numeric
    }
    pin_promotion_id_local_var = malloc(sizeof(int));
    if(!pin_promotion_id_local_var)
    {
        goto end;
    }
    *pin_promotion_id_local_var = pin_promotion_id->valuedouble;
    }

    // campaign_ad_preview->promoted_product_group_id
    cJSON *promoted_product_group_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "promoted_product_group_id");
    if (cJSON_IsNull(promoted_product_group_id)) {
        promoted_product_group_id = NULL;
    }
    if (promoted_product_group_id) { 
    if(!cJSON_IsNumber(promoted_product_group_id))
    {
    goto end; //Numeric
    }
    promoted_product_group_id_local_var = malloc(sizeof(int));
    if(!promoted_product_group_id_local_var)
    {
        goto end;
    }
    *promoted_product_group_id_local_var = promoted_product_group_id->valuedouble;
    }

    // campaign_ad_preview->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // campaign_ad_preview->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (!user_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(user_id))
    {
    goto end; //Numeric
    }
    user_id_local_var = malloc(sizeof(int));
    if(!user_id_local_var)
    {
        goto end;
    }
    *user_id_local_var = user_id->valuedouble;

    // campaign_ad_preview->uuid
    cJSON *uuid = cJSON_GetObjectItemCaseSensitive(campaign_ad_previewJSON, "uuid");
    if (cJSON_IsNull(uuid)) {
        uuid = NULL;
    }
    if (!uuid) {
        goto end;
    }

    
    if(!cJSON_IsString(uuid))
    {
    goto end; //String
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);
    if (uuid && !cJSON_IsNull(uuid)) uuid_local_str = strdup(uuid->valuestring);

    campaign_ad_preview_local_var = campaign_ad_preview_create_internal (
        ad_account_id_local_str,
        ad_group_id_local_str,
        client_id_local_var,
        expires_at_local_var,
        is_active_local_var,
        pin_id_local_var,
        pin_promotion_id_local_var,
        promoted_product_group_id_local_var,
        url_local_str,
        user_id_local_var,
        uuid_local_str
        );

    if (!campaign_ad_preview_local_var) {
        goto end;
    }

    return campaign_ad_preview_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (client_id_local_var) {
        free(client_id_local_var);
        client_id_local_var = NULL;
    }
    if (expires_at_local_var) {
        free(expires_at_local_var);
        expires_at_local_var = NULL;
    }
    if (is_active_local_var) {
        free(is_active_local_var);
        is_active_local_var = NULL;
    }
    if (pin_id_local_var) {
        free(pin_id_local_var);
        pin_id_local_var = NULL;
    }
    if (pin_promotion_id_local_var) {
        free(pin_promotion_id_local_var);
        pin_promotion_id_local_var = NULL;
    }
    if (promoted_product_group_id_local_var) {
        free(promoted_product_group_id_local_var);
        promoted_product_group_id_local_var = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    if (user_id_local_var) {
        free(user_id_local_var);
        user_id_local_var = NULL;
    }
    if (uuid_local_str) {
        free(uuid_local_str);
        uuid_local_str = NULL;
    }
    return NULL;

}
