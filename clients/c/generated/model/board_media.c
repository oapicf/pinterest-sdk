#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_media.h"



board_media_t *board_media_create(
    char *image_cover_url,
    list_t *pin_thumbnail_urls
    ) {
    board_media_t *board_media_local_var = malloc(sizeof(board_media_t));
    if (!board_media_local_var) {
        return NULL;
    }
    board_media_local_var->image_cover_url = image_cover_url;
    board_media_local_var->pin_thumbnail_urls = pin_thumbnail_urls;

    return board_media_local_var;
}


void board_media_free(board_media_t *board_media) {
    if(NULL == board_media){
        return ;
    }
    listEntry_t *listEntry;
    if (board_media->image_cover_url) {
        free(board_media->image_cover_url);
        board_media->image_cover_url = NULL;
    }
    if (board_media->pin_thumbnail_urls) {
        list_ForEach(listEntry, board_media->pin_thumbnail_urls) {
            free(listEntry->data);
        }
        list_freeList(board_media->pin_thumbnail_urls);
        board_media->pin_thumbnail_urls = NULL;
    }
    free(board_media);
}

cJSON *board_media_convertToJSON(board_media_t *board_media) {
    cJSON *item = cJSON_CreateObject();

    // board_media->image_cover_url
    if(board_media->image_cover_url) {
    if(cJSON_AddStringToObject(item, "image_cover_url", board_media->image_cover_url) == NULL) {
    goto fail; //String
    }
    }


    // board_media->pin_thumbnail_urls
    if(board_media->pin_thumbnail_urls) {
    cJSON *pin_thumbnail_urls = cJSON_AddArrayToObject(item, "pin_thumbnail_urls");
    if(pin_thumbnail_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *pin_thumbnail_urlsListEntry;
    list_ForEach(pin_thumbnail_urlsListEntry, board_media->pin_thumbnail_urls) {
    if(cJSON_AddStringToObject(pin_thumbnail_urls, "", (char*)pin_thumbnail_urlsListEntry->data) == NULL)
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

board_media_t *board_media_parseFromJSON(cJSON *board_mediaJSON){

    board_media_t *board_media_local_var = NULL;

    // define the local list for board_media->pin_thumbnail_urls
    list_t *pin_thumbnail_urlsList = NULL;

    // board_media->image_cover_url
    cJSON *image_cover_url = cJSON_GetObjectItemCaseSensitive(board_mediaJSON, "image_cover_url");
    if (image_cover_url) { 
    if(!cJSON_IsString(image_cover_url) && !cJSON_IsNull(image_cover_url))
    {
    goto end; //String
    }
    }

    // board_media->pin_thumbnail_urls
    cJSON *pin_thumbnail_urls = cJSON_GetObjectItemCaseSensitive(board_mediaJSON, "pin_thumbnail_urls");
    if (pin_thumbnail_urls) { 
    cJSON *pin_thumbnail_urls_local = NULL;
    if(!cJSON_IsArray(pin_thumbnail_urls)) {
        goto end;//primitive container
    }
    pin_thumbnail_urlsList = list_createList();

    cJSON_ArrayForEach(pin_thumbnail_urls_local, pin_thumbnail_urls)
    {
        if(!cJSON_IsString(pin_thumbnail_urls_local))
        {
            goto end;
        }
        list_addElement(pin_thumbnail_urlsList , strdup(pin_thumbnail_urls_local->valuestring));
    }
    }


    board_media_local_var = board_media_create (
        image_cover_url && !cJSON_IsNull(image_cover_url) ? strdup(image_cover_url->valuestring) : NULL,
        pin_thumbnail_urls ? pin_thumbnail_urlsList : NULL
        );

    return board_media_local_var;
end:
    if (pin_thumbnail_urlsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pin_thumbnail_urlsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pin_thumbnail_urlsList);
        pin_thumbnail_urlsList = NULL;
    }
    return NULL;

}
