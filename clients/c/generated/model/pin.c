#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin.h"



pin_t *pin_create(
    char *id,
    char *created_at,
    char *link,
    char *title,
    char *description,
    char *dominant_color,
    char *alt_text,
    creative_type_t *creative_type,
    char *board_id,
    char *board_section_id,
    board_owner_t *board_owner,
    int is_owner,
    summary_pin_media_t *media,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    int is_standard,
    int has_been_promoted,
    char *note,
    object_t *pin_metrics
    ) {
    pin_t *pin_local_var = malloc(sizeof(pin_t));
    if (!pin_local_var) {
        return NULL;
    }
    pin_local_var->id = id;
    pin_local_var->created_at = created_at;
    pin_local_var->link = link;
    pin_local_var->title = title;
    pin_local_var->description = description;
    pin_local_var->dominant_color = dominant_color;
    pin_local_var->alt_text = alt_text;
    pin_local_var->creative_type = creative_type;
    pin_local_var->board_id = board_id;
    pin_local_var->board_section_id = board_section_id;
    pin_local_var->board_owner = board_owner;
    pin_local_var->is_owner = is_owner;
    pin_local_var->media = media;
    pin_local_var->media_source = media_source;
    pin_local_var->parent_pin_id = parent_pin_id;
    pin_local_var->is_standard = is_standard;
    pin_local_var->has_been_promoted = has_been_promoted;
    pin_local_var->note = note;
    pin_local_var->pin_metrics = pin_metrics;

    return pin_local_var;
}


void pin_free(pin_t *pin) {
    if(NULL == pin){
        return ;
    }
    listEntry_t *listEntry;
    if (pin->id) {
        free(pin->id);
        pin->id = NULL;
    }
    if (pin->created_at) {
        free(pin->created_at);
        pin->created_at = NULL;
    }
    if (pin->link) {
        free(pin->link);
        pin->link = NULL;
    }
    if (pin->title) {
        free(pin->title);
        pin->title = NULL;
    }
    if (pin->description) {
        free(pin->description);
        pin->description = NULL;
    }
    if (pin->dominant_color) {
        free(pin->dominant_color);
        pin->dominant_color = NULL;
    }
    if (pin->alt_text) {
        free(pin->alt_text);
        pin->alt_text = NULL;
    }
    if (pin->creative_type) {
        creative_type_free(pin->creative_type);
        pin->creative_type = NULL;
    }
    if (pin->board_id) {
        free(pin->board_id);
        pin->board_id = NULL;
    }
    if (pin->board_section_id) {
        free(pin->board_section_id);
        pin->board_section_id = NULL;
    }
    if (pin->board_owner) {
        board_owner_free(pin->board_owner);
        pin->board_owner = NULL;
    }
    if (pin->media) {
        summary_pin_media_free(pin->media);
        pin->media = NULL;
    }
    if (pin->media_source) {
        pin_media_source_free(pin->media_source);
        pin->media_source = NULL;
    }
    if (pin->parent_pin_id) {
        free(pin->parent_pin_id);
        pin->parent_pin_id = NULL;
    }
    if (pin->note) {
        free(pin->note);
        pin->note = NULL;
    }
    if (pin->pin_metrics) {
        object_free(pin->pin_metrics);
        pin->pin_metrics = NULL;
    }
    free(pin);
}

