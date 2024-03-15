#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_request.h"



keywords_request_t *keywords_request_create(
    list_t *keywords,
    char *parent_id
    ) {
    keywords_request_t *keywords_request_local_var = malloc(sizeof(keywords_request_t));
    if (!keywords_request_local_var) {
        return NULL;
    }
    keywords_request_local_var->keywords = keywords;
    keywords_request_local_var->parent_id = parent_id;

    return keywords_request_local_var;
}


void keywords_request_free(keywords_request_t *keywords_request) {
    if(NULL == keywords_request){
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_request->keywords) {
        list_ForEach(listEntry, keywords_request->keywords) {
            keywords_common_free(listEntry->data);
        }
        list_freeList(keywords_request->keywords);
        keywords_request->keywords = NULL;
    }
    if (keywords_request->parent_id) {
        free(keywords_request->parent_id);
        keywords_request->parent_id = NULL;
    }
    free(keywords_request);
}

cJSON *keywords_request_convertToJSON(keywords_request_t *keywords_request) {
    cJSON *item = cJSON_CreateObject();

    // keywords_request->keywords
    if (!keywords_request->keywords) {
        goto fail;
    }
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keywords_request->keywords) {
    list_ForEach(keywordsListEntry, keywords_request->keywords) {
    cJSON *itemLocal = keywords_common_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }


    // keywords_request->parent_id
    if (!keywords_request->parent_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "parent_id", keywords_request->parent_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keywords_request_t *keywords_request_parseFromJSON(cJSON *keywords_requestJSON){

    keywords_request_t *keywords_request_local_var = NULL;

    // define the local list for keywords_request->keywords
    list_t *keywordsList = NULL;

    // keywords_request->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keywords_requestJSON, "keywords");
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
        keywords_common_t *keywordsItem = keywords_common_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }

    // keywords_request->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(keywords_requestJSON, "parent_id");
    if (!parent_id) {
        goto end;
    }

    
    if(!cJSON_IsString(parent_id))
    {
    goto end; //String
    }


    keywords_request_local_var = keywords_request_create (
        keywordsList,
        strdup(parent_id->valuestring)
        );

    return keywords_request_local_var;
end:
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keywords_common_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
