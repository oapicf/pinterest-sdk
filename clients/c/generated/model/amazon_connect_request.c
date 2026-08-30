#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "amazon_connect_request.h"



static amazon_connect_request_t *amazon_connect_request_create_internal(
    char *amazon_storefront_id,
    char *amazon_storefront_name,
    char *amazon_storefront_url,
    char *amazon_user_id,
    int *is_amazon_account_linked,
    char *one_time_passcode,
    char *pinterest_user_id
    ) {
    amazon_connect_request_t *amazon_connect_request_local_var = malloc(sizeof(amazon_connect_request_t));
    if (!amazon_connect_request_local_var) {
        return NULL;
    }
    memset(amazon_connect_request_local_var, 0, sizeof(amazon_connect_request_t));
    amazon_connect_request_local_var->_library_owned = 1;
    amazon_connect_request_local_var->amazon_storefront_id = amazon_storefront_id;
    amazon_connect_request_local_var->amazon_storefront_name = amazon_storefront_name;
    amazon_connect_request_local_var->amazon_storefront_url = amazon_storefront_url;
    amazon_connect_request_local_var->amazon_user_id = amazon_user_id;
    amazon_connect_request_local_var->is_amazon_account_linked = is_amazon_account_linked;
    amazon_connect_request_local_var->one_time_passcode = one_time_passcode;
    amazon_connect_request_local_var->pinterest_user_id = pinterest_user_id;
    return amazon_connect_request_local_var;
}

__attribute__((deprecated)) amazon_connect_request_t *amazon_connect_request_create(
    char *amazon_storefront_id,
    char *amazon_storefront_name,
    char *amazon_storefront_url,
    char *amazon_user_id,
    int *is_amazon_account_linked,
    char *one_time_passcode,
    char *pinterest_user_id
    ) {
    int *is_amazon_account_linked_copy = NULL;
    if (is_amazon_account_linked) {
        is_amazon_account_linked_copy = malloc(sizeof(int));
        if (is_amazon_account_linked_copy) *is_amazon_account_linked_copy = *is_amazon_account_linked;
    }
    amazon_connect_request_t *result = amazon_connect_request_create_internal (
        amazon_storefront_id,
        amazon_storefront_name,
        amazon_storefront_url,
        amazon_user_id,
        is_amazon_account_linked_copy,
        one_time_passcode,
        pinterest_user_id
        );
    if (!result) {
        free(is_amazon_account_linked_copy);
    }
    return result;
}

void amazon_connect_request_free(amazon_connect_request_t *amazon_connect_request) {
    if(NULL == amazon_connect_request){
        return ;
    }
    if(amazon_connect_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "amazon_connect_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (amazon_connect_request->amazon_storefront_id) {
        free(amazon_connect_request->amazon_storefront_id);
        amazon_connect_request->amazon_storefront_id = NULL;
    }
    if (amazon_connect_request->amazon_storefront_name) {
        free(amazon_connect_request->amazon_storefront_name);
        amazon_connect_request->amazon_storefront_name = NULL;
    }
    if (amazon_connect_request->amazon_storefront_url) {
        free(amazon_connect_request->amazon_storefront_url);
        amazon_connect_request->amazon_storefront_url = NULL;
    }
    if (amazon_connect_request->amazon_user_id) {
        free(amazon_connect_request->amazon_user_id);
        amazon_connect_request->amazon_user_id = NULL;
    }
    if (amazon_connect_request->is_amazon_account_linked) {
        free(amazon_connect_request->is_amazon_account_linked);
        amazon_connect_request->is_amazon_account_linked = NULL;
    }
    if (amazon_connect_request->one_time_passcode) {
        free(amazon_connect_request->one_time_passcode);
        amazon_connect_request->one_time_passcode = NULL;
    }
    if (amazon_connect_request->pinterest_user_id) {
        free(amazon_connect_request->pinterest_user_id);
        amazon_connect_request->pinterest_user_id = NULL;
    }
    free(amazon_connect_request);
}

