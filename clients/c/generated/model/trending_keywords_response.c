#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keywords_response.h"



trending_keywords_response_t *trending_keywords_response_create(
    list_t *trends
    ) {
    trending_keywords_response_t *trending_keywords_response_local_var = malloc(sizeof(trending_keywords_response_t));
    if (!trending_keywords_response_local_var) {
        return NULL;
    }
    trending_keywords_response_local_var->trends = trends;

    return trending_keywords_response_local_var;
}


void trending_keywords_response_free(trending_keywords_response_t *trending_keywords_response) {
    if(NULL == trending_keywords_response){
        return ;
    }
    listEntry_t *listEntry;
    if (trending_keywords_response->trends) {
        list_ForEach(listEntry, trending_keywords_response->trends) {
            trending_keywords_response_trends_inner_free(listEntry->data);
        }
        list_freeList(trending_keywords_response->trends);
        trending_keywords_response->trends = NULL;
    }
    free(trending_keywords_response);
}

cJSON *trending_keywords_response_convertToJSON(trending_keywords_response_t *trending_keywords_response) {
    cJSON *item = cJSON_CreateObject();

    // trending_keywords_response->trends
    if(trending_keywords_response->trends) {
    cJSON *trends = cJSON_AddArrayToObject(item, "trends");
    if(trends == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *trendsListEntry;
    if (trending_keywords_response->trends) {
    list_ForEach(trendsListEntry, trending_keywords_response->trends) {
    cJSON *itemLocal = trending_keywords_response_trends_inner_convertToJSON(trendsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(trends, itemLocal);
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

trending_keywords_response_t *trending_keywords_response_parseFromJSON(cJSON *trending_keywords_responseJSON){

    trending_keywords_response_t *trending_keywords_response_local_var = NULL;

    // define the local list for trending_keywords_response->trends
    list_t *trendsList = NULL;

    // trending_keywords_response->trends
    cJSON *trends = cJSON_GetObjectItemCaseSensitive(trending_keywords_responseJSON, "trends");
    if (trends) { 
    cJSON *trends_local_nonprimitive = NULL;
    if(!cJSON_IsArray(trends)){
        goto end; //nonprimitive container
    }

    trendsList = list_createList();

    cJSON_ArrayForEach(trends_local_nonprimitive,trends )
    {
        if(!cJSON_IsObject(trends_local_nonprimitive)){
            goto end;
        }
        trending_keywords_response_trends_inner_t *trendsItem = trending_keywords_response_trends_inner_parseFromJSON(trends_local_nonprimitive);

        list_addElement(trendsList, trendsItem);
    }
    }


    trending_keywords_response_local_var = trending_keywords_response_create (
        trends ? trendsList : NULL
        );

    return trending_keywords_response_local_var;
end:
    if (trendsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, trendsList) {
            trending_keywords_response_trends_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(trendsList);
        trendsList = NULL;
    }
    return NULL;

}
