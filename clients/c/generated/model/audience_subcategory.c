#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_subcategory.h"



static audience_subcategory_t *audience_subcategory_create_internal(
    char *id,
    double *index,
    char *key,
    char *name,
    double *ratio
    ) {
    audience_subcategory_t *audience_subcategory_local_var = malloc(sizeof(audience_subcategory_t));
    if (!audience_subcategory_local_var) {
        return NULL;
    }
    memset(audience_subcategory_local_var, 0, sizeof(audience_subcategory_t));
    audience_subcategory_local_var->_library_owned = 1;
    audience_subcategory_local_var->id = id;
    audience_subcategory_local_var->index = index;
    audience_subcategory_local_var->key = key;
    audience_subcategory_local_var->name = name;
    audience_subcategory_local_var->ratio = ratio;
    return audience_subcategory_local_var;
}

__attribute__((deprecated)) audience_subcategory_t *audience_subcategory_create(
    char *id,
    double *index,
    char *key,
    char *name,
    double *ratio
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
    audience_subcategory_t *result = audience_subcategory_create_internal (
        id,
        index_copy,
        key,
        name,
        ratio_copy
        );
    if (!result) {
        free(index_copy);
        free(ratio_copy);
    }
    return result;
}

void audience_subcategory_free(audience_subcategory_t *audience_subcategory) {
    if(NULL == audience_subcategory){
        return ;
    }
    if(audience_subcategory->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_subcategory_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_subcategory->id) {
        free(audience_subcategory->id);
        audience_subcategory->id = NULL;
    }
    if (audience_subcategory->index) {
        free(audience_subcategory->index);
        audience_subcategory->index = NULL;
    }
    if (audience_subcategory->key) {
        free(audience_subcategory->key);
        audience_subcategory->key = NULL;
    }
    if (audience_subcategory->name) {
        free(audience_subcategory->name);
        audience_subcategory->name = NULL;
    }
    if (audience_subcategory->ratio) {
        free(audience_subcategory->ratio);
        audience_subcategory->ratio = NULL;
    }
    free(audience_subcategory);
}

cJSON *audience_subcategory_convertToJSON(audience_subcategory_t *audience_subcategory) {
    cJSON *item = cJSON_CreateObject();

    // audience_subcategory->id
    if(audience_subcategory->id) {
    if(cJSON_AddStringToObject(item, "id", audience_subcategory->id) == NULL) {
    goto fail; //String
    }
    }


    // audience_subcategory->index
    if(audience_subcategory->index) {
    if(cJSON_AddNumberToObject(item, "index", *audience_subcategory->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_subcategory->key
    if(audience_subcategory->key) {
    if(cJSON_AddStringToObject(item, "key", audience_subcategory->key) == NULL) {
    goto fail; //String
    }
    }


    // audience_subcategory->name
    if(audience_subcategory->name) {
    if(cJSON_AddStringToObject(item, "name", audience_subcategory->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_subcategory->ratio
    if(audience_subcategory->ratio) {
    if(cJSON_AddNumberToObject(item, "ratio", *audience_subcategory->ratio) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_subcategory_t *audience_subcategory_parseFromJSON(cJSON *audience_subcategoryJSON){

    audience_subcategory_t *audience_subcategory_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for audience_subcategory->index
    double *index_local_var = NULL;

    char *key_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for audience_subcategory->ratio
    double *ratio_local_var = NULL;

    // audience_subcategory->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audience_subcategory->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "index");
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

    // audience_subcategory->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "key");
    if (cJSON_IsNull(key)) {
        key = NULL;
    }
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_subcategory->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_subcategory->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "ratio");
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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (key && !cJSON_IsNull(key)) key_local_str = strdup(key->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    audience_subcategory_local_var = audience_subcategory_create_internal (
        id_local_str,
        index_local_var,
        key_local_str,
        name_local_str,
        ratio_local_var
        );

    if (!audience_subcategory_local_var) {
        goto end;
    }

    return audience_subcategory_local_var;
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
    return NULL;

}
