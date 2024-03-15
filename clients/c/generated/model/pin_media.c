#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media.h"



pin_media_t *pin_media_create(
    char *media_type
    ) {
    pin_media_t *pin_media_local_var = malloc(sizeof(pin_media_t));
    if (!pin_media_local_var) {
        return NULL;
    }
    pin_media_local_var->media_type = media_type;

    return pin_media_local_var;
}


void pin_media_free(pin_media_t *pin_media) {
    if(NULL == pin_media){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media->media_type) {
        free(pin_media->media_type);
        pin_media->media_type = NULL;
    }
    free(pin_media);
}

cJSON *pin_media_convertToJSON(pin_media_t *pin_media) {
    cJSON *item = cJSON_CreateObject();

    // pin_media->media_type
    if(pin_media->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", pin_media->media_type) == NULL) {
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

pin_media_t *pin_media_parseFromJSON(cJSON *pin_mediaJSON){

    pin_media_t *pin_media_local_var = NULL;

    // pin_media->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }


    pin_media_local_var = pin_media_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL
        );

    return pin_media_local_var;
end:
    return NULL;

}