cJSON *amazon_connect_request_convertToJSON(amazon_connect_request_t *amazon_connect_request) {
    cJSON *item = cJSON_CreateObject();

    // amazon_connect_request->amazon_storefront_id
    if(amazon_connect_request->amazon_storefront_id) {
    if(cJSON_AddStringToObject(item, "amazon_storefront_id", amazon_connect_request->amazon_storefront_id) == NULL) {
    goto fail; //String
    }
    }


    // amazon_connect_request->amazon_storefront_name
    if (!amazon_connect_request->amazon_storefront_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "amazon_storefront_name", amazon_connect_request->amazon_storefront_name) == NULL) {
    goto fail; //String
    }


    // amazon_connect_request->amazon_storefront_url
    if (!amazon_connect_request->amazon_storefront_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "amazon_storefront_url", amazon_connect_request->amazon_storefront_url) == NULL) {
    goto fail; //String
    }


    // amazon_connect_request->amazon_user_id
    if(amazon_connect_request->amazon_user_id) {
    if(cJSON_AddStringToObject(item, "amazon_user_id", amazon_connect_request->amazon_user_id) == NULL) {
    goto fail; //String
    }
    }


    // amazon_connect_request->is_amazon_account_linked
    if (!amazon_connect_request->is_amazon_account_linked) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_amazon_account_linked", *amazon_connect_request->is_amazon_account_linked) == NULL) {
    goto fail; //Bool
    }


    // amazon_connect_request->one_time_passcode
    if(amazon_connect_request->one_time_passcode) {
    if(cJSON_AddStringToObject(item, "one_time_passcode", amazon_connect_request->one_time_passcode) == NULL) {
    goto fail; //String
    }
    }


    // amazon_connect_request->pinterest_user_id
    if(amazon_connect_request->pinterest_user_id) {
    if(cJSON_AddStringToObject(item, "pinterest_user_id", amazon_connect_request->pinterest_user_id) == NULL) {
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

amazon_connect_request_t *amazon_connect_request_parseFromJSON(cJSON *amazon_connect_requestJSON){

    amazon_connect_request_t *amazon_connect_request_local_var = NULL;

    char *amazon_storefront_id_local_str = NULL;

    char *amazon_storefront_name_local_str = NULL;

    char *amazon_storefront_url_local_str = NULL;

    char *amazon_user_id_local_str = NULL;

    // define the local variable for amazon_connect_request->is_amazon_account_linked
    int *is_amazon_account_linked_local_var = NULL;

    char *one_time_passcode_local_str = NULL;

    char *pinterest_user_id_local_str = NULL;

    // amazon_connect_request->amazon_storefront_id
    cJSON *amazon_storefront_id = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "amazon_storefront_id");
    if (cJSON_IsNull(amazon_storefront_id)) {
        amazon_storefront_id = NULL;
    }
    if (amazon_storefront_id) { 
    if(!cJSON_IsString(amazon_storefront_id) && !cJSON_IsNull(amazon_storefront_id))
    {
    goto end; //String
    }
    }

    // amazon_connect_request->amazon_storefront_name
    cJSON *amazon_storefront_name = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "amazon_storefront_name");
    if (cJSON_IsNull(amazon_storefront_name)) {
        amazon_storefront_name = NULL;
    }
    if (!amazon_storefront_name) {
        goto end;
    }

    
    if(!cJSON_IsString(amazon_storefront_name))
    {
    goto end; //String
    }

    // amazon_connect_request->amazon_storefront_url
    cJSON *amazon_storefront_url = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "amazon_storefront_url");
    if (cJSON_IsNull(amazon_storefront_url)) {
        amazon_storefront_url = NULL;
    }
    if (!amazon_storefront_url) {
        goto end;
    }

    
    if(!cJSON_IsString(amazon_storefront_url))
    {
    goto end; //String
    }

    // amazon_connect_request->amazon_user_id
    cJSON *amazon_user_id = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "amazon_user_id");
    if (cJSON_IsNull(amazon_user_id)) {
        amazon_user_id = NULL;
    }
    if (amazon_user_id) { 
    if(!cJSON_IsString(amazon_user_id) && !cJSON_IsNull(amazon_user_id))
    {
    goto end; //String
    }
    }

    // amazon_connect_request->is_amazon_account_linked
    cJSON *is_amazon_account_linked = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "is_amazon_account_linked");
    if (cJSON_IsNull(is_amazon_account_linked)) {
        is_amazon_account_linked = NULL;
    }
    if (!is_amazon_account_linked) {
        goto end;
    }

    
    if(!cJSON_IsBool(is_amazon_account_linked))
    {
    goto end; //Bool
    }
    is_amazon_account_linked_local_var = malloc(sizeof(int));
    if(!is_amazon_account_linked_local_var)
    {
        goto end;
    }
    *is_amazon_account_linked_local_var = is_amazon_account_linked->valueint;

    // amazon_connect_request->one_time_passcode
    cJSON *one_time_passcode = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "one_time_passcode");
    if (cJSON_IsNull(one_time_passcode)) {
        one_time_passcode = NULL;
    }
    if (one_time_passcode) { 
    if(!cJSON_IsString(one_time_passcode) && !cJSON_IsNull(one_time_passcode))
    {
    goto end; //String
    }
    }

    // amazon_connect_request->pinterest_user_id
    cJSON *pinterest_user_id = cJSON_GetObjectItemCaseSensitive(amazon_connect_requestJSON, "pinterest_user_id");
    if (cJSON_IsNull(pinterest_user_id)) {
        pinterest_user_id = NULL;
    }
    if (pinterest_user_id) { 
    if(!cJSON_IsString(pinterest_user_id) && !cJSON_IsNull(pinterest_user_id))
    {
    goto end; //String
    }
    }


    if (amazon_storefront_id && !cJSON_IsNull(amazon_storefront_id)) amazon_storefront_id_local_str = strdup(amazon_storefront_id->valuestring);
    if (amazon_storefront_name && !cJSON_IsNull(amazon_storefront_name)) amazon_storefront_name_local_str = strdup(amazon_storefront_name->valuestring);
    if (amazon_storefront_url && !cJSON_IsNull(amazon_storefront_url)) amazon_storefront_url_local_str = strdup(amazon_storefront_url->valuestring);
    if (amazon_user_id && !cJSON_IsNull(amazon_user_id)) amazon_user_id_local_str = strdup(amazon_user_id->valuestring);
    if (one_time_passcode && !cJSON_IsNull(one_time_passcode)) one_time_passcode_local_str = strdup(one_time_passcode->valuestring);
    if (pinterest_user_id && !cJSON_IsNull(pinterest_user_id)) pinterest_user_id_local_str = strdup(pinterest_user_id->valuestring);

    amazon_connect_request_local_var = amazon_connect_request_create_internal (
        amazon_storefront_id_local_str,
        amazon_storefront_name_local_str,
        amazon_storefront_url_local_str,
        amazon_user_id_local_str,
        is_amazon_account_linked_local_var,
        one_time_passcode_local_str,
        pinterest_user_id_local_str
        );

    if (!amazon_connect_request_local_var) {
        goto end;
    }

    return amazon_connect_request_local_var;
end:
    if (amazon_storefront_id_local_str) {
        free(amazon_storefront_id_local_str);
        amazon_storefront_id_local_str = NULL;
    }
    if (amazon_storefront_name_local_str) {
        free(amazon_storefront_name_local_str);
        amazon_storefront_name_local_str = NULL;
    }
    if (amazon_storefront_url_local_str) {
        free(amazon_storefront_url_local_str);
        amazon_storefront_url_local_str = NULL;
    }
    if (amazon_user_id_local_str) {
        free(amazon_user_id_local_str);
        amazon_user_id_local_str = NULL;
    }
    if (is_amazon_account_linked_local_var) {
        free(is_amazon_account_linked_local_var);
        is_amazon_account_linked_local_var = NULL;
    }
    if (one_time_passcode_local_str) {
        free(one_time_passcode_local_str);
        one_time_passcode_local_str = NULL;
    }
    if (pinterest_user_id_local_str) {
        free(pinterest_user_id_local_str);
        pinterest_user_id_local_str = NULL;
    }
    return NULL;

}
