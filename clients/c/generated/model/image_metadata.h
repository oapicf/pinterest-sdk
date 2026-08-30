/*
 * image_metadata.h
 *
 * 
 */

#ifndef _image_metadata_H_
#define _image_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct image_metadata_t image_metadata_t;

#include "image_size.h"

// Enum ITEMTYPE for image_metadata

typedef enum  { pinterest_rest_api_image_metadata_ITEMTYPE_NULL = 0, pinterest_rest_api_image_metadata_ITEMTYPE_image } pinterest_rest_api_image_metadata_ITEMTYPE_e;

char* image_metadata_item_type_ToString(pinterest_rest_api_image_metadata_ITEMTYPE_e item_type);

pinterest_rest_api_image_metadata_ITEMTYPE_e image_metadata_item_type_FromString(char* item_type);



typedef struct image_metadata_t {
    char *description; // string
    struct image_size_t *images; //model
    pinterest_rest_api_image_metadata_ITEMTYPE_e item_type; //enum
    char *link; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} image_metadata_t;

__attribute__((deprecated)) image_metadata_t *image_metadata_create(
    char *description,
    image_size_t *images,
    pinterest_rest_api_image_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title
);

void image_metadata_free(image_metadata_t *image_metadata);

image_metadata_t *image_metadata_parseFromJSON(cJSON *image_metadataJSON);

cJSON *image_metadata_convertToJSON(image_metadata_t *image_metadata);

#endif /* _image_metadata_H_ */

