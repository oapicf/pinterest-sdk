#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "carousel_slot.h"



static carousel_slot_t *carousel_slot_create_internal(
    char *description,
    char *link,
    char *title
    ) {
    carousel_slot_t *carousel_slot_local_var = malloc(sizeof(carousel_slot_t));
    if (!carousel_slot_local_var) {
        return NULL;
    }
    carousel_slot_local_var->description = description;
    carousel_slot_local_var->link = link;
    carousel_slot_local_var->title = title;

    carousel_slot_local_var->_library_owned = 1;
    return carousel_slot_local_var;
}

__attribute__((deprecated)) carousel_slot_t *carousel_slot_create(
    char *description,
    char *link,
    char *title
    ) {
    return carousel_slot_create_internal (
        description,
        link,
        title
        );
}

void carousel_slot_free(carousel_slot_t *carousel_slot) {
    if(NULL == carousel_slot){
        return ;
    }
    if(carousel_slot->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "carousel_slot_free");
        return ;
    }
    listEntry_t *listEntry;
    if (carousel_slot->description) {
        free(carousel_slot->description);
        carousel_slot->description = NULL;
    }
    if (carousel_slot->link) {
        free(carousel_slot->link);
        carousel_slot->link = NULL;
    }
    if (carousel_slot->title) {
        free(carousel_slot->title);
        carousel_slot->title = NULL;
    }
    free(carousel_slot);
}

cJSON *carousel_slot_convertToJSON(carousel_slot_t *carousel_slot) {
    cJSON *item = cJSON_CreateObject();

    // carousel_slot->description
    if(carousel_slot->description) {
    if(cJSON_AddStringToObject(item, "description", carousel_slot->description) == NULL) {
    goto fail; //String
    }
    }


    // carousel_slot->link
    if(carousel_slot->link) {
    if(cJSON_AddStringToObject(item, "link", carousel_slot->link) == NULL) {
    goto fail; //String
    }
    }


    // carousel_slot->title
    if(carousel_slot->title) {
    if(cJSON_AddStringToObject(item, "title", carousel_slot->title) == NULL) {
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

carousel_slot_t *carousel_slot_parseFromJSON(cJSON *carousel_slotJSON){

    carousel_slot_t *carousel_slot_local_var = NULL;

    // carousel_slot->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(carousel_slotJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // carousel_slot->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(carousel_slotJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // carousel_slot->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(carousel_slotJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    carousel_slot_local_var = carousel_slot_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL
        );

    return carousel_slot_local_var;
end:
    return NULL;

}
