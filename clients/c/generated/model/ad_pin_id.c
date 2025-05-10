#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_pin_id.h"



static ad_pin_id_t *ad_pin_id_create_internal(
    char *pin_id
    ) {
    ad_pin_id_t *ad_pin_id_local_var = malloc(sizeof(ad_pin_id_t));
    if (!ad_pin_id_local_var) {
        return NULL;
    }
    ad_pin_id_local_var->pin_id = pin_id;

    ad_pin_id_local_var->_library_owned = 1;
    return ad_pin_id_local_var;
}

__attribute__((deprecated)) ad_pin_id_t *ad_pin_id_create(
    char *pin_id
    ) {
    return ad_pin_id_create_internal (
        pin_id
        );
}

void ad_pin_id_free(ad_pin_id_t *ad_pin_id) {
    if(NULL == ad_pin_id){
        return ;
    }
    if(ad_pin_id->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_pin_id_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_pin_id->pin_id) {
        free(ad_pin_id->pin_id);
        ad_pin_id->pin_id = NULL;
    }
    free(ad_pin_id);
}

cJSON *ad_pin_id_convertToJSON(ad_pin_id_t *ad_pin_id) {
    cJSON *item = cJSON_CreateObject();

    // ad_pin_id->pin_id
    if(ad_pin_id->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", ad_pin_id->pin_id) == NULL) {
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

ad_pin_id_t *ad_pin_id_parseFromJSON(cJSON *ad_pin_idJSON){

    ad_pin_id_t *ad_pin_id_local_var = NULL;

    // ad_pin_id->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_pin_idJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }


    ad_pin_id_local_var = ad_pin_id_create_internal (
        pin_id && !cJSON_IsNull(pin_id) ? strdup(pin_id->valuestring) : NULL
        );

    return ad_pin_id_local_var;
end:
    return NULL;

}
