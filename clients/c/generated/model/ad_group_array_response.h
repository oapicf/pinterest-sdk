/*
 * ad_group_array_response.h
 *
 * 
 */

#ifndef _ad_group_array_response_H_
#define _ad_group_array_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_array_response_t ad_group_array_response_t;

#include "ad_group_array_response_element.h"



typedef struct ad_group_array_response_t {
    list_t *items; //nonprimitive container

} ad_group_array_response_t;

ad_group_array_response_t *ad_group_array_response_create(
    list_t *items
);

void ad_group_array_response_free(ad_group_array_response_t *ad_group_array_response);

ad_group_array_response_t *ad_group_array_response_parseFromJSON(cJSON *ad_group_array_responseJSON);

cJSON *ad_group_array_response_convertToJSON(ad_group_array_response_t *ad_group_array_response);

#endif /* _ad_group_array_response_H_ */

