/*
 * video_metadata.h
 *
 * 
 */

#ifndef _video_metadata_H_
#define _video_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct video_metadata_t video_metadata_t;




typedef struct video_metadata_t {
    char *item_type; // string
    char *cover_image_url; // string
    char *video_url; // string
    double duration; //numeric
    int height; //numeric
    int width; //numeric

} video_metadata_t;

video_metadata_t *video_metadata_create(
    char *item_type,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
);

void video_metadata_free(video_metadata_t *video_metadata);

video_metadata_t *video_metadata_parseFromJSON(cJSON *video_metadataJSON);

cJSON *video_metadata_convertToJSON(video_metadata_t *video_metadata);

#endif /* _video_metadata_H_ */

