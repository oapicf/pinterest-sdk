#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_account_update.h"



static brand_account_update_t *brand_account_update_create_internal(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_update_t *profile_image,
    char *username,
    char *website
    ) {
    brand_account_update_t *brand_account_update_local_var = malloc(sizeof(brand_account_update_t));
    if (!brand_account_update_local_var) {
        return NULL;
    }
    memset(brand_account_update_local_var, 0, sizeof(brand_account_update_t));
    brand_account_update_local_var->_library_owned = 1;
    brand_account_update_local_var->about = about;
    brand_account_update_local_var->country = country;
    brand_account_update_local_var->name = name;
    brand_account_update_local_var->profile_image = profile_image;
    brand_account_update_local_var->username = username;
    brand_account_update_local_var->website = website;
    return brand_account_update_local_var;
}

__attribute__((deprecated)) brand_account_update_t *brand_account_update_create(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_update_t *profile_image,
    char *username,
    char *website
    ) {
    brand_account_update_t *result = brand_account_update_create_internal (
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

void brand_account_update_free(brand_account_update_t *brand_account_update) {
    if(NULL == brand_account_update){
        return ;
    }
    if(brand_account_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_account_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (brand_account_update->about) {
        free(brand_account_update->about);
        brand_account_update->about = NULL;
    }
    if (brand_account_update->name) {
        free(brand_account_update->name);
        brand_account_update->name = NULL;
    }
    if (brand_account_update->profile_image) {
        brand_account_profile_image_update_free(brand_account_update->profile_image);
        brand_account_update->profile_image = NULL;
    }
    if (brand_account_update->username) {
        free(brand_account_update->username);
        brand_account_update->username = NULL;
    }
    if (brand_account_update->website) {
        free(brand_account_update->website);
        brand_account_update->website = NULL;
    }
    free(brand_account_update);
}

cJSON *brand_account_update_convertToJSON(brand_account_update_t *brand_account_update) {
    cJSON *item = cJSON_CreateObject();

    // brand_account_update->about
    if(brand_account_update->about) {
    if(cJSON_AddStringToObject(item, "about", brand_account_update->about) == NULL) {
    goto fail; //String
    }
    }


    // brand_account_update->country
    if(brand_account_update->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(brand_account_update->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // brand_account_update->name
    if(brand_account_update->name) {
    if(cJSON_AddStringToObject(item, "name", brand_account_update->name) == NULL) {
    goto fail; //String
    }
    }


    // brand_account_update->profile_image
    if(brand_account_update->profile_image) {
    cJSON *profile_image_local_JSON = brand_account_profile_image_update_convertToJSON(brand_account_update->profile_image);
    if(profile_image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "profile_image", profile_image_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // brand_account_update->username
    if(brand_account_update->username) {
    if(cJSON_AddStringToObject(item, "username", brand_account_update->username) == NULL) {
    goto fail; //String
    }
    }


    // brand_account_update->website
    if(brand_account_update->website) {
    if(cJSON_AddStringToObject(item, "website", brand_account_update->website) == NULL) {
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

brand_account_update_t *brand_account_update_parseFromJSON(cJSON *brand_account_updateJSON){

    brand_account_update_t *brand_account_update_local_var = NULL;

    char *about_local_str = NULL;

    // define the local variable for brand_account_update->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    char *name_local_str = NULL;

    // define the local variable for brand_account_update->profile_image
    brand_account_profile_image_update_t *profile_image_local_nonprim = NULL;

    char *username_local_str = NULL;

    char *website_local_str = NULL;

    // brand_account_update->about
    cJSON *about = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "about");
    if (cJSON_IsNull(about)) {
        about = NULL;
    }
    if (about) { 
    if(!cJSON_IsString(about) && !cJSON_IsNull(about))
    {
    goto end; //String
    }
    }

    // brand_account_update->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // brand_account_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // brand_account_update->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "profile_image");
    if (cJSON_IsNull(profile_image)) {
        profile_image = NULL;
    }
    if (profile_image) { 
    profile_image_local_nonprim = brand_account_profile_image_update_parseFromJSON(profile_image); //nonprimitive
    }

    // brand_account_update->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }

    // brand_account_update->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(brand_account_updateJSON, "website");
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

    brand_account_update_local_var = brand_account_update_create_internal (
        about_local_str,
        country ? country_local_nonprim : 0,
        name_local_str,
        profile_image ? profile_image_local_nonprim : NULL,
        username_local_str,
        website_local_str
        );

    if (!brand_account_update_local_var) {
        goto end;
    }

    return brand_account_update_local_var;
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
        brand_account_profile_image_update_free(profile_image_local_nonprim);
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
