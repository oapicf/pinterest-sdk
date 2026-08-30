#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog_create.h"



static catalog_create_t *catalog_create_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    catalog_create_t *catalog_create_local_var = malloc(sizeof(catalog_create_t));
    if (!catalog_create_local_var) {
        return NULL;
    }
    memset(catalog_create_local_var, 0, sizeof(catalog_create_t));
    catalog_create_local_var->_library_owned = 1;
    catalog_create_local_var->catalog_type = catalog_type;
    catalog_create_local_var->name = name;
    return catalog_create_local_var;
}

__attribute__((deprecated)) catalog_create_t *catalog_create_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    catalog_create_t *result = catalog_create_create_internal (
        catalog_type,
        name
        );
    if (!result) {
    }
    return result;
}

void catalog_create_free(catalog_create_t *catalog_create) {
    if(NULL == catalog_create){
        return ;
    }
    if(catalog_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalog_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalog_create->name) {
        free(catalog_create->name);
        catalog_create->name = NULL;
    }
    free(catalog_create);
}

cJSON *catalog_create_convertToJSON(catalog_create_t *catalog_create) {
    cJSON *item = cJSON_CreateObject();

    // catalog_create->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalog_create->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalog_create->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalog_create->name
    if (!catalog_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalog_create->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalog_create_t *catalog_create_parseFromJSON(cJSON *catalog_createJSON){

    catalog_create_t *catalog_create_local_var = NULL;

    // define the local variable for catalog_create->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    char *name_local_str = NULL;

    // catalog_create->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalog_createJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalog_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalog_createJSON, "name");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalog_create_local_var = catalog_create_create_internal (
        catalog_type_local_nonprim,
        name_local_str
        );

    if (!catalog_create_local_var) {
        goto end;
    }

    return catalog_create_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
