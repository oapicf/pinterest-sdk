/*
 * board_media.h
 *
 * Board media.
 */

#ifndef _board_media_H_
#define _board_media_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_media_t board_media_t;




typedef struct board_media_t {
    char *image_cover_url; // string
    list_t *pin_thumbnail_urls; //primitive container

} board_media_t;

board_media_t *board_media_create(
    char *image_cover_url,
    list_t *pin_thumbnail_urls
);

void board_media_free(board_media_t *board_media);

board_media_t *board_media_parseFromJSON(cJSON *board_mediaJSON);

cJSON *board_media_convertToJSON(board_media_t *board_media);

#endif /* _board_media_H_ */

