#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website_summary.h"



static user_website_summary_t *user_website_summary_create_internal(
    char *status,
    char *verified_at,
    char *website
    ) {
    user_website_summary_t *user_website_summary_local_var = malloc(sizeof(user_website_summary_t));
    if (!user_website_summary_local_var) {
        return NULL;
    }
    user_website_summary_local_var->status = status;
    user_website_summary_local_var->verified_at = verified_at;
    user_website_summary_local_var->website = website;

    user_website_summary_local_var->_library_owned = 1;
    return user_website_summary_local_var;
}

__attribute__((deprecated)) user_website_summary_t *user_website_summary_create(
    char *status,
    char *verified_at,
    char *website
    ) {
    return user_website_summary_create_internal (
        status,
        verified_at,
        website
        );
}

void user_website_summary_free(user_website_summary_t *user_website_summary) {
    if(NULL == user_website_summary){
        return ;
    }
    if(user_website_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_website_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_website_summary->status) {
        free(user_website_summary->status);
        user_website_summary->status = NULL;
    }
    if (user_website_summary->verified_at) {
        free(user_website_summary->verified_at);
        user_website_summary->verified_at = NULL;
    }
    if (user_website_summary->website) {
        free(user_website_summary->website);
        user_website_summary->website = NULL;
    }
    free(user_website_summary);
}

cJSON *user_website_summary_convertToJSON(user_website_summary_t *user_website_summary) {
    cJSON *item = cJSON_CreateObject();

    // user_website_summary->status
    if(user_website_summary->status) {
    if(cJSON_AddStringToObject(item, "status", user_website_summary->status) == NULL) {
    goto fail; //String
    }
    }


    // user_website_summary->verified_at
    if(user_website_summary->verified_at) {
    if(cJSON_AddStringToObject(item, "verified_at", user_website_summary->verified_at) == NULL) {
    goto fail; //String
    }
    }


    // user_website_summary->website
    if(user_website_summary->website) {
    if(cJSON_AddStringToObject(item, "website", user_website_summary->website) == NULL) {
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

user_website_summary_t *user_website_summary_parseFromJSON(cJSON *user_website_summaryJSON){

    user_website_summary_t *user_website_summary_local_var = NULL;

    // user_website_summary->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(user_website_summaryJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // user_website_summary->verified_at
    cJSON *verified_at = cJSON_GetObjectItemCaseSensitive(user_website_summaryJSON, "verified_at");
    if (cJSON_IsNull(verified_at)) {
        verified_at = NULL;
    }
    if (verified_at) { 
    if(!cJSON_IsString(verified_at) && !cJSON_IsNull(verified_at))
    {
    goto end; //String
    }
    }

    // user_website_summary->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(user_website_summaryJSON, "website");
    if (cJSON_IsNull(website)) {
        website = NULL;
    }
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }


    user_website_summary_local_var = user_website_summary_create_internal (
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        verified_at && !cJSON_IsNull(verified_at) ? strdup(verified_at->valuestring) : NULL,
        website && !cJSON_IsNull(website) ? strdup(website->valuestring) : NULL
        );

    return user_website_summary_local_var;
end:
    return NULL;

}
