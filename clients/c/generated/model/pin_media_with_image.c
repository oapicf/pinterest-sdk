#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_image.h"


char* pin_media_with_image_media_type_ToString(pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type) {
    char* media_typeArray[] =  { "NULL", "image" };
    return media_typeArray[media_type];
}

pinterest_rest_api_pin_media_with_image_MEDIATYPE_e pin_media_with_image_media_type_FromString(char* media_type){
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "image" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_with_image_t *pin_media_with_image_create_internal(
    image_size_t *images,
    pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type
    ) {
    pin_media_with_image_t *pin_media_with_image_local_var = malloc(sizeof(pin_media_with_image_t));
    if (!pin_media_with_image_local_var) {
        return NULL;
    }
    pin_media_with_image_local_var->images = images;
    pin_media_with_image_local_var->media_type = media_type;

    pin_media_with_image_local_var->_library_owned = 1;
    return pin_media_with_image_local_var;
}

__attribute__((deprecated)) pin_media_with_image_t *pin_media_with_image_create(
    image_size_t *images,
    pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type
    ) {
    return pin_media_with_image_create_internal (
        images,
        media_type
        );
}

void pin_media_with_image_free(pin_media_with_image_t *pin_media_with_image) {
    if(NULL == pin_media_with_image){
        return ;
    }
    if(pin_media_with_image->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_with_image_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_image->images) {
        image_size_free(pin_media_with_image->images);
        pin_media_with_image->images = NULL;
    }
    free(pin_media_with_image);
}

cJSON *pin_media_with_image_convertToJSON(pin_media_with_image_t *pin_media_with_image) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_image->images
    if(pin_media_with_image->images) {
    cJSON *images_local_JSON = image_size_convertToJSON(pin_media_with_image->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_with_image->media_type
    if (pinterest_rest_api_pin_media_with_image_MEDIATYPE_NULL == pin_media_with_image->media_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_image_media_type_ToString(pin_media_with_image->media_type)) == NULL)
    {
    goto fail; //Enum
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
    image_size_t *images_local_nonprim = NULL;

    // pin_media_with_image->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_media_with_imageJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (images) { 
    images_local_nonprim = image_size_parseFromJSON(images); //nonprimitive
    }

    // pin_media_with_image->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_imageJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_typeVariable;
    
    if(!cJSON_IsString(media_type))
    {
    goto end; //Enum
    }
    media_typeVariable = pin_media_with_image_media_type_FromString(media_type->valuestring);


    pin_media_with_image_local_var = pin_media_with_image_create_internal (
        images ? images_local_nonprim : NULL,
        media_typeVariable
        );

    return pin_media_with_image_local_var;
end:
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    return NULL;

}
