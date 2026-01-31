/*
 * video_metadata_with_item_type.h
 *
 * 
 */

#ifndef _video_metadata_with_item_type_H_
#define _video_metadata_with_item_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct video_metadata_with_item_type_t video_metadata_with_item_type_t;




typedef struct video_metadata_with_item_type_t {
    char *cover_image_url; // string
    double duration; //numeric
    int height; //numeric
    char *item_type; // string
    char *video_url; // string
    int width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} video_metadata_with_item_type_t;

__attribute__((deprecated)) video_metadata_with_item_type_t *video_metadata_with_item_type_create(
    char *cover_image_url,
    double duration,
    int height,
    char *item_type,
    char *video_url,
    int width
);

void video_metadata_with_item_type_free(video_metadata_with_item_type_t *video_metadata_with_item_type);

video_metadata_with_item_type_t *video_metadata_with_item_type_parseFromJSON(cJSON *video_metadata_with_item_typeJSON);

cJSON *video_metadata_with_item_type_convertToJSON(video_metadata_with_item_type_t *video_metadata_with_item_type);

#endif /* _video_metadata_with_item_type_H_ */

