#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group.h"


char* catalogs_creative_assets_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalogs_creative_assets_product_group_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_type,
    int *created_at,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *id,
    char *name,
    int *updated_at
    ) {
    catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_local_var = malloc(sizeof(catalogs_creative_assets_product_group_t));
    if (!catalogs_creative_assets_product_group_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_product_group_local_var, 0, sizeof(catalogs_creative_assets_product_group_t));
    catalogs_creative_assets_product_group_local_var->_library_owned = 1;
    catalogs_creative_assets_product_group_local_var->catalog_id = catalog_id;
    catalogs_creative_assets_product_group_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_product_group_local_var->created_at = created_at;
    catalogs_creative_assets_product_group_local_var->description = description;
    catalogs_creative_assets_product_group_local_var->filters = filters;
    catalogs_creative_assets_product_group_local_var->id = id;
    catalogs_creative_assets_product_group_local_var->name = name;
    catalogs_creative_assets_product_group_local_var->updated_at = updated_at;
    return catalogs_creative_assets_product_group_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_type,
    int *created_at,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *id,
    char *name,
    int *updated_at
    ) {
    int *created_at_copy = NULL;
    if (created_at) {
        created_at_copy = malloc(sizeof(int));
        if (created_at_copy) *created_at_copy = *created_at;
    }
    int *updated_at_copy = NULL;
    if (updated_at) {
        updated_at_copy = malloc(sizeof(int));
        if (updated_at_copy) *updated_at_copy = *updated_at;
    }
    catalogs_creative_assets_product_group_t *result = catalogs_creative_assets_product_group_create_internal (
        catalog_id,
        catalog_type,
        created_at_copy,
        description,
        filters,
        id,
        name,
        updated_at_copy
        );
    if (!result) {
        free(created_at_copy);
        free(updated_at_copy);
    }
    return result;
}

void catalogs_creative_assets_product_group_free(catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group) {
    if(NULL == catalogs_creative_assets_product_group){
        return ;
    }
    if(catalogs_creative_assets_product_group->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_product_group_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group->catalog_id) {
        free(catalogs_creative_assets_product_group->catalog_id);
        catalogs_creative_assets_product_group->catalog_id = NULL;
    }
    if (catalogs_creative_assets_product_group->created_at) {
        free(catalogs_creative_assets_product_group->created_at);
        catalogs_creative_assets_product_group->created_at = NULL;
    }
    if (catalogs_creative_assets_product_group->description) {
        free(catalogs_creative_assets_product_group->description);
        catalogs_creative_assets_product_group->description = NULL;
    }
    if (catalogs_creative_assets_product_group->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_creative_assets_product_group->filters);
        catalogs_creative_assets_product_group->filters = NULL;
    }
    if (catalogs_creative_assets_product_group->id) {
        free(catalogs_creative_assets_product_group->id);
        catalogs_creative_assets_product_group->id = NULL;
    }
    if (catalogs_creative_assets_product_group->name) {
        free(catalogs_creative_assets_product_group->name);
        catalogs_creative_assets_product_group->name = NULL;
    }
    if (catalogs_creative_assets_product_group->updated_at) {
        free(catalogs_creative_assets_product_group->updated_at);
        catalogs_creative_assets_product_group->updated_at = NULL;
    }
    free(catalogs_creative_assets_product_group);
}

cJSON *catalogs_creative_assets_product_group_convertToJSON(catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group->catalog_id
    if (!catalogs_creative_assets_product_group->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_creative_assets_product_group->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_creative_assets_product_group->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_NULL == catalogs_creative_assets_product_group->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_creative_assets_product_group_catalog_type_ToString(catalogs_creative_assets_product_group->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_product_group->created_at
    if(catalogs_creative_assets_product_group->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", *catalogs_creative_assets_product_group->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_creative_assets_product_group->description
    if(catalogs_creative_assets_product_group->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_creative_assets_product_group->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_product_group->filters
    if (!catalogs_creative_assets_product_group->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_creative_assets_product_group->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group->id
    if (!catalogs_creative_assets_product_group->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_creative_assets_product_group->id) == NULL) {
    goto fail; //String
    }


    // catalogs_creative_assets_product_group->name
    if(catalogs_creative_assets_product_group->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_creative_assets_product_group->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_product_group->updated_at
    if(catalogs_creative_assets_product_group->updated_at) {
    if(cJSON_AddNumberToObject(item, "updated_at", *catalogs_creative_assets_product_group->updated_at) == NULL) {
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

catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_parseFromJSON(cJSON *catalogs_creative_assets_product_groupJSON){

    catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_creative_assets_product_group->created_at
    int *created_at_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for catalogs_creative_assets_product_group->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for catalogs_creative_assets_product_group->updated_at
    int *updated_at_local_var = NULL;

    // catalogs_creative_assets_product_group->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // catalogs_creative_assets_product_group->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_product_group_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_product_group->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    created_at_local_var = malloc(sizeof(int));
    if(!created_at_local_var)
    {
        goto end;
    }
    *created_at_local_var = created_at->valuedouble;
    }

    // catalogs_creative_assets_product_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_creative_assets_product_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "id");
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

    // catalogs_creative_assets_product_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "updated_at");
    if (cJSON_IsNull(updated_at)) {
        updated_at = NULL;
    }
    if (updated_at) { 
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }
    updated_at_local_var = malloc(sizeof(int));
    if(!updated_at_local_var)
    {
        goto end;
    }
    *updated_at_local_var = updated_at->valuedouble;
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_creative_assets_product_group_local_var = catalogs_creative_assets_product_group_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        created_at_local_var,
        description_local_str,
        filters_local_nonprim,
        id_local_str,
        name_local_str,
        updated_at_local_var
        );

    if (!catalogs_creative_assets_product_group_local_var) {
        goto end;
    }

    return catalogs_creative_assets_product_group_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (created_at_local_var) {
        free(created_at_local_var);
        created_at_local_var = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (updated_at_local_var) {
        free(updated_at_local_var);
        updated_at_local_var = NULL;
    }
    return NULL;

}
