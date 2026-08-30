#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog.h"



static catalog_t *catalog_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *created_at,
    char *id,
    char *name,
    char *updated_at
    ) {
    catalog_t *catalog_local_var = malloc(sizeof(catalog_t));
    if (!catalog_local_var) {
        return NULL;
    }
    memset(catalog_local_var, 0, sizeof(catalog_t));
    catalog_local_var->_library_owned = 1;
    catalog_local_var->catalog_type = catalog_type;
    catalog_local_var->created_at = created_at;
    catalog_local_var->id = id;
    catalog_local_var->name = name;
    catalog_local_var->updated_at = updated_at;
    return catalog_local_var;
}

__attribute__((deprecated)) catalog_t *catalog_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *created_at,
    char *id,
    char *name,
    char *updated_at
    ) {
    catalog_t *result = catalog_create_internal (
        catalog_type,
        created_at,
        id,
        name,
        updated_at
        );
    if (!result) {
    }
    return result;
}

void catalog_free(catalog_t *catalog) {
    if(NULL == catalog){
        return ;
    }
    if(catalog->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalog_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalog->created_at) {
        free(catalog->created_at);
        catalog->created_at = NULL;
    }
    if (catalog->id) {
        free(catalog->id);
        catalog->id = NULL;
    }
    if (catalog->name) {
        free(catalog->name);
        catalog->name = NULL;
    }
    if (catalog->updated_at) {
        free(catalog->updated_at);
        catalog->updated_at = NULL;
    }
    free(catalog);
}

cJSON *catalog_convertToJSON(catalog_t *catalog) {
    cJSON *item = cJSON_CreateObject();

    // catalog->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalog->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalog->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalog->created_at
    if (!catalog->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalog->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalog->id
    if (!catalog->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalog->id) == NULL) {
    goto fail; //String
    }


    // catalog->name
    if (!catalog->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalog->name) == NULL) {
    goto fail; //String
    }


    // catalog->updated_at
    if (!catalog->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", catalog->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalog_t *catalog_parseFromJSON(cJSON *catalogJSON){

    catalog_t *catalog_local_var = NULL;

    // define the local variable for catalog->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    char *created_at_local_str = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    char *updated_at_local_str = NULL;

    // catalog->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalog->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // catalog->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogJSON, "id");
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

    // catalog->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogJSON, "name");
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

    // catalog->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogJSON, "updated_at");
    if (cJSON_IsNull(updated_at)) {
        updated_at = NULL;
    }
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }


    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (updated_at && !cJSON_IsNull(updated_at)) updated_at_local_str = strdup(updated_at->valuestring);

    catalog_local_var = catalog_create_internal (
        catalog_type_local_nonprim,
        created_at_local_str,
        id_local_str,
        name_local_str,
        updated_at_local_str
        );

    if (!catalog_local_var) {
        goto end;
    }

    return catalog_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (updated_at_local_str) {
        free(updated_at_local_str);
        updated_at_local_str = NULL;
    }
    return NULL;

}
