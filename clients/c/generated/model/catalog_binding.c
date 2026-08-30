#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog_binding.h"



static catalog_binding_t *catalog_binding_create_internal(
    char *catalog_type,
    char *id,
    char *name
    ) {
    catalog_binding_t *catalog_binding_local_var = malloc(sizeof(catalog_binding_t));
    if (!catalog_binding_local_var) {
        return NULL;
    }
    memset(catalog_binding_local_var, 0, sizeof(catalog_binding_t));
    catalog_binding_local_var->_library_owned = 1;
    catalog_binding_local_var->catalog_type = catalog_type;
    catalog_binding_local_var->id = id;
    catalog_binding_local_var->name = name;
    return catalog_binding_local_var;
}

__attribute__((deprecated)) catalog_binding_t *catalog_binding_create(
    char *catalog_type,
    char *id,
    char *name
    ) {
    catalog_binding_t *result = catalog_binding_create_internal (
        catalog_type,
        id,
        name
        );
    if (!result) {
    }
    return result;
}

void catalog_binding_free(catalog_binding_t *catalog_binding) {
    if(NULL == catalog_binding){
        return ;
    }
    if(catalog_binding->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalog_binding_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalog_binding->catalog_type) {
        free(catalog_binding->catalog_type);
        catalog_binding->catalog_type = NULL;
    }
    if (catalog_binding->id) {
        free(catalog_binding->id);
        catalog_binding->id = NULL;
    }
    if (catalog_binding->name) {
        free(catalog_binding->name);
        catalog_binding->name = NULL;
    }
    free(catalog_binding);
}

cJSON *catalog_binding_convertToJSON(catalog_binding_t *catalog_binding) {
    cJSON *item = cJSON_CreateObject();

    // catalog_binding->catalog_type
    if(catalog_binding->catalog_type) {
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_binding->catalog_type) == NULL) {
    goto fail; //String
    }
    }


    // catalog_binding->id
    if(catalog_binding->id) {
    if(cJSON_AddStringToObject(item, "id", catalog_binding->id) == NULL) {
    goto fail; //String
    }
    }


    // catalog_binding->name
    if(catalog_binding->name) {
    if(cJSON_AddStringToObject(item, "name", catalog_binding->name) == NULL) {
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

catalog_binding_t *catalog_binding_parseFromJSON(cJSON *catalog_bindingJSON){

    catalog_binding_t *catalog_binding_local_var = NULL;

    char *catalog_type_local_str = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // catalog_binding->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalog_bindingJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (catalog_type) { 
    if(!cJSON_IsString(catalog_type) && !cJSON_IsNull(catalog_type))
    {
    goto end; //String
    }
    }

    // catalog_binding->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalog_bindingJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // catalog_binding->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalog_bindingJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (catalog_type && !cJSON_IsNull(catalog_type)) catalog_type_local_str = strdup(catalog_type->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalog_binding_local_var = catalog_binding_create_internal (
        catalog_type_local_str,
        id_local_str,
        name_local_str
        );

    if (!catalog_binding_local_var) {
        goto end;
    }

    return catalog_binding_local_var;
end:
    if (catalog_type_local_str) {
        free(catalog_type_local_str);
        catalog_type_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
