#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "summary_pin.h"



static summary_pin_t *summary_pin_create_internal(
    char *alt_text,
    char *description,
    char *id,
    char *link,
    pin_media_t *media,
    char *title
    ) {
    summary_pin_t *summary_pin_local_var = malloc(sizeof(summary_pin_t));
    if (!summary_pin_local_var) {
        return NULL;
    }
    memset(summary_pin_local_var, 0, sizeof(summary_pin_t));
    summary_pin_local_var->_library_owned = 1;
    summary_pin_local_var->alt_text = alt_text;
    summary_pin_local_var->description = description;
    summary_pin_local_var->id = id;
    summary_pin_local_var->link = link;
    summary_pin_local_var->media = media;
    summary_pin_local_var->title = title;
    return summary_pin_local_var;
}

__attribute__((deprecated)) summary_pin_t *summary_pin_create(
    char *alt_text,
    char *description,
    char *id,
    char *link,
    pin_media_t *media,
    char *title
    ) {
    summary_pin_t *result = summary_pin_create_internal (
        alt_text,
        description,
        id,
        link,
        media,
        title
        );
    if (!result) {
    }
    return result;
}

void summary_pin_free(summary_pin_t *summary_pin) {
    if(NULL == summary_pin){
        return ;
    }
    if(summary_pin->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "summary_pin_free");
        return ;
    }
    listEntry_t *listEntry;
    if (summary_pin->alt_text) {
        free(summary_pin->alt_text);
        summary_pin->alt_text = NULL;
    }
    if (summary_pin->description) {
        free(summary_pin->description);
        summary_pin->description = NULL;
    }
    if (summary_pin->id) {
        free(summary_pin->id);
        summary_pin->id = NULL;
    }
    if (summary_pin->link) {
        free(summary_pin->link);
        summary_pin->link = NULL;
    }
    if (summary_pin->media) {
        pin_media_free(summary_pin->media);
        summary_pin->media = NULL;
    }
    if (summary_pin->title) {
        free(summary_pin->title);
        summary_pin->title = NULL;
    }
    free(summary_pin);
}

cJSON *summary_pin_convertToJSON(summary_pin_t *summary_pin) {
    cJSON *item = cJSON_CreateObject();

    // summary_pin->alt_text
    if(summary_pin->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", summary_pin->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // summary_pin->description
    if(summary_pin->description) {
    if(cJSON_AddStringToObject(item, "description", summary_pin->description) == NULL) {
    goto fail; //String
    }
    }


    // summary_pin->id
    if (!summary_pin->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", summary_pin->id) == NULL) {
    goto fail; //String
    }


    // summary_pin->link
    if(summary_pin->link) {
    if(cJSON_AddStringToObject(item, "link", summary_pin->link) == NULL) {
    goto fail; //String
    }
    }


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


    // summary_pin->title
    if(summary_pin->title) {
    if(cJSON_AddStringToObject(item, "title", summary_pin->title) == NULL) {
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

    char *alt_text_local_str = NULL;

    char *description_local_str = NULL;

    char *id_local_str = NULL;

    char *link_local_str = NULL;

    // define the local variable for summary_pin->media
    pin_media_t *media_local_nonprim = NULL;

    char *title_local_str = NULL;

    // summary_pin->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // summary_pin->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // summary_pin->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // summary_pin->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // summary_pin->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = pin_media_parseFromJSON(media); //nonprimitive
    }

    // summary_pin->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(summary_pinJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (alt_text && !cJSON_IsNull(alt_text)) alt_text_local_str = strdup(alt_text->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    summary_pin_local_var = summary_pin_create_internal (
        alt_text_local_str,
        description_local_str,
        id_local_str,
        link_local_str,
        media ? media_local_nonprim : NULL,
        title_local_str
        );

    if (!summary_pin_local_var) {
        goto end;
    }

    return summary_pin_local_var;
end:
    if (alt_text_local_str) {
        free(alt_text_local_str);
        alt_text_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (media_local_nonprim) {
        pin_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
