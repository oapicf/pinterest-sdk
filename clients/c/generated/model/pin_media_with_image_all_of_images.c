#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_image_all_of_images.h"



pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_create(
    object_t *_150x150,
    object_t *_400x300,
    object_t *_600x,
    object_t *_1200x
    ) {
    pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_local_var = malloc(sizeof(pin_media_with_image_all_of_images_t));
    if (!pin_media_with_image_all_of_images_local_var) {
        return NULL;
    }
    pin_media_with_image_all_of_images_local_var->_150x150 = _150x150;
    pin_media_with_image_all_of_images_local_var->_400x300 = _400x300;
    pin_media_with_image_all_of_images_local_var->_600x = _600x;
    pin_media_with_image_all_of_images_local_var->_1200x = _1200x;

    return pin_media_with_image_all_of_images_local_var;
}


void pin_media_with_image_all_of_images_free(pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images) {
    if(NULL == pin_media_with_image_all_of_images){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_image_all_of_images->_150x150) {
        object_free(pin_media_with_image_all_of_images->_150x150);
        pin_media_with_image_all_of_images->_150x150 = NULL;
    }
    if (pin_media_with_image_all_of_images->_400x300) {
        object_free(pin_media_with_image_all_of_images->_400x300);
        pin_media_with_image_all_of_images->_400x300 = NULL;
    }
    if (pin_media_with_image_all_of_images->_600x) {
        object_free(pin_media_with_image_all_of_images->_600x);
        pin_media_with_image_all_of_images->_600x = NULL;
    }
    if (pin_media_with_image_all_of_images->_1200x) {
        object_free(pin_media_with_image_all_of_images->_1200x);
        pin_media_with_image_all_of_images->_1200x = NULL;
    }
    free(pin_media_with_image_all_of_images);
}

cJSON *pin_media_with_image_all_of_images_convertToJSON(pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_image_all_of_images->_150x150
    if(pin_media_with_image_all_of_images->_150x150) {
    cJSON *_150x150_object = object_convertToJSON(pin_media_with_image_all_of_images->_150x150);
    if(_150x150_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "150x150", _150x150_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_image_all_of_images->_400x300
    if(pin_media_with_image_all_of_images->_400x300) {
    cJSON *_400x300_object = object_convertToJSON(pin_media_with_image_all_of_images->_400x300);
    if(_400x300_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "400x300", _400x300_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_image_all_of_images->_600x
    if(pin_media_with_image_all_of_images->_600x) {
    cJSON *_600x_object = object_convertToJSON(pin_media_with_image_all_of_images->_600x);
    if(_600x_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "600x", _600x_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_image_all_of_images->_1200x
    if(pin_media_with_image_all_of_images->_1200x) {
    cJSON *_1200x_object = object_convertToJSON(pin_media_with_image_all_of_images->_1200x);
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

pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_parseFromJSON(cJSON *pin_media_with_image_all_of_imagesJSON){

    pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_local_var = NULL;

    // pin_media_with_image_all_of_images->_150x150
    cJSON *_150x150 = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_all_of_imagesJSON, "150x150");
    object_t *_150x150_local_object = NULL;
    if (_150x150) { 
    _150x150_local_object = object_parseFromJSON(_150x150); //object
    }

    // pin_media_with_image_all_of_images->_400x300
    cJSON *_400x300 = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_all_of_imagesJSON, "400x300");
    object_t *_400x300_local_object = NULL;
    if (_400x300) { 
    _400x300_local_object = object_parseFromJSON(_400x300); //object
    }

    // pin_media_with_image_all_of_images->_600x
    cJSON *_600x = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_all_of_imagesJSON, "600x");
    object_t *_600x_local_object = NULL;
    if (_600x) { 
    _600x_local_object = object_parseFromJSON(_600x); //object
    }

    // pin_media_with_image_all_of_images->_1200x
    cJSON *_1200x = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_all_of_imagesJSON, "1200x");
    object_t *_1200x_local_object = NULL;
    if (_1200x) { 
    _1200x_local_object = object_parseFromJSON(_1200x); //object
    }


    pin_media_with_image_all_of_images_local_var = pin_media_with_image_all_of_images_create (
        _150x150 ? _150x150_local_object : NULL,
        _400x300 ? _400x300_local_object : NULL,
        _600x ? _600x_local_object : NULL,
        _1200x ? _1200x_local_object : NULL
        );

    return pin_media_with_image_all_of_images_local_var;
end:
    return NULL;

}
