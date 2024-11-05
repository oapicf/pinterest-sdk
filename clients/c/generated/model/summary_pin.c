#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "summary_pin.h"



summary_pin_t *summary_pin_create(
    pin_media_t *media,
    char *alt_text,
    char *link,
    char *title,
    char *description
    ) {
    summary_pin_t *summary_pin_local_var = malloc(sizeof(summary_pin_t));
    if (!summary_pin_local_var) {
        return NULL;
    }
    summary_pin_local_var->media = media;
    summary_pin_local_var->alt_text = alt_text;
    summary_pin_local_var->link = link;
    summary_pin_local_var->title = title;
    summary_pin_local_var->description = description;

    return summary_pin_local_var;
}


void summary_pin_free(summary_pin_t *summary_pin) {
    if(NULL == summary_pin){
        return ;
    }
    listEntry_t *listEntry;
    if (summary_pin->media) {
        pin_media_free(summary_pin->media);
        summary_pin->media = NULL;
    }
    if (summary_pin->alt_text) {
        free(summary_pin->alt_text);
        summary_pin->alt_text = NULL;
    }
    if (summary_pin->link) {
        free(summary_pin->link);
        summary_pin->link = NULL;
    }
    if (summary_pin->title) {
        free(summary_pin->title);
        summary_pin->title = NULL;
    }
    if (summary_pin->description) {
        free(summary_pin->description);
        summary_pin->description = NULL;
    }
    free(summary_pin);
}

cJSON *summary_pin_convertToJSON(summary_pin_t *summary_pin) {
    cJSON *item = cJSON_CreateObject();

    // summary_pin->media
    if(summary_pin->media) {
    cJSON *media_local_JSON = pin_media_convertToJSON(summary_pin->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // summary_pin->alt_text
    if(summary_pin->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", summary_pin->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // summary_pin->link
    if(summary_pin->link) {
    if(cJSON_AddStringToObject(item, "link", summary_pin->link) == NULL) {
    goto fail; //String
    }
    }


    // summary_pin->title
    if(summary_pin->title) {
    if(cJSON_AddStringToObject(item, "title", summary_pin->title) == NULL) {
    goto fail; //String
    }
    }


    // summary_pin->description
    if(summary_pin->description) {
    if(cJSON_AddStringToObject(item, "description", summary_pin->description) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

summary_pin_t *summary_pin_parseFromJSON(cJSON *summary_pinJSON){

    summary_pin_t *summary_pin_local_var = NULL;

    // define the local variable for summary_pin->media
    pin_media_t *media_local_nonprim = NULL;

    // summary_pin->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "media");
    if (media) { 
    media_local_nonprim = pin_media_parseFromJSON(media); //nonprimitive
    }

    // summary_pin->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "alt_text");
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // summary_pin->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // summary_pin->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // summary_pin->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    summary_pin_local_var = summary_pin_create (
        media ? media_local_nonprim : NULL,
        alt_text && !cJSON_IsNull(alt_text) ? strdup(alt_text->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL
        );

    return summary_pin_local_var;
end:
    if (media_local_nonprim) {
        pin_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    return NULL;

}
