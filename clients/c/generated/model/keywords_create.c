#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_create.h"



static keywords_create_t *keywords_create_create_internal(
    list_t *keywords,
    char *parent_id
    ) {
    keywords_create_t *keywords_create_local_var = malloc(sizeof(keywords_create_t));
    if (!keywords_create_local_var) {
        return NULL;
    }
    memset(keywords_create_local_var, 0, sizeof(keywords_create_t));
    keywords_create_local_var->_library_owned = 1;
    keywords_create_local_var->keywords = keywords;
    keywords_create_local_var->parent_id = parent_id;
    return keywords_create_local_var;
}

__attribute__((deprecated)) keywords_create_t *keywords_create_create(
    list_t *keywords,
    char *parent_id
    ) {
    keywords_create_t *result = keywords_create_create_internal (
        keywords,
        parent_id
        );
    if (!result) {
    }
    return result;
}

void keywords_create_free(keywords_create_t *keywords_create) {
    if(NULL == keywords_create){
        return ;
    }
    if(keywords_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keywords_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_create->keywords) {
        list_ForEach(listEntry, keywords_create->keywords) {
            keyword_create_item_free(listEntry->data);
        }
        list_freeList(keywords_create->keywords);
        keywords_create->keywords = NULL;
    }
    if (keywords_create->parent_id) {
        free(keywords_create->parent_id);
        keywords_create->parent_id = NULL;
    }
    free(keywords_create);
}

cJSON *keywords_create_convertToJSON(keywords_create_t *keywords_create) {
    cJSON *item = cJSON_CreateObject();

    // keywords_create->keywords
    if (!keywords_create->keywords) {
        goto fail;
    }
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keywords_create->keywords) {
    list_ForEach(keywordsListEntry, keywords_create->keywords) {
    cJSON *itemLocal = keyword_create_item_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }


    // keywords_create->parent_id
    if (!keywords_create->parent_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "parent_id", keywords_create->parent_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keywords_create_t *keywords_create_parseFromJSON(cJSON *keywords_createJSON){

    keywords_create_t *keywords_create_local_var = NULL;

    // define the local list for keywords_create->keywords
    list_t *keywordsList = NULL;

    char *parent_id_local_str = NULL;

    // keywords_create->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keywords_createJSON, "keywords");
    if (cJSON_IsNull(keywords)) {
        keywords = NULL;
    }
    if (!keywords) {
        goto end;
    }

    
    cJSON *keywords_local_nonprimitive = NULL;
    if(!cJSON_IsArray(keywords)){
        goto end; //nonprimitive container
    }

    keywordsList = list_createList();

    cJSON_ArrayForEach(keywords_local_nonprimitive,keywords )
    {
        if(!cJSON_IsObject(keywords_local_nonprimitive)){
            goto end;
        }
        keyword_create_item_t *keywordsItem = keyword_create_item_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }

    // keywords_create->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(keywords_createJSON, "parent_id");
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


    if (parent_id && !cJSON_IsNull(parent_id)) parent_id_local_str = strdup(parent_id->valuestring);

    keywords_create_local_var = keywords_create_create_internal (
        keywordsList,
        parent_id_local_str
        );

    if (!keywords_create_local_var) {
        goto end;
    }

    return keywords_create_local_var;
end:
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_create_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    if (parent_id_local_str) {
        free(parent_id_local_str);
        parent_id_local_str = NULL;
    }
    return NULL;

}
