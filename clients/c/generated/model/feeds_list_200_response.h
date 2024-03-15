/*
 * feeds_list_200_response.h
 *
 * 
 */

#ifndef _feeds_list_200_response_H_
#define _feeds_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feeds_list_200_response_t feeds_list_200_response_t;

#include "catalogs_feed.h"



typedef struct feeds_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} feeds_list_200_response_t;

feeds_list_200_response_t *feeds_list_200_response_create(
    list_t *items,
    char *bookmark
);

void feeds_list_200_response_free(feeds_list_200_response_t *feeds_list_200_response);

feeds_list_200_response_t *feeds_list_200_response_parseFromJSON(cJSON *feeds_list_200_responseJSON);

cJSON *feeds_list_200_response_convertToJSON(feeds_list_200_response_t *feeds_list_200_response);

#endif /* _feeds_list_200_response_H_ */

