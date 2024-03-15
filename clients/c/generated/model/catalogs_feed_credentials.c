#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_credentials.h"



catalogs_feed_credentials_t *catalogs_feed_credentials_create(
    char *password,
    char *username
    ) {
    catalogs_feed_credentials_t *catalogs_feed_credentials_local_var = malloc(sizeof(catalogs_feed_credentials_t));
    if (!catalogs_feed_credentials_local_var) {
        return NULL;
    }
    catalogs_feed_credentials_local_var->password = password;
    catalogs_feed_credentials_local_var->username = username;

    return catalogs_feed_credentials_local_var;
}


void catalogs_feed_credentials_free(catalogs_feed_credentials_t *catalogs_feed_credentials) {
    if(NULL == catalogs_feed_credentials){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_credentials->password) {
        free(catalogs_feed_credentials->password);
        catalogs_feed_credentials->password = NULL;
    }
    if (catalogs_feed_credentials->username) {
        free(catalogs_feed_credentials->username);
        catalogs_feed_credentials->username = NULL;
    }
    free(catalogs_feed_credentials);
}

cJSON *catalogs_feed_credentials_convertToJSON(catalogs_feed_credentials_t *catalogs_feed_credentials) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_credentials->password
    if (!catalogs_feed_credentials->password) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "password", catalogs_feed_credentials->password) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_credentials->username
    if (!catalogs_feed_credentials->username) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "username", catalogs_feed_credentials->username) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_credentials_t *catalogs_feed_credentials_parseFromJSON(cJSON *catalogs_feed_credentialsJSON){

    catalogs_feed_credentials_t *catalogs_feed_credentials_local_var = NULL;

    // catalogs_feed_credentials->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(catalogs_feed_credentialsJSON, "password");
    if (!password) {
        goto end;
    }

    
    if(!cJSON_IsString(password))
    {
    goto end; //String
    }

    // catalogs_feed_credentials->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(catalogs_feed_credentialsJSON, "username");
    if (!username) {
        goto end;
    }

    
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }


    catalogs_feed_credentials_local_var = catalogs_feed_credentials_create (
        strdup(password->valuestring),
        strdup(username->valuestring)
        );

    return catalogs_feed_credentials_local_var;
end:
    return NULL;

}
