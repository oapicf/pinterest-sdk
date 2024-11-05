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

catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_create(
    pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_type,
    char *id,
    char *name,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    int created_at,
    int updated_at,
    char *catalog_id
    ) {
    catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group_local_var = malloc(sizeof(catalogs_creative_assets_product_group_t));
    if (!catalogs_creative_assets_product_group_local_var) {
        return NULL;
    }
    catalogs_creative_assets_product_group_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_product_group_local_var->id = id;
    catalogs_creative_assets_product_group_local_var->name = name;
    catalogs_creative_assets_product_group_local_var->description = description;
    catalogs_creative_assets_product_group_local_var->filters = filters;
    catalogs_creative_assets_product_group_local_var->created_at = created_at;
    catalogs_creative_assets_product_group_local_var->updated_at = updated_at;
    catalogs_creative_assets_product_group_local_var->catalog_id = catalog_id;

    return catalogs_creative_assets_product_group_local_var;
}


void catalogs_creative_assets_product_group_free(catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group) {
    if(NULL == catalogs_creative_assets_product_group){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group->id) {
        free(catalogs_creative_assets_product_group->id);
        catalogs_creative_assets_product_group->id = NULL;
    }
    if (catalogs_creative_assets_product_group->name) {
        free(catalogs_creative_assets_product_group->name);
        catalogs_creative_assets_product_group->name = NULL;
    }
    if (catalogs_creative_assets_product_group->description) {
        free(catalogs_creative_assets_product_group->description);
        catalogs_creative_assets_product_group->description = NULL;
    }
    if (catalogs_creative_assets_product_group->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_creative_assets_product_group->filters);
        catalogs_creative_assets_product_group->filters = NULL;
    }
    if (catalogs_creative_assets_product_group->catalog_id) {
        free(catalogs_creative_assets_product_group->catalog_id);
        catalogs_creative_assets_product_group->catalog_id = NULL;
    }
    free(catalogs_creative_assets_product_group);
}

cJSON *catalogs_creative_assets_product_group_convertToJSON(catalogs_creative_assets_product_group_t *catalogs_creative_assets_product_group) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_NULL == catalogs_creative_assets_product_group->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_creative_assets_product_group_ToString(catalogs_creative_assets_product_group->catalog_type)) == NULL)
    {
    goto fail; //Enum
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


    // catalogs_creative_assets_product_group->created_at
    if(catalogs_creative_assets_product_group->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", catalogs_creative_assets_product_group->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_creative_assets_product_group->updated_at
    if(catalogs_creative_assets_product_group->updated_at) {
    if(cJSON_AddNumberToObject(item, "updated_at", catalogs_creative_assets_product_group->updated_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_creative_assets_product_group->catalog_id
    if (!catalogs_creative_assets_product_group->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_creative_assets_product_group->catalog_id) == NULL) {
    goto fail; //String
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

    // define the local variable for catalogs_creative_assets_product_group->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    // catalogs_creative_assets_product_group->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_product_group_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_product_group_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_product_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_creative_assets_product_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_creative_assets_product_group->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_creative_assets_product_group->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_creative_assets_product_group->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_groupJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }


    catalogs_creative_assets_product_group_local_var = catalogs_creative_assets_product_group_create (
        catalog_typeVariable,
        strdup(id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters_local_nonprim,
        created_at ? created_at->valuedouble : 0,
        updated_at ? updated_at->valuedouble : 0,
        strdup(catalog_id->valuestring)
        );

    return catalogs_creative_assets_product_group_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
