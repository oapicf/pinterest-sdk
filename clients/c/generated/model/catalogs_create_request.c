#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_request.h"


char* catalogs_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalogs_create_request_catalog_type_FromString(char* catalog_type){
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

catalogs_create_request_t *catalogs_create_request_create(
    pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_type,
    char *name
    ) {
    catalogs_create_request_t *catalogs_create_request_local_var = malloc(sizeof(catalogs_create_request_t));
    if (!catalogs_create_request_local_var) {
        return NULL;
    }
    catalogs_create_request_local_var->catalog_type = catalog_type;
    catalogs_create_request_local_var->name = name;

    return catalogs_create_request_local_var;
}


void catalogs_create_request_free(catalogs_create_request_t *catalogs_create_request) {
    if(NULL == catalogs_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_create_request->name) {
        free(catalogs_create_request->name);
        catalogs_create_request->name = NULL;
    }
    free(catalogs_create_request);
}

cJSON *catalogs_create_request_convertToJSON(catalogs_create_request_t *catalogs_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_create_request->catalog_type
    if (pinterest_rest_api_catalogs_create_request_CATALOGTYPE_NULL == catalogs_create_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_create_request_ToString(catalogs_create_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_create_request->name
    if (!catalogs_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_create_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_create_request_t *catalogs_create_request_parseFromJSON(cJSON *catalogs_create_requestJSON){

    catalogs_create_request_t *catalogs_create_request_local_var = NULL;

    // catalogs_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_create_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_create_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_create_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    catalogs_create_request_local_var = catalogs_create_request_create (
        catalog_typeVariable,
        strdup(name->valuestring)
        );

    return catalogs_create_request_local_var;
end:
    return NULL;

}
