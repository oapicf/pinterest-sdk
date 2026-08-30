#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_create.h"



static media_upload_create_t *media_upload_create_create_internal(
    media_upload_type_t *media_type
    ) {
    media_upload_create_t *media_upload_create_local_var = malloc(sizeof(media_upload_create_t));
    if (!media_upload_create_local_var) {
        return NULL;
    }
    memset(media_upload_create_local_var, 0, sizeof(media_upload_create_t));
    media_upload_create_local_var->_library_owned = 1;
    media_upload_create_local_var->media_type = media_type;
    return media_upload_create_local_var;
}

__attribute__((deprecated)) media_upload_create_t *media_upload_create_create(
    media_upload_type_t *media_type
    ) {
    media_upload_create_t *result = media_upload_create_create_internal (
        media_type
        );
    if (!result) {
    }
    return result;
}

void media_upload_create_free(media_upload_create_t *media_upload_create) {
    if(NULL == media_upload_create){
        return ;
    }
    if(media_upload_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "media_upload_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (media_upload_create->media_type) {
        media_upload_type_free(media_upload_create->media_type);
        media_upload_create->media_type = NULL;
    }
    free(media_upload_create);
}

cJSON *media_upload_create_convertToJSON(media_upload_create_t *media_upload_create) {
    cJSON *item = cJSON_CreateObject();

    // media_upload_create->media_type
    if (!media_upload_create->media_type) {
        goto fail;
    }
    cJSON *media_type_local_JSON = media_upload_type_convertToJSON(media_upload_create->media_type);
    if(media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "media_type", media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

media_upload_create_t *media_upload_create_parseFromJSON(cJSON *media_upload_createJSON){

    media_upload_create_t *media_upload_create_local_var = NULL;

    // define the local variable for media_upload_create->media_type
    media_upload_type_t *media_type_local_nonprim = NULL;

    // media_upload_create->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_upload_createJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    
    media_type_local_nonprim = media_upload_type_parseFromJSON(media_type); //custom



    media_upload_create_local_var = media_upload_create_create_internal (
        media_type_local_nonprim
        );

    if (!media_upload_create_local_var) {
        goto end;
    }

    return media_upload_create_local_var;
end:
    if (media_type_local_nonprim) {
        media_upload_type_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    return NULL;

}
