/*
 * conversion_tag_list_response.h
 *
 * 
 */

#ifndef _conversion_tag_list_response_H_
#define _conversion_tag_list_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_list_response_t conversion_tag_list_response_t;

#include "conversion_tag_response.h"



typedef struct conversion_tag_list_response_t {
    list_t *items; //nonprimitive container

} conversion_tag_list_response_t;

conversion_tag_list_response_t *conversion_tag_list_response_create(
    list_t *items
);

void conversion_tag_list_response_free(conversion_tag_list_response_t *conversion_tag_list_response);

conversion_tag_list_response_t *conversion_tag_list_response_parseFromJSON(cJSON *conversion_tag_list_responseJSON);

cJSON *conversion_tag_list_response_convertToJSON(conversion_tag_list_response_t *conversion_tag_list_response);

#endif /* _conversion_tag_list_response_H_ */