cJSON *pin_convertToJSON(pin_t *pin) {
    cJSON *item = cJSON_CreateObject();

    // pin->id
    if(pin->id) {
    if(cJSON_AddStringToObject(item, "id", pin->id) == NULL) {
    goto fail; //String
    }
    }


    // pin->created_at
    if(pin->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", pin->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // pin->link
    if(pin->link) {
    if(cJSON_AddStringToObject(item, "link", pin->link) == NULL) {
    goto fail; //String
    }
    }


    // pin->title
    if(pin->title) {
    if(cJSON_AddStringToObject(item, "title", pin->title) == NULL) {
    goto fail; //String
    }
    }


    // pin->description
    if(pin->description) {
    if(cJSON_AddStringToObject(item, "description", pin->description) == NULL) {
    goto fail; //String
    }
    }


    // pin->dominant_color
    if(pin->dominant_color) {
    if(cJSON_AddStringToObject(item, "dominant_color", pin->dominant_color) == NULL) {
    goto fail; //String
    }
    }


    // pin->alt_text
    if(pin->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", pin->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // pin->creative_type
    if(pin->creative_type) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(pin->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pin->board_id
    if(pin->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pin->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->board_section_id
    if(pin->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pin->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->board_owner
    if(pin->board_owner) {
    cJSON *board_owner_local_JSON = board_owner_convertToJSON(pin->board_owner);
    if(board_owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "board_owner", board_owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->is_owner
    if(pin->is_owner) {
    if(cJSON_AddBoolToObject(item, "is_owner", pin->is_owner) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->media
    if(pin->media) {
    cJSON *media_local_JSON = summary_pin_media_convertToJSON(pin->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->media_source
    if(pin->media_source) {
    cJSON *media_source_local_JSON = pin_media_source_convertToJSON(pin->media_source);
    if(media_source_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media_source", media_source_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->parent_pin_id
    if(pin->parent_pin_id) {
    if(cJSON_AddStringToObject(item, "parent_pin_id", pin->parent_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->is_standard
    if(pin->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", pin->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->has_been_promoted
    if(pin->has_been_promoted) {
    if(cJSON_AddBoolToObject(item, "has_been_promoted", pin->has_been_promoted) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->note
    if(pin->note) {
    if(cJSON_AddStringToObject(item, "note", pin->note) == NULL) {
    goto fail; //String
    }
    }


    // pin->pin_metrics
    if(pin->pin_metrics) {
    cJSON *pin_metrics_object = object_convertToJSON(pin->pin_metrics);
    if(pin_metrics_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin_metrics", pin_metrics_object);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_t *pin_parseFromJSON(cJSON *pinJSON){

    pin_t *pin_local_var = NULL;

    // define the local variable for pin->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    // define the local variable for pin->board_owner
    board_owner_t *board_owner_local_nonprim = NULL;

    // define the local variable for pin->media
    summary_pin_media_t *media_local_nonprim = NULL;

    // define the local variable for pin->media_source
    pin_media_source_t *media_source_local_nonprim = NULL;

    // pin->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pinJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // pin->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(pinJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // pin->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pinJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pinJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pinJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin->dominant_color
    cJSON *dominant_color = cJSON_GetObjectItemCaseSensitive(pinJSON, "dominant_color");
    if (dominant_color) { 
    if(!cJSON_IsString(dominant_color) && !cJSON_IsNull(dominant_color))
    {
    goto end; //String
    }
    }

    // pin->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pinJSON, "alt_text");
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(pinJSON, "creative_type");
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // pin->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_id");
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_section_id");
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin->board_owner
    cJSON *board_owner = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_owner");
    if (board_owner) { 
    board_owner_local_nonprim = board_owner_parseFromJSON(board_owner); //nonprimitive
    }

    // pin->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(pinJSON, "is_owner");
    if (is_owner) { 
    if(!cJSON_IsBool(is_owner))
    {
    goto end; //Bool
    }
    }

    // pin->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(pinJSON, "media");
    if (media) { 
    media_local_nonprim = summary_pin_media_parseFromJSON(media); //nonprimitive
    }

    // pin->media_source
    cJSON *media_source = cJSON_GetObjectItemCaseSensitive(pinJSON, "media_source");
    if (media_source) { 
    media_source_local_nonprim = pin_media_source_parseFromJSON(media_source); //nonprimitive
    }

    // pin->parent_pin_id
    cJSON *parent_pin_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "parent_pin_id");
    if (parent_pin_id) { 
    if(!cJSON_IsString(parent_pin_id) && !cJSON_IsNull(parent_pin_id))
    {
    goto end; //String
    }
    }

    // pin->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pinJSON, "is_standard");
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    }

    // pin->has_been_promoted
    cJSON *has_been_promoted = cJSON_GetObjectItemCaseSensitive(pinJSON, "has_been_promoted");
    if (has_been_promoted) { 
    if(!cJSON_IsBool(has_been_promoted))
    {
    goto end; //Bool
    }
    }

    // pin->note
    cJSON *note = cJSON_GetObjectItemCaseSensitive(pinJSON, "note");
    if (note) { 
    if(!cJSON_IsString(note) && !cJSON_IsNull(note))
    {
    goto end; //String
    }
    }

    // pin->pin_metrics
    cJSON *pin_metrics = cJSON_GetObjectItemCaseSensitive(pinJSON, "pin_metrics");
    object_t *pin_metrics_local_object = NULL;
    if (pin_metrics) { 
    pin_metrics_local_object = object_parseFromJSON(pin_metrics); //object
    }


    pin_local_var = pin_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        dominant_color && !cJSON_IsNull(dominant_color) ? strdup(dominant_color->valuestring) : NULL,
        alt_text && !cJSON_IsNull(alt_text) ? strdup(alt_text->valuestring) : NULL,
        creative_type ? creative_type_local_nonprim : NULL,
        board_id && !cJSON_IsNull(board_id) ? strdup(board_id->valuestring) : NULL,
        board_section_id && !cJSON_IsNull(board_section_id) ? strdup(board_section_id->valuestring) : NULL,
        board_owner ? board_owner_local_nonprim : NULL,
        is_owner ? is_owner->valueint : 0,
        media ? media_local_nonprim : NULL,
        media_source ? media_source_local_nonprim : NULL,
        parent_pin_id && !cJSON_IsNull(parent_pin_id) ? strdup(parent_pin_id->valuestring) : NULL,
        is_standard ? is_standard->valueint : 0,
        has_been_promoted ? has_been_promoted->valueint : 0,
        note && !cJSON_IsNull(note) ? strdup(note->valuestring) : NULL,
        pin_metrics ? pin_metrics_local_object : NULL
        );

    return pin_local_var;
end:
    if (creative_type_local_nonprim) {
        creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (board_owner_local_nonprim) {
        board_owner_free(board_owner_local_nonprim);
        board_owner_local_nonprim = NULL;
    }
    if (media_local_nonprim) {
        summary_pin_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (media_source_local_nonprim) {
        pin_media_source_free(media_source_local_nonprim);
        media_source_local_nonprim = NULL;
    }
    return NULL;

}
