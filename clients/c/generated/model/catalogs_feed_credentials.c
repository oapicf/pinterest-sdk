#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_credentials.h"



static catalogs_feed_credentials_t *catalogs_feed_credentials_create_internal(
    char *password,
    char *username
    ) {
    catalogs_feed_credentials_t *catalogs_feed_credentials_local_var = malloc(sizeof(catalogs_feed_credentials_t));
    if (!catalogs_feed_credentials_local_var) {
        return NULL;
    }
    memset(catalogs_feed_credentials_local_var, 0, sizeof(catalogs_feed_credentials_t));
    catalogs_feed_credentials_local_var->_library_owned = 1;
    catalogs_feed_credentials_local_var->password = password;
    catalogs_feed_credentials_local_var->username = username;
    return catalogs_feed_credentials_local_var;
}

__attribute__((deprecated)) catalogs_feed_credentials_t *catalogs_feed_credentials_create(
    char *password,
    char *username
    ) {
    catalogs_feed_credentials_t *result = catalogs_feed_credentials_create_internal (
        password,
        username
        );
    if (!result) {
    }
    return result;
}

void catalogs_feed_credentials_free(catalogs_feed_credentials_t *catalogs_feed_credentials) {
    if(NULL == catalogs_feed_credentials){
        return ;
    }
    if(catalogs_feed_credentials->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_credentials_free");
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

    char *password_local_str = NULL;

    char *username_local_str = NULL;

    // catalogs_feed_credentials->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(catalogs_feed_credentialsJSON, "password");
    if (cJSON_IsNull(password)) {
        password = NULL;
    }
    if (!password) {
        goto end;
    }

    
    if(!cJSON_IsString(password))
    {
    goto end; //String
    }

    // catalogs_feed_credentials->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(catalogs_feed_credentialsJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (!username) {
        goto end;
    }

    
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }


    if (password && !cJSON_IsNull(password)) password_local_str = strdup(password->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);

    catalogs_feed_credentials_local_var = catalogs_feed_credentials_create_internal (
        password_local_str,
        username_local_str
        );

    if (!catalogs_feed_credentials_local_var) {
        goto end;
    }

    return catalogs_feed_credentials_local_var;
end:
    if (password_local_str) {
        free(password_local_str);
        password_local_str = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    return NULL;

}
