#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_group_create_request.h"


char* catalogs_hotel_product_group_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalogs_hotel_product_group_create_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_create(
    pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_type,
    char *name,
    char *description,
    catalogs_hotel_product_group_filters_t *filters,
    char *catalog_id
    ) {
    catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_local_var = malloc(sizeof(catalogs_hotel_product_group_create_request_t));
    if (!catalogs_hotel_product_group_create_request_local_var) {
        return NULL;
    }
    catalogs_hotel_product_group_create_request_local_var->catalog_type = catalog_type;
    catalogs_hotel_product_group_create_request_local_var->name = name;
    catalogs_hotel_product_group_create_request_local_var->description = description;
    catalogs_hotel_product_group_create_request_local_var->filters = filters;
    catalogs_hotel_product_group_create_request_local_var->catalog_id = catalog_id;

    return catalogs_hotel_product_group_create_request_local_var;
}


void catalogs_hotel_product_group_create_request_free(catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request) {
    if(NULL == catalogs_hotel_product_group_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product_group_create_request->name) {
        free(catalogs_hotel_product_group_create_request->name);
        catalogs_hotel_product_group_create_request->name = NULL;
    }
    if (catalogs_hotel_product_group_create_request->description) {
        free(catalogs_hotel_product_group_create_request->description);
        catalogs_hotel_product_group_create_request->description = NULL;
    }
    if (catalogs_hotel_product_group_create_request->filters) {
        catalogs_hotel_product_group_filters_free(catalogs_hotel_product_group_create_request->filters);
        catalogs_hotel_product_group_create_request->filters = NULL;
    }
    if (catalogs_hotel_product_group_create_request->catalog_id) {
        free(catalogs_hotel_product_group_create_request->catalog_id);
        catalogs_hotel_product_group_create_request->catalog_id = NULL;
    }
    free(catalogs_hotel_product_group_create_request);
}

cJSON *catalogs_hotel_product_group_create_request_convertToJSON(catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product_group_create_request->catalog_type
    if (pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_NULL == catalogs_hotel_product_group_create_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_hotel_product_group_create_request_ToString(catalogs_hotel_product_group_create_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_hotel_product_group_create_request->name
    if (!catalogs_hotel_product_group_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_product_group_create_request->name) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_product_group_create_request->description
    if(catalogs_hotel_product_group_create_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_hotel_product_group_create_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_product_group_create_request->filters
    if (!catalogs_hotel_product_group_create_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_hotel_product_group_filters_convertToJSON(catalogs_hotel_product_group_create_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product_group_create_request->catalog_id
    if (!catalogs_hotel_product_group_create_request->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_product_group_create_request->catalog_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_parseFromJSON(cJSON *catalogs_hotel_product_group_create_requestJSON){

    catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_local_var = NULL;

    // define the local variable for catalogs_hotel_product_group_create_request->filters
    catalogs_hotel_product_group_filters_t *filters_local_nonprim = NULL;

    // catalogs_hotel_product_group_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_create_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_product_group_create_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_hotel_product_group_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_create_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // catalogs_hotel_product_group_create_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_create_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_product_group_create_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_create_requestJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_hotel_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_hotel_product_group_create_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_create_requestJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }


    catalogs_hotel_product_group_create_request_local_var = catalogs_hotel_product_group_create_request_create (
        catalog_typeVariable,
        strdup(name->valuestring),
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters_local_nonprim,
        strdup(catalog_id->valuestring)
        );

    return catalogs_hotel_product_group_create_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_hotel_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
