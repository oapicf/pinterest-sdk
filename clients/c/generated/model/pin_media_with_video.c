#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_video.h"



pin_media_with_video_t *pin_media_with_video_create(
    char *media_type,
    pin_media_with_image_all_of_images_t *images,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
    ) {
    pin_media_with_video_t *pin_media_with_video_local_var = malloc(sizeof(pin_media_with_video_t));
    if (!pin_media_with_video_local_var) {
        return NULL;
    }
    pin_media_with_video_local_var->media_type = media_type;
    pin_media_with_video_local_var->images = images;
    pin_media_with_video_local_var->cover_image_url = cover_image_url;
    pin_media_with_video_local_var->video_url = video_url;
    pin_media_with_video_local_var->duration = duration;
    pin_media_with_video_local_var->height = height;
    pin_media_with_video_local_var->width = width;

    return pin_media_with_video_local_var;
}


void pin_media_with_video_free(pin_media_with_video_t *pin_media_with_video) {
    if(NULL == pin_media_with_video){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_video->media_type) {
        free(pin_media_with_video->media_type);
        pin_media_with_video->media_type = NULL;
    }
    if (pin_media_with_video->images) {
        pin_media_with_image_all_of_images_free(pin_media_with_video->images);
        pin_media_with_video->images = NULL;
    }
    if (pin_media_with_video->cover_image_url) {
        free(pin_media_with_video->cover_image_url);
        pin_media_with_video->cover_image_url = NULL;
    }
    if (pin_media_with_video->video_url) {
        free(pin_media_with_video->video_url);
        pin_media_with_video->video_url = NULL;
    }
    free(pin_media_with_video);
}

cJSON *pin_media_with_video_convertToJSON(pin_media_with_video_t *pin_media_with_video) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_video->media_type
    if(pin_media_with_video->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_video->media_type) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->images
    if(pin_media_with_video->images) {
    cJSON *images_local_JSON = pin_media_with_image_all_of_images_convertToJSON(pin_media_with_video->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_video->cover_image_url
    if(pin_media_with_video->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_with_video->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->video_url
    if(pin_media_with_video->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", pin_media_with_video->video_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->duration
    if(pin_media_with_video->duration) {
    if(cJSON_AddNumberToObject(item, "duration", pin_media_with_video->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_with_video->height
    if(pin_media_with_video->height) {
    if(cJSON_AddNumberToObject(item, "height", pin_media_with_video->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_with_video->width
    if(pin_media_with_video->width) {
    if(cJSON_AddNumberToObject(item, "width", pin_media_with_video->width) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_with_video_t *pin_media_with_video_parseFromJSON(cJSON *pin_media_with_videoJSON){

    pin_media_with_video_t *pin_media_with_video_local_var = NULL;

    // define the local variable for pin_media_with_video->images
    pin_media_with_image_all_of_images_t *images_local_nonprim = NULL;

    // pin_media_with_video->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "images");
    if (images) { 
    images_local_nonprim = pin_media_with_image_all_of_images_parseFromJSON(images); //nonprimitive
    }

    // pin_media_with_video->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "cover_image_url");
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "video_url");
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "duration");
    if (duration) { 
    if(!cJSON_IsNumber(duration))
    {
    goto end; //Numeric
    }
    }

    // pin_media_with_video->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "height");
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // pin_media_with_video->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "width");
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    }


    pin_media_with_video_local_var = pin_media_with_video_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL,
        images ? images_local_nonprim : NULL,
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        video_url && !cJSON_IsNull(video_url) ? strdup(video_url->valuestring) : NULL,
        duration ? duration->valuedouble : 0,
        height ? height->valuedouble : 0,
        width ? width->valuedouble : 0
        );

    return pin_media_with_video_local_var;
end:
    if (images_local_nonprim) {
        pin_media_with_image_all_of_images_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    return NULL;

}
