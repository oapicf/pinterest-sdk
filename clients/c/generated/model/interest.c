#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "interest.h"



interest_t *interest_create(
    char *canonical_url,
    char *id,
    char *key,
    char *name
    ) {
    interest_t *interest_local_var = malloc(sizeof(interest_t));
    if (!interest_local_var) {
        return NULL;
    }
    interest_local_var->canonical_url = canonical_url;
    interest_local_var->id = id;
    interest_local_var->key = key;
    interest_local_var->name = name;

    return interest_local_var;
}


void interest_free(interest_t *interest) {
    if(NULL == interest){
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

    // interest->canonical_url
    cJSON *canonical_url = cJSON_GetObjectItemCaseSensitive(interestJSON, "canonical_url");
    if (canonical_url) { 
    if(!cJSON_IsString(canonical_url) && !cJSON_IsNull(canonical_url))
    {
    goto end; //String
    }
    }

    // interest->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(interestJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // interest->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(interestJSON, "key");
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // interest->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(interestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    interest_local_var = interest_create (
        canonical_url && !cJSON_IsNull(canonical_url) ? strdup(canonical_url->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        key && !cJSON_IsNull(key) ? strdup(key->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return interest_local_var;
end:
    return NULL;

}
