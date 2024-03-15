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

#include "media_upload_details.h"



typedef struct media_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} media_list_200_response_t;

media_list_200_response_t *media_list_200_response_create(
    list_t *items,
    char *bookmark
);

void media_list_200_response_free(media_list_200_response_t *media_list_200_response);

media_list_200_response_t *media_list_200_response_parseFromJSON(cJSON *media_list_200_responseJSON);

cJSON *media_list_200_response_convertToJSON(media_list_200_response_t *media_list_200_response);

#endif /* _media_list_200_response_H_ */

