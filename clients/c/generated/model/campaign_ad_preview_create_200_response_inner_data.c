#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview_create_200_response_inner_data.h"



static campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_create_internal(
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
    char *uuid,
    pinterest_lib_error_t *exceptions
    ) {
    campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_local_var = malloc(sizeof(campaign_ad_preview_create_200_response_inner_data_t));
    if (!campaign_ad_preview_create_200_response_inner_data_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_create_200_response_inner_data_local_var, 0, sizeof(campaign_ad_preview_create_200_response_inner_data_t));
    campaign_ad_preview_create_200_response_inner_data_local_var->_library_owned = 1;
    campaign_ad_preview_create_200_response_inner_data_local_var->ad_account_id = ad_account_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->ad_group_id = ad_group_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->client_id = client_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->expires_at = expires_at;
    campaign_ad_preview_create_200_response_inner_data_local_var->is_active = is_active;
    campaign_ad_preview_create_200_response_inner_data_local_var->pin_id = pin_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->pin_promotion_id = pin_promotion_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->promoted_product_group_id = promoted_product_group_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->url = url;
    campaign_ad_preview_create_200_response_inner_data_local_var->user_id = user_id;
    campaign_ad_preview_create_200_response_inner_data_local_var->uuid = uuid;
    campaign_ad_preview_create_200_response_inner_data_local_var->exceptions = exceptions;
    return campaign_ad_preview_create_200_response_inner_data_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_create(
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
    char *uuid,
    pinterest_lib_error_t *exceptions
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
    campaign_ad_preview_create_200_response_inner_data_t *result = campaign_ad_preview_create_200_response_inner_data_create_internal (
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
        uuid,
        exceptions
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

void campaign_ad_preview_create_200_response_inner_data_free(campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data) {
    if(NULL == campaign_ad_preview_create_200_response_inner_data){
        return ;
    }
    if(campaign_ad_preview_create_200_response_inner_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_create_200_response_inner_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview_create_200_response_inner_data->ad_account_id) {
        free(campaign_ad_preview_create_200_response_inner_data->ad_account_id);
        campaign_ad_preview_create_200_response_inner_data->ad_account_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->ad_group_id) {
        free(campaign_ad_preview_create_200_response_inner_data->ad_group_id);
        campaign_ad_preview_create_200_response_inner_data->ad_group_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->client_id) {
        free(campaign_ad_preview_create_200_response_inner_data->client_id);
        campaign_ad_preview_create_200_response_inner_data->client_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->expires_at) {
        free(campaign_ad_preview_create_200_response_inner_data->expires_at);
        campaign_ad_preview_create_200_response_inner_data->expires_at = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->is_active) {
        free(campaign_ad_preview_create_200_response_inner_data->is_active);
        campaign_ad_preview_create_200_response_inner_data->is_active = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->pin_id) {
        free(campaign_ad_preview_create_200_response_inner_data->pin_id);
        campaign_ad_preview_create_200_response_inner_data->pin_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->pin_promotion_id) {
        free(campaign_ad_preview_create_200_response_inner_data->pin_promotion_id);
        campaign_ad_preview_create_200_response_inner_data->pin_promotion_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id) {
        free(campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id);
        campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->url) {
        free(campaign_ad_preview_create_200_response_inner_data->url);
        campaign_ad_preview_create_200_response_inner_data->url = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->user_id) {
        free(campaign_ad_preview_create_200_response_inner_data->user_id);
        campaign_ad_preview_create_200_response_inner_data->user_id = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->uuid) {
        free(campaign_ad_preview_create_200_response_inner_data->uuid);
        campaign_ad_preview_create_200_response_inner_data->uuid = NULL;
    }
    if (campaign_ad_preview_create_200_response_inner_data->exceptions) {
        pinterest_lib_error_free(campaign_ad_preview_create_200_response_inner_data->exceptions);
        campaign_ad_preview_create_200_response_inner_data->exceptions = NULL;
    }
    free(campaign_ad_preview_create_200_response_inner_data);
}

cJSON *campaign_ad_preview_create_200_response_inner_data_convertToJSON(campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview_create_200_response_inner_data->ad_account_id
    if (!campaign_ad_preview_create_200_response_inner_data->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_ad_preview_create_200_response_inner_data->ad_account_id) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview_create_200_response_inner_data->ad_group_id
    if (!campaign_ad_preview_create_200_response_inner_data->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", campaign_ad_preview_create_200_response_inner_data->ad_group_id) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview_create_200_response_inner_data->client_id
    if(campaign_ad_preview_create_200_response_inner_data->client_id) {
    if(cJSON_AddNumberToObject(item, "client_id", *campaign_ad_preview_create_200_response_inner_data->client_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview_create_200_response_inner_data->expires_at
    if (!campaign_ad_preview_create_200_response_inner_data->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", *campaign_ad_preview_create_200_response_inner_data->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview_create_200_response_inner_data->is_active
    if (!campaign_ad_preview_create_200_response_inner_data->is_active) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_active", *campaign_ad_preview_create_200_response_inner_data->is_active) == NULL) {
    goto fail; //Bool
    }


    // campaign_ad_preview_create_200_response_inner_data->pin_id
    if(campaign_ad_preview_create_200_response_inner_data->pin_id) {
    if(cJSON_AddNumberToObject(item, "pin_id", *campaign_ad_preview_create_200_response_inner_data->pin_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview_create_200_response_inner_data->pin_promotion_id
    if(campaign_ad_preview_create_200_response_inner_data->pin_promotion_id) {
    if(cJSON_AddNumberToObject(item, "pin_promotion_id", *campaign_ad_preview_create_200_response_inner_data->pin_promotion_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id
    if(campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id) {
    if(cJSON_AddNumberToObject(item, "promoted_product_group_id", *campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_ad_preview_create_200_response_inner_data->url
    if (!campaign_ad_preview_create_200_response_inner_data->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", campaign_ad_preview_create_200_response_inner_data->url) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview_create_200_response_inner_data->user_id
    if (!campaign_ad_preview_create_200_response_inner_data->user_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "user_id", *campaign_ad_preview_create_200_response_inner_data->user_id) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview_create_200_response_inner_data->uuid
    if (!campaign_ad_preview_create_200_response_inner_data->uuid) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "uuid", campaign_ad_preview_create_200_response_inner_data->uuid) == NULL) {
    goto fail; //String
    }


    // campaign_ad_preview_create_200_response_inner_data->exceptions
    if (!campaign_ad_preview_create_200_response_inner_data->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(campaign_ad_preview_create_200_response_inner_data->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_inner_dataJSON){

    campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *ad_group_id_local_str = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->client_id
    int *client_id_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->expires_at
    int *expires_at_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->is_active
    int *is_active_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->pin_id
    int *pin_id_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->pin_promotion_id
    int *pin_promotion_id_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id
    int *promoted_product_group_id_local_var = NULL;

    char *url_local_str = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->user_id
    int *user_id_local_var = NULL;

    char *uuid_local_str = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner_data->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // campaign_ad_preview_create_200_response_inner_data->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "ad_account_id");
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

    // campaign_ad_preview_create_200_response_inner_data->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "ad_group_id");
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

    // campaign_ad_preview_create_200_response_inner_data->client_id
    cJSON *client_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "client_id");
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

    // campaign_ad_preview_create_200_response_inner_data->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "expires_at");
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

    // campaign_ad_preview_create_200_response_inner_data->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "is_active");
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

    // campaign_ad_preview_create_200_response_inner_data->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "pin_id");
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

    // campaign_ad_preview_create_200_response_inner_data->pin_promotion_id
    cJSON *pin_promotion_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "pin_promotion_id");
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

    // campaign_ad_preview_create_200_response_inner_data->promoted_product_group_id
    cJSON *promoted_product_group_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "promoted_product_group_id");
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

    // campaign_ad_preview_create_200_response_inner_data->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "url");
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

    // campaign_ad_preview_create_200_response_inner_data->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "user_id");
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

    // campaign_ad_preview_create_200_response_inner_data->uuid
    cJSON *uuid = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "uuid");
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

    // campaign_ad_preview_create_200_response_inner_data->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_inner_dataJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);
    if (uuid && !cJSON_IsNull(uuid)) uuid_local_str = strdup(uuid->valuestring);

    campaign_ad_preview_create_200_response_inner_data_local_var = campaign_ad_preview_create_200_response_inner_data_create_internal (
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
        uuid_local_str,
        exceptions_local_nonprim
        );

    if (!campaign_ad_preview_create_200_response_inner_data_local_var) {
        goto end;
    }

    return campaign_ad_preview_create_200_response_inner_data_local_var;
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
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
