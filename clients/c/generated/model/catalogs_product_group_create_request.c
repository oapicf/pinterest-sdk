#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_create_request.h"



static catalogs_product_group_create_request_t *catalogs_product_group_create_request_create_internal(
    char *name,
    char *description,
    int is_featured,
    catalogs_product_group_filters_request_t *filters,
    char *feed_id
    ) {
    catalogs_product_group_create_request_t *catalogs_product_group_create_request_local_var = malloc(sizeof(catalogs_product_group_create_request_t));
    if (!catalogs_product_group_create_request_local_var) {
        return NULL;
    }
    catalogs_product_group_create_request_local_var->name = name;
    catalogs_product_group_create_request_local_var->description = description;
    catalogs_product_group_create_request_local_var->is_featured = is_featured;
    catalogs_product_group_create_request_local_var->filters = filters;
    catalogs_product_group_create_request_local_var->feed_id = feed_id;

    catalogs_product_group_create_request_local_var->_library_owned = 1;
    return catalogs_product_group_create_request_local_var;
}

__attribute__((deprecated)) catalogs_product_group_create_request_t *catalogs_product_group_create_request_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_product_group_filters_request_t *filters,
    char *feed_id
    ) {
    return catalogs_product_group_create_request_create_internal (
        name,
        description,
        is_featured,
        filters,
        feed_id
        );
}

void catalogs_product_group_create_request_free(catalogs_product_group_create_request_t *catalogs_product_group_create_request) {
    if(NULL == catalogs_product_group_create_request){
        return ;
    }
    if(catalogs_product_group_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_create_request->name) {
        free(catalogs_product_group_create_request->name);
        catalogs_product_group_create_request->name = NULL;
    }
    if (catalogs_product_group_create_request->description) {
        free(catalogs_product_group_create_request->description);
        catalogs_product_group_create_request->description = NULL;
    }
    if (catalogs_product_group_create_request->filters) {
        catalogs_product_group_filters_request_free(catalogs_product_group_create_request->filters);
        catalogs_product_group_create_request->filters = NULL;
    }
    if (catalogs_product_group_create_request->feed_id) {
        free(catalogs_product_group_create_request->feed_id);
        catalogs_product_group_create_request->feed_id = NULL;
    }
    free(catalogs_product_group_create_request);
}

cJSON *catalogs_product_group_create_request_convertToJSON(catalogs_product_group_create_request_t *catalogs_product_group_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_create_request->name
    if (!catalogs_product_group_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_product_group_create_request->name) == NULL) {
    goto fail; //String
    }


    // catalogs_product_group_create_request->description
    if(catalogs_product_group_create_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_product_group_create_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_group_create_request->is_featured
    if(catalogs_product_group_create_request->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", catalogs_product_group_create_request->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_create_request->filters
    if (!catalogs_product_group_create_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_create_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_create_request->feed_id
    if (!catalogs_product_group_create_request->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_product_group_create_request->feed_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_create_request_t *catalogs_product_group_create_request_parseFromJSON(cJSON *catalogs_product_group_create_requestJSON){

    catalogs_product_group_create_request_t *catalogs_product_group_create_request_local_var = NULL;

    // define the local variable for catalogs_product_group_create_request->filters
    catalogs_product_group_filters_request_t *filters_local_nonprim = NULL;

    // catalogs_product_group_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // catalogs_product_group_create_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_create_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_product_group_create_request->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_create_requestJSON, "is_featured");
    if (cJSON_IsNull(is_featured)) {
        is_featured = NULL;
    }
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_create_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_create_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_request_parseFromJSON(filters); //nonprimitive

    // catalogs_product_group_create_request->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_create_requestJSON, "feed_id");
    if (cJSON_IsNull(feed_id)) {
        feed_id = NULL;
    }
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }


    catalogs_product_group_create_request_local_var = catalogs_product_group_create_request_create_internal (
        strdup(name->valuestring),
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        is_featured ? is_featured->valueint : 0,
        filters_local_nonprim,
        strdup(feed_id->valuestring)
        );

    return catalogs_product_group_create_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_request_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
