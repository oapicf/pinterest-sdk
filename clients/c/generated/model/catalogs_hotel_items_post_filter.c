#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_items_post_filter.h"


char* catalogs_hotel_items_post_filter_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_e catalogs_hotel_items_post_filter_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *hotel_ids
    ) {
    catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter_local_var = malloc(sizeof(catalogs_hotel_items_post_filter_t));
    if (!catalogs_hotel_items_post_filter_local_var) {
        return NULL;
    }
    catalogs_hotel_items_post_filter_local_var->catalog_id = catalog_id;
    catalogs_hotel_items_post_filter_local_var->catalog_type = catalog_type;
    catalogs_hotel_items_post_filter_local_var->hotel_ids = hotel_ids;

    catalogs_hotel_items_post_filter_local_var->_library_owned = 1;
    return catalogs_hotel_items_post_filter_local_var;
}

__attribute__((deprecated)) catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *hotel_ids
    ) {
    return catalogs_hotel_items_post_filter_create_internal (
        catalog_id,
        catalog_type,
        hotel_ids
        );
}

void catalogs_hotel_items_post_filter_free(catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter) {
    if(NULL == catalogs_hotel_items_post_filter){
        return ;
    }
    if(catalogs_hotel_items_post_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_items_post_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_items_post_filter->catalog_id) {
        free(catalogs_hotel_items_post_filter->catalog_id);
        catalogs_hotel_items_post_filter->catalog_id = NULL;
    }
    if (catalogs_hotel_items_post_filter->hotel_ids) {
        list_ForEach(listEntry, catalogs_hotel_items_post_filter->hotel_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_items_post_filter->hotel_ids);
        catalogs_hotel_items_post_filter->hotel_ids = NULL;
    }
    free(catalogs_hotel_items_post_filter);
}

cJSON *catalogs_hotel_items_post_filter_convertToJSON(catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_items_post_filter->catalog_id
    if(catalogs_hotel_items_post_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_items_post_filter->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_items_post_filter->catalog_type
    if (pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_NULL == catalogs_hotel_items_post_filter->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_hotel_items_post_filter_catalog_type_ToString(catalogs_hotel_items_post_filter->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_hotel_items_post_filter->hotel_ids
    if (!catalogs_hotel_items_post_filter->hotel_ids) {
        goto fail;
    }
    cJSON *hotel_ids = cJSON_AddArrayToObject(item, "hotel_ids");
    if(hotel_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hotel_idsListEntry;
    list_ForEach(hotel_idsListEntry, catalogs_hotel_items_post_filter->hotel_ids) {
    if(cJSON_AddStringToObject(hotel_ids, "", hotel_idsListEntry->data) == NULL)
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

catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter_parseFromJSON(cJSON *catalogs_hotel_items_post_filterJSON){

    catalogs_hotel_items_post_filter_t *catalogs_hotel_items_post_filter_local_var = NULL;

    // define the local list for catalogs_hotel_items_post_filter->hotel_ids
    list_t *hotel_idsList = NULL;

    // catalogs_hotel_items_post_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_post_filterJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_items_post_filter->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_post_filterJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_hotel_items_post_filter_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_items_post_filter_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_hotel_items_post_filter->hotel_ids
    cJSON *hotel_ids = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_post_filterJSON, "hotel_ids");
    if (cJSON_IsNull(hotel_ids)) {
        hotel_ids = NULL;
    }
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


    catalogs_hotel_items_post_filter_local_var = catalogs_hotel_items_post_filter_create_internal (
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        catalog_typeVariable,
        hotel_idsList
        );

    return catalogs_hotel_items_post_filter_local_var;
end:
    if (hotel_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hotel_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hotel_idsList);
        hotel_idsList = NULL;
    }
    return NULL;

}
