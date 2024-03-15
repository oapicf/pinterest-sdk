/*
 * ad_group_array_response_element.h
 *
 * 
 */

#ifndef _ad_group_array_response_element_H_
#define _ad_group_array_response_element_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_array_response_element_t ad_group_array_response_element_t;

#include "ad_group_response.h"
#include "exception.h"



typedef struct ad_group_array_response_element_t {
    struct ad_group_response_t *data; //model
    list_t *exceptions; //nonprimitive container

} ad_group_array_response_element_t;

ad_group_array_response_element_t *ad_group_array_response_element_create(
    ad_group_response_t *data,
    list_t *exceptions
);

void ad_group_array_response_element_free(ad_group_array_response_element_t *ad_group_array_response_element);

ad_group_array_response_element_t *ad_group_array_response_element_parseFromJSON(cJSON *ad_group_array_response_elementJSON);

cJSON *ad_group_array_response_element_convertToJSON(ad_group_array_response_element_t *ad_group_array_response_element);

#endif /* _ad_group_array_response_element_H_ */

