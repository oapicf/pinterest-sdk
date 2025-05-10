#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_create_from_pin.h"



static ad_preview_create_from_pin_t *ad_preview_create_from_pin_create_internal(
    char *pin_id
    ) {
    ad_preview_create_from_pin_t *ad_preview_create_from_pin_local_var = malloc(sizeof(ad_preview_create_from_pin_t));
    if (!ad_preview_create_from_pin_local_var) {
        return NULL;
    }
    ad_preview_create_from_pin_local_var->pin_id = pin_id;

    ad_preview_create_from_pin_local_var->_library_owned = 1;
    return ad_preview_create_from_pin_local_var;
}

__attribute__((deprecated)) ad_preview_create_from_pin_t *ad_preview_create_from_pin_create(
    char *pin_id
    ) {
    return ad_preview_create_from_pin_create_internal (
        pin_id
        );
}

void ad_preview_create_from_pin_free(ad_preview_create_from_pin_t *ad_preview_create_from_pin) {
    if(NULL == ad_preview_create_from_pin){
        return ;
    }
    if(ad_preview_create_from_pin->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_create_from_pin_free");
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
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }


    ad_preview_create_from_pin_local_var = ad_preview_create_from_pin_create_internal (
        strdup(pin_id->valuestring)
        );

    return ad_preview_create_from_pin_local_var;
end:
    return NULL;

}
