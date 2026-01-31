#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_filter_values_map.h"



static catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_create_internal(
    list_t *brand,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4
    ) {
    catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_local_var = malloc(sizeof(catalogs_hotel_filter_values_map_t));
    if (!catalogs_hotel_filter_values_map_local_var) {
        return NULL;
    }
    catalogs_hotel_filter_values_map_local_var->brand = brand;
    catalogs_hotel_filter_values_map_local_var->custom_label_0 = custom_label_0;
    catalogs_hotel_filter_values_map_local_var->custom_label_1 = custom_label_1;
    catalogs_hotel_filter_values_map_local_var->custom_label_2 = custom_label_2;
    catalogs_hotel_filter_values_map_local_var->custom_label_3 = custom_label_3;
    catalogs_hotel_filter_values_map_local_var->custom_label_4 = custom_label_4;

    catalogs_hotel_filter_values_map_local_var->_library_owned = 1;
    return catalogs_hotel_filter_values_map_local_var;
}

__attribute__((deprecated)) catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_create(
    list_t *brand,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4
    ) {
    return catalogs_hotel_filter_values_map_create_internal (
        brand,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4
        );
}

void catalogs_hotel_filter_values_map_free(catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map) {
    if(NULL == catalogs_hotel_filter_values_map){
        return ;
    }
    if(catalogs_hotel_filter_values_map->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_filter_values_map_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_filter_values_map->brand) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->brand) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->brand);
        catalogs_hotel_filter_values_map->brand = NULL;
    }
    if (catalogs_hotel_filter_values_map->custom_label_0) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->custom_label_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->custom_label_0);
        catalogs_hotel_filter_values_map->custom_label_0 = NULL;
    }
    if (catalogs_hotel_filter_values_map->custom_label_1) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->custom_label_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->custom_label_1);
        catalogs_hotel_filter_values_map->custom_label_1 = NULL;
    }
    if (catalogs_hotel_filter_values_map->custom_label_2) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->custom_label_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->custom_label_2);
        catalogs_hotel_filter_values_map->custom_label_2 = NULL;
    }
    if (catalogs_hotel_filter_values_map->custom_label_3) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->custom_label_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->custom_label_3);
        catalogs_hotel_filter_values_map->custom_label_3 = NULL;
    }
    if (catalogs_hotel_filter_values_map->custom_label_4) {
        list_ForEach(listEntry, catalogs_hotel_filter_values_map->custom_label_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_filter_values_map->custom_label_4);
        catalogs_hotel_filter_values_map->custom_label_4 = NULL;
    }
    free(catalogs_hotel_filter_values_map);
}

