#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_update_request.h"



catalogs_product_group_update_request_t *catalogs_product_group_update_request_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_product_group_filters_request_t *filters
    ) {
    catalogs_product_group_update_request_t *catalogs_product_group_update_request_local_var = malloc(sizeof(catalogs_product_group_update_request_t));
    if (!catalogs_product_group_update_request_local_var) {
        return NULL;
    }
    catalogs_product_group_update_request_local_var->name = name;
    catalogs_product_group_update_request_local_var->description = description;
    catalogs_product_group_update_request_local_var->is_featured = is_featured;
    catalogs_product_group_update_request_local_var->filters = filters;

    return catalogs_product_group_update_request_local_var;
}


void catalogs_product_group_update_request_free(catalogs_product_group_update_request_t *catalogs_product_group_update_request) {
    if(NULL == catalogs_product_group_update_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_update_request->name) {
        free(catalogs_product_group_update_request->name);
        catalogs_product_group_update_request->name = NULL;
    }
    if (catalogs_product_group_update_request->description) {
        free(catalogs_product_group_update_request->description);
        catalogs_product_group_update_request->description = NULL;
    }
    if (catalogs_product_group_update_request->filters) {
        catalogs_product_group_filters_request_free(catalogs_product_group_update_request->filters);
        catalogs_product_group_update_request->filters = NULL;
    }
    free(catalogs_product_group_update_request);
}

cJSON *catalogs_product_group_update_request_convertToJSON(catalogs_product_group_update_request_t *catalogs_product_group_update_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_update_request->name
    if(catalogs_product_group_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_product_group_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_group_update_request->description
    if(catalogs_product_group_update_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_product_group_update_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_group_update_request->is_featured
    if(catalogs_product_group_update_request->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", catalogs_product_group_update_request->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_update_request->filters
    if(catalogs_product_group_update_request->filters) {
    cJSON *filters_local_JSON = catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_update_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
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

catalogs_product_group_update_request_t *catalogs_product_group_update_request_parseFromJSON(cJSON *catalogs_product_group_update_requestJSON){

    catalogs_product_group_update_request_t *catalogs_product_group_update_request_local_var = NULL;

    // define the local variable for catalogs_product_group_update_request->filters
    catalogs_product_group_filters_request_t *filters_local_nonprim = NULL;

    // catalogs_product_group_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_product_group_update_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_product_group_update_request->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_requestJSON, "is_featured");
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_update_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_update_requestJSON, "filters");
    if (filters) { 
    filters_local_nonprim = catalogs_product_group_filters_request_parseFromJSON(filters); //nonprimitive
    }


    catalogs_product_group_update_request_local_var = catalogs_product_group_update_request_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        is_featured ? is_featured->valueint : 0,
        filters ? filters_local_nonprim : NULL
        );

    return catalogs_product_group_update_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_request_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
