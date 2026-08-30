#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create.h"



static ad_account_create_t *ad_account_create_create_internal(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_currency__e currency,
    char *name,
    char *owner_user_id,
    char *time_zone
    ) {
    ad_account_create_t *ad_account_create_local_var = malloc(sizeof(ad_account_create_t));
    if (!ad_account_create_local_var) {
        return NULL;
    }
    memset(ad_account_create_local_var, 0, sizeof(ad_account_create_t));
    ad_account_create_local_var->_library_owned = 1;
    ad_account_create_local_var->country = country;
    ad_account_create_local_var->currency = currency;
    ad_account_create_local_var->name = name;
    ad_account_create_local_var->owner_user_id = owner_user_id;
    ad_account_create_local_var->time_zone = time_zone;
    return ad_account_create_local_var;
}

__attribute__((deprecated)) ad_account_create_t *ad_account_create_create(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_currency__e currency,
    char *name,
    char *owner_user_id,
    char *time_zone
    ) {
    ad_account_create_t *result = ad_account_create_create_internal (
        country,
        currency,
        name,
        owner_user_id,
        time_zone
        );
    if (!result) {
    }
    return result;
}

void ad_account_create_free(ad_account_create_t *ad_account_create) {
    if(NULL == ad_account_create){
        return ;
    }
    if(ad_account_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create->name) {
        free(ad_account_create->name);
        ad_account_create->name = NULL;
    }
    if (ad_account_create->owner_user_id) {
        free(ad_account_create->owner_user_id);
        ad_account_create->owner_user_id = NULL;
    }
    if (ad_account_create->time_zone) {
        free(ad_account_create->time_zone);
        ad_account_create->time_zone = NULL;
    }
    free(ad_account_create);
}

cJSON *ad_account_create_convertToJSON(ad_account_create_t *ad_account_create) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create->country
    if(ad_account_create->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(ad_account_create->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account_create->currency
    if(ad_account_create->currency != pinterest_rest_api_currency__NULL) {
    cJSON *currency_local_JSON = currency_convertToJSON(ad_account_create->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account_create->name
    if(ad_account_create->name) {
    if(cJSON_AddStringToObject(item, "name", ad_account_create->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create->owner_user_id
    if(ad_account_create->owner_user_id) {
    if(cJSON_AddStringToObject(item, "owner_user_id", ad_account_create->owner_user_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create->time_zone
    if(ad_account_create->time_zone) {
    if(cJSON_AddStringToObject(item, "time_zone", ad_account_create->time_zone) == NULL) {
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

ad_account_create_t *ad_account_create_parseFromJSON(cJSON *ad_account_createJSON){

    ad_account_create_t *ad_account_create_local_var = NULL;

    // define the local variable for ad_account_create->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for ad_account_create->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    char *name_local_str = NULL;

    char *owner_user_id_local_str = NULL;

    char *time_zone_local_str = NULL;

    // ad_account_create->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_account_createJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // ad_account_create->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_account_createJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // ad_account_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_account_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_account_create->owner_user_id
    cJSON *owner_user_id = cJSON_GetObjectItemCaseSensitive(ad_account_createJSON, "owner_user_id");
    if (cJSON_IsNull(owner_user_id)) {
        owner_user_id = NULL;
    }
    if (owner_user_id) { 
    if(!cJSON_IsString(owner_user_id) && !cJSON_IsNull(owner_user_id))
    {
    goto end; //String
    }
    }

    // ad_account_create->time_zone
    cJSON *time_zone = cJSON_GetObjectItemCaseSensitive(ad_account_createJSON, "time_zone");
    if (cJSON_IsNull(time_zone)) {
        time_zone = NULL;
    }
    if (time_zone) { 
    if(!cJSON_IsString(time_zone) && !cJSON_IsNull(time_zone))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (owner_user_id && !cJSON_IsNull(owner_user_id)) owner_user_id_local_str = strdup(owner_user_id->valuestring);
    if (time_zone && !cJSON_IsNull(time_zone)) time_zone_local_str = strdup(time_zone->valuestring);

    ad_account_create_local_var = ad_account_create_create_internal (
        country ? country_local_nonprim : 0,
        currency ? currency_local_nonprim : 0,
        name_local_str,
        owner_user_id_local_str,
        time_zone_local_str
        );

    if (!ad_account_create_local_var) {
        goto end;
    }

    return ad_account_create_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (owner_user_id_local_str) {
        free(owner_user_id_local_str);
        owner_user_id_local_str = NULL;
    }
    if (time_zone_local_str) {
        free(time_zone_local_str);
        time_zone_local_str = NULL;
    }
    return NULL;

}