cJSON *catalogs_hotel_filter_values_map_convertToJSON(catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_filter_values_map->brand
    if(catalogs_hotel_filter_values_map->brand) {
    cJSON *brand = cJSON_AddArrayToObject(item, "brand");
    if(brand == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *brandListEntry;
    list_ForEach(brandListEntry, catalogs_hotel_filter_values_map->brand) {
    if(cJSON_AddStringToObject(brand, "", brandListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_filter_values_map->custom_label_0
    if(catalogs_hotel_filter_values_map->custom_label_0) {
    cJSON *custom_label_0 = cJSON_AddArrayToObject(item, "custom_label_0");
    if(custom_label_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_0ListEntry;
    list_ForEach(custom_label_0ListEntry, catalogs_hotel_filter_values_map->custom_label_0) {
    if(cJSON_AddStringToObject(custom_label_0, "", custom_label_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_filter_values_map->custom_label_1
    if(catalogs_hotel_filter_values_map->custom_label_1) {
    cJSON *custom_label_1 = cJSON_AddArrayToObject(item, "custom_label_1");
    if(custom_label_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_1ListEntry;
    list_ForEach(custom_label_1ListEntry, catalogs_hotel_filter_values_map->custom_label_1) {
    if(cJSON_AddStringToObject(custom_label_1, "", custom_label_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_filter_values_map->custom_label_2
    if(catalogs_hotel_filter_values_map->custom_label_2) {
    cJSON *custom_label_2 = cJSON_AddArrayToObject(item, "custom_label_2");
    if(custom_label_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_2ListEntry;
    list_ForEach(custom_label_2ListEntry, catalogs_hotel_filter_values_map->custom_label_2) {
    if(cJSON_AddStringToObject(custom_label_2, "", custom_label_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_filter_values_map->custom_label_3
    if(catalogs_hotel_filter_values_map->custom_label_3) {
    cJSON *custom_label_3 = cJSON_AddArrayToObject(item, "custom_label_3");
    if(custom_label_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_3ListEntry;
    list_ForEach(custom_label_3ListEntry, catalogs_hotel_filter_values_map->custom_label_3) {
    if(cJSON_AddStringToObject(custom_label_3, "", custom_label_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_hotel_filter_values_map->custom_label_4
    if(catalogs_hotel_filter_values_map->custom_label_4) {
    cJSON *custom_label_4 = cJSON_AddArrayToObject(item, "custom_label_4");
    if(custom_label_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_4ListEntry;
    list_ForEach(custom_label_4ListEntry, catalogs_hotel_filter_values_map->custom_label_4) {
    if(cJSON_AddStringToObject(custom_label_4, "", custom_label_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_parseFromJSON(cJSON *catalogs_hotel_filter_values_mapJSON){

    catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_local_var = NULL;

    // define the local list for catalogs_hotel_filter_values_map->brand
    list_t *brandList = NULL;

    // define the local list for catalogs_hotel_filter_values_map->custom_label_0
    list_t *custom_label_0List = NULL;

    // define the local list for catalogs_hotel_filter_values_map->custom_label_1
    list_t *custom_label_1List = NULL;

    // define the local list for catalogs_hotel_filter_values_map->custom_label_2
    list_t *custom_label_2List = NULL;

    // define the local list for catalogs_hotel_filter_values_map->custom_label_3
    list_t *custom_label_3List = NULL;

    // define the local list for catalogs_hotel_filter_values_map->custom_label_4
    list_t *custom_label_4List = NULL;

    // catalogs_hotel_filter_values_map->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    cJSON *brand_local = NULL;
    if(!cJSON_IsArray(brand)) {
        goto end;//primitive container
    }
    brandList = list_createList();

    cJSON_ArrayForEach(brand_local, brand)
    {
        if(!cJSON_IsString(brand_local))
        {
            goto end;
        }
        list_addElement(brandList , strdup(brand_local->valuestring));
    }
    }

    // catalogs_hotel_filter_values_map->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    cJSON *custom_label_0_local = NULL;
    if(!cJSON_IsArray(custom_label_0)) {
        goto end;//primitive container
    }
    custom_label_0List = list_createList();

    cJSON_ArrayForEach(custom_label_0_local, custom_label_0)
    {
        if(!cJSON_IsString(custom_label_0_local))
        {
            goto end;
        }
        list_addElement(custom_label_0List , strdup(custom_label_0_local->valuestring));
    }
    }

    // catalogs_hotel_filter_values_map->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    cJSON *custom_label_1_local = NULL;
    if(!cJSON_IsArray(custom_label_1)) {
        goto end;//primitive container
    }
    custom_label_1List = list_createList();

    cJSON_ArrayForEach(custom_label_1_local, custom_label_1)
    {
        if(!cJSON_IsString(custom_label_1_local))
        {
            goto end;
        }
        list_addElement(custom_label_1List , strdup(custom_label_1_local->valuestring));
    }
    }

    // catalogs_hotel_filter_values_map->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    cJSON *custom_label_2_local = NULL;
    if(!cJSON_IsArray(custom_label_2)) {
        goto end;//primitive container
    }
    custom_label_2List = list_createList();

    cJSON_ArrayForEach(custom_label_2_local, custom_label_2)
    {
        if(!cJSON_IsString(custom_label_2_local))
        {
            goto end;
        }
        list_addElement(custom_label_2List , strdup(custom_label_2_local->valuestring));
    }
    }

    // catalogs_hotel_filter_values_map->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    cJSON *custom_label_3_local = NULL;
    if(!cJSON_IsArray(custom_label_3)) {
        goto end;//primitive container
    }
    custom_label_3List = list_createList();

    cJSON_ArrayForEach(custom_label_3_local, custom_label_3)
    {
        if(!cJSON_IsString(custom_label_3_local))
        {
            goto end;
        }
        list_addElement(custom_label_3List , strdup(custom_label_3_local->valuestring));
    }
    }

    // catalogs_hotel_filter_values_map->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_filter_values_mapJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    cJSON *custom_label_4_local = NULL;
    if(!cJSON_IsArray(custom_label_4)) {
        goto end;//primitive container
    }
    custom_label_4List = list_createList();

    cJSON_ArrayForEach(custom_label_4_local, custom_label_4)
    {
        if(!cJSON_IsString(custom_label_4_local))
        {
            goto end;
        }
        list_addElement(custom_label_4List , strdup(custom_label_4_local->valuestring));
    }
    }


    catalogs_hotel_filter_values_map_local_var = catalogs_hotel_filter_values_map_create_internal (
        brand ? brandList : NULL,
        custom_label_0 ? custom_label_0List : NULL,
        custom_label_1 ? custom_label_1List : NULL,
        custom_label_2 ? custom_label_2List : NULL,
        custom_label_3 ? custom_label_3List : NULL,
        custom_label_4 ? custom_label_4List : NULL
        );

    return catalogs_hotel_filter_values_map_local_var;
end:
    if (brandList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, brandList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(brandList);
        brandList = NULL;
    }
    if (custom_label_0List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_0List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_0List);
        custom_label_0List = NULL;
    }
    if (custom_label_1List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_1List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_1List);
        custom_label_1List = NULL;
    }
    if (custom_label_2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_2List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_2List);
        custom_label_2List = NULL;
    }
    if (custom_label_3List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_3List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_3List);
        custom_label_3List = NULL;
    }
    if (custom_label_4List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_4List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_4List);
        custom_label_4List = NULL;
    }
    return NULL;

}
