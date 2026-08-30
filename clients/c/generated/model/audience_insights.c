#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_insights.h"



static audience_insights_t *audience_insights_create_internal(
    list_t *categories,
    char *date,
    audience_demographics_t *demographics,
    int *size,
    int *size_is_upper_bound,
    pinterest_rest_api_audience_insight_type__e type
    ) {
    audience_insights_t *audience_insights_local_var = malloc(sizeof(audience_insights_t));
    if (!audience_insights_local_var) {
        return NULL;
    }
    memset(audience_insights_local_var, 0, sizeof(audience_insights_t));
    audience_insights_local_var->_library_owned = 1;
    audience_insights_local_var->categories = categories;
    audience_insights_local_var->date = date;
    audience_insights_local_var->demographics = demographics;
    audience_insights_local_var->size = size;
    audience_insights_local_var->size_is_upper_bound = size_is_upper_bound;
    audience_insights_local_var->type = type;
    return audience_insights_local_var;
}

__attribute__((deprecated)) audience_insights_t *audience_insights_create(
    list_t *categories,
    char *date,
    audience_demographics_t *demographics,
    int *size,
    int *size_is_upper_bound,
    pinterest_rest_api_audience_insight_type__e type
    ) {
    int *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(int));
        if (size_copy) *size_copy = *size;
    }
    int *size_is_upper_bound_copy = NULL;
    if (size_is_upper_bound) {
        size_is_upper_bound_copy = malloc(sizeof(int));
        if (size_is_upper_bound_copy) *size_is_upper_bound_copy = *size_is_upper_bound;
    }
    audience_insights_t *result = audience_insights_create_internal (
        categories,
        date,
        demographics,
        size_copy,
        size_is_upper_bound_copy,
        type
        );
    if (!result) {
        free(size_copy);
        free(size_is_upper_bound_copy);
    }
    return result;
}

void audience_insights_free(audience_insights_t *audience_insights) {
    if(NULL == audience_insights){
        return ;
    }
    if(audience_insights->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_insights_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_insights->categories) {
        list_ForEach(listEntry, audience_insights->categories) {
            audience_category_free(listEntry->data);
        }
        list_freeList(audience_insights->categories);
        audience_insights->categories = NULL;
    }
    if (audience_insights->date) {
        free(audience_insights->date);
        audience_insights->date = NULL;
    }
    if (audience_insights->demographics) {
        audience_demographics_free(audience_insights->demographics);
        audience_insights->demographics = NULL;
    }
    if (audience_insights->size) {
        free(audience_insights->size);
        audience_insights->size = NULL;
    }
    if (audience_insights->size_is_upper_bound) {
        free(audience_insights->size_is_upper_bound);
        audience_insights->size_is_upper_bound = NULL;
    }
    free(audience_insights);
}

