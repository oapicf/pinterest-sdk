#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_update_item_read_or_update_item.h"


char* asset_group_update_item_read_or_update_item_asset_group_types_ToString(pinterest_rest_api_asset_group_update_item_read_or_update_item__e asset_group_types) {
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    return asset_group_typesArray[asset_group_types - 1];
}

pinterest_rest_api_asset_group_update_item_read_or_update_item__e asset_group_update_item_read_or_update_item_asset_group_types_FromString(char* asset_group_types) {
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

static asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_create_internal(
    char *asset_group_id,
    list_t *asset_group_types,
    list_t *assets_to_add,
    list_t *assets_to_remove,
    char *description,
    char *name
    ) {
    asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_local_var = malloc(sizeof(asset_group_update_item_read_or_update_item_t));
    if (!asset_group_update_item_read_or_update_item_local_var) {
        return NULL;
    }
    memset(asset_group_update_item_read_or_update_item_local_var, 0, sizeof(asset_group_update_item_read_or_update_item_t));
    asset_group_update_item_read_or_update_item_local_var->_library_owned = 1;
    asset_group_update_item_read_or_update_item_local_var->asset_group_id = asset_group_id;
    asset_group_update_item_read_or_update_item_local_var->asset_group_types = asset_group_types;
    asset_group_update_item_read_or_update_item_local_var->assets_to_add = assets_to_add;
    asset_group_update_item_read_or_update_item_local_var->assets_to_remove = assets_to_remove;
    asset_group_update_item_read_or_update_item_local_var->description = description;
    asset_group_update_item_read_or_update_item_local_var->name = name;
    return asset_group_update_item_read_or_update_item_local_var;
}

__attribute__((deprecated)) asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_create(
    char *asset_group_id,
    list_t *asset_group_types,
    list_t *assets_to_add,
    list_t *assets_to_remove,
    char *description,
    char *name
    ) {
    asset_group_update_item_read_or_update_item_t *result = asset_group_update_item_read_or_update_item_create_internal (
        asset_group_id,
        asset_group_types,
        assets_to_add,
        assets_to_remove,
        description,
        name
        );
    if (!result) {
    }
    return result;
}

void asset_group_update_item_read_or_update_item_free(asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item) {
    if(NULL == asset_group_update_item_read_or_update_item){
        return ;
    }
    if(asset_group_update_item_read_or_update_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_update_item_read_or_update_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_update_item_read_or_update_item->asset_group_id) {
        free(asset_group_update_item_read_or_update_item->asset_group_id);
        asset_group_update_item_read_or_update_item->asset_group_id = NULL;
    }
    if (asset_group_update_item_read_or_update_item->asset_group_types) {
        list_ForEach(listEntry, asset_group_update_item_read_or_update_item->asset_group_types) {
            asset_group_type_free(listEntry->data);
        }
        list_freeList(asset_group_update_item_read_or_update_item->asset_group_types);
        asset_group_update_item_read_or_update_item->asset_group_types = NULL;
    }
    if (asset_group_update_item_read_or_update_item->assets_to_add) {
        list_ForEach(listEntry, asset_group_update_item_read_or_update_item->assets_to_add) {
            free(listEntry->data);
        }
        list_freeList(asset_group_update_item_read_or_update_item->assets_to_add);
        asset_group_update_item_read_or_update_item->assets_to_add = NULL;
    }
    if (asset_group_update_item_read_or_update_item->assets_to_remove) {
        list_ForEach(listEntry, asset_group_update_item_read_or_update_item->assets_to_remove) {
            free(listEntry->data);
        }
        list_freeList(asset_group_update_item_read_or_update_item->assets_to_remove);
        asset_group_update_item_read_or_update_item->assets_to_remove = NULL;
    }
    if (asset_group_update_item_read_or_update_item->description) {
        free(asset_group_update_item_read_or_update_item->description);
        asset_group_update_item_read_or_update_item->description = NULL;
    }
    if (asset_group_update_item_read_or_update_item->name) {
        free(asset_group_update_item_read_or_update_item->name);
        asset_group_update_item_read_or_update_item->name = NULL;
    }
    free(asset_group_update_item_read_or_update_item);
}

cJSON *asset_group_update_item_read_or_update_item_convertToJSON(asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_update_item_read_or_update_item->asset_group_id
    if (!asset_group_update_item_read_or_update_item->asset_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_id", asset_group_update_item_read_or_update_item->asset_group_id) == NULL) {
    goto fail; //String
    }


    // asset_group_update_item_read_or_update_item->asset_group_types
    if(asset_group_update_item_read_or_update_item->asset_group_types != pinterest_rest_api_list_ASSETGROUPTYPES_NULL) {
    cJSON *asset_group_types = cJSON_AddArrayToObject(item, "asset_group_types");
    if(asset_group_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_group_typesListEntry;
    if (asset_group_update_item_read_or_update_item->asset_group_types) {
    list_ForEach(asset_group_typesListEntry, asset_group_update_item_read_or_update_item->asset_group_types) {
    cJSON *itemLocal = asset_group_type_convertToJSON((pinterest_rest_api_asset_group_update_item_read_or_update_item__e)asset_group_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_group_types, itemLocal);
    }
    }
    }


    // asset_group_update_item_read_or_update_item->assets_to_add
    if(asset_group_update_item_read_or_update_item->assets_to_add) {
    cJSON *assets_to_add = cJSON_AddArrayToObject(item, "assets_to_add");
    if(assets_to_add == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *assets_to_addListEntry;
    list_ForEach(assets_to_addListEntry, asset_group_update_item_read_or_update_item->assets_to_add) {
    if(cJSON_AddStringToObject(assets_to_add, "", assets_to_addListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_update_item_read_or_update_item->assets_to_remove
    if(asset_group_update_item_read_or_update_item->assets_to_remove) {
    cJSON *assets_to_remove = cJSON_AddArrayToObject(item, "assets_to_remove");
    if(assets_to_remove == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *assets_to_removeListEntry;
    list_ForEach(assets_to_removeListEntry, asset_group_update_item_read_or_update_item->assets_to_remove) {
    if(cJSON_AddStringToObject(assets_to_remove, "", assets_to_removeListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_update_item_read_or_update_item->description
    if(asset_group_update_item_read_or_update_item->description) {
    if(cJSON_AddStringToObject(item, "description", asset_group_update_item_read_or_update_item->description) == NULL) {
    goto fail; //String
    }
    }


    // asset_group_update_item_read_or_update_item->name
    if(asset_group_update_item_read_or_update_item->name) {
    if(cJSON_AddStringToObject(item, "name", asset_group_update_item_read_or_update_item->name) == NULL) {
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

asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_parseFromJSON(cJSON *asset_group_update_item_read_or_update_itemJSON){

    asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_local_var = NULL;

    char *asset_group_id_local_str = NULL;

    // define the local list for asset_group_update_item_read_or_update_item->asset_group_types
    list_t *asset_group_typesList = NULL;

    // define the local list for asset_group_update_item_read_or_update_item->assets_to_add
    list_t *assets_to_addList = NULL;

    // define the local list for asset_group_update_item_read_or_update_item->assets_to_remove
    list_t *assets_to_removeList = NULL;

    char *description_local_str = NULL;

    char *name_local_str = NULL;

    // asset_group_update_item_read_or_update_item->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "asset_group_id");
    if (cJSON_IsNull(asset_group_id)) {
        asset_group_id = NULL;
    }
    if (!asset_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_id))
    {
    goto end; //String
    }

    // asset_group_update_item_read_or_update_item->asset_group_types
    cJSON *asset_group_types = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "asset_group_types");
    if (cJSON_IsNull(asset_group_types)) {
        asset_group_types = NULL;
    }
    if (asset_group_types) { 
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
        asset_group_update_item_read_or_update_item_asset_group_type_e asset_group_typesItem = asset_group_type_parseFromJSON(asset_group_types_local_nonprimitive);

        list_addElement(asset_group_typesList, (void *)asset_group_typesItem);
    }
    }

    // asset_group_update_item_read_or_update_item->assets_to_add
    cJSON *assets_to_add = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "assets_to_add");
    if (cJSON_IsNull(assets_to_add)) {
        assets_to_add = NULL;
    }
    if (assets_to_add) { 
    cJSON *assets_to_add_local = NULL;
    if(!cJSON_IsArray(assets_to_add)) {
        goto end;//primitive container
    }
    assets_to_addList = list_createList();

    cJSON_ArrayForEach(assets_to_add_local, assets_to_add)
    {
        if(!cJSON_IsString(assets_to_add_local))
        {
            goto end;
        }
        list_addElement(assets_to_addList , strdup(assets_to_add_local->valuestring));
    }
    }

    // asset_group_update_item_read_or_update_item->assets_to_remove
    cJSON *assets_to_remove = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "assets_to_remove");
    if (cJSON_IsNull(assets_to_remove)) {
        assets_to_remove = NULL;
    }
    if (assets_to_remove) { 
    cJSON *assets_to_remove_local = NULL;
    if(!cJSON_IsArray(assets_to_remove)) {
        goto end;//primitive container
    }
    assets_to_removeList = list_createList();

    cJSON_ArrayForEach(assets_to_remove_local, assets_to_remove)
    {
        if(!cJSON_IsString(assets_to_remove_local))
        {
            goto end;
        }
        list_addElement(assets_to_removeList , strdup(assets_to_remove_local->valuestring));
    }
    }

    // asset_group_update_item_read_or_update_item->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // asset_group_update_item_read_or_update_item->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(asset_group_update_item_read_or_update_itemJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (asset_group_id && !cJSON_IsNull(asset_group_id)) asset_group_id_local_str = strdup(asset_group_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    asset_group_update_item_read_or_update_item_local_var = asset_group_update_item_read_or_update_item_create_internal (
        asset_group_id_local_str,
        asset_group_types ? asset_group_typesList : NULL,
        assets_to_add ? assets_to_addList : NULL,
        assets_to_remove ? assets_to_removeList : NULL,
        description_local_str,
        name_local_str
        );

    if (!asset_group_update_item_read_or_update_item_local_var) {
        goto end;
    }

    return asset_group_update_item_read_or_update_item_local_var;
end:
    if (asset_group_id_local_str) {
        free(asset_group_id_local_str);
        asset_group_id_local_str = NULL;
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
    if (assets_to_addList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, assets_to_addList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(assets_to_addList);
        assets_to_addList = NULL;
    }
    if (assets_to_removeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, assets_to_removeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(assets_to_removeList);
        assets_to_removeList = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
