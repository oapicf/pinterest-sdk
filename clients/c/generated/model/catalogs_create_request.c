#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_request.h"



static catalogs_create_request_t *catalogs_create_request_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    catalogs_create_request_t *catalogs_create_request_local_var = malloc(sizeof(catalogs_create_request_t));
    if (!catalogs_create_request_local_var) {
        return NULL;
    }
    catalogs_create_request_local_var->catalog_type = catalog_type;
    catalogs_create_request_local_var->name = name;

    catalogs_create_request_local_var->_library_owned = 1;
    return catalogs_create_request_local_var;
}

__attribute__((deprecated)) catalogs_create_request_t *catalogs_create_request_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    return catalogs_create_request_create_internal (
        catalog_type,
        name
        );
}

void catalogs_create_request_free(catalogs_create_request_t *catalogs_create_request) {
    if(NULL == catalogs_create_request){
        return ;
    }
    if(catalogs_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_create_request_free");
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
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_create_request->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_create_request->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
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

    // define the local variable for catalogs_create_request->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // catalogs_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_create_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_create_requestJSON, "name");
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


    catalogs_create_request_local_var = catalogs_create_request_create_internal (
        catalog_type_local_nonprim,
        strdup(name->valuestring)
        );

    return catalogs_create_request_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    return NULL;

}