cJSON *audience_insights_convertToJSON(audience_insights_t *audience_insights) {
    cJSON *item = cJSON_CreateObject();

    // audience_insights->categories
    if(audience_insights->categories) {
    cJSON *categories = cJSON_AddArrayToObject(item, "categories");
    if(categories == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *categoriesListEntry;
    if (audience_insights->categories) {
    list_ForEach(categoriesListEntry, audience_insights->categories) {
    cJSON *itemLocal = audience_category_convertToJSON(categoriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(categories, itemLocal);
    }
    }
    }


    // audience_insights->date
    if(audience_insights->date) {
    if(cJSON_AddStringToObject(item, "date", audience_insights->date) == NULL) {
    goto fail; //String
    }
    }


    // audience_insights->demographics
    if(audience_insights->demographics) {
    cJSON *demographics_local_JSON = audience_demographics_convertToJSON(audience_insights->demographics);
    if(demographics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "demographics", demographics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_insights->size
    if(audience_insights->size) {
    if(cJSON_AddNumberToObject(item, "size", *audience_insights->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_insights->size_is_upper_bound
    if(audience_insights->size_is_upper_bound) {
    if(cJSON_AddBoolToObject(item, "size_is_upper_bound", *audience_insights->size_is_upper_bound) == NULL) {
    goto fail; //Bool
    }
    }


    // audience_insights->type
    if(audience_insights->type != pinterest_rest_api_audience_insight_type__NULL) {
    cJSON *type_local_JSON = audience_insight_type_convertToJSON(audience_insights->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_insights_t *audience_insights_parseFromJSON(cJSON *audience_insightsJSON){

    audience_insights_t *audience_insights_local_var = NULL;

    // define the local list for audience_insights->categories
    list_t *categoriesList = NULL;

    char *date_local_str = NULL;

    // define the local variable for audience_insights->demographics
    audience_demographics_t *demographics_local_nonprim = NULL;

    // define the local variable for audience_insights->size
    int *size_local_var = NULL;

    // define the local variable for audience_insights->size_is_upper_bound
    int *size_is_upper_bound_local_var = NULL;

    // define the local variable for audience_insights->type
    pinterest_rest_api_audience_insight_type__e type_local_nonprim = 0;

    // audience_insights->categories
    cJSON *categories = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "categories");
    if (cJSON_IsNull(categories)) {
        categories = NULL;
    }
    if (categories) { 
    cJSON *categories_local_nonprimitive = NULL;
    if(!cJSON_IsArray(categories)){
        goto end; //nonprimitive container
    }

    categoriesList = list_createList();

    cJSON_ArrayForEach(categories_local_nonprimitive,categories )
    {
        if(!cJSON_IsObject(categories_local_nonprimitive)){
            goto end;
        }
        audience_category_t *categoriesItem = audience_category_parseFromJSON(categories_local_nonprimitive);

        list_addElement(categoriesList, categoriesItem);
    }
    }

    // audience_insights->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "date");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // audience_insights->demographics
    cJSON *demographics = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "demographics");
    if (cJSON_IsNull(demographics)) {
        demographics = NULL;
    }
    if (demographics) { 
    demographics_local_nonprim = audience_demographics_parseFromJSON(demographics); //nonprimitive
    }

    // audience_insights->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    size_local_var = malloc(sizeof(int));
    if(!size_local_var)
    {
        goto end;
    }
    *size_local_var = size->valuedouble;
    }

    // audience_insights->size_is_upper_bound
    cJSON *size_is_upper_bound = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "size_is_upper_bound");
    if (cJSON_IsNull(size_is_upper_bound)) {
        size_is_upper_bound = NULL;
    }
    if (size_is_upper_bound) { 
    if(!cJSON_IsBool(size_is_upper_bound))
    {
    goto end; //Bool
    }
    size_is_upper_bound_local_var = malloc(sizeof(int));
    if(!size_is_upper_bound_local_var)
    {
        goto end;
    }
    *size_is_upper_bound_local_var = size_is_upper_bound->valueint;
    }

    // audience_insights->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audience_insightsJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = audience_insight_type_parseFromJSON(type); //custom
    }


    if (date && !cJSON_IsNull(date)) date_local_str = strdup(date->valuestring);

    audience_insights_local_var = audience_insights_create_internal (
        categories ? categoriesList : NULL,
        date_local_str,
        demographics ? demographics_local_nonprim : NULL,
        size_local_var,
        size_is_upper_bound_local_var,
        type ? type_local_nonprim : 0
        );

    if (!audience_insights_local_var) {
        goto end;
    }

    return audience_insights_local_var;
end:
    if (categoriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, categoriesList) {
            audience_category_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(categoriesList);
        categoriesList = NULL;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    if (demographics_local_nonprim) {
        audience_demographics_free(demographics_local_nonprim);
        demographics_local_nonprim = NULL;
    }
    if (size_local_var) {
        free(size_local_var);
        size_local_var = NULL;
    }
    if (size_is_upper_bound_local_var) {
        free(size_is_upper_bound_local_var);
        size_is_upper_bound_local_var = NULL;
    }
    if (type_local_nonprim) {
        type_local_nonprim = 0;
    }
    return NULL;

}
