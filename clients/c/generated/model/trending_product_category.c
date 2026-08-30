#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_product_category.h"



static trending_product_category_t *trending_product_category_create_internal(
    product_categories_engagement_type_t *engagement_type,
    int *pct_change_mom,
    int *percent_relative_volume,
    int *pinterest_product_category_id,
    char *product_category,
    list_t *verticals
    ) {
    trending_product_category_t *trending_product_category_local_var = malloc(sizeof(trending_product_category_t));
    if (!trending_product_category_local_var) {
        return NULL;
    }
    memset(trending_product_category_local_var, 0, sizeof(trending_product_category_t));
    trending_product_category_local_var->_library_owned = 1;
    trending_product_category_local_var->engagement_type = engagement_type;
    trending_product_category_local_var->pct_change_mom = pct_change_mom;
    trending_product_category_local_var->percent_relative_volume = percent_relative_volume;
    trending_product_category_local_var->pinterest_product_category_id = pinterest_product_category_id;
    trending_product_category_local_var->product_category = product_category;
    trending_product_category_local_var->verticals = verticals;
    return trending_product_category_local_var;
}

__attribute__((deprecated)) trending_product_category_t *trending_product_category_create(
    product_categories_engagement_type_t *engagement_type,
    int *pct_change_mom,
    int *percent_relative_volume,
    int *pinterest_product_category_id,
    char *product_category,
    list_t *verticals
    ) {
    int *pct_change_mom_copy = NULL;
    if (pct_change_mom) {
        pct_change_mom_copy = malloc(sizeof(int));
        if (pct_change_mom_copy) *pct_change_mom_copy = *pct_change_mom;
    }
    int *percent_relative_volume_copy = NULL;
    if (percent_relative_volume) {
        percent_relative_volume_copy = malloc(sizeof(int));
        if (percent_relative_volume_copy) *percent_relative_volume_copy = *percent_relative_volume;
    }
    int *pinterest_product_category_id_copy = NULL;
    if (pinterest_product_category_id) {
        pinterest_product_category_id_copy = malloc(sizeof(int));
        if (pinterest_product_category_id_copy) *pinterest_product_category_id_copy = *pinterest_product_category_id;
    }
    trending_product_category_t *result = trending_product_category_create_internal (
        engagement_type,
        pct_change_mom_copy,
        percent_relative_volume_copy,
        pinterest_product_category_id_copy,
        product_category,
        verticals
        );
    if (!result) {
        free(pct_change_mom_copy);
        free(percent_relative_volume_copy);
        free(pinterest_product_category_id_copy);
    }
    return result;
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
    if (trending_product_category->pct_change_mom) {
        free(trending_product_category->pct_change_mom);
        trending_product_category->pct_change_mom = NULL;
    }
    if (trending_product_category->percent_relative_volume) {
        free(trending_product_category->percent_relative_volume);
        trending_product_category->percent_relative_volume = NULL;
    }
    if (trending_product_category->pinterest_product_category_id) {
        free(trending_product_category->pinterest_product_category_id);
        trending_product_category->pinterest_product_category_id = NULL;
    }
    if (trending_product_category->product_category) {
        free(trending_product_category->product_category);
        trending_product_category->product_category = NULL;
    }
    if (trending_product_category->verticals) {
        list_ForEach(listEntry, trending_product_category->verticals) {
            free(listEntry->data);
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
    if(cJSON_AddNumberToObject(item, "pct_change_mom", *trending_product_category->pct_change_mom) == NULL) {
    goto fail; //Numeric
    }


    // trending_product_category->percent_relative_volume
    if (!trending_product_category->percent_relative_volume) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "percent_relative_volume", *trending_product_category->percent_relative_volume) == NULL) {
    goto fail; //Numeric
    }


    // trending_product_category->pinterest_product_category_id
    if (!trending_product_category->pinterest_product_category_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "pinterest_product_category_id", *trending_product_category->pinterest_product_category_id) == NULL) {
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
    if(trending_product_category->verticals) {
    cJSON *verticals = cJSON_AddArrayToObject(item, "verticals");
    if(verticals == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *verticalsListEntry;
    list_ForEach(verticalsListEntry, trending_product_category->verticals) {
    if(cJSON_AddStringToObject(verticals, "", verticalsListEntry->data) == NULL)
    {
        goto fail;
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

    // define the local variable for trending_product_category->pct_change_mom
    int *pct_change_mom_local_var = NULL;

    // define the local variable for trending_product_category->percent_relative_volume
    int *percent_relative_volume_local_var = NULL;

    // define the local variable for trending_product_category->pinterest_product_category_id
    int *pinterest_product_category_id_local_var = NULL;

    char *product_category_local_str = NULL;

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
    pct_change_mom_local_var = malloc(sizeof(int));
    if(!pct_change_mom_local_var)
    {
        goto end;
    }
    *pct_change_mom_local_var = pct_change_mom->valuedouble;

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
    percent_relative_volume_local_var = malloc(sizeof(int));
    if(!percent_relative_volume_local_var)
    {
        goto end;
    }
    *percent_relative_volume_local_var = percent_relative_volume->valuedouble;

    // trending_product_category->pinterest_product_category_id
    cJSON *pinterest_product_category_id = cJSON_GetObjectItemCaseSensitive(trending_product_categoryJSON, "pinterest_product_category_id");
    if (cJSON_IsNull(pinterest_product_category_id)) {
        pinterest_product_category_id = NULL;
    }
    if (!pinterest_product_category_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(pinterest_product_category_id))
    {
    goto end; //Numeric
    }
    pinterest_product_category_id_local_var = malloc(sizeof(int));
    if(!pinterest_product_category_id_local_var)
    {
        goto end;
    }
    *pinterest_product_category_id_local_var = pinterest_product_category_id->valuedouble;

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
    cJSON *verticals_local = NULL;
    if(!cJSON_IsArray(verticals)) {
        goto end;//primitive container
    }
    verticalsList = list_createList();

    cJSON_ArrayForEach(verticals_local, verticals)
    {
        if(!cJSON_IsString(verticals_local))
        {
            goto end;
        }
        list_addElement(verticalsList , strdup(verticals_local->valuestring));
    }
    }


    if (product_category && !cJSON_IsNull(product_category)) product_category_local_str = strdup(product_category->valuestring);

    trending_product_category_local_var = trending_product_category_create_internal (
        engagement_type_local_nonprim,
        pct_change_mom_local_var,
        percent_relative_volume_local_var,
        pinterest_product_category_id_local_var,
        product_category_local_str,
        verticals ? verticalsList : NULL
        );

    if (!trending_product_category_local_var) {
        goto end;
    }

    return trending_product_category_local_var;
end:
    if (engagement_type_local_nonprim) {
        product_categories_engagement_type_free(engagement_type_local_nonprim);
        engagement_type_local_nonprim = NULL;
    }
    if (pct_change_mom_local_var) {
        free(pct_change_mom_local_var);
        pct_change_mom_local_var = NULL;
    }
    if (percent_relative_volume_local_var) {
        free(percent_relative_volume_local_var);
        percent_relative_volume_local_var = NULL;
    }
    if (pinterest_product_category_id_local_var) {
        free(pinterest_product_category_id_local_var);
        pinterest_product_category_id_local_var = NULL;
    }
    if (product_category_local_str) {
        free(product_category_local_str);
        product_category_local_str = NULL;
    }
    if (verticalsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, verticalsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(verticalsList);
        verticalsList = NULL;
    }
    return NULL;

}
