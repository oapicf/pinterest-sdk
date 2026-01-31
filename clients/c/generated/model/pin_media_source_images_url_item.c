#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_images_url_item.h"



static pin_media_source_images_url_item_t *pin_media_source_images_url_item_create_internal(
    char *description,
    char *link,
    char *title,
    char *url
    ) {
    pin_media_source_images_url_item_t *pin_media_source_images_url_item_local_var = malloc(sizeof(pin_media_source_images_url_item_t));
    if (!pin_media_source_images_url_item_local_var) {
        return NULL;
    }
    pin_media_source_images_url_item_local_var->description = description;
    pin_media_source_images_url_item_local_var->link = link;
    pin_media_source_images_url_item_local_var->title = title;
    pin_media_source_images_url_item_local_var->url = url;

    pin_media_source_images_url_item_local_var->_library_owned = 1;
    return pin_media_source_images_url_item_local_var;
}

__attribute__((deprecated)) pin_media_source_images_url_item_t *pin_media_source_images_url_item_create(
    char *description,
    char *link,
    char *title,
    char *url
    ) {
    return pin_media_source_images_url_item_create_internal (
        description,
        link,
        title,
        url
        );
}

void pin_media_source_images_url_item_free(pin_media_source_images_url_item_t *pin_media_source_images_url_item) {
    if(NULL == pin_media_source_images_url_item){
        return ;
    }
    if(pin_media_source_images_url_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_images_url_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_images_url_item->description) {
        free(pin_media_source_images_url_item->description);
        pin_media_source_images_url_item->description = NULL;
    }
    if (pin_media_source_images_url_item->link) {
        free(pin_media_source_images_url_item->link);
        pin_media_source_images_url_item->link = NULL;
    }
    if (pin_media_source_images_url_item->title) {
        free(pin_media_source_images_url_item->title);
        pin_media_source_images_url_item->title = NULL;
    }
    if (pin_media_source_images_url_item->url) {
        free(pin_media_source_images_url_item->url);
        pin_media_source_images_url_item->url = NULL;
    }
    free(pin_media_source_images_url_item);
}

cJSON *pin_media_source_images_url_item_convertToJSON(pin_media_source_images_url_item_t *pin_media_source_images_url_item) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_images_url_item->description
    if(pin_media_source_images_url_item->description) {
    if(cJSON_AddStringToObject(item, "description", pin_media_source_images_url_item->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_item->link
    if(pin_media_source_images_url_item->link) {
    if(cJSON_AddStringToObject(item, "link", pin_media_source_images_url_item->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_item->title
    if(pin_media_source_images_url_item->title) {
    if(cJSON_AddStringToObject(item, "title", pin_media_source_images_url_item->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_item->url
    if (!pin_media_source_images_url_item->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pin_media_source_images_url_item->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_images_url_item_t *pin_media_source_images_url_item_parseFromJSON(cJSON *pin_media_source_images_url_itemJSON){

    pin_media_source_images_url_item_t *pin_media_source_images_url_item_local_var = NULL;

    // pin_media_source_images_url_item->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_itemJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_item->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_itemJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_item->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_itemJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_item->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_itemJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    pin_media_source_images_url_item_local_var = pin_media_source_images_url_item_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        strdup(url->valuestring)
        );

    return pin_media_source_images_url_item_local_var;
end:
    return NULL;

}
