#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_attributes_all_of_main_image.h"



catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_create(
    char *link,
    list_t *tag
    ) {
    catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_local_var = malloc(sizeof(catalogs_hotel_attributes_all_of_main_image_t));
    if (!catalogs_hotel_attributes_all_of_main_image_local_var) {
        return NULL;
    }
    catalogs_hotel_attributes_all_of_main_image_local_var->link = link;
    catalogs_hotel_attributes_all_of_main_image_local_var->tag = tag;

    return catalogs_hotel_attributes_all_of_main_image_local_var;
}


void catalogs_hotel_attributes_all_of_main_image_free(catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image) {
    if(NULL == catalogs_hotel_attributes_all_of_main_image){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_attributes_all_of_main_image->link) {
        free(catalogs_hotel_attributes_all_of_main_image->link);
        catalogs_hotel_attributes_all_of_main_image->link = NULL;
    }
    if (catalogs_hotel_attributes_all_of_main_image->tag) {
        list_ForEach(listEntry, catalogs_hotel_attributes_all_of_main_image->tag) {
            free(listEntry->data);
        }
        list_freeList(catalogs_hotel_attributes_all_of_main_image->tag);
        catalogs_hotel_attributes_all_of_main_image->tag = NULL;
    }
    free(catalogs_hotel_attributes_all_of_main_image);
}

cJSON *catalogs_hotel_attributes_all_of_main_image_convertToJSON(catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_attributes_all_of_main_image->link
    if(catalogs_hotel_attributes_all_of_main_image->link) {
    if(cJSON_AddStringToObject(item, "link", catalogs_hotel_attributes_all_of_main_image->link) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_attributes_all_of_main_image->tag
    if(catalogs_hotel_attributes_all_of_main_image->tag) {
    cJSON *tag = cJSON_AddArrayToObject(item, "tag");
    if(tag == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tagListEntry;
    list_ForEach(tagListEntry, catalogs_hotel_attributes_all_of_main_image->tag) {
    if(cJSON_AddStringToObject(tag, "", (char*)tagListEntry->data) == NULL)
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

catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_parseFromJSON(cJSON *catalogs_hotel_attributes_all_of_main_imageJSON){

    catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_local_var = NULL;

    // define the local list for catalogs_hotel_attributes_all_of_main_image->tag
    list_t *tagList = NULL;

    // catalogs_hotel_attributes_all_of_main_image->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributes_all_of_main_imageJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_attributes_all_of_main_image->tag
    cJSON *tag = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_attributes_all_of_main_imageJSON, "tag");
    if (tag) { 
    cJSON *tag_local = NULL;
    if(!cJSON_IsArray(tag)) {
        goto end;//primitive container
    }
    tagList = list_createList();

    cJSON_ArrayForEach(tag_local, tag)
    {
        if(!cJSON_IsString(tag_local))
        {
            goto end;
        }
        list_addElement(tagList , strdup(tag_local->valuestring));
    }
    }


    catalogs_hotel_attributes_all_of_main_image_local_var = catalogs_hotel_attributes_all_of_main_image_create (
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        tag ? tagList : NULL
        );

    return catalogs_hotel_attributes_all_of_main_image_local_var;
end:
    if (tagList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tagList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tagList);
        tagList = NULL;
    }
    return NULL;

}
