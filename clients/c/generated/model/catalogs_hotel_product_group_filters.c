#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_group_filters.h"



catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters_create(
    list_t *any_of,
    list_t *all_of
    ) {
    catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters_local_var = malloc(sizeof(catalogs_hotel_product_group_filters_t));
    if (!catalogs_hotel_product_group_filters_local_var) {
        return NULL;
    }
    catalogs_hotel_product_group_filters_local_var->any_of = any_of;
    catalogs_hotel_product_group_filters_local_var->all_of = all_of;

    return catalogs_hotel_product_group_filters_local_var;
}


void catalogs_hotel_product_group_filters_free(catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters) {
    if(NULL == catalogs_hotel_product_group_filters){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product_group_filters->any_of) {
        list_ForEach(listEntry, catalogs_hotel_product_group_filters->any_of) {
            catalogs_hotel_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(catalogs_hotel_product_group_filters->any_of);
        catalogs_hotel_product_group_filters->any_of = NULL;
    }
    if (catalogs_hotel_product_group_filters->all_of) {
        list_ForEach(listEntry, catalogs_hotel_product_group_filters->all_of) {
            catalogs_hotel_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(catalogs_hotel_product_group_filters->all_of);
        catalogs_hotel_product_group_filters->all_of = NULL;
    }
    free(catalogs_hotel_product_group_filters);
}

cJSON *catalogs_hotel_product_group_filters_convertToJSON(catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product_group_filters->any_of
    if (!catalogs_hotel_product_group_filters->any_of) {
        goto fail;
    }
    cJSON *any_of = cJSON_AddArrayToObject(item, "any_of");
    if(any_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *any_ofListEntry;
    if (catalogs_hotel_product_group_filters->any_of) {
    list_ForEach(any_ofListEntry, catalogs_hotel_product_group_filters->any_of) {
    cJSON *itemLocal = catalogs_hotel_product_group_filter_keys_convertToJSON(any_ofListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(any_of, itemLocal);
    }
    }


    // catalogs_hotel_product_group_filters->all_of
    if (!catalogs_hotel_product_group_filters->all_of) {
        goto fail;
    }
    cJSON *all_of = cJSON_AddArrayToObject(item, "all_of");
    if(all_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *all_ofListEntry;
    if (catalogs_hotel_product_group_filters->all_of) {
    list_ForEach(all_ofListEntry, catalogs_hotel_product_group_filters->all_of) {
    cJSON *itemLocal = catalogs_hotel_product_group_filter_keys_convertToJSON(all_ofListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(all_of, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters_parseFromJSON(cJSON *catalogs_hotel_product_group_filtersJSON){

    catalogs_hotel_product_group_filters_t *catalogs_hotel_product_group_filters_local_var = NULL;

    // define the local list for catalogs_hotel_product_group_filters->any_of
    list_t *any_ofList = NULL;

    // define the local list for catalogs_hotel_product_group_filters->all_of
    list_t *all_ofList = NULL;

    // catalogs_hotel_product_group_filters->any_of
    cJSON *any_of = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filtersJSON, "any_of");
    if (!any_of) {
        goto end;
    }

    
    cJSON *any_of_local_nonprimitive = NULL;
    if(!cJSON_IsArray(any_of)){
        goto end; //nonprimitive container
    }

    any_ofList = list_createList();

    cJSON_ArrayForEach(any_of_local_nonprimitive,any_of )
    {
        if(!cJSON_IsObject(any_of_local_nonprimitive)){
            goto end;
        }
        catalogs_hotel_product_group_filter_keys_t *any_ofItem = catalogs_hotel_product_group_filter_keys_parseFromJSON(any_of_local_nonprimitive);

        list_addElement(any_ofList, any_ofItem);
    }

    // catalogs_hotel_product_group_filters->all_of
    cJSON *all_of = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_filtersJSON, "all_of");
    if (!all_of) {
        goto end;
    }

    
    cJSON *all_of_local_nonprimitive = NULL;
    if(!cJSON_IsArray(all_of)){
        goto end; //nonprimitive container
    }

    all_ofList = list_createList();

    cJSON_ArrayForEach(all_of_local_nonprimitive,all_of )
    {
        if(!cJSON_IsObject(all_of_local_nonprimitive)){
            goto end;
        }
        catalogs_hotel_product_group_filter_keys_t *all_ofItem = catalogs_hotel_product_group_filter_keys_parseFromJSON(all_of_local_nonprimitive);

        list_addElement(all_ofList, all_ofItem);
    }


    catalogs_hotel_product_group_filters_local_var = catalogs_hotel_product_group_filters_create (
        any_ofList,
        all_ofList
        );

    return catalogs_hotel_product_group_filters_local_var;
end:
    if (any_ofList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, any_ofList) {
            catalogs_hotel_product_group_filter_keys_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(any_ofList);
        any_ofList = NULL;
    }
    if (all_ofList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, all_ofList) {
            catalogs_hotel_product_group_filter_keys_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(all_ofList);
        all_ofList = NULL;
    }
    return NULL;

}
