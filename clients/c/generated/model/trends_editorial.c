#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_editorial.h"



static trends_editorial_t *trends_editorial_create_internal(
    char *board_url,
    char *description,
    list_t *interests,
    list_t *pins_url,
    list_t *related_keywords,
    char *title
    ) {
    trends_editorial_t *trends_editorial_local_var = malloc(sizeof(trends_editorial_t));
    if (!trends_editorial_local_var) {
        return NULL;
    }
    memset(trends_editorial_local_var, 0, sizeof(trends_editorial_t));
    trends_editorial_local_var->_library_owned = 1;
    trends_editorial_local_var->board_url = board_url;
    trends_editorial_local_var->description = description;
    trends_editorial_local_var->interests = interests;
    trends_editorial_local_var->pins_url = pins_url;
    trends_editorial_local_var->related_keywords = related_keywords;
    trends_editorial_local_var->title = title;
    return trends_editorial_local_var;
}

__attribute__((deprecated)) trends_editorial_t *trends_editorial_create(
    char *board_url,
    char *description,
    list_t *interests,
    list_t *pins_url,
    list_t *related_keywords,
    char *title
    ) {
    trends_editorial_t *result = trends_editorial_create_internal (
        board_url,
        description,
        interests,
        pins_url,
        related_keywords,
        title
        );
    if (!result) {
    }
    return result;
}

void trends_editorial_free(trends_editorial_t *trends_editorial) {
    if(NULL == trends_editorial){
        return ;
    }
    if(trends_editorial->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trends_editorial_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trends_editorial->board_url) {
        free(trends_editorial->board_url);
        trends_editorial->board_url = NULL;
    }
    if (trends_editorial->description) {
        free(trends_editorial->description);
        trends_editorial->description = NULL;
    }
    if (trends_editorial->interests) {
        list_ForEach(listEntry, trends_editorial->interests) {
            free(listEntry->data);
        }
        list_freeList(trends_editorial->interests);
        trends_editorial->interests = NULL;
    }
    if (trends_editorial->pins_url) {
        list_ForEach(listEntry, trends_editorial->pins_url) {
            free(listEntry->data);
        }
        list_freeList(trends_editorial->pins_url);
        trends_editorial->pins_url = NULL;
    }
    if (trends_editorial->related_keywords) {
        list_ForEach(listEntry, trends_editorial->related_keywords) {
            keyword_info_free(listEntry->data);
        }
        list_freeList(trends_editorial->related_keywords);
        trends_editorial->related_keywords = NULL;
    }
    if (trends_editorial->title) {
        free(trends_editorial->title);
        trends_editorial->title = NULL;
    }
    free(trends_editorial);
}

