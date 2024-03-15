#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_response.h"



keywords_response_t *keywords_response_create(
    list_t *errors,
    list_t *keywords
    ) {
    keywords_response_t *keywords_response_local_var = malloc(sizeof(keywords_response_t));
    if (!keywords_response_local_var) {
        return NULL;
    }
    keywords_response_local_var->errors = errors;
    keywords_response_local_var->keywords = keywords;

    return keywords_response_local_var;
}


void keywords_response_free(keywords_response_t *keywords_response) {
    if(NULL == keywords_response){
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_response->errors) {
        list_ForEach(listEntry, keywords_response->errors) {
            keyword_error_free(listEntry->data);
        }
        list_freeList(keywords_response->errors);
        keywords_response->errors = NULL;
    }
    if (keywords_response->keywords) {
        list_ForEach(listEntry, keywords_response->keywords) {
            keyword_free(listEntry->data);
        }
        list_freeList(keywords_response->keywords);
        keywords_response->keywords = NULL;
    }
    free(keywords_response);
}

cJSON *keywords_response_convertToJSON(keywords_response_t *keywords_response) {
    cJSON *item = cJSON_CreateObject();

    // keywords_response->errors
    if(keywords_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (keywords_response->errors) {
    list_ForEach(errorsListEntry, keywords_response->errors) {
    cJSON *itemLocal = keyword_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // keywords_response->keywords
    if(keywords_response->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (keywords_response->keywords) {
    list_ForEach(keywordsListEntry, keywords_response->keywords) {
    cJSON *itemLocal = keyword_convertToJSON(keywordsListEntry->data);
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

keywords_response_t *keywords_response_parseFromJSON(cJSON *keywords_responseJSON){

    keywords_response_t *keywords_response_local_var = NULL;

    // define the local list for keywords_response->errors
    list_t *errorsList = NULL;

    // define the local list for keywords_response->keywords
    list_t *keywordsList = NULL;

    // keywords_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(keywords_responseJSON, "errors");
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
        keyword_error_t *errorsItem = keyword_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // keywords_response->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(keywords_responseJSON, "keywords");
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
        keyword_t *keywordsItem = keyword_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }


    keywords_response_local_var = keywords_response_create (
        errors ? errorsList : NULL,
        keywords ? keywordsList : NULL
        );

    return keywords_response_local_var;
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
