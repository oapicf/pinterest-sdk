#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_update.h"



static pin_update_t *pin_update_create_internal(
    ai_disclosures_update_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    char *board_section_id,
    list_t *carousel_slots,
    char *description,
    char *link,
    char *title
    ) {
    pin_update_t *pin_update_local_var = malloc(sizeof(pin_update_t));
    if (!pin_update_local_var) {
        return NULL;
    }
    memset(pin_update_local_var, 0, sizeof(pin_update_t));
    pin_update_local_var->_library_owned = 1;
    pin_update_local_var->ai_disclosures = ai_disclosures;
    pin_update_local_var->alt_text = alt_text;
    pin_update_local_var->board_id = board_id;
    pin_update_local_var->board_section_id = board_section_id;
    pin_update_local_var->carousel_slots = carousel_slots;
    pin_update_local_var->description = description;
    pin_update_local_var->link = link;
    pin_update_local_var->title = title;
    return pin_update_local_var;
}

__attribute__((deprecated)) pin_update_t *pin_update_create(
    ai_disclosures_update_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    char *board_section_id,
    list_t *carousel_slots,
    char *description,
    char *link,
    char *title
    ) {
    pin_update_t *result = pin_update_create_internal (
        ai_disclosures,
        alt_text,
        board_id,
        board_section_id,
        carousel_slots,
        description,
        link,
        title
        );
    if (!result) {
    }
    return result;
}

void pin_update_free(pin_update_t *pin_update) {
    if(NULL == pin_update){
        return ;
    }
    if(pin_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_update->ai_disclosures) {
        ai_disclosures_update_free(pin_update->ai_disclosures);
        pin_update->ai_disclosures = NULL;
    }
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
    if (pin_update->carousel_slots) {
        list_ForEach(listEntry, pin_update->carousel_slots) {
            carousel_slot_free(listEntry->data);
        }
        list_freeList(pin_update->carousel_slots);
        pin_update->carousel_slots = NULL;
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
    free(pin_update);
}

cJSON *pin_update_convertToJSON(pin_update_t *pin_update) {
    cJSON *item = cJSON_CreateObject();

    // pin_update->ai_disclosures
    if(pin_update->ai_disclosures) {
    cJSON *ai_disclosures_local_JSON = ai_disclosures_update_convertToJSON(pin_update->ai_disclosures);
    if(ai_disclosures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ai_disclosures", ai_disclosures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


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


    // pin_update->carousel_slots
    if(pin_update->carousel_slots) {
    cJSON *carousel_slots = cJSON_AddArrayToObject(item, "carousel_slots");
    if(carousel_slots == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *carousel_slotsListEntry;
    if (pin_update->carousel_slots) {
    list_ForEach(carousel_slotsListEntry, pin_update->carousel_slots) {
    cJSON *itemLocal = carousel_slot_convertToJSON(carousel_slotsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(carousel_slots, itemLocal);
    }
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_update_t *pin_update_parseFromJSON(cJSON *pin_updateJSON){

    pin_update_t *pin_update_local_var = NULL;

    // define the local variable for pin_update->ai_disclosures
    ai_disclosures_update_t *ai_disclosures_local_nonprim = NULL;

    char *alt_text_local_str = NULL;

    char *board_id_local_str = NULL;

    char *board_section_id_local_str = NULL;

    // define the local list for pin_update->carousel_slots
    list_t *carousel_slotsList = NULL;

    char *description_local_str = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    // pin_update->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    ai_disclosures_local_nonprim = ai_disclosures_update_parseFromJSON(ai_disclosures); //nonprimitive
    }

    // pin_update->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin_update->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin_update->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin_update->carousel_slots
    cJSON *carousel_slots = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "carousel_slots");
    if (cJSON_IsNull(carousel_slots)) {
        carousel_slots = NULL;
    }
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
        carousel_slot_t *carousel_slotsItem = carousel_slot_parseFromJSON(carousel_slots_local_nonprimitive);

        list_addElement(carousel_slotsList, carousel_slotsItem);
    }
    }

    // pin_update->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_update->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_update->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_updateJSON, "title");
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
    if (board_id && !cJSON_IsNull(board_id)) board_id_local_str = strdup(board_id->valuestring);
    if (board_section_id && !cJSON_IsNull(board_section_id)) board_section_id_local_str = strdup(board_section_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    pin_update_local_var = pin_update_create_internal (
        ai_disclosures ? ai_disclosures_local_nonprim : NULL,
        alt_text_local_str,
        board_id_local_str,
        board_section_id_local_str,
        carousel_slots ? carousel_slotsList : NULL,
        description_local_str,
        link_local_str,
        title_local_str
        );

    if (!pin_update_local_var) {
        goto end;
    }

    return pin_update_local_var;
end:
    if (ai_disclosures_local_nonprim) {
        ai_disclosures_update_free(ai_disclosures_local_nonprim);
        ai_disclosures_local_nonprim = NULL;
    }
    if (alt_text_local_str) {
        free(alt_text_local_str);
        alt_text_local_str = NULL;
    }
    if (board_id_local_str) {
        free(board_id_local_str);
        board_id_local_str = NULL;
    }
    if (board_section_id_local_str) {
        free(board_section_id_local_str);
        board_section_id_local_str = NULL;
    }
    if (carousel_slotsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_slotsList) {
            carousel_slot_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_slotsList);
        carousel_slotsList = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