cJSON *trends_editorial_convertToJSON(trends_editorial_t *trends_editorial) {
    cJSON *item = cJSON_CreateObject();

    // trends_editorial->board_url
    if (!trends_editorial->board_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "board_url", trends_editorial->board_url) == NULL) {
    goto fail; //String
    }


    // trends_editorial->description
    if (!trends_editorial->description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "description", trends_editorial->description) == NULL) {
    goto fail; //String
    }


    // trends_editorial->interests
    if (!trends_editorial->interests) {
        goto fail;
    }
    cJSON *interests = cJSON_AddArrayToObject(item, "interests");
    if(interests == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *interestsListEntry;
    list_ForEach(interestsListEntry, trends_editorial->interests) {
    if(cJSON_AddStringToObject(interests, "", interestsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // trends_editorial->pins_url
    if (!trends_editorial->pins_url) {
        goto fail;
    }
    cJSON *pins_url = cJSON_AddArrayToObject(item, "pins_url");
    if(pins_url == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *pins_urlListEntry;
    list_ForEach(pins_urlListEntry, trends_editorial->pins_url) {
    if(cJSON_AddStringToObject(pins_url, "", pins_urlListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // trends_editorial->related_keywords
    if (!trends_editorial->related_keywords) {
        goto fail;
    }
    cJSON *related_keywords = cJSON_AddArrayToObject(item, "related_keywords");
    if(related_keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *related_keywordsListEntry;
    if (trends_editorial->related_keywords) {
    list_ForEach(related_keywordsListEntry, trends_editorial->related_keywords) {
    cJSON *itemLocal = keyword_info_convertToJSON(related_keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(related_keywords, itemLocal);
    }
    }


    // trends_editorial->title
    if (!trends_editorial->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", trends_editorial->title) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

trends_editorial_t *trends_editorial_parseFromJSON(cJSON *trends_editorialJSON){

    trends_editorial_t *trends_editorial_local_var = NULL;

    char *board_url_local_str = NULL;

    char *description_local_str = NULL;

    // define the local list for trends_editorial->interests
    list_t *interestsList = NULL;

    // define the local list for trends_editorial->pins_url
    list_t *pins_urlList = NULL;

    // define the local list for trends_editorial->related_keywords
    list_t *related_keywordsList = NULL;

    char *title_local_str = NULL;

    // trends_editorial->board_url
    cJSON *board_url = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "board_url");
    if (cJSON_IsNull(board_url)) {
        board_url = NULL;
    }
    if (!board_url) {
        goto end;
    }

    
    if(!cJSON_IsString(board_url))
    {
    goto end; //String
    }

    // trends_editorial->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (!description) {
        goto end;
    }

    
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }

    // trends_editorial->interests
    cJSON *interests = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "interests");
    if (cJSON_IsNull(interests)) {
        interests = NULL;
    }
    if (!interests) {
        goto end;
    }

    
    cJSON *interests_local = NULL;
    if(!cJSON_IsArray(interests)) {
        goto end;//primitive container
    }
    interestsList = list_createList();

    cJSON_ArrayForEach(interests_local, interests)
    {
        if(!cJSON_IsString(interests_local))
        {
            goto end;
        }
        list_addElement(interestsList , strdup(interests_local->valuestring));
    }

    // trends_editorial->pins_url
    cJSON *pins_url = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "pins_url");
    if (cJSON_IsNull(pins_url)) {
        pins_url = NULL;
    }
    if (!pins_url) {
        goto end;
    }

    
    cJSON *pins_url_local = NULL;
    if(!cJSON_IsArray(pins_url)) {
        goto end;//primitive container
    }
    pins_urlList = list_createList();

    cJSON_ArrayForEach(pins_url_local, pins_url)
    {
        if(!cJSON_IsString(pins_url_local))
        {
            goto end;
        }
        list_addElement(pins_urlList , strdup(pins_url_local->valuestring));
    }

    // trends_editorial->related_keywords
    cJSON *related_keywords = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "related_keywords");
    if (cJSON_IsNull(related_keywords)) {
        related_keywords = NULL;
    }
    if (!related_keywords) {
        goto end;
    }

    
    cJSON *related_keywords_local_nonprimitive = NULL;
    if(!cJSON_IsArray(related_keywords)){
        goto end; //nonprimitive container
    }

    related_keywordsList = list_createList();

    cJSON_ArrayForEach(related_keywords_local_nonprimitive,related_keywords )
    {
        if(!cJSON_IsObject(related_keywords_local_nonprimitive)){
            goto end;
        }
        keyword_info_t *related_keywordsItem = keyword_info_parseFromJSON(related_keywords_local_nonprimitive);

        list_addElement(related_keywordsList, related_keywordsItem);
    }

    // trends_editorial->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(trends_editorialJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }


    if (board_url && !cJSON_IsNull(board_url)) board_url_local_str = strdup(board_url->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    trends_editorial_local_var = trends_editorial_create_internal (
        board_url_local_str,
        description_local_str,
        interestsList,
        pins_urlList,
        related_keywordsList,
        title_local_str
        );

    if (!trends_editorial_local_var) {
        goto end;
    }

    return trends_editorial_local_var;
end:
    if (board_url_local_str) {
        free(board_url_local_str);
        board_url_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (interestsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, interestsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(interestsList);
        interestsList = NULL;
    }
    if (pins_urlList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pins_urlList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pins_urlList);
        pins_urlList = NULL;
    }
    if (related_keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_keywordsList) {
            keyword_info_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_keywordsList);
        related_keywordsList = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
