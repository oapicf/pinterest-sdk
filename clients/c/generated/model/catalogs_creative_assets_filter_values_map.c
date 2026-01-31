#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_filter_values_map.h"


char* catalogs_creative_assets_filter_values_map_media_type_ToString(pinterest_rest_api_catalogs_creative_assets_filter_values_map_MEDIATYPE_e media_type) {
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    return media_typeArray[media_type - 1];
}

pinterest_rest_api_catalogs_creative_assets_filter_values_map_MEDIATYPE_e catalogs_creative_assets_filter_values_map_media_type_FromString(char* media_type) {
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_create_internal(
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type
    ) {
    catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_local_var = malloc(sizeof(catalogs_creative_assets_filter_values_map_t));
    if (!catalogs_creative_assets_filter_values_map_local_var) {
        return NULL;
    }
    catalogs_creative_assets_filter_values_map_local_var->custom_label_0 = custom_label_0;
    catalogs_creative_assets_filter_values_map_local_var->custom_label_1 = custom_label_1;
    catalogs_creative_assets_filter_values_map_local_var->custom_label_2 = custom_label_2;
    catalogs_creative_assets_filter_values_map_local_var->custom_label_3 = custom_label_3;
    catalogs_creative_assets_filter_values_map_local_var->custom_label_4 = custom_label_4;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_0 = google_product_category_0;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_1 = google_product_category_1;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_2 = google_product_category_2;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_3 = google_product_category_3;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_4 = google_product_category_4;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_5 = google_product_category_5;
    catalogs_creative_assets_filter_values_map_local_var->google_product_category_6 = google_product_category_6;
    catalogs_creative_assets_filter_values_map_local_var->media_type = media_type;

    catalogs_creative_assets_filter_values_map_local_var->_library_owned = 1;
    return catalogs_creative_assets_filter_values_map_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_create(
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type
    ) {
    return catalogs_creative_assets_filter_values_map_create_internal (
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        google_product_category_0,
        google_product_category_1,
        google_product_category_2,
        google_product_category_3,
        google_product_category_4,
        google_product_category_5,
        google_product_category_6,
        media_type
        );
}

void catalogs_creative_assets_filter_values_map_free(catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map) {
    if(NULL == catalogs_creative_assets_filter_values_map){
        return ;
    }
    if(catalogs_creative_assets_filter_values_map->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_filter_values_map_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_filter_values_map->custom_label_0) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->custom_label_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->custom_label_0);
        catalogs_creative_assets_filter_values_map->custom_label_0 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->custom_label_1) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->custom_label_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->custom_label_1);
        catalogs_creative_assets_filter_values_map->custom_label_1 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->custom_label_2) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->custom_label_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->custom_label_2);
        catalogs_creative_assets_filter_values_map->custom_label_2 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->custom_label_3) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->custom_label_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->custom_label_3);
        catalogs_creative_assets_filter_values_map->custom_label_3 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->custom_label_4) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->custom_label_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->custom_label_4);
        catalogs_creative_assets_filter_values_map->custom_label_4 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_0) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_0);
        catalogs_creative_assets_filter_values_map->google_product_category_0 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_1) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_1);
        catalogs_creative_assets_filter_values_map->google_product_category_1 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_2) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_2);
        catalogs_creative_assets_filter_values_map->google_product_category_2 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_3) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_3);
        catalogs_creative_assets_filter_values_map->google_product_category_3 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_4) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_4);
        catalogs_creative_assets_filter_values_map->google_product_category_4 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_5) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_5) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_5);
        catalogs_creative_assets_filter_values_map->google_product_category_5 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->google_product_category_6) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->google_product_category_6) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->google_product_category_6);
        catalogs_creative_assets_filter_values_map->google_product_category_6 = NULL;
    }
    if (catalogs_creative_assets_filter_values_map->media_type) {
        list_ForEach(listEntry, catalogs_creative_assets_filter_values_map->media_type) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_filter_values_map->media_type);
        catalogs_creative_assets_filter_values_map->media_type = NULL;
    }
    free(catalogs_creative_assets_filter_values_map);
}

