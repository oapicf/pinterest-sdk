#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_items_submit_upsert_record.h"


char* advanced_auction_items_submit_upsert_record_update_mask_ToString(pinterest_rest_api_advanced_auction_items_submit_upsert_record__e update_mask) {
    char *update_maskArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_advanced_auction_items_submit_upsert_record__e advanced_auction_items_submit_upsert_record_update_mask_FromString(char* update_mask) {
    int stringToReturn = 0;
    char *update_maskArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    size_t sizeofArray = sizeof(update_maskArray) / sizeof(update_maskArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask, update_maskArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record_create_internal(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language,
    advanced_auction_bid_options_t *bid_options,
    list_t *errors,
    list_t *update_mask
    ) {
    advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record_local_var = malloc(sizeof(advanced_auction_items_submit_upsert_record_t));
    if (!advanced_auction_items_submit_upsert_record_local_var) {
        return NULL;
    }
    advanced_auction_items_submit_upsert_record_local_var->country = country;
    advanced_auction_items_submit_upsert_record_local_var->item_id = item_id;
    advanced_auction_items_submit_upsert_record_local_var->language = language;
    advanced_auction_items_submit_upsert_record_local_var->bid_options = bid_options;
    advanced_auction_items_submit_upsert_record_local_var->errors = errors;
    advanced_auction_items_submit_upsert_record_local_var->update_mask = update_mask;

    advanced_auction_items_submit_upsert_record_local_var->_library_owned = 1;
    return advanced_auction_items_submit_upsert_record_local_var;
}

__attribute__((deprecated)) advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record_create(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language,
    advanced_auction_bid_options_t *bid_options,
    list_t *errors,
    list_t *update_mask
    ) {
    return advanced_auction_items_submit_upsert_record_create_internal (
        country,
        item_id,
        language,
        bid_options,
        errors,
        update_mask
        );
}

void advanced_auction_items_submit_upsert_record_free(advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record) {
    if(NULL == advanced_auction_items_submit_upsert_record){
        return ;
    }
    if(advanced_auction_items_submit_upsert_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_items_submit_upsert_record_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_items_submit_upsert_record->item_id) {
        free(advanced_auction_items_submit_upsert_record->item_id);
        advanced_auction_items_submit_upsert_record->item_id = NULL;
    }
    if (advanced_auction_items_submit_upsert_record->bid_options) {
        advanced_auction_bid_options_free(advanced_auction_items_submit_upsert_record->bid_options);
        advanced_auction_items_submit_upsert_record->bid_options = NULL;
    }
    if (advanced_auction_items_submit_upsert_record->errors) {
        list_ForEach(listEntry, advanced_auction_items_submit_upsert_record->errors) {
            advanced_auction_operation_error_free(listEntry->data);
        }
        list_freeList(advanced_auction_items_submit_upsert_record->errors);
        advanced_auction_items_submit_upsert_record->errors = NULL;
    }
    if (advanced_auction_items_submit_upsert_record->update_mask) {
        list_ForEach(listEntry, advanced_auction_items_submit_upsert_record->update_mask) {
            update_mask_bid_option_field_free(listEntry->data);
        }
        list_freeList(advanced_auction_items_submit_upsert_record->update_mask);
        advanced_auction_items_submit_upsert_record->update_mask = NULL;
    }
    free(advanced_auction_items_submit_upsert_record);
}

cJSON *advanced_auction_items_submit_upsert_record_convertToJSON(advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_items_submit_upsert_record->country
    if (pinterest_rest_api_country__NULL == advanced_auction_items_submit_upsert_record->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_items_submit_upsert_record->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_items_submit_upsert_record->item_id
    if (!advanced_auction_items_submit_upsert_record->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_items_submit_upsert_record->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_items_submit_upsert_record->language
    if (pinterest_rest_api_language__NULL == advanced_auction_items_submit_upsert_record->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_items_submit_upsert_record->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_items_submit_upsert_record->bid_options
    if (!advanced_auction_items_submit_upsert_record->bid_options) {
        goto fail;
    }
    cJSON *bid_options_local_JSON = advanced_auction_bid_options_convertToJSON(advanced_auction_items_submit_upsert_record->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // advanced_auction_items_submit_upsert_record->errors
    if(advanced_auction_items_submit_upsert_record->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (advanced_auction_items_submit_upsert_record->errors) {
    list_ForEach(errorsListEntry, advanced_auction_items_submit_upsert_record->errors) {
    cJSON *itemLocal = advanced_auction_operation_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // advanced_auction_items_submit_upsert_record->update_mask
    if (pinterest_rest_api_list_UPDATEMASK_NULL == advanced_auction_items_submit_upsert_record->update_mask) {
        goto fail;
    }
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (advanced_auction_items_submit_upsert_record->update_mask) {
    list_ForEach(update_maskListEntry, advanced_auction_items_submit_upsert_record->update_mask) {
    cJSON *itemLocal = update_mask_bid_option_field_convertToJSON((pinterest_rest_api_advanced_auction_items_submit_upsert_record__e)update_maskListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(update_mask, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record_parseFromJSON(cJSON *advanced_auction_items_submit_upsert_recordJSON){

    advanced_auction_items_submit_upsert_record_t *advanced_auction_items_submit_upsert_record_local_var = NULL;

    // define the local variable for advanced_auction_items_submit_upsert_record->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for advanced_auction_items_submit_upsert_record->language
    pinterest_rest_api_language__e language_local_nonprim = 0;

    // define the local variable for advanced_auction_items_submit_upsert_record->bid_options
    advanced_auction_bid_options_t *bid_options_local_nonprim = NULL;

    // define the local list for advanced_auction_items_submit_upsert_record->errors
    list_t *errorsList = NULL;

    // define the local list for advanced_auction_items_submit_upsert_record->update_mask
    list_t *update_maskList = NULL;

    // advanced_auction_items_submit_upsert_record->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_items_submit_upsert_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "item_id");
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

    // advanced_auction_items_submit_upsert_record->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom

    // advanced_auction_items_submit_upsert_record->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (!bid_options) {
        goto end;
    }

    
    bid_options_local_nonprim = advanced_auction_bid_options_parseFromJSON(bid_options); //nonprimitive

    // advanced_auction_items_submit_upsert_record->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        advanced_auction_operation_error_t *errorsItem = advanced_auction_operation_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // advanced_auction_items_submit_upsert_record->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_submit_upsert_recordJSON, "update_mask");
    if (cJSON_IsNull(update_mask)) {
        update_mask = NULL;
    }
    if (!update_mask) {
        goto end;
    }

    
    cJSON *update_mask_local_nonprimitive = NULL;
    if(!cJSON_IsArray(update_mask)){
        goto end; //nonprimitive container
    }

    update_maskList = list_createList();

    cJSON_ArrayForEach(update_mask_local_nonprimitive,update_mask )
    {
        if(!cJSON_IsObject(update_mask_local_nonprimitive)){
            goto end;
        }
        advanced_auction_items_submit_upsert_record_update_mask_bid_option_field_e update_maskItem = update_mask_bid_option_field_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }


    advanced_auction_items_submit_upsert_record_local_var = advanced_auction_items_submit_upsert_record_create_internal (
        country_local_nonprim,
        strdup(item_id->valuestring),
        language_local_nonprim,
        bid_options_local_nonprim,
        errors ? errorsList : NULL,
        update_maskList
        );

    return advanced_auction_items_submit_upsert_record_local_var;
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
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            advanced_auction_operation_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (update_maskList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, update_maskList) {
            update_mask_bid_option_field_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(update_maskList);
        update_maskList = NULL;
    }
    return NULL;

}
