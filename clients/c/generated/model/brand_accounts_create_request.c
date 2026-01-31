#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_accounts_create_request.h"



static brand_accounts_create_request_t *brand_accounts_create_request_create_internal(
    char *name,
    char *username,
    pinterest_rest_api_country__e country,
    char *about,
    char *website,
    image_base64_t *profile_image
    ) {
    brand_accounts_create_request_t *brand_accounts_create_request_local_var = malloc(sizeof(brand_accounts_create_request_t));
    if (!brand_accounts_create_request_local_var) {
        return NULL;
    }
    brand_accounts_create_request_local_var->name = name;
    brand_accounts_create_request_local_var->username = username;
    brand_accounts_create_request_local_var->country = country;
    brand_accounts_create_request_local_var->about = about;
    brand_accounts_create_request_local_var->website = website;
    brand_accounts_create_request_local_var->profile_image = profile_image;

    brand_accounts_create_request_local_var->_library_owned = 1;
    return brand_accounts_create_request_local_var;
}

__attribute__((deprecated)) brand_accounts_create_request_t *brand_accounts_create_request_create(
    char *name,
    char *username,
    pinterest_rest_api_country__e country,
    char *about,
    char *website,
    image_base64_t *profile_image
    ) {
    return brand_accounts_create_request_create_internal (
        name,
        username,
        country,
        about,
        website,
        profile_image
        );
}

void brand_accounts_create_request_free(brand_accounts_create_request_t *brand_accounts_create_request) {
    if(NULL == brand_accounts_create_request){
        return ;
    }
    if(brand_accounts_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_accounts_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_accounts_create_request->name) {
        free(brand_accounts_create_request->name);
        brand_accounts_create_request->name = NULL;
    }
    if (brand_accounts_create_request->username) {
        free(brand_accounts_create_request->username);
        brand_accounts_create_request->username = NULL;
    }
    if (brand_accounts_create_request->about) {
        free(brand_accounts_create_request->about);
        brand_accounts_create_request->about = NULL;
    }
    if (brand_accounts_create_request->website) {
        free(brand_accounts_create_request->website);
        brand_accounts_create_request->website = NULL;
    }
    if (brand_accounts_create_request->profile_image) {
        image_base64_free(brand_accounts_create_request->profile_image);
        brand_accounts_create_request->profile_image = NULL;
    }
    free(brand_accounts_create_request);
}

cJSON *brand_accounts_create_request_convertToJSON(brand_accounts_create_request_t *brand_accounts_create_request) {
    cJSON *item = cJSON_CreateObject();

    // brand_accounts_create_request->name
    if (!brand_accounts_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", brand_accounts_create_request->name) == NULL) {
    goto fail; //String
    }


    // brand_accounts_create_request->username
    if (!brand_accounts_create_request->username) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "username", brand_accounts_create_request->username) == NULL) {
    goto fail; //String
    }


    // brand_accounts_create_request->country
    if (pinterest_rest_api_country__NULL == brand_accounts_create_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(brand_accounts_create_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // brand_accounts_create_request->about
    if(brand_accounts_create_request->about) {
    if(cJSON_AddStringToObject(item, "about", brand_accounts_create_request->about) == NULL) {
    goto fail; //String
    }
    }


    // brand_accounts_create_request->website
    if(brand_accounts_create_request->website) {
    if(cJSON_AddStringToObject(item, "website", brand_accounts_create_request->website) == NULL) {
    goto fail; //String
    }
    }


    // brand_accounts_create_request->profile_image
    if(brand_accounts_create_request->profile_image) {
    cJSON *profile_image_local_JSON = image_base64_convertToJSON(brand_accounts_create_request->profile_image);
    if(profile_image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "profile_image", profile_image_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

brand_accounts_create_request_t *brand_accounts_create_request_parseFromJSON(cJSON *brand_accounts_create_requestJSON){

    brand_accounts_create_request_t *brand_accounts_create_request_local_var = NULL;

    // define the local variable for brand_accounts_create_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for brand_accounts_create_request->profile_image
    image_base64_t *profile_image_local_nonprim = NULL;

    // brand_accounts_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // brand_accounts_create_request->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "username");
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

    // brand_accounts_create_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // brand_accounts_create_request->about
    cJSON *about = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "about");
    if (cJSON_IsNull(about)) {
        about = NULL;
    }
    if (about) { 
    if(!cJSON_IsString(about) && !cJSON_IsNull(about))
    {
    goto end; //String
    }
    }

    // brand_accounts_create_request->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "website");
    if (cJSON_IsNull(website)) {
        website = NULL;
    }
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }

    // brand_accounts_create_request->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(brand_accounts_create_requestJSON, "profile_image");
    if (cJSON_IsNull(profile_image)) {
        profile_image = NULL;
    }
    if (profile_image) { 
    profile_image_local_nonprim = image_base64_parseFromJSON(profile_image); //nonprimitive
    }


    brand_accounts_create_request_local_var = brand_accounts_create_request_create_internal (
        strdup(name->valuestring),
        strdup(username->valuestring),
        country_local_nonprim,
        about && !cJSON_IsNull(about) ? strdup(about->valuestring) : NULL,
        website && !cJSON_IsNull(website) ? strdup(website->valuestring) : NULL,
        profile_image ? profile_image_local_nonprim : NULL
        );

    return brand_accounts_create_request_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (profile_image_local_nonprim) {
        image_base64_free(profile_image_local_nonprim);
        profile_image_local_nonprim = NULL;
    }
    return NULL;

}
