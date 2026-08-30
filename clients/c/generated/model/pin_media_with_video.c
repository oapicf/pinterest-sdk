#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_video.h"


char* pin_media_with_video_media_type_ToString(pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type) {
    char* media_typeArray[] =  { "NULL", "video" };
    return media_typeArray[media_type];
}

pinterest_rest_api_pin_media_with_video_MEDIATYPE_e pin_media_with_video_media_type_FromString(char* media_type){
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "video" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_with_video_t *pin_media_with_video_create_internal(
    char *cover_image_url,
    double *duration,
    int *height,
    image_size_t *images,
    pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type,
    char *video_url,
    char *video_url_hls,
    int *width
    ) {
    pin_media_with_video_t *pin_media_with_video_local_var = malloc(sizeof(pin_media_with_video_t));
    if (!pin_media_with_video_local_var) {
        return NULL;
    }
    memset(pin_media_with_video_local_var, 0, sizeof(pin_media_with_video_t));
    pin_media_with_video_local_var->_library_owned = 1;
    pin_media_with_video_local_var->cover_image_url = cover_image_url;
    pin_media_with_video_local_var->duration = duration;
    pin_media_with_video_local_var->height = height;
    pin_media_with_video_local_var->images = images;
    pin_media_with_video_local_var->media_type = media_type;
    pin_media_with_video_local_var->video_url = video_url;
    pin_media_with_video_local_var->video_url_hls = video_url_hls;
    pin_media_with_video_local_var->width = width;
    return pin_media_with_video_local_var;
}

__attribute__((deprecated)) pin_media_with_video_t *pin_media_with_video_create(
    char *cover_image_url,
    double *duration,
    int *height,
    image_size_t *images,
    pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type,
    char *video_url,
    char *video_url_hls,
    int *width
    ) {
    double *duration_copy = NULL;
    if (duration) {
        duration_copy = malloc(sizeof(double));
        if (duration_copy) *duration_copy = *duration;
    }
    int *height_copy = NULL;
    if (height) {
        height_copy = malloc(sizeof(int));
        if (height_copy) *height_copy = *height;
    }
    int *width_copy = NULL;
    if (width) {
        width_copy = malloc(sizeof(int));
        if (width_copy) *width_copy = *width;
    }
    pin_media_with_video_t *result = pin_media_with_video_create_internal (
        cover_image_url,
        duration_copy,
        height_copy,
        images,
        media_type,
        video_url,
        video_url_hls,
        width_copy
        );
    if (!result) {
        free(duration_copy);
        free(height_copy);
        free(width_copy);
    }
    return result;
}

void pin_media_with_video_free(pin_media_with_video_t *pin_media_with_video) {
    if(NULL == pin_media_with_video){
        return ;
    }
    if(pin_media_with_video->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_with_video_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_video->cover_image_url) {
        free(pin_media_with_video->cover_image_url);
        pin_media_with_video->cover_image_url = NULL;
    }
    if (pin_media_with_video->duration) {
        free(pin_media_with_video->duration);
        pin_media_with_video->duration = NULL;
    }
    if (pin_media_with_video->height) {
        free(pin_media_with_video->height);
        pin_media_with_video->height = NULL;
    }
    if (pin_media_with_video->images) {
        image_size_free(pin_media_with_video->images);
        pin_media_with_video->images = NULL;
    }
    if (pin_media_with_video->video_url) {
        free(pin_media_with_video->video_url);
        pin_media_with_video->video_url = NULL;
    }
    if (pin_media_with_video->video_url_hls) {
        free(pin_media_with_video->video_url_hls);
        pin_media_with_video->video_url_hls = NULL;
    }
    if (pin_media_with_video->width) {
        free(pin_media_with_video->width);
        pin_media_with_video->width = NULL;
    }
    free(pin_media_with_video);
}

cJSON *pin_media_with_video_convertToJSON(pin_media_with_video_t *pin_media_with_video) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_video->cover_image_url
    if(pin_media_with_video->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_with_video->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->duration
    if(pin_media_with_video->duration) {
    if(cJSON_AddNumberToObject(item, "duration", *pin_media_with_video->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_with_video->height
    if(pin_media_with_video->height) {
    if(cJSON_AddNumberToObject(item, "height", *pin_media_with_video->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_with_video->images
    if(pin_media_with_video->images) {
    cJSON *images_local_JSON = image_size_convertToJSON(pin_media_with_video->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_video->media_type
    if (pinterest_rest_api_pin_media_with_video_MEDIATYPE_NULL == pin_media_with_video->media_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_video_media_type_ToString(pin_media_with_video->media_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_with_video->video_url
    if(pin_media_with_video->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", pin_media_with_video->video_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->video_url_hls
    if(pin_media_with_video->video_url_hls) {
    if(cJSON_AddStringToObject(item, "video_url_hls", pin_media_with_video->video_url_hls) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_video->width
    if(pin_media_with_video->width) {
    if(cJSON_AddNumberToObject(item, "width", *pin_media_with_video->width) == NULL) {
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

    char *cover_image_url_local_str = NULL;

    // define the local variable for pin_media_with_video->duration
    double *duration_local_var = NULL;

    // define the local variable for pin_media_with_video->height
    int *height_local_var = NULL;

    // define the local variable for pin_media_with_video->images
    image_size_t *images_local_nonprim = NULL;

    char *video_url_local_str = NULL;

    char *video_url_hls_local_str = NULL;

    // define the local variable for pin_media_with_video->width
    int *width_local_var = NULL;

    // pin_media_with_video->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "duration");
    if (cJSON_IsNull(duration)) {
        duration = NULL;
    }
    if (duration) { 
    if(!cJSON_IsNumber(duration))
    {
    goto end; //Numeric
    }
    duration_local_var = malloc(sizeof(double));
    if(!duration_local_var)
    {
        goto end;
    }
    *duration_local_var = duration->valuedouble;
    }

    // pin_media_with_video->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    height_local_var = malloc(sizeof(int));
    if(!height_local_var)
    {
        goto end;
    }
    *height_local_var = height->valuedouble;
    }

    // pin_media_with_video->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (images) { 
    images_local_nonprim = image_size_parseFromJSON(images); //nonprimitive
    }

    // pin_media_with_video->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_typeVariable;
    
    if(!cJSON_IsString(media_type))
    {
    goto end; //Enum
    }
    media_typeVariable = pin_media_with_video_media_type_FromString(media_type->valuestring);

    // pin_media_with_video->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "video_url");
    if (cJSON_IsNull(video_url)) {
        video_url = NULL;
    }
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->video_url_hls
    cJSON *video_url_hls = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "video_url_hls");
    if (cJSON_IsNull(video_url_hls)) {
        video_url_hls = NULL;
    }
    if (video_url_hls) { 
    if(!cJSON_IsString(video_url_hls) && !cJSON_IsNull(video_url_hls))
    {
    goto end; //String
    }
    }

    // pin_media_with_video->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(pin_media_with_videoJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    width_local_var = malloc(sizeof(int));
    if(!width_local_var)
    {
        goto end;
    }
    *width_local_var = width->valuedouble;
    }


    if (cover_image_url && !cJSON_IsNull(cover_image_url)) cover_image_url_local_str = strdup(cover_image_url->valuestring);
    if (video_url && !cJSON_IsNull(video_url)) video_url_local_str = strdup(video_url->valuestring);
    if (video_url_hls && !cJSON_IsNull(video_url_hls)) video_url_hls_local_str = strdup(video_url_hls->valuestring);

    pin_media_with_video_local_var = pin_media_with_video_create_internal (
        cover_image_url_local_str,
        duration_local_var,
        height_local_var,
        images ? images_local_nonprim : NULL,
        media_typeVariable,
        video_url_local_str,
        video_url_hls_local_str,
        width_local_var
        );

    if (!pin_media_with_video_local_var) {
        goto end;
    }

    return pin_media_with_video_local_var;
end:
    if (cover_image_url_local_str) {
        free(cover_image_url_local_str);
        cover_image_url_local_str = NULL;
    }
    if (duration_local_var) {
        free(duration_local_var);
        duration_local_var = NULL;
    }
    if (height_local_var) {
        free(height_local_var);
        height_local_var = NULL;
    }
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    if (video_url_local_str) {
        free(video_url_local_str);
        video_url_local_str = NULL;
    }
    if (video_url_hls_local_str) {
        free(video_url_hls_local_str);
        video_url_hls_local_str = NULL;
    }
    if (width_local_var) {
        free(width_local_var);
        width_local_var = NULL;
    }
    return NULL;

}
