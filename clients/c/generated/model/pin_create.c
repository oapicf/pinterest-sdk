#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_create.h"



static pin_create_t *pin_create_create_internal(
    char *alt_text,
    char *board_id,
    char *board_section_id,
    char *description,
    char *dominant_color,
    char *link,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    char *sponsor_id,
    char *title
    ) {
    pin_create_t *pin_create_local_var = malloc(sizeof(pin_create_t));
    if (!pin_create_local_var) {
        return NULL;
    }
    pin_create_local_var->alt_text = alt_text;
    pin_create_local_var->board_id = board_id;
    pin_create_local_var->board_section_id = board_section_id;
    pin_create_local_var->description = description;
    pin_create_local_var->dominant_color = dominant_color;
    pin_create_local_var->link = link;
    pin_create_local_var->media_source = media_source;
    pin_create_local_var->parent_pin_id = parent_pin_id;
    pin_create_local_var->sponsor_id = sponsor_id;
    pin_create_local_var->title = title;

    pin_create_local_var->_library_owned = 1;
    return pin_create_local_var;
}

__attribute__((deprecated)) pin_create_t *pin_create_create(
    char *alt_text,
    char *board_id,
    char *board_section_id,
    char *description,
    char *dominant_color,
    char *link,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    char *sponsor_id,
    char *title
    ) {
    return pin_create_create_internal (
        alt_text,
        board_id,
        board_section_id,
        description,
        dominant_color,
        link,
        media_source,
        parent_pin_id,
        sponsor_id,
        title
        );
}

void pin_create_free(pin_create_t *pin_create) {
    if(NULL == pin_create){
        return ;
    }
    if(pin_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_create->alt_text) {
        free(pin_create->alt_text);
        pin_create->alt_text = NULL;
    }
    if (pin_create->board_id) {
        free(pin_create->board_id);
        pin_create->board_id = NULL;
    }
    if (pin_create->board_section_id) {
        free(pin_create->board_section_id);
        pin_create->board_section_id = NULL;
    }
    if (pin_create->description) {
        free(pin_create->description);
        pin_create->description = NULL;
    }
    if (pin_create->dominant_color) {
        free(pin_create->dominant_color);
        pin_create->dominant_color = NULL;
    }
    if (pin_create->link) {
        free(pin_create->link);
        pin_create->link = NULL;
    }
    if (pin_create->media_source) {
        pin_media_source_free(pin_create->media_source);
        pin_create->media_source = NULL;
    }
    if (pin_create->parent_pin_id) {
        free(pin_create->parent_pin_id);
        pin_create->parent_pin_id = NULL;
    }
    if (pin_create->sponsor_id) {
        free(pin_create->sponsor_id);
        pin_create->sponsor_id = NULL;
    }
    if (pin_create->title) {
        free(pin_create->title);
        pin_create->title = NULL;
    }
    free(pin_create);
}

cJSON *pin_create_convertToJSON(pin_create_t *pin_create) {
    cJSON *item = cJSON_CreateObject();

    // pin_create->alt_text
    if(pin_create->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", pin_create->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->board_id
    if(pin_create->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pin_create->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->board_section_id
    if(pin_create->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pin_create->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->description
    if(pin_create->description) {
    if(cJSON_AddStringToObject(item, "description", pin_create->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->dominant_color
    if(pin_create->dominant_color) {
    if(cJSON_AddStringToObject(item, "dominant_color", pin_create->dominant_color) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->link
    if(pin_create->link) {
    if(cJSON_AddStringToObject(item, "link", pin_create->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->media_source
    if(pin_create->media_source) {
    cJSON *media_source_local_JSON = pin_media_source_convertToJSON(pin_create->media_source);
    if(media_source_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media_source", media_source_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_create->parent_pin_id
    if(pin_create->parent_pin_id) {
    if(cJSON_AddStringToObject(item, "parent_pin_id", pin_create->parent_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->sponsor_id
    if(pin_create->sponsor_id) {
    if(cJSON_AddStringToObject(item, "sponsor_id", pin_create->sponsor_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_create->title
    if(pin_create->title) {
    if(cJSON_AddStringToObject(item, "title", pin_create->title) == NULL) {
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

pin_create_t *pin_create_parseFromJSON(cJSON *pin_createJSON){

    pin_create_t *pin_create_local_var = NULL;

    // define the local variable for pin_create->media_source
    pin_media_source_t *media_source_local_nonprim = NULL;

    // pin_create->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin_create->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin_create->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin_create->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_create->dominant_color
    cJSON *dominant_color = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "dominant_color");
    if (cJSON_IsNull(dominant_color)) {
        dominant_color = NULL;
    }
    if (dominant_color) { 
    if(!cJSON_IsString(dominant_color) && !cJSON_IsNull(dominant_color))
    {
    goto end; //String
    }
    }

    // pin_create->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_create->media_source
    cJSON *media_source = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "media_source");
    if (cJSON_IsNull(media_source)) {
        media_source = NULL;
    }
    if (media_source) { 
    media_source_local_nonprim = pin_media_source_parseFromJSON(media_source); //nonprimitive
    }

    // pin_create->parent_pin_id
    cJSON *parent_pin_id = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "parent_pin_id");
    if (cJSON_IsNull(parent_pin_id)) {
        parent_pin_id = NULL;
    }
    if (parent_pin_id) { 
    if(!cJSON_IsString(parent_pin_id) && !cJSON_IsNull(parent_pin_id))
    {
    goto end; //String
    }
    }

    // pin_create->sponsor_id
    cJSON *sponsor_id = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "sponsor_id");
    if (cJSON_IsNull(sponsor_id)) {
        sponsor_id = NULL;
    }
    if (sponsor_id) { 
    if(!cJSON_IsString(sponsor_id) && !cJSON_IsNull(sponsor_id))
    {
    goto end; //String
    }
    }

    // pin_create->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_createJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    pin_create_local_var = pin_create_create_internal (
        alt_text && !cJSON_IsNull(alt_text) ? strdup(alt_text->valuestring) : NULL,
        board_id && !cJSON_IsNull(board_id) ? strdup(board_id->valuestring) : NULL,
        board_section_id && !cJSON_IsNull(board_section_id) ? strdup(board_section_id->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        dominant_color && !cJSON_IsNull(dominant_color) ? strdup(dominant_color->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        media_source ? media_source_local_nonprim : NULL,
        parent_pin_id && !cJSON_IsNull(parent_pin_id) ? strdup(parent_pin_id->valuestring) : NULL,
        sponsor_id && !cJSON_IsNull(sponsor_id) ? strdup(sponsor_id->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL
        );

    return pin_create_local_var;
end:
    if (media_source_local_nonprim) {
        pin_media_source_free(media_source_local_nonprim);
        media_source_local_nonprim = NULL;
    }
    return NULL;

}
