#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_images_url_items_inner.h"



static pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_create_internal(
    char *title,
    char *description,
    char *link,
    char *url
    ) {
    pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_local_var = malloc(sizeof(pin_media_source_images_url_items_inner_t));
    if (!pin_media_source_images_url_items_inner_local_var) {
        return NULL;
    }
    pin_media_source_images_url_items_inner_local_var->title = title;
    pin_media_source_images_url_items_inner_local_var->description = description;
    pin_media_source_images_url_items_inner_local_var->link = link;
    pin_media_source_images_url_items_inner_local_var->url = url;

    pin_media_source_images_url_items_inner_local_var->_library_owned = 1;
    return pin_media_source_images_url_items_inner_local_var;
}

__attribute__((deprecated)) pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_create(
    char *title,
    char *description,
    char *link,
    char *url
    ) {
    return pin_media_source_images_url_items_inner_create_internal (
        title,
        description,
        link,
        url
        );
}

void pin_media_source_images_url_items_inner_free(pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner) {
    if(NULL == pin_media_source_images_url_items_inner){
        return ;
    }
    if(pin_media_source_images_url_items_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_images_url_items_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_images_url_items_inner->title) {
        free(pin_media_source_images_url_items_inner->title);
        pin_media_source_images_url_items_inner->title = NULL;
    }
    if (pin_media_source_images_url_items_inner->description) {
        free(pin_media_source_images_url_items_inner->description);
        pin_media_source_images_url_items_inner->description = NULL;
    }
    if (pin_media_source_images_url_items_inner->link) {
        free(pin_media_source_images_url_items_inner->link);
        pin_media_source_images_url_items_inner->link = NULL;
    }
    if (pin_media_source_images_url_items_inner->url) {
        free(pin_media_source_images_url_items_inner->url);
        pin_media_source_images_url_items_inner->url = NULL;
    }
    free(pin_media_source_images_url_items_inner);
}

cJSON *pin_media_source_images_url_items_inner_convertToJSON(pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_images_url_items_inner->title
    if(pin_media_source_images_url_items_inner->title) {
    if(cJSON_AddStringToObject(item, "title", pin_media_source_images_url_items_inner->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_items_inner->description
    if(pin_media_source_images_url_items_inner->description) {
    if(cJSON_AddStringToObject(item, "description", pin_media_source_images_url_items_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_items_inner->link
    if(pin_media_source_images_url_items_inner->link) {
    if(cJSON_AddStringToObject(item, "link", pin_media_source_images_url_items_inner->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_images_url_items_inner->url
    if (!pin_media_source_images_url_items_inner->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pin_media_source_images_url_items_inner->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_parseFromJSON(cJSON *pin_media_source_images_url_items_innerJSON){

    pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_local_var = NULL;

    // pin_media_source_images_url_items_inner->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_items_innerJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_items_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_items_innerJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_items_inner->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_items_innerJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_media_source_images_url_items_inner->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_url_items_innerJSON, "url");
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


    pin_media_source_images_url_items_inner_local_var = pin_media_source_images_url_items_inner_create_internal (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        strdup(url->valuestring)
        );

    return pin_media_source_images_url_items_inner_local_var;
end:
    return NULL;

}
