#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_update_many_request_items_one_of_items0.h"



static catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_create_internal(
    char *description,
    catalogs_product_group_filters_request_t *filters,
    int *is_featured,
    char *name,
    char *id
    ) {
    catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_local_var = malloc(sizeof(catalogs_product_group_update_many_request_items_one_of_items0_t));
    if (!catalogs_product_group_update_many_request_items_one_of_items0_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_update_many_request_items_one_of_items0_local_var, 0, sizeof(catalogs_product_group_update_many_request_items_one_of_items0_t));
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->_library_owned = 1;
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->description = description;
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->filters = filters;
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->is_featured = is_featured;
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->name = name;
    catalogs_product_group_update_many_request_items_one_of_items0_local_var->id = id;
    return catalogs_product_group_update_many_request_items_one_of_items0_local_var;
}

__attribute__((deprecated)) catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_create(
    char *description,
    catalogs_product_group_filters_request_t *filters,
    int *is_featured,
    char *name,
    char *id
    ) {
    int *is_featured_copy = NULL;
    if (is_featured) {
        is_featured_copy = malloc(sizeof(int));
        if (is_featured_copy) *is_featured_copy = *is_featured;
    }
    catalogs_product_group_update_many_request_items_one_of_items0_t *result = catalogs_product_group_update_many_request_items_one_of_items0_create_internal (
        description,
        filters,
        is_featured_copy,
        name,
        id
        );
    if (!result) {
        free(is_featured_copy);
    }
    return result;
}

void catalogs_product_group_update_many_request_items_one_of_items0_free(catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0) {
    if(NULL == catalogs_product_group_update_many_request_items_one_of_items0){
        return ;
    }
    if(catalogs_product_group_update_many_request_items_one_of_items0->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_update_many_request_items_one_of_items0_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_update_many_request_items_one_of_items0->description) {
        free(catalogs_product_group_update_many_request_items_one_of_items0->description);
        catalogs_product_group_update_many_request_items_one_of_items0->description = NULL;
    }
    if (catalogs_product_group_update_many_request_items_one_of_items0->filters) {
        catalogs_product_group_filters_request_free(catalogs_product_group_update_many_request_items_one_of_items0->filters);
        catalogs_product_group_update_many_request_items_one_of_items0->filters = NULL;
    }
    if (catalogs_product_group_update_many_request_items_one_of_items0->is_featured) {
        free(catalogs_product_group_update_many_request_items_one_of_items0->is_featured);
        catalogs_product_group_update_many_request_items_one_of_items0->is_featured = NULL;
    }
    if (catalogs_product_group_update_many_request_items_one_of_items0->name) {
        free(catalogs_product_group_update_many_request_items_one_of_items0->name);
        catalogs_product_group_update_many_request_items_one_of_items0->name = NULL;
    }
    if (catalogs_product_group_update_many_request_items_one_of_items0->id) {
        free(catalogs_product_group_update_many_request_items_one_of_items0->id);
        catalogs_product_group_update_many_request_items_one_of_items0->id = NULL;
    }
    free(catalogs_product_group_update_many_request_items_one_of_items0);
}

cJSON *catalogs_product_group_update_many_request_items_one_of_items0_convertToJSON(catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_update_many_request_items_one_of_items0->description
    if(catalogs_product_group_update_many_request_items_one_of_items0->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_product_group_update_many_request_items_one_of_items0->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_group_update_many_request_items_one_of_items0->filters
    if(catalogs_product_group_update_many_request_items_one_of_items0->filters) {
    cJSON *filters_local_JSON = catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_update_many_request_items_one_of_items0->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_product_group_update_many_request_items_one_of_items0->is_featured
    if(catalogs_product_group_update_many_request_items_one_of_items0->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", *catalogs_product_group_update_many_request_items_one_of_items0->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_update_many_request_items_one_of_items0->name
    if(catalogs_product_group_update_many_request_items_one_of_items0->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_product_group_update_many_request_items_one_of_items0->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_group_update_many_request_items_one_of_items0->id
    if (!catalogs_product_group_update_many_request_items_one_of_items0->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_product_group_update_many_request_items_one_of_items0->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_parseFromJSON(cJSON *catalogs_product_group_update_many_request_items_one_of_items0JSON){

    catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for catalogs_product_group_update_many_request_items_one_of_items0->filters
    catalogs_product_group_filters_request_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_product_group_update_many_request_items_one_of_items0->is_featured
    int *is_featured_local_var = NULL;

    char *name_local_str = NULL;

    char *id_local_str = NULL;

    // catalogs_product_group_update_many_request_items_one_of_items0->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_many_request_items_one_of_items0JSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_product_group_update_many_request_items_one_of_items0->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_many_request_items_one_of_items0JSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (filters) { 
    filters_local_nonprim = catalogs_product_group_filters_request_parseFromJSON(filters); //nonprimitive
    }

    // catalogs_product_group_update_many_request_items_one_of_items0->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_many_request_items_one_of_items0JSON, "is_featured");
    if (cJSON_IsNull(is_featured)) {
        is_featured = NULL;
    }
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    is_featured_local_var = malloc(sizeof(int));
    if(!is_featured_local_var)
    {
        goto end;
    }
    *is_featured_local_var = is_featured->valueint;
    }

    // catalogs_product_group_update_many_request_items_one_of_items0->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_many_request_items_one_of_items0JSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_product_group_update_many_request_items_one_of_items0->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_many_request_items_one_of_items0JSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    catalogs_product_group_update_many_request_items_one_of_items0_local_var = catalogs_product_group_update_many_request_items_one_of_items0_create_internal (
        description_local_str,
        filters ? filters_local_nonprim : NULL,
        is_featured_local_var,
        name_local_str,
        id_local_str
        );

    if (!catalogs_product_group_update_many_request_items_one_of_items0_local_var) {
        goto end;
    }

    return catalogs_product_group_update_many_request_items_one_of_items0_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_product_group_filters_request_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (is_featured_local_var) {
        free(is_featured_local_var);
        is_featured_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    return NULL;

}
