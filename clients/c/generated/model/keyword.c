#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword.h"



static keyword_t *keyword_create_internal(
    int *archived,
    int *bid,
    char *id,
    match_type_t *match_type,
    char *parent_id,
    char *parent_type,
    char *type,
    char *value
    ) {
    keyword_t *keyword_local_var = malloc(sizeof(keyword_t));
    if (!keyword_local_var) {
        return NULL;
    }
    memset(keyword_local_var, 0, sizeof(keyword_t));
    keyword_local_var->_library_owned = 1;
    keyword_local_var->archived = archived;
    keyword_local_var->bid = bid;
    keyword_local_var->id = id;
    keyword_local_var->match_type = match_type;
    keyword_local_var->parent_id = parent_id;
    keyword_local_var->parent_type = parent_type;
    keyword_local_var->type = type;
    keyword_local_var->value = value;
    return keyword_local_var;
}

__attribute__((deprecated)) keyword_t *keyword_create(
    int *archived,
    int *bid,
    char *id,
    match_type_t *match_type,
    char *parent_id,
    char *parent_type,
    char *type,
    char *value
    ) {
    int *archived_copy = NULL;
    if (archived) {
        archived_copy = malloc(sizeof(int));
        if (archived_copy) *archived_copy = *archived;
    }
    int *bid_copy = NULL;
    if (bid) {
        bid_copy = malloc(sizeof(int));
        if (bid_copy) *bid_copy = *bid;
    }
    keyword_t *result = keyword_create_internal (
        archived_copy,
        bid_copy,
        id,
        match_type,
        parent_id,
        parent_type,
        type,
        value
        );
    if (!result) {
        free(archived_copy);
        free(bid_copy);
    }
    return result;
}

void keyword_free(keyword_t *keyword) {
    if(NULL == keyword){
        return ;
    }
    if(keyword->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword->archived) {
        free(keyword->archived);
        keyword->archived = NULL;
    }
    if (keyword->bid) {
        free(keyword->bid);
        keyword->bid = NULL;
    }
    if (keyword->id) {
        free(keyword->id);
        keyword->id = NULL;
    }
    if (keyword->match_type) {
        match_type_free(keyword->match_type);
        keyword->match_type = NULL;
    }
    if (keyword->parent_id) {
        free(keyword->parent_id);
        keyword->parent_id = NULL;
    }
    if (keyword->parent_type) {
        free(keyword->parent_type);
        keyword->parent_type = NULL;
    }
    if (keyword->type) {
        free(keyword->type);
        keyword->type = NULL;
    }
    if (keyword->value) {
        free(keyword->value);
        keyword->value = NULL;
    }
    free(keyword);
}

cJSON *keyword_convertToJSON(keyword_t *keyword) {
    cJSON *item = cJSON_CreateObject();

    // keyword->archived
    if(keyword->archived) {
    if(cJSON_AddBoolToObject(item, "archived", *keyword->archived) == NULL) {
    goto fail; //Bool
    }
    }


    // keyword->bid
    if(keyword->bid) {
    if(cJSON_AddNumberToObject(item, "bid", *keyword->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // keyword->id
    if (!keyword->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", keyword->id) == NULL) {
    goto fail; //String
    }


    // keyword->match_type
    if (!keyword->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = match_type_convertToJSON(keyword->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // keyword->parent_id
    if (!keyword->parent_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "parent_id", keyword->parent_id) == NULL) {
    goto fail; //String
    }


    // keyword->parent_type
    if(keyword->parent_type) {
    if(cJSON_AddStringToObject(item, "parent_type", keyword->parent_type) == NULL) {
    goto fail; //String
    }
    }


    // keyword->type
    if(keyword->type) {
    if(cJSON_AddStringToObject(item, "type", keyword->type) == NULL) {
    goto fail; //String
    }
    }


    // keyword->value
    if (!keyword->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", keyword->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_t *keyword_parseFromJSON(cJSON *keywordJSON){

    keyword_t *keyword_local_var = NULL;

    // define the local variable for keyword->archived
    int *archived_local_var = NULL;

    // define the local variable for keyword->bid
    int *bid_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for keyword->match_type
    match_type_t *match_type_local_nonprim = NULL;

    char *parent_id_local_str = NULL;

    char *parent_type_local_str = NULL;

    char *type_local_str = NULL;

    char *value_local_str = NULL;

    // keyword->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(keywordJSON, "archived");
    if (cJSON_IsNull(archived)) {
        archived = NULL;
    }
    if (archived) { 
    if(!cJSON_IsBool(archived))
    {
    goto end; //Bool
    }
    archived_local_var = malloc(sizeof(int));
    if(!archived_local_var)
    {
        goto end;
    }
    *archived_local_var = archived->valueint;
    }

    // keyword->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keywordJSON, "bid");
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

    // keyword->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(keywordJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // keyword->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "match_type");
    if (cJSON_IsNull(match_type)) {
        match_type = NULL;
    }
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = match_type_parseFromJSON(match_type); //custom

    // keyword->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(keywordJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (!parent_id) {
        goto end;
    }

    
    if(!cJSON_IsString(parent_id))
    {
    goto end; //String
    }

    // keyword->parent_type
    cJSON *parent_type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "parent_type");
    if (cJSON_IsNull(parent_type)) {
        parent_type = NULL;
    }
    if (parent_type) { 
    if(!cJSON_IsString(parent_type) && !cJSON_IsNull(parent_type))
    {
    goto end; //String
    }
    }

    // keyword->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // keyword->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(keywordJSON, "value");
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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (parent_id && !cJSON_IsNull(parent_id)) parent_id_local_str = strdup(parent_id->valuestring);
    if (parent_type && !cJSON_IsNull(parent_type)) parent_type_local_str = strdup(parent_type->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    keyword_local_var = keyword_create_internal (
        archived_local_var,
        bid_local_var,
        id_local_str,
        match_type_local_nonprim,
        parent_id_local_str,
        parent_type_local_str,
        type_local_str,
        value_local_str
        );

    if (!keyword_local_var) {
        goto end;
    }

    return keyword_local_var;
end:
    if (archived_local_var) {
        free(archived_local_var);
        archived_local_var = NULL;
    }
    if (bid_local_var) {
        free(bid_local_var);
        bid_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (match_type_local_nonprim) {
        match_type_free(match_type_local_nonprim);
        match_type_local_nonprim = NULL;
    }
    if (parent_id_local_str) {
        free(parent_id_local_str);
        parent_id_local_str = NULL;
    }
    if (parent_type_local_str) {
        free(parent_type_local_str);
        parent_type_local_str = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
