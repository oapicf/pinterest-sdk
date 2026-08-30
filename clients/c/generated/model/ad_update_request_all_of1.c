#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_update_request_all_of1.h"



static ad_update_request_all_of1_t *ad_update_request_all_of1_create_internal(
    char *id,
    char *pin_id
    ) {
    ad_update_request_all_of1_t *ad_update_request_all_of1_local_var = malloc(sizeof(ad_update_request_all_of1_t));
    if (!ad_update_request_all_of1_local_var) {
        return NULL;
    }
    memset(ad_update_request_all_of1_local_var, 0, sizeof(ad_update_request_all_of1_t));
    ad_update_request_all_of1_local_var->_library_owned = 1;
    ad_update_request_all_of1_local_var->id = id;
    ad_update_request_all_of1_local_var->pin_id = pin_id;
    return ad_update_request_all_of1_local_var;
}

__attribute__((deprecated)) ad_update_request_all_of1_t *ad_update_request_all_of1_create(
    char *id,
    char *pin_id
    ) {
    ad_update_request_all_of1_t *result = ad_update_request_all_of1_create_internal (
        id,
        pin_id
        );
    if (!result) {
    }
    return result;
}

void ad_update_request_all_of1_free(ad_update_request_all_of1_t *ad_update_request_all_of1) {
    if(NULL == ad_update_request_all_of1){
        return ;
    }
    if(ad_update_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_update_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_update_request_all_of1->id) {
        free(ad_update_request_all_of1->id);
        ad_update_request_all_of1->id = NULL;
    }
    if (ad_update_request_all_of1->pin_id) {
        free(ad_update_request_all_of1->pin_id);
        ad_update_request_all_of1->pin_id = NULL;
    }
    free(ad_update_request_all_of1);
}

cJSON *ad_update_request_all_of1_convertToJSON(ad_update_request_all_of1_t *ad_update_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // ad_update_request_all_of1->id
    if (!ad_update_request_all_of1->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_update_request_all_of1->id) == NULL) {
    goto fail; //String
    }


    // ad_update_request_all_of1->pin_id
    if(ad_update_request_all_of1->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", ad_update_request_all_of1->pin_id) == NULL) {
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

ad_update_request_all_of1_t *ad_update_request_all_of1_parseFromJSON(cJSON *ad_update_request_all_of1JSON){

    ad_update_request_all_of1_t *ad_update_request_all_of1_local_var = NULL;

    char *id_local_str = NULL;

    char *pin_id_local_str = NULL;

    // ad_update_request_all_of1->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_update_request_all_of1JSON, "id");
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

    // ad_update_request_all_of1->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_update_request_all_of1JSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);

    ad_update_request_all_of1_local_var = ad_update_request_all_of1_create_internal (
        id_local_str,
        pin_id_local_str
        );

    if (!ad_update_request_all_of1_local_var) {
        goto end;
    }

    return ad_update_request_all_of1_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    return NULL;

}
