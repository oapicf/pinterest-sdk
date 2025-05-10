#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_request.h"



static ad_account_create_request_t *ad_account_create_request_create_internal(
    pinterest_rest_api_country__e country,
    char *name,
    char *owner_user_id
    ) {
    ad_account_create_request_t *ad_account_create_request_local_var = malloc(sizeof(ad_account_create_request_t));
    if (!ad_account_create_request_local_var) {
        return NULL;
    }
    ad_account_create_request_local_var->country = country;
    ad_account_create_request_local_var->name = name;
    ad_account_create_request_local_var->owner_user_id = owner_user_id;

    ad_account_create_request_local_var->_library_owned = 1;
    return ad_account_create_request_local_var;
}

__attribute__((deprecated)) ad_account_create_request_t *ad_account_create_request_create(
    pinterest_rest_api_country__e country,
    char *name,
    char *owner_user_id
    ) {
    return ad_account_create_request_create_internal (
        country,
        name,
        owner_user_id
        );
}

void ad_account_create_request_free(ad_account_create_request_t *ad_account_create_request) {
    if(NULL == ad_account_create_request){
        return ;
    }
    if(ad_account_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_request->name) {
        free(ad_account_create_request->name);
        ad_account_create_request->name = NULL;
    }
    if (ad_account_create_request->owner_user_id) {
        free(ad_account_create_request->owner_user_id);
        ad_account_create_request->owner_user_id = NULL;
    }
    free(ad_account_create_request);
}

cJSON *ad_account_create_request_convertToJSON(ad_account_create_request_t *ad_account_create_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_request->country
    if(ad_account_create_request->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(ad_account_create_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account_create_request->name
    if(ad_account_create_request->name) {
    if(cJSON_AddStringToObject(item, "name", ad_account_create_request->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_request->owner_user_id
    if(ad_account_create_request->owner_user_id) {
    if(cJSON_AddStringToObject(item, "owner_user_id", ad_account_create_request->owner_user_id) == NULL) {
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

ad_account_create_request_t *ad_account_create_request_parseFromJSON(cJSON *ad_account_create_requestJSON){

    ad_account_create_request_t *ad_account_create_request_local_var = NULL;

    // define the local variable for ad_account_create_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // ad_account_create_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // ad_account_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_account_create_request->owner_user_id
    cJSON *owner_user_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "owner_user_id");
    if (cJSON_IsNull(owner_user_id)) {
        owner_user_id = NULL;
    }
    if (owner_user_id) { 
    if(!cJSON_IsString(owner_user_id) && !cJSON_IsNull(owner_user_id))
    {
    goto end; //String
    }
    }


    ad_account_create_request_local_var = ad_account_create_request_create_internal (
        country ? country_local_nonprim : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        owner_user_id && !cJSON_IsNull(owner_user_id) ? strdup(owner_user_id->valuestring) : NULL
        );

    return ad_account_create_request_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    return NULL;

}
