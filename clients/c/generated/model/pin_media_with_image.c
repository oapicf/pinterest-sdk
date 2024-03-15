#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_image.h"



pin_media_with_image_t *pin_media_with_image_create(
    char *media_type,
    image_metadata_images_t *images
    ) {
    pin_media_with_image_t *pin_media_with_image_local_var = malloc(sizeof(pin_media_with_image_t));
    if (!pin_media_with_image_local_var) {
        return NULL;
    }
    pin_media_with_image_local_var->media_type = media_type;
    pin_media_with_image_local_var->images = images;

    return pin_media_with_image_local_var;
}


void pin_media_with_image_free(pin_media_with_image_t *pin_media_with_image) {
    if(NULL == pin_media_with_image){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_image->media_type) {
        free(pin_media_with_image->media_type);
        pin_media_with_image->media_type = NULL;
    }
    if (pin_media_with_image->images) {
        image_metadata_images_free(pin_media_with_image->images);
        pin_media_with_image->images = NULL;
    }
    free(pin_media_with_image);
}

cJSON *pin_media_with_image_convertToJSON(pin_media_with_image_t *pin_media_with_image) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_image->media_type
    if(pin_media_with_image->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_image->media_type) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_image->images
    if(pin_media_with_image->images) {
    cJSON *images_local_JSON = image_metadata_images_convertToJSON(pin_media_with_image->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_with_image_t *pin_media_with_image_parseFromJSON(cJSON *pin_media_with_imageJSON){

    pin_media_with_image_t *pin_media_with_image_local_var = NULL;

    // define the local variable for pin_media_with_image->images
    image_metadata_images_t *images_local_nonprim = NULL;

    // pin_media_with_image->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_imageJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }

    // pin_media_with_image->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_media_with_imageJSON, "images");
    if (images) { 
    images_local_nonprim = image_metadata_images_parseFromJSON(images); //nonprimitive
    }


    pin_media_with_image_local_var = pin_media_with_image_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL,
        images ? images_local_nonprim : NULL
        );

    return pin_media_with_image_local_var;
end:
    if (images_local_nonprim) {
        image_metadata_images_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    return NULL;

}
