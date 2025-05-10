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

#include "image_metadata_images.h"



typedef struct image_metadata_t {
    char *item_type; // string
    char *title; // string
    char *description; // string
    char *link; // string
    struct image_metadata_images_t *images; //model

    int _library_owned; // Is the library responsible for freeing this object?
} image_metadata_t;

__attribute__((deprecated)) image_metadata_t *image_metadata_create(
    char *item_type,
    char *title,
    char *description,
    char *link,
    image_metadata_images_t *images
);

void image_metadata_free(image_metadata_t *image_metadata);

image_metadata_t *image_metadata_parseFromJSON(cJSON *image_metadataJSON);

cJSON *image_metadata_convertToJSON(image_metadata_t *image_metadata);

#endif /* _image_metadata_H_ */

