#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_create_item.h"



static keyword_create_item_t *keyword_create_item_create_internal(
    int *bid,
    match_type_t *match_type,
    char *value
    ) {
    keyword_create_item_t *keyword_create_item_local_var = malloc(sizeof(keyword_create_item_t));
    if (!keyword_create_item_local_var) {
        return NULL;
    }
    memset(keyword_create_item_local_var, 0, sizeof(keyword_create_item_t));
    keyword_create_item_local_var->_library_owned = 1;
    keyword_create_item_local_var->bid = bid;
    keyword_create_item_local_var->match_type = match_type;
    keyword_create_item_local_var->value = value;
    return keyword_create_item_local_var;
}

__attribute__((deprecated)) keyword_create_item_t *keyword_create_item_create(
    int *bid,
    match_type_t *match_type,
    char *value
    ) {
    int *bid_copy = NULL;
    if (bid) {
        bid_copy = malloc(sizeof(int));
        if (bid_copy) *bid_copy = *bid;
    }
    keyword_create_item_t *result = keyword_create_item_create_internal (
        bid_copy,
        match_type,
        value
        );
    if (!result) {
        free(bid_copy);
    }
    return result;
}

void keyword_create_item_free(keyword_create_item_t *keyword_create_item) {
    if(NULL == keyword_create_item){
        return ;
    }
    if(keyword_create_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_create_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_create_item->bid) {
        free(keyword_create_item->bid);
        keyword_create_item->bid = NULL;
    }
    if (keyword_create_item->match_type) {
        match_type_free(keyword_create_item->match_type);
        keyword_create_item->match_type = NULL;
    }
    if (keyword_create_item->value) {
        free(keyword_create_item->value);
        keyword_create_item->value = NULL;
    }
    free(keyword_create_item);
}

cJSON *keyword_create_item_convertToJSON(keyword_create_item_t *keyword_create_item) {
    cJSON *item = cJSON_CreateObject();

    // keyword_create_item->bid
    if(keyword_create_item->bid) {
    if(cJSON_AddNumberToObject(item, "bid", *keyword_create_item->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // keyword_create_item->match_type
    if (!keyword_create_item->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = match_type_convertToJSON(keyword_create_item->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // keyword_create_item->value
    if (!keyword_create_item->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", keyword_create_item->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_create_item_t *keyword_create_item_parseFromJSON(cJSON *keyword_create_itemJSON){

    keyword_create_item_t *keyword_create_item_local_var = NULL;

    // define the local variable for keyword_create_item->bid
    int *bid_local_var = NULL;

    // define the local variable for keyword_create_item->match_type
    match_type_t *match_type_local_nonprim = NULL;

    char *value_local_str = NULL;

    // keyword_create_item->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keyword_create_itemJSON, "bid");
    if (cJSON_IsNull(bid)) {
        bid = NULL;
    }
    if (bid) { 
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }
    bid_local_var = malloc(sizeof(int));
    if(!bid_local_var)
    {
        goto end;
    }
    *bid_local_var = bid->valuedouble;
    }

    // keyword_create_item->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(keyword_create_itemJSON, "match_type");
    if (cJSON_IsNull(match_type)) {
        match_type = NULL;
    }
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = match_type_parseFromJSON(match_type); //custom

    // keyword_create_item->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(keyword_create_itemJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    keyword_create_item_local_var = keyword_create_item_create_internal (
        bid_local_var,
        match_type_local_nonprim,
        value_local_str
        );

    if (!keyword_create_item_local_var) {
        goto end;
    }

    return keyword_create_item_local_var;
end:
    if (bid_local_var) {
        free(bid_local_var);
        bid_local_var = NULL;
    }
    if (match_type_local_nonprim) {
        match_type_free(match_type_local_nonprim);
        match_type_local_nonprim = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
