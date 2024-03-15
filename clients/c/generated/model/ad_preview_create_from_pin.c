#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_create_from_pin.h"



ad_preview_create_from_pin_t *ad_preview_create_from_pin_create(
    char *pin_id
    ) {
    ad_preview_create_from_pin_t *ad_preview_create_from_pin_local_var = malloc(sizeof(ad_preview_create_from_pin_t));
    if (!ad_preview_create_from_pin_local_var) {
        return NULL;
    }
    ad_preview_create_from_pin_local_var->pin_id = pin_id;

    return ad_preview_create_from_pin_local_var;
}


void ad_preview_create_from_pin_free(ad_preview_create_from_pin_t *ad_preview_create_from_pin) {
    if(NULL == ad_preview_create_from_pin){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_create_from_pin->pin_id) {
        free(ad_preview_create_from_pin->pin_id);
        ad_preview_create_from_pin->pin_id = NULL;
    }
    free(ad_preview_create_from_pin);
}

cJSON *ad_preview_create_from_pin_convertToJSON(ad_preview_create_from_pin_t *ad_preview_create_from_pin) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_create_from_pin->pin_id
    if (!ad_preview_create_from_pin->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad_preview_create_from_pin->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_preview_create_from_pin_t *ad_preview_create_from_pin_parseFromJSON(cJSON *ad_preview_create_from_pinJSON){

    ad_preview_create_from_pin_t *ad_preview_create_from_pin_local_var = NULL;

    // ad_preview_create_from_pin->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_create_from_pinJSON, "pin_id");
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }


    ad_preview_create_from_pin_local_var = ad_preview_create_from_pin_create (
        strdup(pin_id->valuestring)
        );

    return ad_preview_create_from_pin_local_var;
end:
    return NULL;

}
