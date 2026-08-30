#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website_create.h"



static user_website_create_t *user_website_create_create_internal(
    website_verification_method_t *verification_method,
    char *website
    ) {
    user_website_create_t *user_website_create_local_var = malloc(sizeof(user_website_create_t));
    if (!user_website_create_local_var) {
        return NULL;
    }
    memset(user_website_create_local_var, 0, sizeof(user_website_create_t));
    user_website_create_local_var->_library_owned = 1;
    user_website_create_local_var->verification_method = verification_method;
    user_website_create_local_var->website = website;
    return user_website_create_local_var;
}

__attribute__((deprecated)) user_website_create_t *user_website_create_create(
    website_verification_method_t *verification_method,
    char *website
    ) {
    user_website_create_t *result = user_website_create_create_internal (
        verification_method,
        website
        );
    if (!result) {
    }
    return result;
}

void user_website_create_free(user_website_create_t *user_website_create) {
    if(NULL == user_website_create){
        return ;
    }
    if(user_website_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_website_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_website_create->verification_method) {
        website_verification_method_free(user_website_create->verification_method);
        user_website_create->verification_method = NULL;
    }
    if (user_website_create->website) {
        free(user_website_create->website);
        user_website_create->website = NULL;
    }
    free(user_website_create);
}

cJSON *user_website_create_convertToJSON(user_website_create_t *user_website_create) {
    cJSON *item = cJSON_CreateObject();

    // user_website_create->verification_method
    if(user_website_create->verification_method) {
    cJSON *verification_method_local_JSON = website_verification_method_convertToJSON(user_website_create->verification_method);
    if(verification_method_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "verification_method", verification_method_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // user_website_create->website
    if(user_website_create->website) {
    if(cJSON_AddStringToObject(item, "website", user_website_create->website) == NULL) {
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

user_website_create_t *user_website_create_parseFromJSON(cJSON *user_website_createJSON){

    user_website_create_t *user_website_create_local_var = NULL;

    // define the local variable for user_website_create->verification_method
    website_verification_method_t *verification_method_local_nonprim = NULL;

    char *website_local_str = NULL;

    // user_website_create->verification_method
    cJSON *verification_method = cJSON_GetObjectItemCaseSensitive(user_website_createJSON, "verification_method");
    if (cJSON_IsNull(verification_method)) {
        verification_method = NULL;
    }
    if (verification_method) { 
    verification_method_local_nonprim = website_verification_method_parseFromJSON(verification_method); //custom
    }

    // user_website_create->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(user_website_createJSON, "website");
    if (cJSON_IsNull(website)) {
        website = NULL;
    }
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }


    if (website && !cJSON_IsNull(website)) website_local_str = strdup(website->valuestring);

    user_website_create_local_var = user_website_create_create_internal (
        verification_method ? verification_method_local_nonprim : NULL,
        website_local_str
        );

    if (!user_website_create_local_var) {
        goto end;
    }

    return user_website_create_local_var;
end:
    if (verification_method_local_nonprim) {
        website_verification_method_free(verification_method_local_nonprim);
        verification_method_local_nonprim = NULL;
    }
    if (website_local_str) {
        free(website_local_str);
        website_local_str = NULL;
    }
    return NULL;

}
