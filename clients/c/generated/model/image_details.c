#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_details.h"



image_details_t *image_details_create(
    int width,
    int height,
    char *url
    ) {
    image_details_t *image_details_local_var = malloc(sizeof(image_details_t));
    if (!image_details_local_var) {
        return NULL;
    }
    image_details_local_var->width = width;
    image_details_local_var->height = height;
    image_details_local_var->url = url;

    return image_details_local_var;
}


void image_details_free(image_details_t *image_details) {
    if(NULL == image_details){
        return ;
    }
    listEntry_t *listEntry;
    if (image_details->url) {
        free(image_details->url);
        image_details->url = NULL;
    }
    free(image_details);
}

cJSON *image_details_convertToJSON(image_details_t *image_details) {
    cJSON *item = cJSON_CreateObject();

    // image_details->width
    if (!image_details->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", image_details->width) == NULL) {
    goto fail; //Numeric
    }


    // image_details->height
    if (!image_details->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", image_details->height) == NULL) {
    goto fail; //Numeric
    }


    // image_details->url
    if (!image_details->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", image_details->url) == NULL) {
    goto fail; //String
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

    // image_details->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "width");
    if (!width) {
        goto end;
    }

    
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }

    // image_details->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "height");
    if (!height) {
        goto end;
    }

    
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }

    // image_details->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(image_detailsJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    image_details_local_var = image_details_create (
        width->valuedouble,
        height->valuedouble,
        strdup(url->valuestring)
        );

    return image_details_local_var;
end:
    return NULL;

}
