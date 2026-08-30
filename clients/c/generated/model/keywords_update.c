#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_update.h"



static keywords_update_t *keywords_update_create_internal(
    list_t *keywords
    ) {
    keywords_update_t *keywords_update_local_var = malloc(sizeof(keywords_update_t));
    if (!keywords_update_local_var) {
        return NULL;
    }
    memset(keywords_update_local_var, 0, sizeof(keywords_update_t));
    keywords_update_local_var->_library_owned = 1;
    keywords_update_local_var->keywords = keywords;
    return keywords_update_local_var;
}

__attribute__((deprecated)) keywords_update_t *keywords_update_create(
    list_t *keywords
    ) {
    keywords_update_t *result = keywords_update_create_internal (
        keywords
        );
    if (!result) {
    }
    return result;
}

void keywords_update_free(keywords_update_t *keywords_update) {
    if(NULL == keywords_update){
        return ;
    }
    if(keywords_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keywords_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_update->keywords) {
        list_ForEach(listEntry, keywords_update->keywords) {
            keyword_update_item_free(listEntry->data);
        }
        list_freeList(keywords_update->keywords);
        keywords_update->keywords = NULL;
    }
    free(keywords_update);
}

cJSON *keywords_update_convertToJSON(keywords_update_t *keywords_update) {
    cJSON *item = cJSON_CreateObject();

    // keywords_update->keywords
    if(keywords_update->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keywords_update->keywords) {
    list_ForEach(keywordsListEntry, keywords_update->keywords) {
    cJSON *itemLocal = keyword_update_item_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keywords_update_t *keywords_update_parseFromJSON(cJSON *keywords_updateJSON){

    keywords_update_t *keywords_update_local_var = NULL;

    // define the local list for keywords_update->keywords
    list_t *keywordsList = NULL;

    // keywords_update->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keywords_updateJSON, "keywords");
    if (cJSON_IsNull(keywords)) {
        keywords = NULL;
    }
    if (keywords) { 
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
        keyword_update_item_t *keywordsItem = keyword_update_item_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }



    keywords_update_local_var = keywords_update_create_internal (
        keywords ? keywordsList : NULL
        );

    if (!keywords_update_local_var) {
        goto end;
    }

    return keywords_update_local_var;
end:
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_update_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
