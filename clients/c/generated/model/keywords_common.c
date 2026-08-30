#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_common.h"



static keywords_common_t *keywords_common_create_internal(
    int *bid,
    pinterest_rest_api_match_type_response__e match_type,
    char *value
    ) {
    keywords_common_t *keywords_common_local_var = malloc(sizeof(keywords_common_t));
    if (!keywords_common_local_var) {
        return NULL;
    }
    memset(keywords_common_local_var, 0, sizeof(keywords_common_t));
    keywords_common_local_var->_library_owned = 1;
    keywords_common_local_var->bid = bid;
    keywords_common_local_var->match_type = match_type;
    keywords_common_local_var->value = value;
    return keywords_common_local_var;
}

__attribute__((deprecated)) keywords_common_t *keywords_common_create(
    int *bid,
    pinterest_rest_api_match_type_response__e match_type,
    char *value
    ) {
    int *bid_copy = NULL;
    if (bid) {
        bid_copy = malloc(sizeof(int));
        if (bid_copy) *bid_copy = *bid;
    }
    keywords_common_t *result = keywords_common_create_internal (
        bid_copy,
        match_type,
        value
        );
    if (!result) {
        free(bid_copy);
    }
    return result;
}

void keywords_common_free(keywords_common_t *keywords_common) {
    if(NULL == keywords_common){
        return ;
    }
    if(keywords_common->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keywords_common_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_common->bid) {
        free(keywords_common->bid);
        keywords_common->bid = NULL;
    }
    if (keywords_common->value) {
        free(keywords_common->value);
        keywords_common->value = NULL;
    }
    free(keywords_common);
}

cJSON *keywords_common_convertToJSON(keywords_common_t *keywords_common) {
    cJSON *item = cJSON_CreateObject();

    // keywords_common->bid
    if(keywords_common->bid) {
    if(cJSON_AddNumberToObject(item, "bid", *keywords_common->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // keywords_common->match_type
    if (pinterest_rest_api_match_type_response__NULL == keywords_common->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = match_type_response_convertToJSON(keywords_common->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // keywords_common->value
    if (!keywords_common->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", keywords_common->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keywords_common_t *keywords_common_parseFromJSON(cJSON *keywords_commonJSON){

    keywords_common_t *keywords_common_local_var = NULL;

    // define the local variable for keywords_common->bid
    int *bid_local_var = NULL;

    // define the local variable for keywords_common->match_type
    pinterest_rest_api_match_type_response__e match_type_local_nonprim = 0;

    char *value_local_str = NULL;

    // keywords_common->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keywords_commonJSON, "bid");
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

    // keywords_common->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(keywords_commonJSON, "match_type");
    if (cJSON_IsNull(match_type)) {
        match_type = NULL;
    }
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = match_type_response_parseFromJSON(match_type); //custom

    // keywords_common->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(keywords_commonJSON, "value");
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

    keywords_common_local_var = keywords_common_create_internal (
        bid_local_var,
        match_type_local_nonprim,
        value_local_str
        );

    if (!keywords_common_local_var) {
        goto end;
    }

    return keywords_common_local_var;
end:
    if (bid_local_var) {
        free(bid_local_var);
        bid_local_var = NULL;
    }
    if (match_type_local_nonprim) {
        match_type_local_nonprim = 0;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
