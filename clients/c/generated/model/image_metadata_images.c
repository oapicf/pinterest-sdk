#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_metadata_images.h"



image_metadata_images_t *image_metadata_images_create(
    image_details_t *_150x150,
    image_details_t *_400x300,
    image_details_t *_600x,
    image_details_t *_1200x
    ) {
    image_metadata_images_t *image_metadata_images_local_var = malloc(sizeof(image_metadata_images_t));
    if (!image_metadata_images_local_var) {
        return NULL;
    }
    image_metadata_images_local_var->_150x150 = _150x150;
    image_metadata_images_local_var->_400x300 = _400x300;
    image_metadata_images_local_var->_600x = _600x;
    image_metadata_images_local_var->_1200x = _1200x;

    return image_metadata_images_local_var;
}


void image_metadata_images_free(image_metadata_images_t *image_metadata_images) {
    if(NULL == image_metadata_images){
        return ;
    }
    listEntry_t *listEntry;
    if (image_metadata_images->_150x150) {
        object_free(image_metadata_images->_150x150);
        image_metadata_images->_150x150 = NULL;
    }
    if (image_metadata_images->_400x300) {
        object_free(image_metadata_images->_400x300);
        image_metadata_images->_400x300 = NULL;
    }
    if (image_metadata_images->_600x) {
        object_free(image_metadata_images->_600x);
        image_metadata_images->_600x = NULL;
    }
    if (image_metadata_images->_1200x) {
        object_free(image_metadata_images->_1200x);
        image_metadata_images->_1200x = NULL;
    }
    free(image_metadata_images);
}

cJSON *image_metadata_images_convertToJSON(image_metadata_images_t *image_metadata_images) {
    cJSON *item = cJSON_CreateObject();

    // image_metadata_images->_150x150
    if(image_metadata_images->_150x150) {
    cJSON *_150x150_object = object_convertToJSON(image_metadata_images->_150x150);
    if(_150x150_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "150x150", _150x150_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_metadata_images->_400x300
    if(image_metadata_images->_400x300) {
    cJSON *_400x300_object = object_convertToJSON(image_metadata_images->_400x300);
    if(_400x300_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "400x300", _400x300_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_metadata_images->_600x
    if(image_metadata_images->_600x) {
    cJSON *_600x_object = object_convertToJSON(image_metadata_images->_600x);
    if(_600x_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "600x", _600x_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_metadata_images->_1200x
    if(image_metadata_images->_1200x) {
    cJSON *_1200x_object = object_convertToJSON(image_metadata_images->_1200x);
    if(_1200x_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "1200x", _1200x_object);
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

image_metadata_images_t *image_metadata_images_parseFromJSON(cJSON *image_metadata_imagesJSON){

    image_metadata_images_t *image_metadata_images_local_var = NULL;

    // image_metadata_images->_150x150
    cJSON *_150x150 = cJSON_GetObjectItemCaseSensitive(image_metadata_imagesJSON, "150x150");
    object_t *_150x150_local_object = NULL;
    if (_150x150) { 
    _150x150_local_object = object_parseFromJSON(_150x150); //object
    }

    // image_metadata_images->_400x300
    cJSON *_400x300 = cJSON_GetObjectItemCaseSensitive(image_metadata_imagesJSON, "400x300");
    object_t *_400x300_local_object = NULL;
    if (_400x300) { 
    _400x300_local_object = object_parseFromJSON(_400x300); //object
    }

    // image_metadata_images->_600x
    cJSON *_600x = cJSON_GetObjectItemCaseSensitive(image_metadata_imagesJSON, "600x");
    object_t *_600x_local_object = NULL;
    if (_600x) { 
    _600x_local_object = object_parseFromJSON(_600x); //object
    }

    // image_metadata_images->_1200x
    cJSON *_1200x = cJSON_GetObjectItemCaseSensitive(image_metadata_imagesJSON, "1200x");
    object_t *_1200x_local_object = NULL;
    if (_1200x) { 
    _1200x_local_object = object_parseFromJSON(_1200x); //object
    }


    image_metadata_images_local_var = image_metadata_images_create (
        _150x150 ? _150x150_local_object : NULL,
        _400x300 ? _400x300_local_object : NULL,
        _600x ? _600x_local_object : NULL,
        _1200x ? _1200x_local_object : NULL
        );

    return image_metadata_images_local_var;
end:
    return NULL;

}
