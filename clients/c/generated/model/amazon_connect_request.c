#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "amazon_connect_request.h"



static amazon_connect_request_t *amazon_connect_request_create_internal(
    char *amazon_storefront_id,
    char *amazon_storefront_name,
    char *amazon_storefront_url,
    char *amazon_user_id,
    int is_amazon_account_linked,
    char *one_time_passcode,
    char *pinterest_user_id
    ) {
    amazon_connect_request_t *amazon_connect_request_local_var = malloc(sizeof(amazon_connect_request_t));
    if (!amazon_connect_request_local_var) {
        return NULL;
    }
    amazon_connect_request_local_var->amazon_storefront_id = amazon_storefront_id;
    amazon_connect_request_local_var->amazon_storefront_name = amazon_storefront_name;
    amazon_connect_request_local_var->amazon_storefront_url = amazon_storefront_url;
    amazon_connect_request_local_var->amazon_user_id = amazon_user_id;
    amazon_connect_request_local_var->is_amazon_account_linked = is_amazon_account_linked;
    amazon_connect_request_local_var->one_time_passcode = one_time_passcode;
    amazon_connect_request_local_var->pinterest_user_id = pinterest_user_id;

    amazon_connect_request_local_var->_library_owned = 1;
    return amazon_connect_request_local_var;
}

__attribute__((deprecated)) amazon_connect_request_t *amazon_connect_request_create(
    char *amazon_storefront_id,
    char *amazon_storefront_name,
    char *amazon_storefront_url,
    char *amazon_user_id,
    int is_amazon_account_linked,
    char *one_time_passcode,
    char *pinterest_user_id
    ) {
    return amazon_connect_request_create_internal (
        amazon_storefront_id,
        amazon_storefront_name,
        amazon_storefront_url,
        amazon_user_id,
        is_amazon_account_linked,
        one_time_passcode,
        pinterest_user_id
        );
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
    if(cJSON_AddBoolToObject(item, "is_amazon_account_linked", amazon_connect_request->is_amazon_account_linked) == NULL) {
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


    amazon_connect_request_local_var = amazon_connect_request_create_internal (
        amazon_storefront_id && !cJSON_IsNull(amazon_storefront_id) ? strdup(amazon_storefront_id->valuestring) : NULL,
        strdup(amazon_storefront_name->valuestring),
        strdup(amazon_storefront_url->valuestring),
        amazon_user_id && !cJSON_IsNull(amazon_user_id) ? strdup(amazon_user_id->valuestring) : NULL,
        is_amazon_account_linked->valueint,
        one_time_passcode && !cJSON_IsNull(one_time_passcode) ? strdup(one_time_passcode->valuestring) : NULL,
        pinterest_user_id && !cJSON_IsNull(pinterest_user_id) ? strdup(pinterest_user_id->valuestring) : NULL
        );

    return amazon_connect_request_local_var;
end:
    return NULL;

}
