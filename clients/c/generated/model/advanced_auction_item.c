#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_item.h"



static advanced_auction_item_t *advanced_auction_item_create_internal(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language,
    advanced_auction_bid_options_t *bid_options
    ) {
    advanced_auction_item_t *advanced_auction_item_local_var = malloc(sizeof(advanced_auction_item_t));
    if (!advanced_auction_item_local_var) {
        return NULL;
    }
    advanced_auction_item_local_var->country = country;
    advanced_auction_item_local_var->item_id = item_id;
    advanced_auction_item_local_var->language = language;
    advanced_auction_item_local_var->bid_options = bid_options;

    advanced_auction_item_local_var->_library_owned = 1;
    return advanced_auction_item_local_var;
}

__attribute__((deprecated)) advanced_auction_item_t *advanced_auction_item_create(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language,
    advanced_auction_bid_options_t *bid_options
    ) {
    return advanced_auction_item_create_internal (
        country,
        item_id,
        language,
        bid_options
        );
}

void advanced_auction_item_free(advanced_auction_item_t *advanced_auction_item) {
    if(NULL == advanced_auction_item){
        return ;
    }
    if(advanced_auction_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_item->item_id) {
        free(advanced_auction_item->item_id);
        advanced_auction_item->item_id = NULL;
    }
    if (advanced_auction_item->bid_options) {
        advanced_auction_bid_options_free(advanced_auction_item->bid_options);
        advanced_auction_item->bid_options = NULL;
    }
    free(advanced_auction_item);
}

cJSON *advanced_auction_item_convertToJSON(advanced_auction_item_t *advanced_auction_item) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_item->country
    if (pinterest_rest_api_country__NULL == advanced_auction_item->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_item->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_item->item_id
    if (!advanced_auction_item->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_item->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_item->language
    if (pinterest_rest_api_language__NULL == advanced_auction_item->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_item->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_item->bid_options
    if (!advanced_auction_item->bid_options) {
        goto fail;
    }
    cJSON *bid_options_local_JSON = advanced_auction_bid_options_convertToJSON(advanced_auction_item->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
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

advanced_auction_item_t *advanced_auction_item_parseFromJSON(cJSON *advanced_auction_itemJSON){

    advanced_auction_item_t *advanced_auction_item_local_var = NULL;

    // define the local variable for advanced_auction_item->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for advanced_auction_item->language
    pinterest_rest_api_language__e language_local_nonprim = 0;

    // define the local variable for advanced_auction_item->bid_options
    advanced_auction_bid_options_t *bid_options_local_nonprim = NULL;

    // advanced_auction_item->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_itemJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_item->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_itemJSON, "item_id");
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

    // advanced_auction_item->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_itemJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom

    // advanced_auction_item->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(advanced_auction_itemJSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (!bid_options) {
        goto end;
    }

    
    bid_options_local_nonprim = advanced_auction_bid_options_parseFromJSON(bid_options); //nonprimitive


    advanced_auction_item_local_var = advanced_auction_item_create_internal (
        country_local_nonprim,
        strdup(item_id->valuestring),
        language_local_nonprim,
        bid_options_local_nonprim
        );

    return advanced_auction_item_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (language_local_nonprim) {
        language_local_nonprim = 0;
    }
    if (bid_options_local_nonprim) {
        advanced_auction_bid_options_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
    }
    return NULL;

}
