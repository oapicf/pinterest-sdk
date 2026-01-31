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



typedef struct image_metadata_t {
    char *description; // string
    struct image_size_t *images; //model
    char *item_type; // string
    char *link; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} image_metadata_t;

__attribute__((deprecated)) image_metadata_t *image_metadata_create(
    char *description,
    image_size_t *images,
    char *item_type,
    char *link,
    char *title
);

void image_metadata_free(image_metadata_t *image_metadata);

image_metadata_t *image_metadata_parseFromJSON(cJSON *image_metadataJSON);

cJSON *image_metadata_convertToJSON(image_metadata_t *image_metadata);

#endif /* _image_metadata_H_ */

