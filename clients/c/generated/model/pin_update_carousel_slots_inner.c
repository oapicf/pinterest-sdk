#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_update_carousel_slots_inner.h"



pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_create(
    char *title,
    char *description,
    char *link
    ) {
    pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_local_var = malloc(sizeof(pin_update_carousel_slots_inner_t));
    if (!pin_update_carousel_slots_inner_local_var) {
        return NULL;
    }
    pin_update_carousel_slots_inner_local_var->title = title;
    pin_update_carousel_slots_inner_local_var->description = description;
    pin_update_carousel_slots_inner_local_var->link = link;

    return pin_update_carousel_slots_inner_local_var;
}


void pin_update_carousel_slots_inner_free(pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner) {
    if(NULL == pin_update_carousel_slots_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_update_carousel_slots_inner->title) {
        free(pin_update_carousel_slots_inner->title);
        pin_update_carousel_slots_inner->title = NULL;
    }
    if (pin_update_carousel_slots_inner->description) {
        free(pin_update_carousel_slots_inner->description);
        pin_update_carousel_slots_inner->description = NULL;
    }
    if (pin_update_carousel_slots_inner->link) {
        free(pin_update_carousel_slots_inner->link);
        pin_update_carousel_slots_inner->link = NULL;
    }
    free(pin_update_carousel_slots_inner);
}

cJSON *pin_update_carousel_slots_inner_convertToJSON(pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner) {
    cJSON *item = cJSON_CreateObject();

    // pin_update_carousel_slots_inner->title
    if(pin_update_carousel_slots_inner->title) {
    if(cJSON_AddStringToObject(item, "title", pin_update_carousel_slots_inner->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_update_carousel_slots_inner->description
    if(pin_update_carousel_slots_inner->description) {
    if(cJSON_AddStringToObject(item, "description", pin_update_carousel_slots_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_update_carousel_slots_inner->link
    if(pin_update_carousel_slots_inner->link) {
    if(cJSON_AddStringToObject(item, "link", pin_update_carousel_slots_inner->link) == NULL) {
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

pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_parseFromJSON(cJSON *pin_update_carousel_slots_innerJSON){

    pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_local_var = NULL;

    // pin_update_carousel_slots_inner->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_update_carousel_slots_innerJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_update_carousel_slots_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_update_carousel_slots_innerJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_update_carousel_slots_inner->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_update_carousel_slots_innerJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }


    pin_update_carousel_slots_inner_local_var = pin_update_carousel_slots_inner_create (
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL
        );

    return pin_update_carousel_slots_inner_local_var;
end:
    return NULL;

}
