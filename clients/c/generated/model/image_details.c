#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_details.h"



static image_details_t *image_details_create_internal(
    int *height,
    char *url,
    int *width
    ) {
    image_details_t *image_details_local_var = malloc(sizeof(image_details_t));
    if (!image_details_local_var) {
        return NULL;
    }
    memset(image_details_local_var, 0, sizeof(image_details_t));
    image_details_local_var->_library_owned = 1;
    image_details_local_var->height = height;
    image_details_local_var->url = url;
    image_details_local_var->width = width;
    return image_details_local_var;
}

__attribute__((deprecated)) image_details_t *image_details_create(
    int *height,
    char *url,
    int *width
    ) {
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
    image_details_t *result = image_details_create_internal (
        height_copy,
        url,
        width_copy
        );
    if (!result) {
        free(height_copy);
        free(width_copy);
    }
    return result;
}

void image_details_free(image_details_t *image_details) {
    if(NULL == image_details){
        return ;
    }
    if(image_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "image_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (image_details->height) {
        free(image_details->height);
        image_details->height = NULL;
    }
    if (image_details->url) {
        free(image_details->url);
        image_details->url = NULL;
    }
    if (image_details->width) {
        free(image_details->width);
        image_details->width = NULL;
    }
    free(image_details);
}

cJSON *image_details_convertToJSON(image_details_t *image_details) {
    cJSON *item = cJSON_CreateObject();

    // image_details->height
    if (!image_details->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", *image_details->height) == NULL) {
    goto fail; //Numeric
    }


    // image_details->url
    if (!image_details->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", image_details->url) == NULL) {
    goto fail; //String
    }


    // image_details->width
    if (!image_details->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", *image_details->width) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

image_details_t *image_details_parseFromJSON(cJSON *image_detailsJSON){

    image_details_t *image_details_local_var = NULL;

    // define the local variable for image_details->height
    int *height_local_var = NULL;

    char *url_local_str = NULL;

    // define the local variable for image_details->width
    int *width_local_var = NULL;

    // image_details->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (!height) {
        goto end;
    }

    
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

    // image_details->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // image_details->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (!width) {
        goto end;
    }

    
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


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    image_details_local_var = image_details_create_internal (
        height_local_var,
        url_local_str,
        width_local_var
        );

    if (!image_details_local_var) {
        goto end;
    }

    return image_details_local_var;
end:
    if (height_local_var) {
        free(height_local_var);
        height_local_var = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    if (width_local_var) {
        free(width_local_var);
        width_local_var = NULL;
    }
    return NULL;

}
