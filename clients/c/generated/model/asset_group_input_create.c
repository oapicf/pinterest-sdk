#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_input_create.h"


char* asset_group_input_create_asset_group_types_ToString(pinterest_rest_api_asset_group_input_create__e asset_group_types) {
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    return asset_group_typesArray[asset_group_types - 1];
}

pinterest_rest_api_asset_group_input_create__e asset_group_input_create_asset_group_types_FromString(char* asset_group_types) {
    int stringToReturn = 0;
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    size_t sizeofArray = sizeof(asset_group_typesArray) / sizeof(asset_group_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_group_types, asset_group_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static asset_group_input_create_t *asset_group_input_create_create_internal(
    asset_group_binding_t *asset_group,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types
    ) {
    asset_group_input_create_t *asset_group_input_create_local_var = malloc(sizeof(asset_group_input_create_t));
    if (!asset_group_input_create_local_var) {
        return NULL;
    }
    memset(asset_group_input_create_local_var, 0, sizeof(asset_group_input_create_t));
    asset_group_input_create_local_var->_library_owned = 1;
    asset_group_input_create_local_var->asset_group = asset_group;
    asset_group_input_create_local_var->asset_group_description = asset_group_description;
    asset_group_input_create_local_var->asset_group_name = asset_group_name;
    asset_group_input_create_local_var->asset_group_types = asset_group_types;
    return asset_group_input_create_local_var;
}

__attribute__((deprecated)) asset_group_input_create_t *asset_group_input_create_create(
    asset_group_binding_t *asset_group,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types
    ) {
    asset_group_input_create_t *result = asset_group_input_create_create_internal (
        asset_group,
        asset_group_description,
        asset_group_name,
        asset_group_types
        );
    if (!result) {
    }
    return result;
}

void asset_group_input_create_free(asset_group_input_create_t *asset_group_input_create) {
    if(NULL == asset_group_input_create){
        return ;
    }
    if(asset_group_input_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_input_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_input_create->asset_group) {
        asset_group_binding_free(asset_group_input_create->asset_group);
        asset_group_input_create->asset_group = NULL;
    }
    if (asset_group_input_create->asset_group_description) {
        free(asset_group_input_create->asset_group_description);
        asset_group_input_create->asset_group_description = NULL;
    }
    if (asset_group_input_create->asset_group_name) {
        free(asset_group_input_create->asset_group_name);
        asset_group_input_create->asset_group_name = NULL;
    }
    if (asset_group_input_create->asset_group_types) {
        list_ForEach(listEntry, asset_group_input_create->asset_group_types) {
            asset_group_type_free(listEntry->data);
        }
        list_freeList(asset_group_input_create->asset_group_types);
        asset_group_input_create->asset_group_types = NULL;
    }
    free(asset_group_input_create);
}

cJSON *asset_group_input_create_convertToJSON(asset_group_input_create_t *asset_group_input_create) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_input_create->asset_group
    if(asset_group_input_create->asset_group) {
    cJSON *asset_group_local_JSON = asset_group_binding_convertToJSON(asset_group_input_create->asset_group);
    if(asset_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group", asset_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // asset_group_input_create->asset_group_description
    if (!asset_group_input_create->asset_group_description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_description", asset_group_input_create->asset_group_description) == NULL) {
    goto fail; //String
    }


    // asset_group_input_create->asset_group_name
    if (!asset_group_input_create->asset_group_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_name", asset_group_input_create->asset_group_name) == NULL) {
    goto fail; //String
    }


    // asset_group_input_create->asset_group_types
    if (pinterest_rest_api_list_ASSETGROUPTYPES_NULL == asset_group_input_create->asset_group_types) {
        goto fail;
    }
    cJSON *asset_group_types = cJSON_AddArrayToObject(item, "asset_group_types");
    if(asset_group_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_group_typesListEntry;
    if (asset_group_input_create->asset_group_types) {
    list_ForEach(asset_group_typesListEntry, asset_group_input_create->asset_group_types) {
    cJSON *itemLocal = asset_group_type_convertToJSON((pinterest_rest_api_asset_group_input_create__e)asset_group_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_group_types, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

asset_group_input_create_t *asset_group_input_create_parseFromJSON(cJSON *asset_group_input_createJSON){

    asset_group_input_create_t *asset_group_input_create_local_var = NULL;

    // define the local variable for asset_group_input_create->asset_group
    asset_group_binding_t *asset_group_local_nonprim = NULL;

    char *asset_group_description_local_str = NULL;

    char *asset_group_name_local_str = NULL;

    // define the local list for asset_group_input_create->asset_group_types
    list_t *asset_group_typesList = NULL;

    // asset_group_input_create->asset_group
    cJSON *asset_group = cJSON_GetObjectItemCaseSensitive(asset_group_input_createJSON, "asset_group");
    if (cJSON_IsNull(asset_group)) {
        asset_group = NULL;
    }
    if (asset_group) { 
    asset_group_local_nonprim = asset_group_binding_parseFromJSON(asset_group); //nonprimitive
    }

    // asset_group_input_create->asset_group_description
    cJSON *asset_group_description = cJSON_GetObjectItemCaseSensitive(asset_group_input_createJSON, "asset_group_description");
    if (cJSON_IsNull(asset_group_description)) {
        asset_group_description = NULL;
    }
    if (!asset_group_description) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_description))
    {
    goto end; //String
    }

    // asset_group_input_create->asset_group_name
    cJSON *asset_group_name = cJSON_GetObjectItemCaseSensitive(asset_group_input_createJSON, "asset_group_name");
    if (cJSON_IsNull(asset_group_name)) {
        asset_group_name = NULL;
    }
    if (!asset_group_name) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_name))
    {
    goto end; //String
    }

    // asset_group_input_create->asset_group_types
    cJSON *asset_group_types = cJSON_GetObjectItemCaseSensitive(asset_group_input_createJSON, "asset_group_types");
    if (cJSON_IsNull(asset_group_types)) {
        asset_group_types = NULL;
    }
    if (!asset_group_types) {
        goto end;
    }

    
    cJSON *asset_group_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(asset_group_types)){
        goto end; //nonprimitive container
    }

    asset_group_typesList = list_createList();

    cJSON_ArrayForEach(asset_group_types_local_nonprimitive,asset_group_types )
    {
        if(!cJSON_IsObject(asset_group_types_local_nonprimitive)){
            goto end;
        }
        asset_group_input_create_asset_group_type_e asset_group_typesItem = asset_group_type_parseFromJSON(asset_group_types_local_nonprimitive);

        list_addElement(asset_group_typesList, (void *)asset_group_typesItem);
    }


    if (asset_group_description && !cJSON_IsNull(asset_group_description)) asset_group_description_local_str = strdup(asset_group_description->valuestring);
    if (asset_group_name && !cJSON_IsNull(asset_group_name)) asset_group_name_local_str = strdup(asset_group_name->valuestring);

    asset_group_input_create_local_var = asset_group_input_create_create_internal (
        asset_group ? asset_group_local_nonprim : NULL,
        asset_group_description_local_str,
        asset_group_name_local_str,
        asset_group_typesList
        );

    if (!asset_group_input_create_local_var) {
        goto end;
    }

    return asset_group_input_create_local_var;
end:
    if (asset_group_local_nonprim) {
        asset_group_binding_free(asset_group_local_nonprim);
        asset_group_local_nonprim = NULL;
    }
    if (asset_group_description_local_str) {
        free(asset_group_description_local_str);
        asset_group_description_local_str = NULL;
    }
    if (asset_group_name_local_str) {
        free(asset_group_name_local_str);
        asset_group_name_local_str = NULL;
    }
    if (asset_group_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_group_typesList) {
            asset_group_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_group_typesList);
        asset_group_typesList = NULL;
    }
    return NULL;

}
