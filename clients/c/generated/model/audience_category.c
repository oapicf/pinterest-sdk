#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_category.h"



static audience_category_t *audience_category_create_internal(
    char *id,
    double *index,
    char *key,
    char *name,
    double *ratio,
    list_t *subcategories
    ) {
    audience_category_t *audience_category_local_var = malloc(sizeof(audience_category_t));
    if (!audience_category_local_var) {
        return NULL;
    }
    memset(audience_category_local_var, 0, sizeof(audience_category_t));
    audience_category_local_var->_library_owned = 1;
    audience_category_local_var->id = id;
    audience_category_local_var->index = index;
    audience_category_local_var->key = key;
    audience_category_local_var->name = name;
    audience_category_local_var->ratio = ratio;
    audience_category_local_var->subcategories = subcategories;
    return audience_category_local_var;
}

__attribute__((deprecated)) audience_category_t *audience_category_create(
    char *id,
    double *index,
    char *key,
    char *name,
    double *ratio,
    list_t *subcategories
    ) {
    double *index_copy = NULL;
    if (index) {
        index_copy = malloc(sizeof(double));
        if (index_copy) *index_copy = *index;
    }
    double *ratio_copy = NULL;
    if (ratio) {
        ratio_copy = malloc(sizeof(double));
        if (ratio_copy) *ratio_copy = *ratio;
    }
    audience_category_t *result = audience_category_create_internal (
        id,
        index_copy,
        key,
        name,
        ratio_copy,
        subcategories
        );
    if (!result) {
        free(index_copy);
        free(ratio_copy);
    }
    return result;
}

void audience_category_free(audience_category_t *audience_category) {
    if(NULL == audience_category){
        return ;
    }
    if(audience_category->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_category_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_category->id) {
        free(audience_category->id);
        audience_category->id = NULL;
    }
    if (audience_category->index) {
        free(audience_category->index);
        audience_category->index = NULL;
    }
    if (audience_category->key) {
        free(audience_category->key);
        audience_category->key = NULL;
    }
    if (audience_category->name) {
        free(audience_category->name);
        audience_category->name = NULL;
    }
    if (audience_category->ratio) {
        free(audience_category->ratio);
        audience_category->ratio = NULL;
    }
    if (audience_category->subcategories) {
        list_ForEach(listEntry, audience_category->subcategories) {
            audience_subcategory_free(listEntry->data);
        }
        list_freeList(audience_category->subcategories);
        audience_category->subcategories = NULL;
    }
    free(audience_category);
}

cJSON *audience_category_convertToJSON(audience_category_t *audience_category) {
    cJSON *item = cJSON_CreateObject();

    // audience_category->id
    if(audience_category->id) {
    if(cJSON_AddStringToObject(item, "id", audience_category->id) == NULL) {
    goto fail; //String
    }
    }


    // audience_category->index
    if(audience_category->index) {
    if(cJSON_AddNumberToObject(item, "index", *audience_category->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_category->key
    if(audience_category->key) {
    if(cJSON_AddStringToObject(item, "key", audience_category->key) == NULL) {
    goto fail; //String
    }
    }


    // audience_category->name
    if(audience_category->name) {
    if(cJSON_AddStringToObject(item, "name", audience_category->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_category->ratio
    if(audience_category->ratio) {
    if(cJSON_AddNumberToObject(item, "ratio", *audience_category->ratio) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_category->subcategories
    if(audience_category->subcategories) {
    cJSON *subcategories = cJSON_AddArrayToObject(item, "subcategories");
    if(subcategories == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *subcategoriesListEntry;
    if (audience_category->subcategories) {
    list_ForEach(subcategoriesListEntry, audience_category->subcategories) {
    cJSON *itemLocal = audience_subcategory_convertToJSON(subcategoriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(subcategories, itemLocal);
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

audience_category_t *audience_category_parseFromJSON(cJSON *audience_categoryJSON){

    audience_category_t *audience_category_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for audience_category->index
    double *index_local_var = NULL;

    char *key_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for audience_category->ratio
    double *ratio_local_var = NULL;

    // define the local list for audience_category->subcategories
    list_t *subcategoriesList = NULL;

    // audience_category->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audience_category->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    index_local_var = malloc(sizeof(double));
    if(!index_local_var)
    {
        goto end;
    }
    *index_local_var = index->valuedouble;
    }

    // audience_category->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "key");
    if (cJSON_IsNull(key)) {
        key = NULL;
    }
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_category->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_category->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "ratio");
    if (cJSON_IsNull(ratio)) {
        ratio = NULL;
    }
    if (ratio) { 
    if(!cJSON_IsNumber(ratio))
    {
    goto end; //Numeric
    }
    ratio_local_var = malloc(sizeof(double));
    if(!ratio_local_var)
    {
        goto end;
    }
    *ratio_local_var = ratio->valuedouble;
    }

    // audience_category->subcategories
    cJSON *subcategories = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "subcategories");
    if (cJSON_IsNull(subcategories)) {
        subcategories = NULL;
    }
    if (subcategories) { 
    cJSON *subcategories_local_nonprimitive = NULL;
    if(!cJSON_IsArray(subcategories)){
        goto end; //nonprimitive container
    }

    subcategoriesList = list_createList();

    cJSON_ArrayForEach(subcategories_local_nonprimitive,subcategories )
    {
        if(!cJSON_IsObject(subcategories_local_nonprimitive)){
            goto end;
        }
        audience_subcategory_t *subcategoriesItem = audience_subcategory_parseFromJSON(subcategories_local_nonprimitive);

        list_addElement(subcategoriesList, subcategoriesItem);
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (key && !cJSON_IsNull(key)) key_local_str = strdup(key->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    audience_category_local_var = audience_category_create_internal (
        id_local_str,
        index_local_var,
        key_local_str,
        name_local_str,
        ratio_local_var,
        subcategories ? subcategoriesList : NULL
        );

    if (!audience_category_local_var) {
        goto end;
    }

    return audience_category_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (index_local_var) {
        free(index_local_var);
        index_local_var = NULL;
    }
    if (key_local_str) {
        free(key_local_str);
        key_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (ratio_local_var) {
        free(ratio_local_var);
        ratio_local_var = NULL;
    }
    if (subcategoriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, subcategoriesList) {
            audience_subcategory_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(subcategoriesList);
        subcategoriesList = NULL;
    }
    return NULL;

}
