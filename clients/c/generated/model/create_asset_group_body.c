#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_group_body.h"


char* create_asset_group_body_asset_group_types_ToString(pinterest_rest_api_create_asset_group_body__e asset_group_types) {
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    return asset_group_typesArray[asset_group_types - 1];
}

pinterest_rest_api_create_asset_group_body__e create_asset_group_body_asset_group_types_FromString(char* asset_group_types) {
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

create_asset_group_body_t *create_asset_group_body_create(
    char *asset_group_name,
    char *asset_group_description,
    list_t *asset_group_types
    ) {
    create_asset_group_body_t *create_asset_group_body_local_var = malloc(sizeof(create_asset_group_body_t));
    if (!create_asset_group_body_local_var) {
        return NULL;
    }
    create_asset_group_body_local_var->asset_group_name = asset_group_name;
    create_asset_group_body_local_var->asset_group_description = asset_group_description;
    create_asset_group_body_local_var->asset_group_types = asset_group_types;

    return create_asset_group_body_local_var;
}


void create_asset_group_body_free(create_asset_group_body_t *create_asset_group_body) {
    if(NULL == create_asset_group_body){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_group_body->asset_group_name) {
        free(create_asset_group_body->asset_group_name);
        create_asset_group_body->asset_group_name = NULL;
    }
    if (create_asset_group_body->asset_group_description) {
        free(create_asset_group_body->asset_group_description);
        create_asset_group_body->asset_group_description = NULL;
    }
    if (create_asset_group_body->asset_group_types) {
        list_ForEach(listEntry, create_asset_group_body->asset_group_types) {
            asset_group_type_free(listEntry->data);
        }
        list_freeList(create_asset_group_body->asset_group_types);
        create_asset_group_body->asset_group_types = NULL;
    }
    free(create_asset_group_body);
}

cJSON *create_asset_group_body_convertToJSON(create_asset_group_body_t *create_asset_group_body) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_group_body->asset_group_name
    if (!create_asset_group_body->asset_group_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_name", create_asset_group_body->asset_group_name) == NULL) {
    goto fail; //String
    }


    // create_asset_group_body->asset_group_description
    if (!create_asset_group_body->asset_group_description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_description", create_asset_group_body->asset_group_description) == NULL) {
    goto fail; //String
    }


    // create_asset_group_body->asset_group_types
    if (pinterest_rest_api_create_asset_group_body_ASSETGROUPTYPES_NULL == create_asset_group_body->asset_group_types) {
        goto fail;
    }
    cJSON *asset_group_types = cJSON_AddArrayToObject(item, "asset_group_types");
    if(asset_group_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_group_typesListEntry;
    if (create_asset_group_body->asset_group_types) {
    list_ForEach(asset_group_typesListEntry, create_asset_group_body->asset_group_types) {
    cJSON *itemLocal = asset_group_type_convertToJSON((pinterest_rest_api_create_asset_group_body__e)asset_group_typesListEntry->data);
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

create_asset_group_body_t *create_asset_group_body_parseFromJSON(cJSON *create_asset_group_bodyJSON){

    create_asset_group_body_t *create_asset_group_body_local_var = NULL;

    // define the local list for create_asset_group_body->asset_group_types
    list_t *asset_group_typesList = NULL;

    // create_asset_group_body->asset_group_name
    cJSON *asset_group_name = cJSON_GetObjectItemCaseSensitive(create_asset_group_bodyJSON, "asset_group_name");
    if (!asset_group_name) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_name))
    {
    goto end; //String
    }

    // create_asset_group_body->asset_group_description
    cJSON *asset_group_description = cJSON_GetObjectItemCaseSensitive(create_asset_group_bodyJSON, "asset_group_description");
    if (!asset_group_description) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_description))
    {
    goto end; //String
    }

    // create_asset_group_body->asset_group_types
    cJSON *asset_group_types = cJSON_GetObjectItemCaseSensitive(create_asset_group_bodyJSON, "asset_group_types");
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
        create_asset_group_body_asset_group_type_e asset_group_typesItem = asset_group_type_parseFromJSON(asset_group_types_local_nonprimitive);

        list_addElement(asset_group_typesList, (void *)asset_group_typesItem);
    }


    create_asset_group_body_local_var = create_asset_group_body_create (
        strdup(asset_group_name->valuestring),
        strdup(asset_group_description->valuestring),
        asset_group_typesList
        );

    return create_asset_group_body_local_var;
end:
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
