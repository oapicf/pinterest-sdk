#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword.h"


char* keyword_match_type_ToString(pinterest_rest_api_keyword__e match_type) {
    char* match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    return match_typeArray[match_type];
}

pinterest_rest_api_keyword__e keyword_match_type_FromString(char* match_type){
    int stringToReturn = 0;
    char *match_typeArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE", "" };
    size_t sizeofArray = sizeof(match_typeArray) / sizeof(match_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(match_type, match_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

keyword_t *keyword_create(
    int bid,
    match_type_response_t *match_type,
    char *value,
    int archived,
    char *id,
    char *parent_id,
    char *parent_type,
    char *type
    ) {
    keyword_t *keyword_local_var = malloc(sizeof(keyword_t));
    if (!keyword_local_var) {
        return NULL;
    }
    keyword_local_var->bid = bid;
    keyword_local_var->match_type = match_type;
    keyword_local_var->value = value;
    keyword_local_var->archived = archived;
    keyword_local_var->id = id;
    keyword_local_var->parent_id = parent_id;
    keyword_local_var->parent_type = parent_type;
    keyword_local_var->type = type;

    return keyword_local_var;
}


void keyword_free(keyword_t *keyword) {
    if(NULL == keyword){
        return ;
    }
    listEntry_t *listEntry;
    if (keyword->match_type) {
        match_type_response_free(keyword->match_type);
        keyword->match_type = NULL;
    }
    if (keyword->value) {
        free(keyword->value);
        keyword->value = NULL;
    }
    if (keyword->id) {
        free(keyword->id);
        keyword->id = NULL;
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
    free(keyword);
}

cJSON *keyword_convertToJSON(keyword_t *keyword) {
    cJSON *item = cJSON_CreateObject();

    // keyword->bid
    if(keyword->bid) {
    if(cJSON_AddNumberToObject(item, "bid", keyword->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // keyword->match_type
    if (pinterest_rest_api_keyword__NULL == keyword->match_type) {
        goto fail;
    }
    cJSON *match_type_local_JSON = match_type_response_convertToJSON(keyword->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // keyword->value
    if (!keyword->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", keyword->value) == NULL) {
    goto fail; //String
    }


    // keyword->archived
    if(keyword->archived) {
    if(cJSON_AddBoolToObject(item, "archived", keyword->archived) == NULL) {
    goto fail; //Bool
    }
    }


    // keyword->id
    if(keyword->id) {
    if(cJSON_AddStringToObject(item, "id", keyword->id) == NULL) {
    goto fail; //String
    }
    }


    // keyword->parent_id
    if(keyword->parent_id) {
    if(cJSON_AddStringToObject(item, "parent_id", keyword->parent_id) == NULL) {
    goto fail; //String
    }
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_t *keyword_parseFromJSON(cJSON *keywordJSON){

    keyword_t *keyword_local_var = NULL;

    // define the local variable for keyword->match_type
    match_type_response_t *match_type_local_nonprim = NULL;

    // keyword->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keywordJSON, "bid");
    if (bid) { 
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }
    }

    // keyword->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "match_type");
    if (!match_type) {
        goto end;
    }

    
    match_type_local_nonprim = match_type_response_parseFromJSON(match_type); //custom

    // keyword->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(keywordJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }

    // keyword->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(keywordJSON, "archived");
    if (archived) { 
    if(!cJSON_IsBool(archived))
    {
    goto end; //Bool
    }
    }

    // keyword->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(keywordJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // keyword->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(keywordJSON, "parent_id");
    if (parent_id) { 
    if(!cJSON_IsString(parent_id) && !cJSON_IsNull(parent_id))
    {
    goto end; //String
    }
    }

    // keyword->parent_type
    cJSON *parent_type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "parent_type");
    if (parent_type) { 
    if(!cJSON_IsString(parent_type) && !cJSON_IsNull(parent_type))
    {
    goto end; //String
    }
    }

    // keyword->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(keywordJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    keyword_local_var = keyword_create (
        bid ? bid->valuedouble : 0,
        match_type_local_nonprim,
        strdup(value->valuestring),
        archived ? archived->valueint : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        parent_id && !cJSON_IsNull(parent_id) ? strdup(parent_id->valuestring) : NULL,
        parent_type && !cJSON_IsNull(parent_type) ? strdup(parent_type->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL
        );

    return keyword_local_var;
end:
    if (match_type_local_nonprim) {
        match_type_response_free(match_type_local_nonprim);
        match_type_local_nonprim = NULL;
    }
    return NULL;

}
