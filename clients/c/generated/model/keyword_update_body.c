#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_update_body.h"



static keyword_update_body_t *keyword_update_body_create_internal(
    list_t *keywords
    ) {
    keyword_update_body_t *keyword_update_body_local_var = malloc(sizeof(keyword_update_body_t));
    if (!keyword_update_body_local_var) {
        return NULL;
    }
    keyword_update_body_local_var->keywords = keywords;

    keyword_update_body_local_var->_library_owned = 1;
    return keyword_update_body_local_var;
}

__attribute__((deprecated)) keyword_update_body_t *keyword_update_body_create(
    list_t *keywords
    ) {
    return keyword_update_body_create_internal (
        keywords
        );
}

void keyword_update_body_free(keyword_update_body_t *keyword_update_body) {
    if(NULL == keyword_update_body){
        return ;
    }
    if(keyword_update_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_update_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_update_body->keywords) {
        list_ForEach(listEntry, keyword_update_body->keywords) {
            keyword_update_free(listEntry->data);
        }
        list_freeList(keyword_update_body->keywords);
        keyword_update_body->keywords = NULL;
    }
    free(keyword_update_body);
}

cJSON *keyword_update_body_convertToJSON(keyword_update_body_t *keyword_update_body) {
    cJSON *item = cJSON_CreateObject();

    // keyword_update_body->keywords
    if (!keyword_update_body->keywords) {
        goto fail;
    }
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keyword_update_body->keywords) {
    list_ForEach(keywordsListEntry, keyword_update_body->keywords) {
    cJSON *itemLocal = keyword_update_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_update_body_t *keyword_update_body_parseFromJSON(cJSON *keyword_update_bodyJSON){

    keyword_update_body_t *keyword_update_body_local_var = NULL;

    // define the local list for keyword_update_body->keywords
    list_t *keywordsList = NULL;

    // keyword_update_body->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keyword_update_bodyJSON, "keywords");
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
        keyword_update_t *keywordsItem = keyword_update_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }


    keyword_update_body_local_var = keyword_update_body_create_internal (
        keywordsList
        );

    return keyword_update_body_local_var;
end:
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_update_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
