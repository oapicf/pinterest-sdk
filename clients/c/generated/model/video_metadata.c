#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "video_metadata.h"



static video_metadata_t *video_metadata_create_internal(
    char *item_type,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
    ) {
    video_metadata_t *video_metadata_local_var = malloc(sizeof(video_metadata_t));
    if (!video_metadata_local_var) {
        return NULL;
    }
    video_metadata_local_var->item_type = item_type;
    video_metadata_local_var->cover_image_url = cover_image_url;
    video_metadata_local_var->video_url = video_url;
    video_metadata_local_var->duration = duration;
    video_metadata_local_var->height = height;
    video_metadata_local_var->width = width;

    video_metadata_local_var->_library_owned = 1;
    return video_metadata_local_var;
}

__attribute__((deprecated)) video_metadata_t *video_metadata_create(
    char *item_type,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
    ) {
    return video_metadata_create_internal (
        item_type,
        cover_image_url,
        video_url,
        duration,
        height,
        width
        );
}

void video_metadata_free(video_metadata_t *video_metadata) {
    if(NULL == video_metadata){
        return ;
    }
    if(video_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "video_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (video_metadata->item_type) {
        free(video_metadata->item_type);
        video_metadata->item_type = NULL;
    }
    if (video_metadata->cover_image_url) {
        free(video_metadata->cover_image_url);
        video_metadata->cover_image_url = NULL;
    }
    if (video_metadata->video_url) {
        free(video_metadata->video_url);
        video_metadata->video_url = NULL;
    }
    free(video_metadata);
}

cJSON *video_metadata_convertToJSON(video_metadata_t *video_metadata) {
    cJSON *item = cJSON_CreateObject();

    // video_metadata->item_type
    if(video_metadata->item_type) {
    if(cJSON_AddStringToObject(item, "item_type", video_metadata->item_type) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata->cover_image_url
    if(video_metadata->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", video_metadata->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata->video_url
    if(video_metadata->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", video_metadata->video_url) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata->duration
    if(video_metadata->duration) {
    if(cJSON_AddNumberToObject(item, "duration", video_metadata->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // video_metadata->height
    if(video_metadata->height) {
    if(cJSON_AddNumberToObject(item, "height", video_metadata->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // video_metadata->width
    if(video_metadata->width) {
    if(cJSON_AddNumberToObject(item, "width", video_metadata->width) == NULL) {
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

video_metadata_t *video_metadata_parseFromJSON(cJSON *video_metadataJSON){

    video_metadata_t *video_metadata_local_var = NULL;

    // video_metadata->item_type
    cJSON *item_type = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "item_type");
    if (cJSON_IsNull(item_type)) {
        item_type = NULL;
    }
    if (item_type) { 
    if(!cJSON_IsString(item_type) && !cJSON_IsNull(item_type))
    {
    goto end; //String
    }
    }

    // video_metadata->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // video_metadata->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "video_url");
    if (cJSON_IsNull(video_url)) {
        video_url = NULL;
    }
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // video_metadata->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "duration");
    if (cJSON_IsNull(duration)) {
        duration = NULL;
    }
    if (duration) { 
    if(!cJSON_IsNumber(duration))
    {
    goto end; //Numeric
    }
    }

    // video_metadata->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // video_metadata->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(video_metadataJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    }


    video_metadata_local_var = video_metadata_create_internal (
        item_type && !cJSON_IsNull(item_type) ? strdup(item_type->valuestring) : NULL,
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        video_url && !cJSON_IsNull(video_url) ? strdup(video_url->valuestring) : NULL,
        duration ? duration->valuedouble : 0,
        height ? height->valuedouble : 0,
        width ? width->valuedouble : 0
        );

    return video_metadata_local_var;
end:
    return NULL;

}
