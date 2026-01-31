#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_business_assets_response_catalog_info.h"



static get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_create_internal(
    char *catalog_type,
    char *id,
    char *name
    ) {
    get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_local_var = malloc(sizeof(get_business_assets_response_catalog_info_t));
    if (!get_business_assets_response_catalog_info_local_var) {
        return NULL;
    }
    get_business_assets_response_catalog_info_local_var->catalog_type = catalog_type;
    get_business_assets_response_catalog_info_local_var->id = id;
    get_business_assets_response_catalog_info_local_var->name = name;

    get_business_assets_response_catalog_info_local_var->_library_owned = 1;
    return get_business_assets_response_catalog_info_local_var;
}

__attribute__((deprecated)) get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_create(
    char *catalog_type,
    char *id,
    char *name
    ) {
    return get_business_assets_response_catalog_info_create_internal (
        catalog_type,
        id,
        name
        );
}

void get_business_assets_response_catalog_info_free(get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info) {
    if(NULL == get_business_assets_response_catalog_info){
        return ;
    }
    if(get_business_assets_response_catalog_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "get_business_assets_response_catalog_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (get_business_assets_response_catalog_info->catalog_type) {
        free(get_business_assets_response_catalog_info->catalog_type);
        get_business_assets_response_catalog_info->catalog_type = NULL;
    }
    if (get_business_assets_response_catalog_info->id) {
        free(get_business_assets_response_catalog_info->id);
        get_business_assets_response_catalog_info->id = NULL;
    }
    if (get_business_assets_response_catalog_info->name) {
        free(get_business_assets_response_catalog_info->name);
        get_business_assets_response_catalog_info->name = NULL;
    }
    free(get_business_assets_response_catalog_info);
}

cJSON *get_business_assets_response_catalog_info_convertToJSON(get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info) {
    cJSON *item = cJSON_CreateObject();

    // get_business_assets_response_catalog_info->catalog_type
    if(get_business_assets_response_catalog_info->catalog_type) {
    if(cJSON_AddStringToObject(item, "catalog_type", get_business_assets_response_catalog_info->catalog_type) == NULL) {
    goto fail; //String
    }
    }


    // get_business_assets_response_catalog_info->id
    if(get_business_assets_response_catalog_info->id) {
    if(cJSON_AddStringToObject(item, "id", get_business_assets_response_catalog_info->id) == NULL) {
    goto fail; //String
    }
    }


    // get_business_assets_response_catalog_info->name
    if(get_business_assets_response_catalog_info->name) {
    if(cJSON_AddStringToObject(item, "name", get_business_assets_response_catalog_info->name) == NULL) {
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

get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_parseFromJSON(cJSON *get_business_assets_response_catalog_infoJSON){

    get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_local_var = NULL;

    // get_business_assets_response_catalog_info->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(get_business_assets_response_catalog_infoJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (catalog_type) { 
    if(!cJSON_IsString(catalog_type) && !cJSON_IsNull(catalog_type))
    {
    goto end; //String
    }
    }

    // get_business_assets_response_catalog_info->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(get_business_assets_response_catalog_infoJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // get_business_assets_response_catalog_info->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(get_business_assets_response_catalog_infoJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    get_business_assets_response_catalog_info_local_var = get_business_assets_response_catalog_info_create_internal (
        catalog_type && !cJSON_IsNull(catalog_type) ? strdup(catalog_type->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return get_business_assets_response_catalog_info_local_var;
end:
    return NULL;

}
