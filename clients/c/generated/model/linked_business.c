#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "linked_business.h"



static linked_business_t *linked_business_create_internal(
    char *image_large_url,
    char *image_medium_url,
    char *image_small_url,
    char *image_xlarge_url,
    char *username
    ) {
    linked_business_t *linked_business_local_var = malloc(sizeof(linked_business_t));
    if (!linked_business_local_var) {
        return NULL;
    }
    memset(linked_business_local_var, 0, sizeof(linked_business_t));
    linked_business_local_var->_library_owned = 1;
    linked_business_local_var->image_large_url = image_large_url;
    linked_business_local_var->image_medium_url = image_medium_url;
    linked_business_local_var->image_small_url = image_small_url;
    linked_business_local_var->image_xlarge_url = image_xlarge_url;
    linked_business_local_var->username = username;
    return linked_business_local_var;
}

__attribute__((deprecated)) linked_business_t *linked_business_create(
    char *image_large_url,
    char *image_medium_url,
    char *image_small_url,
    char *image_xlarge_url,
    char *username
    ) {
    linked_business_t *result = linked_business_create_internal (
        image_large_url,
        image_medium_url,
        image_small_url,
        image_xlarge_url,
        username
        );
    if (!result) {
    }
    return result;
}

void linked_business_free(linked_business_t *linked_business) {
    if(NULL == linked_business){
        return ;
    }
    if(linked_business->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "linked_business_free");
        return ;
    }
    listEntry_t *listEntry;
    if (linked_business->image_large_url) {
        free(linked_business->image_large_url);
        linked_business->image_large_url = NULL;
    }
    if (linked_business->image_medium_url) {
        free(linked_business->image_medium_url);
        linked_business->image_medium_url = NULL;
    }
    if (linked_business->image_small_url) {
        free(linked_business->image_small_url);
        linked_business->image_small_url = NULL;
    }
    if (linked_business->image_xlarge_url) {
        free(linked_business->image_xlarge_url);
        linked_business->image_xlarge_url = NULL;
    }
    if (linked_business->username) {
        free(linked_business->username);
        linked_business->username = NULL;
    }
    free(linked_business);
}

cJSON *linked_business_convertToJSON(linked_business_t *linked_business) {
    cJSON *item = cJSON_CreateObject();

    // linked_business->image_large_url
    if(linked_business->image_large_url) {
    if(cJSON_AddStringToObject(item, "image_large_url", linked_business->image_large_url) == NULL) {
    goto fail; //String
    }
    }


    // linked_business->image_medium_url
    if(linked_business->image_medium_url) {
    if(cJSON_AddStringToObject(item, "image_medium_url", linked_business->image_medium_url) == NULL) {
    goto fail; //String
    }
    }


    // linked_business->image_small_url
    if(linked_business->image_small_url) {
    if(cJSON_AddStringToObject(item, "image_small_url", linked_business->image_small_url) == NULL) {
    goto fail; //String
    }
    }


    // linked_business->image_xlarge_url
    if(linked_business->image_xlarge_url) {
    if(cJSON_AddStringToObject(item, "image_xlarge_url", linked_business->image_xlarge_url) == NULL) {
    goto fail; //String
    }
    }


    // linked_business->username
    if(linked_business->username) {
    if(cJSON_AddStringToObject(item, "username", linked_business->username) == NULL) {
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

linked_business_t *linked_business_parseFromJSON(cJSON *linked_businessJSON){

    linked_business_t *linked_business_local_var = NULL;

    char *image_large_url_local_str = NULL;

    char *image_medium_url_local_str = NULL;

    char *image_small_url_local_str = NULL;

    char *image_xlarge_url_local_str = NULL;

    char *username_local_str = NULL;

    // linked_business->image_large_url
    cJSON *image_large_url = cJSON_GetObjectItemCaseSensitive(linked_businessJSON, "image_large_url");
    if (cJSON_IsNull(image_large_url)) {
        image_large_url = NULL;
    }
    if (image_large_url) { 
    if(!cJSON_IsString(image_large_url) && !cJSON_IsNull(image_large_url))
    {
    goto end; //String
    }
    }

    // linked_business->image_medium_url
    cJSON *image_medium_url = cJSON_GetObjectItemCaseSensitive(linked_businessJSON, "image_medium_url");
    if (cJSON_IsNull(image_medium_url)) {
        image_medium_url = NULL;
    }
    if (image_medium_url) { 
    if(!cJSON_IsString(image_medium_url) && !cJSON_IsNull(image_medium_url))
    {
    goto end; //String
    }
    }

    // linked_business->image_small_url
    cJSON *image_small_url = cJSON_GetObjectItemCaseSensitive(linked_businessJSON, "image_small_url");
    if (cJSON_IsNull(image_small_url)) {
        image_small_url = NULL;
    }
    if (image_small_url) { 
    if(!cJSON_IsString(image_small_url) && !cJSON_IsNull(image_small_url))
    {
    goto end; //String
    }
    }

    // linked_business->image_xlarge_url
    cJSON *image_xlarge_url = cJSON_GetObjectItemCaseSensitive(linked_businessJSON, "image_xlarge_url");
    if (cJSON_IsNull(image_xlarge_url)) {
        image_xlarge_url = NULL;
    }
    if (image_xlarge_url) { 
    if(!cJSON_IsString(image_xlarge_url) && !cJSON_IsNull(image_xlarge_url))
    {
    goto end; //String
    }
    }

    // linked_business->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(linked_businessJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    if (image_large_url && !cJSON_IsNull(image_large_url)) image_large_url_local_str = strdup(image_large_url->valuestring);
    if (image_medium_url && !cJSON_IsNull(image_medium_url)) image_medium_url_local_str = strdup(image_medium_url->valuestring);
    if (image_small_url && !cJSON_IsNull(image_small_url)) image_small_url_local_str = strdup(image_small_url->valuestring);
    if (image_xlarge_url && !cJSON_IsNull(image_xlarge_url)) image_xlarge_url_local_str = strdup(image_xlarge_url->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);

    linked_business_local_var = linked_business_create_internal (
        image_large_url_local_str,
        image_medium_url_local_str,
        image_small_url_local_str,
        image_xlarge_url_local_str,
        username_local_str
        );

    if (!linked_business_local_var) {
        goto end;
    }

    return linked_business_local_var;
end:
    if (image_large_url_local_str) {
        free(image_large_url_local_str);
        image_large_url_local_str = NULL;
    }
    if (image_medium_url_local_str) {
        free(image_medium_url_local_str);
        image_medium_url_local_str = NULL;
    }
    if (image_small_url_local_str) {
        free(image_small_url_local_str);
        image_small_url_local_str = NULL;
    }
    if (image_xlarge_url_local_str) {
        free(image_xlarge_url_local_str);
        image_xlarge_url_local_str = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    return NULL;

}
