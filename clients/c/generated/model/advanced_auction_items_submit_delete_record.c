#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_items_submit_delete_record.h"



static advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_create_internal(
    char *item_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_language__e language
    ) {
    advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_local_var = malloc(sizeof(advanced_auction_items_submit_delete_record_t));
    if (!advanced_auction_items_submit_delete_record_local_var) {
        return NULL;
    }
    advanced_auction_items_submit_delete_record_local_var->item_id = item_id;
    advanced_auction_items_submit_delete_record_local_var->country = country;
    advanced_auction_items_submit_delete_record_local_var->language = language;

    advanced_auction_items_submit_delete_record_local_var->_library_owned = 1;
    return advanced_auction_items_submit_delete_record_local_var;
}

__attribute__((deprecated)) advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_create(
    char *item_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_language__e language
    ) {
    return advanced_auction_items_submit_delete_record_create_internal (
        item_id,
        country,
        language
        );
}

void advanced_auction_items_submit_delete_record_free(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record) {
    if(NULL == advanced_auction_items_submit_delete_record){
        return ;
    }
    if(advanced_auction_items_submit_delete_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_items_submit_delete_record_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_items_submit_delete_record->item_id) {
        free(advanced_auction_items_submit_delete_record->item_id);
        advanced_auction_items_submit_delete_record->item_id = NULL;
    }
    free(advanced_auction_items_submit_delete_record);
}

cJSON *advanced_auction_items_submit_delete_record_convertToJSON(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_items_submit_delete_record->item_id
    if (!advanced_auction_items_submit_delete_record->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_items_submit_delete_record->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_items_submit_delete_record->country
    if (pinterest_rest_api_country__NULL == advanced_auction_items_submit_delete_record->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_items_submit_delete_record->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_items_submit_delete_record->language
    if (pinterest_rest_api_language__NULL == advanced_auction_items_submit_delete_record->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_items_submit_delete_record->language);
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

advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_parseFromJSON(cJSON *advanced_auction_items_submit_delete_recordJSON){

    advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_local_var = NULL;

    // define the local variable for advanced_auction_items_submit_delete_record->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for advanced_auction_items_submit_delete_record->language
    pinterest_rest_api_language__e language_local_nonprim = 0;

    // advanced_auction_items_submit_delete_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_delete_recordJSON, "item_id");
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

    // advanced_auction_items_submit_delete_record->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_delete_recordJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_items_submit_delete_record->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_delete_recordJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom


    advanced_auction_items_submit_delete_record_local_var = advanced_auction_items_submit_delete_record_create_internal (
        strdup(item_id->valuestring),
        country_local_nonprim,
        language_local_nonprim
        );

    return advanced_auction_items_submit_delete_record_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (language_local_nonprim) {
        language_local_nonprim = 0;
    }
    return NULL;

}