cJSON *catalogs_creative_assets_filter_values_map_convertToJSON(catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_filter_values_map->custom_label_0
    if(catalogs_creative_assets_filter_values_map->custom_label_0) {
    cJSON *custom_label_0 = cJSON_AddArrayToObject(item, "custom_label_0");
    if(custom_label_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_0ListEntry;
    list_ForEach(custom_label_0ListEntry, catalogs_creative_assets_filter_values_map->custom_label_0) {
    if(cJSON_AddStringToObject(custom_label_0, "", custom_label_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->custom_label_1
    if(catalogs_creative_assets_filter_values_map->custom_label_1) {
    cJSON *custom_label_1 = cJSON_AddArrayToObject(item, "custom_label_1");
    if(custom_label_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_1ListEntry;
    list_ForEach(custom_label_1ListEntry, catalogs_creative_assets_filter_values_map->custom_label_1) {
    if(cJSON_AddStringToObject(custom_label_1, "", custom_label_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->custom_label_2
    if(catalogs_creative_assets_filter_values_map->custom_label_2) {
    cJSON *custom_label_2 = cJSON_AddArrayToObject(item, "custom_label_2");
    if(custom_label_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_2ListEntry;
    list_ForEach(custom_label_2ListEntry, catalogs_creative_assets_filter_values_map->custom_label_2) {
    if(cJSON_AddStringToObject(custom_label_2, "", custom_label_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->custom_label_3
    if(catalogs_creative_assets_filter_values_map->custom_label_3) {
    cJSON *custom_label_3 = cJSON_AddArrayToObject(item, "custom_label_3");
    if(custom_label_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_3ListEntry;
    list_ForEach(custom_label_3ListEntry, catalogs_creative_assets_filter_values_map->custom_label_3) {
    if(cJSON_AddStringToObject(custom_label_3, "", custom_label_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->custom_label_4
    if(catalogs_creative_assets_filter_values_map->custom_label_4) {
    cJSON *custom_label_4 = cJSON_AddArrayToObject(item, "custom_label_4");
    if(custom_label_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_4ListEntry;
    list_ForEach(custom_label_4ListEntry, catalogs_creative_assets_filter_values_map->custom_label_4) {
    if(cJSON_AddStringToObject(custom_label_4, "", custom_label_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_0
    if(catalogs_creative_assets_filter_values_map->google_product_category_0) {
    cJSON *google_product_category_0 = cJSON_AddArrayToObject(item, "google_product_category_0");
    if(google_product_category_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_0ListEntry;
    list_ForEach(google_product_category_0ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_0) {
    if(cJSON_AddStringToObject(google_product_category_0, "", google_product_category_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_1
    if(catalogs_creative_assets_filter_values_map->google_product_category_1) {
    cJSON *google_product_category_1 = cJSON_AddArrayToObject(item, "google_product_category_1");
    if(google_product_category_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_1ListEntry;
    list_ForEach(google_product_category_1ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_1) {
    if(cJSON_AddStringToObject(google_product_category_1, "", google_product_category_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_2
    if(catalogs_creative_assets_filter_values_map->google_product_category_2) {
    cJSON *google_product_category_2 = cJSON_AddArrayToObject(item, "google_product_category_2");
    if(google_product_category_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_2ListEntry;
    list_ForEach(google_product_category_2ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_2) {
    if(cJSON_AddStringToObject(google_product_category_2, "", google_product_category_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_3
    if(catalogs_creative_assets_filter_values_map->google_product_category_3) {
    cJSON *google_product_category_3 = cJSON_AddArrayToObject(item, "google_product_category_3");
    if(google_product_category_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_3ListEntry;
    list_ForEach(google_product_category_3ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_3) {
    if(cJSON_AddStringToObject(google_product_category_3, "", google_product_category_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_4
    if(catalogs_creative_assets_filter_values_map->google_product_category_4) {
    cJSON *google_product_category_4 = cJSON_AddArrayToObject(item, "google_product_category_4");
    if(google_product_category_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_4ListEntry;
    list_ForEach(google_product_category_4ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_4) {
    if(cJSON_AddStringToObject(google_product_category_4, "", google_product_category_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_5
    if(catalogs_creative_assets_filter_values_map->google_product_category_5) {
    cJSON *google_product_category_5 = cJSON_AddArrayToObject(item, "google_product_category_5");
    if(google_product_category_5 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_5ListEntry;
    list_ForEach(google_product_category_5ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_5) {
    if(cJSON_AddStringToObject(google_product_category_5, "", google_product_category_5ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->google_product_category_6
    if(catalogs_creative_assets_filter_values_map->google_product_category_6) {
    cJSON *google_product_category_6 = cJSON_AddArrayToObject(item, "google_product_category_6");
    if(google_product_category_6 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_6ListEntry;
    list_ForEach(google_product_category_6ListEntry, catalogs_creative_assets_filter_values_map->google_product_category_6) {
    if(cJSON_AddStringToObject(google_product_category_6, "", google_product_category_6ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_creative_assets_filter_values_map->media_type
    if(catalogs_creative_assets_filter_values_map->media_type != pinterest_rest_api_catalogs_creative_assets_filter_values_map_MEDIATYPE_NULL) {
    cJSON *media_type = cJSON_AddArrayToObject(item, "media_type");
    if(media_type == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *media_typeListEntry;
    list_ForEach(media_typeListEntry, catalogs_creative_assets_filter_values_map->media_type) {
    if(cJSON_AddStringToObject(media_type, "", media_typeListEntry->data) == NULL)
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

catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_parseFromJSON(cJSON *catalogs_creative_assets_filter_values_mapJSON){

    catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_local_var = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->custom_label_0
    list_t *custom_label_0List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->custom_label_1
    list_t *custom_label_1List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->custom_label_2
    list_t *custom_label_2List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->custom_label_3
    list_t *custom_label_3List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->custom_label_4
    list_t *custom_label_4List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_0
    list_t *google_product_category_0List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_1
    list_t *google_product_category_1List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_2
    list_t *google_product_category_2List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_3
    list_t *google_product_category_3List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_4
    list_t *google_product_category_4List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_5
    list_t *google_product_category_5List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->google_product_category_6
    list_t *google_product_category_6List = NULL;

    // define the local list for catalogs_creative_assets_filter_values_map->media_type
    list_t *media_typeList = NULL;

    // catalogs_creative_assets_filter_values_map->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "custom_label_0");
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

    // catalogs_creative_assets_filter_values_map->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "custom_label_1");
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

    // catalogs_creative_assets_filter_values_map->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "custom_label_2");
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

    // catalogs_creative_assets_filter_values_map->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "custom_label_3");
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

    // catalogs_creative_assets_filter_values_map->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "custom_label_4");
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

    // catalogs_creative_assets_filter_values_map->google_product_category_0
    cJSON *google_product_category_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_0");
    if (cJSON_IsNull(google_product_category_0)) {
        google_product_category_0 = NULL;
    }
    if (google_product_category_0) { 
    cJSON *google_product_category_0_local = NULL;
    if(!cJSON_IsArray(google_product_category_0)) {
        goto end;//primitive container
    }
    google_product_category_0List = list_createList();

    cJSON_ArrayForEach(google_product_category_0_local, google_product_category_0)
    {
        if(!cJSON_IsString(google_product_category_0_local))
        {
            goto end;
        }
        list_addElement(google_product_category_0List , strdup(google_product_category_0_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_1
    cJSON *google_product_category_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_1");
    if (cJSON_IsNull(google_product_category_1)) {
        google_product_category_1 = NULL;
    }
    if (google_product_category_1) { 
    cJSON *google_product_category_1_local = NULL;
    if(!cJSON_IsArray(google_product_category_1)) {
        goto end;//primitive container
    }
    google_product_category_1List = list_createList();

    cJSON_ArrayForEach(google_product_category_1_local, google_product_category_1)
    {
        if(!cJSON_IsString(google_product_category_1_local))
        {
            goto end;
        }
        list_addElement(google_product_category_1List , strdup(google_product_category_1_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_2");
    if (cJSON_IsNull(google_product_category_2)) {
        google_product_category_2 = NULL;
    }
    if (google_product_category_2) { 
    cJSON *google_product_category_2_local = NULL;
    if(!cJSON_IsArray(google_product_category_2)) {
        goto end;//primitive container
    }
    google_product_category_2List = list_createList();

    cJSON_ArrayForEach(google_product_category_2_local, google_product_category_2)
    {
        if(!cJSON_IsString(google_product_category_2_local))
        {
            goto end;
        }
        list_addElement(google_product_category_2List , strdup(google_product_category_2_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_3");
    if (cJSON_IsNull(google_product_category_3)) {
        google_product_category_3 = NULL;
    }
    if (google_product_category_3) { 
    cJSON *google_product_category_3_local = NULL;
    if(!cJSON_IsArray(google_product_category_3)) {
        goto end;//primitive container
    }
    google_product_category_3List = list_createList();

    cJSON_ArrayForEach(google_product_category_3_local, google_product_category_3)
    {
        if(!cJSON_IsString(google_product_category_3_local))
        {
            goto end;
        }
        list_addElement(google_product_category_3List , strdup(google_product_category_3_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_4
    cJSON *google_product_category_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_4");
    if (cJSON_IsNull(google_product_category_4)) {
        google_product_category_4 = NULL;
    }
    if (google_product_category_4) { 
    cJSON *google_product_category_4_local = NULL;
    if(!cJSON_IsArray(google_product_category_4)) {
        goto end;//primitive container
    }
    google_product_category_4List = list_createList();

    cJSON_ArrayForEach(google_product_category_4_local, google_product_category_4)
    {
        if(!cJSON_IsString(google_product_category_4_local))
        {
            goto end;
        }
        list_addElement(google_product_category_4List , strdup(google_product_category_4_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_5
    cJSON *google_product_category_5 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_5");
    if (cJSON_IsNull(google_product_category_5)) {
        google_product_category_5 = NULL;
    }
    if (google_product_category_5) { 
    cJSON *google_product_category_5_local = NULL;
    if(!cJSON_IsArray(google_product_category_5)) {
        goto end;//primitive container
    }
    google_product_category_5List = list_createList();

    cJSON_ArrayForEach(google_product_category_5_local, google_product_category_5)
    {
        if(!cJSON_IsString(google_product_category_5_local))
        {
            goto end;
        }
        list_addElement(google_product_category_5List , strdup(google_product_category_5_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->google_product_category_6
    cJSON *google_product_category_6 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "google_product_category_6");
    if (cJSON_IsNull(google_product_category_6)) {
        google_product_category_6 = NULL;
    }
    if (google_product_category_6) { 
    cJSON *google_product_category_6_local = NULL;
    if(!cJSON_IsArray(google_product_category_6)) {
        goto end;//primitive container
    }
    google_product_category_6List = list_createList();

    cJSON_ArrayForEach(google_product_category_6_local, google_product_category_6)
    {
        if(!cJSON_IsString(google_product_category_6_local))
        {
            goto end;
        }
        list_addElement(google_product_category_6List , strdup(google_product_category_6_local->valuestring));
    }
    }

    // catalogs_creative_assets_filter_values_map->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_filter_values_mapJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (media_type) { 
    cJSON *media_type_local = NULL;
    if(!cJSON_IsArray(media_type)) {
        goto end;//primitive container
    }
    media_typeList = list_createList();

    cJSON_ArrayForEach(media_type_local, media_type)
    {
        if(!cJSON_IsString(media_type_local))
        {
            goto end;
        }
        list_addElement(media_typeList , strdup(media_type_local->valuestring));
    }
    }


    catalogs_creative_assets_filter_values_map_local_var = catalogs_creative_assets_filter_values_map_create_internal (
        custom_label_0 ? custom_label_0List : NULL,
        custom_label_1 ? custom_label_1List : NULL,
        custom_label_2 ? custom_label_2List : NULL,
        custom_label_3 ? custom_label_3List : NULL,
        custom_label_4 ? custom_label_4List : NULL,
        google_product_category_0 ? google_product_category_0List : NULL,
        google_product_category_1 ? google_product_category_1List : NULL,
        google_product_category_2 ? google_product_category_2List : NULL,
        google_product_category_3 ? google_product_category_3List : NULL,
        google_product_category_4 ? google_product_category_4List : NULL,
        google_product_category_5 ? google_product_category_5List : NULL,
        google_product_category_6 ? google_product_category_6List : NULL,
        media_type ? media_typeList : NULL
        );

    return catalogs_creative_assets_filter_values_map_local_var;
end:
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
    if (google_product_category_0List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_0List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_0List);
        google_product_category_0List = NULL;
    }
    if (google_product_category_1List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_1List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_1List);
        google_product_category_1List = NULL;
    }
    if (google_product_category_2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_2List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_2List);
        google_product_category_2List = NULL;
    }
    if (google_product_category_3List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_3List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_3List);
        google_product_category_3List = NULL;
    }
    if (google_product_category_4List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_4List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_4List);
        google_product_category_4List = NULL;
    }
    if (google_product_category_5List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_5List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_5List);
        google_product_category_5List = NULL;
    }
    if (google_product_category_6List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_6List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_6List);
        google_product_category_6List = NULL;
    }
    if (media_typeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, media_typeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(media_typeList);
        media_typeList = NULL;
    }
    return NULL;

}
