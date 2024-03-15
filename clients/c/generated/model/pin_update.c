#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_update.h"



pin_update_t *pin_update_create(
    char *alt_text,
    char *board_id,
    char *board_section_id,
    char *description,
    char *link,
    char *title,
    list_t *carousel_slots,
    char *note
    ) {
    pin_update_t *pin_update_local_var = malloc(sizeof(pin_update_t));
    if (!pin_update_local_var) {
        return NULL;
    }
    pin_update_local_var->alt_text = alt_text;
    pin_update_local_var->board_id = board_id;
    pin_update_local_var->board_section_id = board_section_id;
    pin_update_local_var->description = description;
    pin_update_local_var->link = link;
    pin_update_local_var->title = title;
    pin_update_local_var->carousel_slots = carousel_slots;
    pin_update_local_var->note = note;

    return pin_update_local_var;
}


void pin_update_free(pin_update_t *pin_update) {
    if(NULL == pin_update){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_update->alt_text) {
        free(pin_update->alt_text);
        pin_update->alt_text = NULL;
    }
    if (pin_update->board_id) {
        free(pin_update->board_id);
        pin_update->board_id = NULL;
    }
    if (pin_update->board_section_id) {
        free(pin_update->board_section_id);
        pin_update->board_section_id = NULL;
    }
    if (pin_update->description) {
        free(pin_update->description);
        pin_update->description = NULL;
    }
    if (pin_update->link) {
        free(pin_update->link);
        pin_update->link = NULL;
    }
    if (pin_update->title) {
        free(pin_update->title);
        pin_update->title = NULL;
    }
    if (pin_update->carousel_slots) {
        list_ForEach(listEntry, pin_update->carousel_slots) {
            pin_update_carousel_slots_inner_free(listEntry->data);
        }
        list_freeList(pin_update->carousel_slots);
        pin_update->carousel_slots = NULL;
    }
    if (pin_update->note) {
        free(pin_update->note);
        pin_update->note = NULL;
    }
    free(pin_update);
}

cJSON *pin_update_convertToJSON(pin_update_t *pin_update) {
    cJSON *item = cJSON_CreateObject();

    // pin_update->alt_text
    if(pin_update->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", pin_update->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->board_id
    if(pin_update->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pin_update->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->board_section_id
    if(pin_update->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pin_update->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->description
    if(pin_update->description) {
    if(cJSON_AddStringToObject(item, "description", pin_update->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->link
    if(pin_update->link) {
    if(cJSON_AddStringToObject(item, "link", pin_update->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->title
    if(pin_update->title) {
    if(cJSON_AddStringToObject(item, "title", pin_update->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_update->carousel_slots
    if(pin_update->carousel_slots) {
    cJSON *carousel_slots = cJSON_AddArrayToObject(item, "carousel_slots");
    if(carousel_slots == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *carousel_slotsListEntry;
    if (pin_update->carousel_slots) {
    list_ForEach(carousel_slotsListEntry, pin_update->carousel_slots) {
    cJSON *itemLocal = pin_update_carousel_slots_inner_convertToJSON(carousel_slotsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(carousel_slots, itemLocal);
    }
    }
    }


    // pin_update->note
    if(pin_update->note) {
    if(cJSON_AddStringToObject(item, "note", pin_update->note) == NULL) {
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

pin_update_t *pin_update_parseFromJSON(cJSON *pin_updateJSON){

    pin_update_t *pin_update_local_var = NULL;

    // define the local list for pin_update->carousel_slots
    list_t *carousel_slotsList = NULL;

    // pin_update->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "alt_text");
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin_update->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "board_id");
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin_update->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "board_section_id");
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin_update->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_update->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_update->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_update->carousel_slots
    cJSON *carousel_slots = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "carousel_slots");
    if (carousel_slots) { 
    cJSON *carousel_slots_local_nonprimitive = NULL;
    if(!cJSON_IsArray(carousel_slots)){
        goto end; //nonprimitive container
    }

    carousel_slotsList = list_createList();

    cJSON_ArrayForEach(carousel_slots_local_nonprimitive,carousel_slots )
    {
        if(!cJSON_IsObject(carousel_slots_local_nonprimitive)){
            goto end;
        }
        pin_update_carousel_slots_inner_t *carousel_slotsItem = pin_update_carousel_slots_inner_parseFromJSON(carousel_slots_local_nonprimitive);

        list_addElement(carousel_slotsList, carousel_slotsItem);
    }
    }

    // pin_update->note
    cJSON *note = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "note");
    if (note) { 
    if(!cJSON_IsString(note) && !cJSON_IsNull(note))
    {
    goto end; //String
    }
    }


    pin_update_local_var = pin_update_create (
        alt_text && !cJSON_IsNull(alt_text) ? strdup(alt_text->valuestring) : NULL,
        board_id && !cJSON_IsNull(board_id) ? strdup(board_id->valuestring) : NULL,
        board_section_id && !cJSON_IsNull(board_section_id) ? strdup(board_section_id->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        carousel_slots ? carousel_slotsList : NULL,
        note && !cJSON_IsNull(note) ? strdup(note->valuestring) : NULL
        );

    return pin_update_local_var;
end:
    if (carousel_slotsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_slotsList) {
            pin_update_carousel_slots_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_slotsList);
        carousel_slotsList = NULL;
    }
    return NULL;

}
