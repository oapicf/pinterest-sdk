#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_category.h"



audience_category_t *audience_category_create(
    char *key,
    char *name,
    double ratio,
    double index,
    char *id,
    list_t *subcategories
    ) {
    audience_category_t *audience_category_local_var = malloc(sizeof(audience_category_t));
    if (!audience_category_local_var) {
        return NULL;
    }
    audience_category_local_var->key = key;
    audience_category_local_var->name = name;
    audience_category_local_var->ratio = ratio;
    audience_category_local_var->index = index;
    audience_category_local_var->id = id;
    audience_category_local_var->subcategories = subcategories;

    return audience_category_local_var;
}


void audience_category_free(audience_category_t *audience_category) {
    if(NULL == audience_category){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_category->key) {
        free(audience_category->key);
        audience_category->key = NULL;
    }
    if (audience_category->name) {
        free(audience_category->name);
        audience_category->name = NULL;
    }
    if (audience_category->id) {
        free(audience_category->id);
        audience_category->id = NULL;
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
    if(cJSON_AddNumberToObject(item, "ratio", audience_category->ratio) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_category->index
    if(audience_category->index) {
    if(cJSON_AddNumberToObject(item, "index", audience_category->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_category->id
    if(audience_category->id) {
    if(cJSON_AddStringToObject(item, "id", audience_category->id) == NULL) {
    goto fail; //String
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

    // define the local list for audience_category->subcategories
    list_t *subcategoriesList = NULL;

    // audience_category->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "key");
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_category->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_category->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "ratio");
    if (ratio) { 
    if(!cJSON_IsNumber(ratio))
    {
    goto end; //Numeric
    }
    }

    // audience_category->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // audience_category->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audience_category->subcategories
    cJSON *subcategories = cJSON_GetObjectItemCaseSensitive(audience_categoryJSON, "subcategories");
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


    audience_category_local_var = audience_category_create (
        key && !cJSON_IsNull(key) ? strdup(key->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        ratio ? ratio->valuedouble : 0,
        index ? index->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        subcategories ? subcategoriesList : NULL
        );

    return audience_category_local_var;
end:
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
