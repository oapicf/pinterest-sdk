#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_key.h"



static advanced_auction_key_t *advanced_auction_key_create_internal(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language
    ) {
    advanced_auction_key_t *advanced_auction_key_local_var = malloc(sizeof(advanced_auction_key_t));
    if (!advanced_auction_key_local_var) {
        return NULL;
    }
    memset(advanced_auction_key_local_var, 0, sizeof(advanced_auction_key_t));
    advanced_auction_key_local_var->_library_owned = 1;
    advanced_auction_key_local_var->country = country;
    advanced_auction_key_local_var->item_id = item_id;
    advanced_auction_key_local_var->language = language;
    return advanced_auction_key_local_var;
}

__attribute__((deprecated)) advanced_auction_key_t *advanced_auction_key_create(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language
    ) {
    advanced_auction_key_t *result = advanced_auction_key_create_internal (
        country,
        item_id,
        language
        );
    if (!result) {
    }
    return result;
}

void advanced_auction_key_free(advanced_auction_key_t *advanced_auction_key) {
    if(NULL == advanced_auction_key){
        return ;
    }
    if(advanced_auction_key->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_key_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_key->item_id) {
        free(advanced_auction_key->item_id);
        advanced_auction_key->item_id = NULL;
    }
    free(advanced_auction_key);
}

cJSON *advanced_auction_key_convertToJSON(advanced_auction_key_t *advanced_auction_key) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_key->country
    if (pinterest_rest_api_country__NULL == advanced_auction_key->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_key->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_key->item_id
    if (!advanced_auction_key->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_key->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_key->language
    if (pinterest_rest_api_language__NULL == advanced_auction_key->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_key->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advanced_auction_key_t *advanced_auction_key_parseFromJSON(cJSON *advanced_auction_keyJSON){

    advanced_auction_key_t *advanced_auction_key_local_var = NULL;

    // define the local variable for advanced_auction_key->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    char *item_id_local_str = NULL;

    // define the local variable for advanced_auction_key->language
    pinterest_rest_api_language__e language_local_nonprim = 0;

    // advanced_auction_key->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_keyJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_key->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_keyJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // advanced_auction_key->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_keyJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    advanced_auction_key_local_var = advanced_auction_key_create_internal (
        country_local_nonprim,
        item_id_local_str,
        language_local_nonprim
        );

    if (!advanced_auction_key_local_var) {
        goto end;
    }

    return advanced_auction_key_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_local_nonprim = 0;
    }
    return NULL;

}
