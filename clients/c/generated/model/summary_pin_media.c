#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "summary_pin_media.h"



summary_pin_media_t *summary_pin_media_create(
    char *media_type
    ) {
    summary_pin_media_t *summary_pin_media_local_var = malloc(sizeof(summary_pin_media_t));
    if (!summary_pin_media_local_var) {
        return NULL;
    }
    summary_pin_media_local_var->media_type = media_type;

    return summary_pin_media_local_var;
}


void summary_pin_media_free(summary_pin_media_t *summary_pin_media) {
    if(NULL == summary_pin_media){
        return ;
    }
    listEntry_t *listEntry;
    if (summary_pin_media->media_type) {
        free(summary_pin_media->media_type);
        summary_pin_media->media_type = NULL;
    }
    free(summary_pin_media);
}

cJSON *summary_pin_media_convertToJSON(summary_pin_media_t *summary_pin_media) {
    cJSON *item = cJSON_CreateObject();

    // summary_pin_media->media_type
    if(summary_pin_media->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", summary_pin_media->media_type) == NULL) {
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

summary_pin_media_t *summary_pin_media_parseFromJSON(cJSON *summary_pin_mediaJSON){

    summary_pin_media_t *summary_pin_media_local_var = NULL;

    // summary_pin_media->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(summary_pin_mediaJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }


    summary_pin_media_local_var = summary_pin_media_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL
        );

    return summary_pin_media_local_var;
end:
    return NULL;

}
