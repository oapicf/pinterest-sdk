#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_access_user_summary.h"



business_access_user_summary_t *business_access_user_summary_create(
    char *email,
    char *id,
    char *username
    ) {
    business_access_user_summary_t *business_access_user_summary_local_var = malloc(sizeof(business_access_user_summary_t));
    if (!business_access_user_summary_local_var) {
        return NULL;
    }
    business_access_user_summary_local_var->email = email;
    business_access_user_summary_local_var->id = id;
    business_access_user_summary_local_var->username = username;

    return business_access_user_summary_local_var;
}


void business_access_user_summary_free(business_access_user_summary_t *business_access_user_summary) {
    if(NULL == business_access_user_summary){
        return ;
    }
    listEntry_t *listEntry;
    if (business_access_user_summary->email) {
        free(business_access_user_summary->email);
        business_access_user_summary->email = NULL;
    }
    if (business_access_user_summary->id) {
        free(business_access_user_summary->id);
        business_access_user_summary->id = NULL;
    }
    if (business_access_user_summary->username) {
        free(business_access_user_summary->username);
        business_access_user_summary->username = NULL;
    }
    free(business_access_user_summary);
}

cJSON *business_access_user_summary_convertToJSON(business_access_user_summary_t *business_access_user_summary) {
    cJSON *item = cJSON_CreateObject();

    // business_access_user_summary->email
    if(business_access_user_summary->email) {
    if(cJSON_AddStringToObject(item, "email", business_access_user_summary->email) == NULL) {
    goto fail; //String
    }
    }


    // business_access_user_summary->id
    if(business_access_user_summary->id) {
    if(cJSON_AddStringToObject(item, "id", business_access_user_summary->id) == NULL) {
    goto fail; //String
    }
    }


    // business_access_user_summary->username
    if(business_access_user_summary->username) {
    if(cJSON_AddStringToObject(item, "username", business_access_user_summary->username) == NULL) {
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

business_access_user_summary_t *business_access_user_summary_parseFromJSON(cJSON *business_access_user_summaryJSON){

    business_access_user_summary_t *business_access_user_summary_local_var = NULL;

    // business_access_user_summary->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(business_access_user_summaryJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email) && !cJSON_IsNull(email))
    {
    goto end; //String
    }
    }

    // business_access_user_summary->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(business_access_user_summaryJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // business_access_user_summary->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(business_access_user_summaryJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    business_access_user_summary_local_var = business_access_user_summary_create (
        email && !cJSON_IsNull(email) ? strdup(email->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL
        );

    return business_access_user_summary_local_var;
end:
    return NULL;

}
