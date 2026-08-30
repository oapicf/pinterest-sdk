#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords.h"



static keywords_t *keywords_create_internal(
    list_t *errors,
    list_t *keywords
    ) {
    keywords_t *keywords_local_var = malloc(sizeof(keywords_t));
    if (!keywords_local_var) {
        return NULL;
    }
    memset(keywords_local_var, 0, sizeof(keywords_t));
    keywords_local_var->_library_owned = 1;
    keywords_local_var->errors = errors;
    keywords_local_var->keywords = keywords;
    return keywords_local_var;
}

__attribute__((deprecated)) keywords_t *keywords_create(
    list_t *errors,
    list_t *keywords
    ) {
    keywords_t *result = keywords_create_internal (
        errors,
        keywords
        );
    if (!result) {
    }
    return result;
}

void keywords_free(keywords_t *keywords) {
    if(NULL == keywords){
        return ;
    }
    if(keywords->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keywords_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keywords->errors) {
        list_ForEach(listEntry, keywords->errors) {
            keyword_error_free(listEntry->data);
        }
        list_freeList(keywords->errors);
        keywords->errors = NULL;
    }
    if (keywords->keywords) {
        list_ForEach(listEntry, keywords->keywords) {
            keyword_free(listEntry->data);
        }
        list_freeList(keywords->keywords);
        keywords->keywords = NULL;
    }
    free(keywords);
}

cJSON *keywords_convertToJSON(keywords_t *keywords) {
    cJSON *item = cJSON_CreateObject();

    // keywords->errors
    if (!keywords->errors) {
        goto fail;
    }
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (keywords->errors) {
    list_ForEach(errorsListEntry, keywords->errors) {
    cJSON *itemLocal = keyword_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }


    // keywords->keywords
    if (!keywords->keywords) {
        goto fail;
    }
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keywords->keywords) {
    list_ForEach(keywordsListEntry, keywords->keywords) {
    cJSON *itemLocal = keyword_convertToJSON(keywordsListEntry->data);
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

keywords_t *keywords_parseFromJSON(cJSON *keywordsJSON){

    keywords_t *keywords_local_var = NULL;

    // define the local list for keywords->errors
    list_t *errorsList = NULL;

    // define the local list for keywords->keywords
    list_t *keywordsList = NULL;

    // keywords->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(keywordsJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (!errors) {
        goto end;
    }

    
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
        keyword_error_t *errorsItem = keyword_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }

    // keywords->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keywordsJSON, "keywords");
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
        keyword_t *keywordsItem = keyword_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }



    keywords_local_var = keywords_create_internal (
        errorsList,
        keywordsList
        );

    if (!keywords_local_var) {
        goto end;
    }

    return keywords_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            keyword_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
