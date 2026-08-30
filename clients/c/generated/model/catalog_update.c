#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog_update.h"



static catalog_update_t *catalog_update_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    catalog_update_t *catalog_update_local_var = malloc(sizeof(catalog_update_t));
    if (!catalog_update_local_var) {
        return NULL;
    }
    memset(catalog_update_local_var, 0, sizeof(catalog_update_t));
    catalog_update_local_var->_library_owned = 1;
    catalog_update_local_var->catalog_type = catalog_type;
    catalog_update_local_var->name = name;
    return catalog_update_local_var;
}

__attribute__((deprecated)) catalog_update_t *catalog_update_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
    ) {
    catalog_update_t *result = catalog_update_create_internal (
        catalog_type,
        name
        );
    if (!result) {
    }
    return result;
}

void catalog_update_free(catalog_update_t *catalog_update) {
    if(NULL == catalog_update){
        return ;
    }
    if(catalog_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalog_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalog_update->name) {
        free(catalog_update->name);
        catalog_update->name = NULL;
    }
    free(catalog_update);
}

cJSON *catalog_update_convertToJSON(catalog_update_t *catalog_update) {
    cJSON *item = cJSON_CreateObject();

    // catalog_update->catalog_type
    if(catalog_update->catalog_type != pinterest_rest_api_catalogs_type__NULL) {
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalog_update->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalog_update->name
    if(catalog_update->name) {
    if(cJSON_AddStringToObject(item, "name", catalog_update->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalog_update_t *catalog_update_parseFromJSON(cJSON *catalog_updateJSON){

    catalog_update_t *catalog_update_local_var = NULL;

    // define the local variable for catalog_update->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    char *name_local_str = NULL;

    // catalog_update->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalog_updateJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (catalog_type) { 
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom
    }

    // catalog_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalog_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalog_update_local_var = catalog_update_create_internal (
        catalog_type ? catalog_type_local_nonprim : 0,
        name_local_str
        );

    if (!catalog_update_local_var) {
        goto end;
    }

    return catalog_update_local_var;
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
