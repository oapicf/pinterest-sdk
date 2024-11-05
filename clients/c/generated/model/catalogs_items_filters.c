#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_filters.h"


char* catalogs_items_filters_catalog_type_ToString(pinterest_rest_api_catalogs_items_filters__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_items_filters__e catalogs_items_filters_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_items_filters_t *catalogs_items_filters_create(
    catalogs_type_t *catalog_type,
    list_t *item_ids,
    char *catalog_id,
    list_t *hotel_ids,
    list_t *creative_assets_ids
    ) {
    catalogs_items_filters_t *catalogs_items_filters_local_var = malloc(sizeof(catalogs_items_filters_t));
    if (!catalogs_items_filters_local_var) {
        return NULL;
    }
    catalogs_items_filters_local_var->catalog_type = catalog_type;
    catalogs_items_filters_local_var->item_ids = item_ids;
    catalogs_items_filters_local_var->catalog_id = catalog_id;
    catalogs_items_filters_local_var->hotel_ids = hotel_ids;
    catalogs_items_filters_local_var->creative_assets_ids = creative_assets_ids;

    return catalogs_items_filters_local_var;
}


void catalogs_items_filters_free(catalogs_items_filters_t *catalogs_items_filters) {
    if(NULL == catalogs_items_filters){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_filters->catalog_type) {
        catalogs_type_free(catalogs_items_filters->catalog_type);
        catalogs_items_filters->catalog_type = NULL;
    }
    if (catalogs_items_filters->item_ids) {
        list_ForEach(listEntry, catalogs_items_filters->item_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_items_filters->item_ids);
        catalogs_items_filters->item_ids = NULL;
    }
    if (catalogs_items_filters->catalog_id) {
        free(catalogs_items_filters->catalog_id);
        catalogs_items_filters->catalog_id = NULL;
    }
    if (catalogs_items_filters->hotel_ids) {
        list_ForEach(listEntry, catalogs_items_filters->hotel_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_items_filters->hotel_ids);
        catalogs_items_filters->hotel_ids = NULL;
    }
    if (catalogs_items_filters->creative_assets_ids) {
        list_ForEach(listEntry, catalogs_items_filters->creative_assets_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_items_filters->creative_assets_ids);
        catalogs_items_filters->creative_assets_ids = NULL;
    }
    free(catalogs_items_filters);
}

cJSON *catalogs_items_filters_convertToJSON(catalogs_items_filters_t *catalogs_items_filters) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_filters->catalog_type
    if (pinterest_rest_api_catalogs_items_filters__NULL == catalogs_items_filters->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_items_filters->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_filters->item_ids
    if (!catalogs_items_filters->item_ids) {
        goto fail;
    }
    cJSON *item_ids = cJSON_AddArrayToObject(item, "item_ids");
    if(item_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *item_idsListEntry;
    list_ForEach(item_idsListEntry, catalogs_items_filters->item_ids) {
    if(cJSON_AddStringToObject(item_ids, "", (char*)item_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // catalogs_items_filters->catalog_id
    if(catalogs_items_filters->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_items_filters->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_items_filters->hotel_ids
    if (!catalogs_items_filters->hotel_ids) {
        goto fail;
    }
    cJSON *hotel_ids = cJSON_AddArrayToObject(item, "hotel_ids");
    if(hotel_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hotel_idsListEntry;
    list_ForEach(hotel_idsListEntry, catalogs_items_filters->hotel_ids) {
    if(cJSON_AddStringToObject(hotel_ids, "", (char*)hotel_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // catalogs_items_filters->creative_assets_ids
    if (!catalogs_items_filters->creative_assets_ids) {
        goto fail;
    }
    cJSON *creative_assets_ids = cJSON_AddArrayToObject(item, "creative_assets_ids");
    if(creative_assets_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *creative_assets_idsListEntry;
    list_ForEach(creative_assets_idsListEntry, catalogs_items_filters->creative_assets_ids) {
    if(cJSON_AddStringToObject(creative_assets_ids, "", (char*)creative_assets_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_items_filters_t *catalogs_items_filters_parseFromJSON(cJSON *catalogs_items_filtersJSON){

    catalogs_items_filters_t *catalogs_items_filters_local_var = NULL;

    // define the local variable for catalogs_items_filters->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for catalogs_items_filters->item_ids
    list_t *item_idsList = NULL;

    // define the local list for catalogs_items_filters->hotel_ids
    list_t *hotel_idsList = NULL;

    // define the local list for catalogs_items_filters->creative_assets_ids
    list_t *creative_assets_idsList = NULL;

    // catalogs_items_filters->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_items_filtersJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_items_filters->item_ids
    cJSON *item_ids = cJSON_GetObjectItemCaseSensitive(catalogs_items_filtersJSON, "item_ids");
    if (!item_ids) {
        goto end;
    }

    
    cJSON *item_ids_local = NULL;
    if(!cJSON_IsArray(item_ids)) {
        goto end;//primitive container
    }
    item_idsList = list_createList();

    cJSON_ArrayForEach(item_ids_local, item_ids)
    {
        if(!cJSON_IsString(item_ids_local))
        {
            goto end;
        }
        list_addElement(item_idsList , strdup(item_ids_local->valuestring));
    }

    // catalogs_items_filters->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_items_filtersJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_items_filters->hotel_ids
    cJSON *hotel_ids = cJSON_GetObjectItemCaseSensitive(catalogs_items_filtersJSON, "hotel_ids");
    if (!hotel_ids) {
        goto end;
    }

    
    cJSON *hotel_ids_local = NULL;
    if(!cJSON_IsArray(hotel_ids)) {
        goto end;//primitive container
    }
    hotel_idsList = list_createList();

    cJSON_ArrayForEach(hotel_ids_local, hotel_ids)
    {
        if(!cJSON_IsString(hotel_ids_local))
        {
            goto end;
        }
        list_addElement(hotel_idsList , strdup(hotel_ids_local->valuestring));
    }

    // catalogs_items_filters->creative_assets_ids
    cJSON *creative_assets_ids = cJSON_GetObjectItemCaseSensitive(catalogs_items_filtersJSON, "creative_assets_ids");
    if (!creative_assets_ids) {
        goto end;
    }

    
    cJSON *creative_assets_ids_local = NULL;
    if(!cJSON_IsArray(creative_assets_ids)) {
        goto end;//primitive container
    }
    creative_assets_idsList = list_createList();

    cJSON_ArrayForEach(creative_assets_ids_local, creative_assets_ids)
    {
        if(!cJSON_IsString(creative_assets_ids_local))
        {
            goto end;
        }
        list_addElement(creative_assets_idsList , strdup(creative_assets_ids_local->valuestring));
    }


    catalogs_items_filters_local_var = catalogs_items_filters_create (
        catalog_type_local_nonprim,
        item_idsList,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        hotel_idsList,
        creative_assets_idsList
        );

    return catalogs_items_filters_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (item_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, item_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(item_idsList);
        item_idsList = NULL;
    }
    if (hotel_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hotel_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hotel_idsList);
        hotel_idsList = NULL;
    }
    if (creative_assets_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, creative_assets_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(creative_assets_idsList);
        creative_assets_idsList = NULL;
    }
    return NULL;

}
