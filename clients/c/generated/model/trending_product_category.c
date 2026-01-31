#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_product_category.h"


char* trending_product_category_verticals_ToString(pinterest_rest_api_trending_product_category__e verticals) {
    char *verticalsArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    return verticalsArray[verticals - 1];
}

pinterest_rest_api_trending_product_category__e trending_product_category_verticals_FromString(char* verticals) {
    int stringToReturn = 0;
    char *verticalsArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    size_t sizeofArray = sizeof(verticalsArray) / sizeof(verticalsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(verticals, verticalsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static trending_product_category_t *trending_product_category_create_internal(
    product_categories_engagement_type_t *engagement_type,
    int pct_change_mom,
    int percent_relative_volume,
    char *product_category,
    list_t *verticals
    ) {
    trending_product_category_t *trending_product_category_local_var = malloc(sizeof(trending_product_category_t));
    if (!trending_product_category_local_var) {
        return NULL;
    }
    trending_product_category_local_var->engagement_type = engagement_type;
    trending_product_category_local_var->pct_change_mom = pct_change_mom;
    trending_product_category_local_var->percent_relative_volume = percent_relative_volume;
    trending_product_category_local_var->product_category = product_category;
    trending_product_category_local_var->verticals = verticals;

    trending_product_category_local_var->_library_owned = 1;
    return trending_product_category_local_var;
}

__attribute__((deprecated)) trending_product_category_t *trending_product_category_create(
    product_categories_engagement_type_t *engagement_type,
    int pct_change_mom,
    int percent_relative_volume,
    char *product_category,
    list_t *verticals
    ) {
    return trending_product_category_create_internal (
        engagement_type,
        pct_change_mom,
        percent_relative_volume,
        product_category,
        verticals
        );
}

void trending_product_category_free(trending_product_category_t *trending_product_category) {
    if(NULL == trending_product_category){
        return ;
    }
    if(trending_product_category->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_product_category_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trending_product_category->engagement_type) {
        product_categories_engagement_type_free(trending_product_category->engagement_type);
        trending_product_category->engagement_type = NULL;
    }
    if (trending_product_category->product_category) {
        free(trending_product_category->product_category);
        trending_product_category->product_category = NULL;
    }
    if (trending_product_category->verticals) {
        list_ForEach(listEntry, trending_product_category->verticals) {
            vertical_product_category_free(listEntry->data);
        }
        list_freeList(trending_product_category->verticals);
        trending_product_category->verticals = NULL;
    }
    free(trending_product_category);
}

cJSON *trending_product_category_convertToJSON(trending_product_category_t *trending_product_category) {
    cJSON *item = cJSON_CreateObject();

    // trending_product_category->engagement_type
    if (!trending_product_category->engagement_type) {
        goto fail;
    }
    cJSON *engagement_type_local_JSON = product_categories_engagement_type_convertToJSON(trending_product_category->engagement_type);
    if(engagement_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "engagement_type", engagement_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // trending_product_category->pct_change_mom
    if (!trending_product_category->pct_change_mom) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "pct_change_mom", trending_product_category->pct_change_mom) == NULL) {
    goto fail; //Numeric
    }


    // trending_product_category->percent_relative_volume
    if (!trending_product_category->percent_relative_volume) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "percent_relative_volume", trending_product_category->percent_relative_volume) == NULL) {
    goto fail; //Numeric
    }


    // trending_product_category->product_category
    if (!trending_product_category->product_category) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "product_category", trending_product_category->product_category) == NULL) {
    goto fail; //String
    }


    // trending_product_category->verticals
    if(trending_product_category->verticals != pinterest_rest_api_list_VERTICALS_NULL) {
    cJSON *verticals = cJSON_AddArrayToObject(item, "verticals");
    if(verticals == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *verticalsListEntry;
    if (trending_product_category->verticals) {
    list_ForEach(verticalsListEntry, trending_product_category->verticals) {
    cJSON *itemLocal = vertical_product_category_convertToJSON((pinterest_rest_api_trending_product_category__e)verticalsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(verticals, itemLocal);
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

trending_product_category_t *trending_product_category_parseFromJSON(cJSON *trending_product_categoryJSON){

    trending_product_category_t *trending_product_category_local_var = NULL;

    // define the local variable for trending_product_category->engagement_type
    product_categories_engagement_type_t *engagement_type_local_nonprim = NULL;

    // define the local list for trending_product_category->verticals
    list_t *verticalsList = NULL;

    // trending_product_category->engagement_type
    cJSON *engagement_type = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "engagement_type");
    if (cJSON_IsNull(engagement_type)) {
        engagement_type = NULL;
    }
    if (!engagement_type) {
        goto end;
    }

    
    engagement_type_local_nonprim = product_categories_engagement_type_parseFromJSON(engagement_type); //custom

    // trending_product_category->pct_change_mom
    cJSON *pct_change_mom = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "pct_change_mom");
    if (cJSON_IsNull(pct_change_mom)) {
        pct_change_mom = NULL;
    }
    if (!pct_change_mom) {
        goto end;
    }

    
    if(!cJSON_IsNumber(pct_change_mom))
    {
    goto end; //Numeric
    }

    // trending_product_category->percent_relative_volume
    cJSON *percent_relative_volume = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "percent_relative_volume");
    if (cJSON_IsNull(percent_relative_volume)) {
        percent_relative_volume = NULL;
    }
    if (!percent_relative_volume) {
        goto end;
    }

    
    if(!cJSON_IsNumber(percent_relative_volume))
    {
    goto end; //Numeric
    }

    // trending_product_category->product_category
    cJSON *product_category = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "product_category");
    if (cJSON_IsNull(product_category)) {
        product_category = NULL;
    }
    if (!product_category) {
        goto end;
    }

    
    if(!cJSON_IsString(product_category))
    {
    goto end; //String
    }

    // trending_product_category->verticals
    cJSON *verticals = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "verticals");
    if (cJSON_IsNull(verticals)) {
        verticals = NULL;
    }
    if (verticals) { 
    cJSON *verticals_local_nonprimitive = NULL;
    if(!cJSON_IsArray(verticals)){
        goto end; //nonprimitive container
    }

    verticalsList = list_createList();

    cJSON_ArrayForEach(verticals_local_nonprimitive,verticals )
    {
        if(!cJSON_IsObject(verticals_local_nonprimitive)){
            goto end;
        }
        trending_product_category_vertical_product_category_e verticalsItem = vertical_product_category_parseFromJSON(verticals_local_nonprimitive);

        list_addElement(verticalsList, (void *)verticalsItem);
    }
    }


    trending_product_category_local_var = trending_product_category_create_internal (
        engagement_type_local_nonprim,
        pct_change_mom->valuedouble,
        percent_relative_volume->valuedouble,
        strdup(product_category->valuestring),
        verticals ? verticalsList : NULL
        );

    return trending_product_category_local_var;
end:
    if (engagement_type_local_nonprim) {
        product_categories_engagement_type_free(engagement_type_local_nonprim);
        engagement_type_local_nonprim = NULL;
    }
    if (verticalsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, verticalsList) {
            vertical_product_category_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(verticalsList);
        verticalsList = NULL;
    }
    return NULL;

}
