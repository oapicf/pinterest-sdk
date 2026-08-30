#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "interest.h"



static interest_t *interest_create_internal(
    char *canonical_url,
    char *id,
    char *key,
    char *name
    ) {
    interest_t *interest_local_var = malloc(sizeof(interest_t));
    if (!interest_local_var) {
        return NULL;
    }
    memset(interest_local_var, 0, sizeof(interest_t));
    interest_local_var->_library_owned = 1;
    interest_local_var->canonical_url = canonical_url;
    interest_local_var->id = id;
    interest_local_var->key = key;
    interest_local_var->name = name;
    return interest_local_var;
}

__attribute__((deprecated)) interest_t *interest_create(
    char *canonical_url,
    char *id,
    char *key,
    char *name
    ) {
    interest_t *result = interest_create_internal (
        canonical_url,
        id,
        key,
        name
        );
    if (!result) {
    }
    return result;
}

void interest_free(interest_t *interest) {
    if(NULL == interest){
        return ;
    }
    if(interest->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "interest_free");
        return ;
    }
    listEntry_t *listEntry;
    if (interest->canonical_url) {
        free(interest->canonical_url);
        interest->canonical_url = NULL;
    }
    if (interest->id) {
        free(interest->id);
        interest->id = NULL;
    }
    if (interest->key) {
        free(interest->key);
        interest->key = NULL;
    }
    if (interest->name) {
        free(interest->name);
        interest->name = NULL;
    }
    free(interest);
}

cJSON *interest_convertToJSON(interest_t *interest) {
    cJSON *item = cJSON_CreateObject();

    // interest->canonical_url
    if(interest->canonical_url) {
    if(cJSON_AddStringToObject(item, "canonical_url", interest->canonical_url) == NULL) {
    goto fail; //String
    }
    }


    // interest->id
    if(interest->id) {
    if(cJSON_AddStringToObject(item, "id", interest->id) == NULL) {
    goto fail; //String
    }
    }


    // interest->key
    if(interest->key) {
    if(cJSON_AddStringToObject(item, "key", interest->key) == NULL) {
    goto fail; //String
    }
    }


    // interest->name
    if(interest->name) {
    if(cJSON_AddStringToObject(item, "name", interest->name) == NULL) {
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

interest_t *interest_parseFromJSON(cJSON *interestJSON){

    interest_t *interest_local_var = NULL;

    char *canonical_url_local_str = NULL;

    char *id_local_str = NULL;

    char *key_local_str = NULL;

    char *name_local_str = NULL;

    // interest->canonical_url
    cJSON *canonical_url = cJSON_GetObjectItemCaseSensitive(interestJSON, "canonical_url");
    if (cJSON_IsNull(canonical_url)) {
        canonical_url = NULL;
    }
    if (canonical_url) { 
    if(!cJSON_IsString(canonical_url) && !cJSON_IsNull(canonical_url))
    {
    goto end; //String
    }
    }

    // interest->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(interestJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // interest->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(interestJSON, "key");
    if (cJSON_IsNull(key)) {
        key = NULL;
    }
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // interest->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(interestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (canonical_url && !cJSON_IsNull(canonical_url)) canonical_url_local_str = strdup(canonical_url->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (key && !cJSON_IsNull(key)) key_local_str = strdup(key->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    interest_local_var = interest_create_internal (
        canonical_url_local_str,
        id_local_str,
        key_local_str,
        name_local_str
        );

    if (!interest_local_var) {
        goto end;
    }

    return interest_local_var;
end:
    if (canonical_url_local_str) {
        free(canonical_url_local_str);
        canonical_url_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (key_local_str) {
        free(key_local_str);
        key_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
