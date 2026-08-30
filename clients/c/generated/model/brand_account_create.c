#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_account_create.h"



static brand_account_create_t *brand_account_create_create_internal(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_t *profile_image,
    char *username,
    char *website
    ) {
    brand_account_create_t *brand_account_create_local_var = malloc(sizeof(brand_account_create_t));
    if (!brand_account_create_local_var) {
        return NULL;
    }
    memset(brand_account_create_local_var, 0, sizeof(brand_account_create_t));
    brand_account_create_local_var->_library_owned = 1;
    brand_account_create_local_var->about = about;
    brand_account_create_local_var->country = country;
    brand_account_create_local_var->name = name;
    brand_account_create_local_var->profile_image = profile_image;
    brand_account_create_local_var->username = username;
    brand_account_create_local_var->website = website;
    return brand_account_create_local_var;
}

__attribute__((deprecated)) brand_account_create_t *brand_account_create_create(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_t *profile_image,
    char *username,
    char *website
    ) {
    brand_account_create_t *result = brand_account_create_create_internal (
        about,
        country,
        name,
        profile_image,
        username,
        website
        );
    if (!result) {
    }
    return result;
}

void brand_account_create_free(brand_account_create_t *brand_account_create) {
    if(NULL == brand_account_create){
        return ;
    }
    if(brand_account_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_account_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_account_create->about) {
        free(brand_account_create->about);
        brand_account_create->about = NULL;
    }
    if (brand_account_create->name) {
        free(brand_account_create->name);
        brand_account_create->name = NULL;
    }
    if (brand_account_create->profile_image) {
        brand_account_profile_image_free(brand_account_create->profile_image);
        brand_account_create->profile_image = NULL;
    }
    if (brand_account_create->username) {
        free(brand_account_create->username);
        brand_account_create->username = NULL;
    }
    if (brand_account_create->website) {
        free(brand_account_create->website);
        brand_account_create->website = NULL;
    }
    free(brand_account_create);
}

cJSON *brand_account_create_convertToJSON(brand_account_create_t *brand_account_create) {
    cJSON *item = cJSON_CreateObject();

    // brand_account_create->about
    if(brand_account_create->about) {
    if(cJSON_AddStringToObject(item, "about", brand_account_create->about) == NULL) {
    goto fail; //String
    }
    }


    // brand_account_create->country
    if (pinterest_rest_api_country__NULL == brand_account_create->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(brand_account_create->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // brand_account_create->name
    if (!brand_account_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", brand_account_create->name) == NULL) {
    goto fail; //String
    }


    // brand_account_create->profile_image
    if(brand_account_create->profile_image) {
    cJSON *profile_image_local_JSON = brand_account_profile_image_convertToJSON(brand_account_create->profile_image);
    if(profile_image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "profile_image", profile_image_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // brand_account_create->username
    if (!brand_account_create->username) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "username", brand_account_create->username) == NULL) {
    goto fail; //String
    }


    // brand_account_create->website
    if(brand_account_create->website) {
    if(cJSON_AddStringToObject(item, "website", brand_account_create->website) == NULL) {
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

brand_account_create_t *brand_account_create_parseFromJSON(cJSON *brand_account_createJSON){

    brand_account_create_t *brand_account_create_local_var = NULL;

    char *about_local_str = NULL;

    // define the local variable for brand_account_create->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    char *name_local_str = NULL;

    // define the local variable for brand_account_create->profile_image
    brand_account_profile_image_t *profile_image_local_nonprim = NULL;

    char *username_local_str = NULL;

    char *website_local_str = NULL;

    // brand_account_create->about
    cJSON *about = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "about");
    if (cJSON_IsNull(about)) {
        about = NULL;
    }
    if (about) { 
    if(!cJSON_IsString(about) && !cJSON_IsNull(about))
    {
    goto end; //String
    }
    }

    // brand_account_create->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // brand_account_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "name");
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

    // brand_account_create->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "profile_image");
    if (cJSON_IsNull(profile_image)) {
        profile_image = NULL;
    }
    if (profile_image) { 
    profile_image_local_nonprim = brand_account_profile_image_parseFromJSON(profile_image); //nonprimitive
    }

    // brand_account_create->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "username");
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

    // brand_account_create->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(brand_account_createJSON, "website");
    if (cJSON_IsNull(website)) {
        website = NULL;
    }
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }


    if (about && !cJSON_IsNull(about)) about_local_str = strdup(about->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);
    if (website && !cJSON_IsNull(website)) website_local_str = strdup(website->valuestring);

    brand_account_create_local_var = brand_account_create_create_internal (
        about_local_str,
        country_local_nonprim,
        name_local_str,
        profile_image ? profile_image_local_nonprim : NULL,
        username_local_str,
        website_local_str
        );

    if (!brand_account_create_local_var) {
        goto end;
    }

    return brand_account_create_local_var;
end:
    if (about_local_str) {
        free(about_local_str);
        about_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (profile_image_local_nonprim) {
        brand_account_profile_image_free(profile_image_local_nonprim);
        profile_image_local_nonprim = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    if (website_local_str) {
        free(website_local_str);
        website_local_str = NULL;
    }
    return NULL;

}
