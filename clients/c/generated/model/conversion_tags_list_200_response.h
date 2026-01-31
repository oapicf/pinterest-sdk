/*
 * conversion_tags_list_200_response.h
 *
 * 
 */

#ifndef _conversion_tags_list_200_response_H_
#define _conversion_tags_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tags_list_200_response_t conversion_tags_list_200_response_t;

#include "conversion_tag.h"



typedef struct conversion_tags_list_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_tags_list_200_response_t;

__attribute__((deprecated)) conversion_tags_list_200_response_t *conversion_tags_list_200_response_create(
    list_t *items
);

void conversion_tags_list_200_response_free(conversion_tags_list_200_response_t *conversion_tags_list_200_response);

conversion_tags_list_200_response_t *conversion_tags_list_200_response_parseFromJSON(cJSON *conversion_tags_list_200_responseJSON);

cJSON *conversion_tags_list_200_response_convertToJSON(conversion_tags_list_200_response_t *conversion_tags_list_200_response);

#endif /* _conversion_tags_list_200_response_H_ */

