#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_source_pin_id.h"



static ad_preview_source_pin_id_t *ad_preview_source_pin_id_create_internal(
    ad_pin_preview_creative_type_t *creative_type,
    char *pin_id
    ) {
    ad_preview_source_pin_id_t *ad_preview_source_pin_id_local_var = malloc(sizeof(ad_preview_source_pin_id_t));
    if (!ad_preview_source_pin_id_local_var) {
        return NULL;
    }
    memset(ad_preview_source_pin_id_local_var, 0, sizeof(ad_preview_source_pin_id_t));
    ad_preview_source_pin_id_local_var->_library_owned = 1;
    ad_preview_source_pin_id_local_var->creative_type = creative_type;
    ad_preview_source_pin_id_local_var->pin_id = pin_id;
    return ad_preview_source_pin_id_local_var;
}

__attribute__((deprecated)) ad_preview_source_pin_id_t *ad_preview_source_pin_id_create(
    ad_pin_preview_creative_type_t *creative_type,
    char *pin_id
    ) {
    ad_preview_source_pin_id_t *result = ad_preview_source_pin_id_create_internal (
        creative_type,
        pin_id
        );
    if (!result) {
    }
    return result;
}

void ad_preview_source_pin_id_free(ad_preview_source_pin_id_t *ad_preview_source_pin_id) {
    if(NULL == ad_preview_source_pin_id){
        return ;
    }
    if(ad_preview_source_pin_id->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_source_pin_id_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_source_pin_id->creative_type) {
        ad_pin_preview_creative_type_free(ad_preview_source_pin_id->creative_type);
        ad_preview_source_pin_id->creative_type = NULL;
    }
    if (ad_preview_source_pin_id->pin_id) {
        free(ad_preview_source_pin_id->pin_id);
        ad_preview_source_pin_id->pin_id = NULL;
    }
    free(ad_preview_source_pin_id);
}

cJSON *ad_preview_source_pin_id_convertToJSON(ad_preview_source_pin_id_t *ad_preview_source_pin_id) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_source_pin_id->creative_type
    if(ad_preview_source_pin_id->creative_type) {
    cJSON *creative_type_local_JSON = ad_pin_preview_creative_type_convertToJSON(ad_preview_source_pin_id->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_source_pin_id->pin_id
    if (!ad_preview_source_pin_id->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad_preview_source_pin_id->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_preview_source_pin_id_t *ad_preview_source_pin_id_parseFromJSON(cJSON *ad_preview_source_pin_idJSON){

    ad_preview_source_pin_id_t *ad_preview_source_pin_id_local_var = NULL;

    // define the local variable for ad_preview_source_pin_id->creative_type
    ad_pin_preview_creative_type_t *creative_type_local_nonprim = NULL;

    char *pin_id_local_str = NULL;

    // ad_preview_source_pin_id->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_preview_source_pin_idJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = ad_pin_preview_creative_type_parseFromJSON(creative_type); //custom
    }

    // ad_preview_source_pin_id->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_source_pin_idJSON, "pin_id");
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


    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);

    ad_preview_source_pin_id_local_var = ad_preview_source_pin_id_create_internal (
        creative_type ? creative_type_local_nonprim : NULL,
        pin_id_local_str
        );

    if (!ad_preview_source_pin_id_local_var) {
        goto end;
    }

    return ad_preview_source_pin_id_local_var;
end:
    if (creative_type_local_nonprim) {
        ad_pin_preview_creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    return NULL;

}
