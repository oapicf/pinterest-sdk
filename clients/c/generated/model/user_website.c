#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website.h"



static user_website_t *user_website_create_internal(
    char *status,
    char *verified_at,
    char *website
    ) {
    user_website_t *user_website_local_var = malloc(sizeof(user_website_t));
    if (!user_website_local_var) {
        return NULL;
    }
    memset(user_website_local_var, 0, sizeof(user_website_t));
    user_website_local_var->_library_owned = 1;
    user_website_local_var->status = status;
    user_website_local_var->verified_at = verified_at;
    user_website_local_var->website = website;
    return user_website_local_var;
}

__attribute__((deprecated)) user_website_t *user_website_create(
    char *status,
    char *verified_at,
    char *website
    ) {
    user_website_t *result = user_website_create_internal (
        status,
        verified_at,
        website
        );
    if (!result) {
    }
    return result;
}

void user_website_free(user_website_t *user_website) {
    if(NULL == user_website){
        return ;
    }
    if(user_website->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_website_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_website->status) {
        free(user_website->status);
        user_website->status = NULL;
    }
    if (user_website->verified_at) {
        free(user_website->verified_at);
        user_website->verified_at = NULL;
    }
    if (user_website->website) {
        free(user_website->website);
        user_website->website = NULL;
    }
    free(user_website);
}

cJSON *user_website_convertToJSON(user_website_t *user_website) {
    cJSON *item = cJSON_CreateObject();

    // user_website->status
    if(user_website->status) {
    if(cJSON_AddStringToObject(item, "status", user_website->status) == NULL) {
    goto fail; //String
    }
    }


    // user_website->verified_at
    if(user_website->verified_at) {
    if(cJSON_AddStringToObject(item, "verified_at", user_website->verified_at) == NULL) {
    goto fail; //String
    }
    }


    // user_website->website
    if(user_website->website) {
    if(cJSON_AddStringToObject(item, "website", user_website->website) == NULL) {
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

user_website_t *user_website_parseFromJSON(cJSON *user_websiteJSON){

    user_website_t *user_website_local_var = NULL;

    char *status_local_str = NULL;

    char *verified_at_local_str = NULL;

    char *website_local_str = NULL;

    // user_website->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(user_websiteJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // user_website->verified_at
    cJSON *verified_at = cJSON_GetObjectItemCaseSensitive(user_websiteJSON, "verified_at");
    if (cJSON_IsNull(verified_at)) {
        verified_at = NULL;
    }
    if (verified_at) { 
    if(!cJSON_IsString(verified_at) && !cJSON_IsNull(verified_at))
    {
    goto end; //String
    }
    }

    // user_website->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(user_websiteJSON, "website");
    if (cJSON_IsNull(website)) {
        website = NULL;
    }
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }


    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);
    if (verified_at && !cJSON_IsNull(verified_at)) verified_at_local_str = strdup(verified_at->valuestring);
    if (website && !cJSON_IsNull(website)) website_local_str = strdup(website->valuestring);

    user_website_local_var = user_website_create_internal (
        status_local_str,
        verified_at_local_str,
        website_local_str
        );

    if (!user_website_local_var) {
        goto end;
    }

    return user_website_local_var;
end:
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    if (verified_at_local_str) {
        free(verified_at_local_str);
        verified_at_local_str = NULL;
    }
    if (website_local_str) {
        free(website_local_str);
        website_local_str = NULL;
    }
    return NULL;

}
