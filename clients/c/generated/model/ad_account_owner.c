#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_owner.h"



static ad_account_owner_t *ad_account_owner_create_internal(
    char *id,
    char *username
    ) {
    ad_account_owner_t *ad_account_owner_local_var = malloc(sizeof(ad_account_owner_t));
    if (!ad_account_owner_local_var) {
        return NULL;
    }
    ad_account_owner_local_var->id = id;
    ad_account_owner_local_var->username = username;

    ad_account_owner_local_var->_library_owned = 1;
    return ad_account_owner_local_var;
}

__attribute__((deprecated)) ad_account_owner_t *ad_account_owner_create(
    char *id,
    char *username
    ) {
    return ad_account_owner_create_internal (
        id,
        username
        );
}

void ad_account_owner_free(ad_account_owner_t *ad_account_owner) {
    if(NULL == ad_account_owner){
        return ;
    }
    if(ad_account_owner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_owner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_owner->id) {
        free(ad_account_owner->id);
        ad_account_owner->id = NULL;
    }
    if (ad_account_owner->username) {
        free(ad_account_owner->username);
        ad_account_owner->username = NULL;
    }
    free(ad_account_owner);
}

cJSON *ad_account_owner_convertToJSON(ad_account_owner_t *ad_account_owner) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_owner->id
    if(ad_account_owner->id) {
    if(cJSON_AddStringToObject(item, "id", ad_account_owner->id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_owner->username
    if(ad_account_owner->username) {
    if(cJSON_AddStringToObject(item, "username", ad_account_owner->username) == NULL) {
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

ad_account_owner_t *ad_account_owner_parseFromJSON(cJSON *ad_account_ownerJSON){

    ad_account_owner_t *ad_account_owner_local_var = NULL;

    // ad_account_owner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_account_ownerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ad_account_owner->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(ad_account_ownerJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    ad_account_owner_local_var = ad_account_owner_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL
        );

    return ad_account_owner_local_var;
end:
    return NULL;

}
