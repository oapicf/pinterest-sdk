/*
 * media_list_200_response.h
 *
 * 
 */

#ifndef _media_list_200_response_H_
#define _media_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_list_200_response_t media_list_200_response_t;

#include "media.h"



typedef struct media_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} media_list_200_response_t;

__attribute__((deprecated)) media_list_200_response_t *media_list_200_response_create(
    char *bookmark,
    list_t *items
);

void media_list_200_response_free(media_list_200_response_t *media_list_200_response);

media_list_200_response_t *media_list_200_response_parseFromJSON(cJSON *media_list_200_responseJSON);

cJSON *media_list_200_response_convertToJSON(media_list_200_response_t *media_list_200_response);

#endif /* _media_list_200_response_H_ */

