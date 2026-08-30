#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "video_metadata_with_item_type.h"


char* video_metadata_with_item_type_item_type_ToString(pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_e item_type) {
    char* item_typeArray[] =  { "NULL", "video" };
    return item_typeArray[item_type];
}

pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_e video_metadata_with_item_type_item_type_FromString(char* item_type){
    int stringToReturn = 0;
    char *item_typeArray[] =  { "NULL", "video" };
    size_t sizeofArray = sizeof(item_typeArray) / sizeof(item_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_type, item_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static video_metadata_with_item_type_t *video_metadata_with_item_type_create_internal(
    char *cover_image_url,
    double *duration,
    int *height,
    pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_e item_type,
    char *video_url,
    char *video_url_hls,
    int *width
    ) {
    video_metadata_with_item_type_t *video_metadata_with_item_type_local_var = malloc(sizeof(video_metadata_with_item_type_t));
    if (!video_metadata_with_item_type_local_var) {
        return NULL;
    }
    memset(video_metadata_with_item_type_local_var, 0, sizeof(video_metadata_with_item_type_t));
    video_metadata_with_item_type_local_var->_library_owned = 1;
    video_metadata_with_item_type_local_var->cover_image_url = cover_image_url;
    video_metadata_with_item_type_local_var->duration = duration;
    video_metadata_with_item_type_local_var->height = height;
    video_metadata_with_item_type_local_var->item_type = item_type;
    video_metadata_with_item_type_local_var->video_url = video_url;
    video_metadata_with_item_type_local_var->video_url_hls = video_url_hls;
    video_metadata_with_item_type_local_var->width = width;
    return video_metadata_with_item_type_local_var;
}

__attribute__((deprecated)) video_metadata_with_item_type_t *video_metadata_with_item_type_create(
    char *cover_image_url,
    double *duration,
    int *height,
    pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_e item_type,
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
    video_metadata_with_item_type_t *result = video_metadata_with_item_type_create_internal (
        cover_image_url,
        duration_copy,
        height_copy,
        item_type,
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

void video_metadata_with_item_type_free(video_metadata_with_item_type_t *video_metadata_with_item_type) {
    if(NULL == video_metadata_with_item_type){
        return ;
    }
    if(video_metadata_with_item_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "video_metadata_with_item_type_free");
        return ;
    }
    listEntry_t *listEntry;
    if (video_metadata_with_item_type->cover_image_url) {
        free(video_metadata_with_item_type->cover_image_url);
        video_metadata_with_item_type->cover_image_url = NULL;
    }
    if (video_metadata_with_item_type->duration) {
        free(video_metadata_with_item_type->duration);
        video_metadata_with_item_type->duration = NULL;
    }
    if (video_metadata_with_item_type->height) {
        free(video_metadata_with_item_type->height);
        video_metadata_with_item_type->height = NULL;
    }
    if (video_metadata_with_item_type->video_url) {
        free(video_metadata_with_item_type->video_url);
        video_metadata_with_item_type->video_url = NULL;
    }
    if (video_metadata_with_item_type->video_url_hls) {
        free(video_metadata_with_item_type->video_url_hls);
        video_metadata_with_item_type->video_url_hls = NULL;
    }
    if (video_metadata_with_item_type->width) {
        free(video_metadata_with_item_type->width);
        video_metadata_with_item_type->width = NULL;
    }
    free(video_metadata_with_item_type);
}

cJSON *video_metadata_with_item_type_convertToJSON(video_metadata_with_item_type_t *video_metadata_with_item_type) {
    cJSON *item = cJSON_CreateObject();

    // video_metadata_with_item_type->cover_image_url
    if(video_metadata_with_item_type->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", video_metadata_with_item_type->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata_with_item_type->duration
    if(video_metadata_with_item_type->duration) {
    if(cJSON_AddNumberToObject(item, "duration", *video_metadata_with_item_type->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // video_metadata_with_item_type->height
    if(video_metadata_with_item_type->height) {
    if(cJSON_AddNumberToObject(item, "height", *video_metadata_with_item_type->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // video_metadata_with_item_type->item_type
    if (pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_NULL == video_metadata_with_item_type->item_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_type", video_metadata_with_item_type_item_type_ToString(video_metadata_with_item_type->item_type)) == NULL)
    {
    goto fail; //Enum
    }


    // video_metadata_with_item_type->video_url
    if(video_metadata_with_item_type->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", video_metadata_with_item_type->video_url) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata_with_item_type->video_url_hls
    if(video_metadata_with_item_type->video_url_hls) {
    if(cJSON_AddStringToObject(item, "video_url_hls", video_metadata_with_item_type->video_url_hls) == NULL) {
    goto fail; //String
    }
    }


    // video_metadata_with_item_type->width
    if(video_metadata_with_item_type->width) {
    if(cJSON_AddNumberToObject(item, "width", *video_metadata_with_item_type->width) == NULL) {
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

video_metadata_with_item_type_t *video_metadata_with_item_type_parseFromJSON(cJSON *video_metadata_with_item_typeJSON){

    video_metadata_with_item_type_t *video_metadata_with_item_type_local_var = NULL;

    char *cover_image_url_local_str = NULL;

    // define the local variable for video_metadata_with_item_type->duration
    double *duration_local_var = NULL;

    // define the local variable for video_metadata_with_item_type->height
    int *height_local_var = NULL;

    char *video_url_local_str = NULL;

    char *video_url_hls_local_str = NULL;

    // define the local variable for video_metadata_with_item_type->width
    int *width_local_var = NULL;

    // video_metadata_with_item_type->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // video_metadata_with_item_type->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "duration");
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

    // video_metadata_with_item_type->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "height");
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

    // video_metadata_with_item_type->item_type
    cJSON *item_type = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "item_type");
    if (cJSON_IsNull(item_type)) {
        item_type = NULL;
    }
    if (!item_type) {
        goto end;
    }

    pinterest_rest_api_video_metadata_with_item_type_ITEMTYPE_e item_typeVariable;
    
    if(!cJSON_IsString(item_type))
    {
    goto end; //Enum
    }
    item_typeVariable = video_metadata_with_item_type_item_type_FromString(item_type->valuestring);

    // video_metadata_with_item_type->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "video_url");
    if (cJSON_IsNull(video_url)) {
        video_url = NULL;
    }
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // video_metadata_with_item_type->video_url_hls
    cJSON *video_url_hls = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "video_url_hls");
    if (cJSON_IsNull(video_url_hls)) {
        video_url_hls = NULL;
    }
    if (video_url_hls) { 
    if(!cJSON_IsString(video_url_hls) && !cJSON_IsNull(video_url_hls))
    {
    goto end; //String
    }
    }

    // video_metadata_with_item_type->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(video_metadata_with_item_typeJSON, "width");
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

    video_metadata_with_item_type_local_var = video_metadata_with_item_type_create_internal (
        cover_image_url_local_str,
        duration_local_var,
        height_local_var,
        item_typeVariable,
        video_url_local_str,
        video_url_hls_local_str,
        width_local_var
        );

    if (!video_metadata_with_item_type_local_var) {
        goto end;
    }

    return video_metadata_with_item_type_local_var;
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
