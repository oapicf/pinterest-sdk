#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_owner.h"



ad_account_owner_t *ad_account_owner_create(
    char *username
    ) {
    ad_account_owner_t *ad_account_owner_local_var = malloc(sizeof(ad_account_owner_t));
    if (!ad_account_owner_local_var) {
        return NULL;
    }
    ad_account_owner_local_var->username = username;

    return ad_account_owner_local_var;
}


void ad_account_owner_free(ad_account_owner_t *ad_account_owner) {
    if(NULL == ad_account_owner){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_owner->username) {
        free(ad_account_owner->username);
        ad_account_owner->username = NULL;
    }
    free(ad_account_owner);
}

cJSON *ad_account_owner_convertToJSON(ad_account_owner_t *ad_account_owner) {
    cJSON *item = cJSON_CreateObject();

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

    // ad_account_owner->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(ad_account_ownerJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }
    }


    ad_account_owner_local_var = ad_account_owner_create (
        username ? strdup(username->valuestring) : NULL
        );

    return ad_account_owner_local_var;
end:
    return NULL;

}
