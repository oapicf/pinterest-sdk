/*
 * ad_array_response_element.h
 *
 * 
 */

#ifndef _ad_array_response_element_H_
#define _ad_array_response_element_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_array_response_element_t ad_array_response_element_t;

#include "ad_response.h"
#include "exception.h"



typedef struct ad_array_response_element_t {
    struct ad_response_t *data; //model
    struct exception_t *exceptions; //model

} ad_array_response_element_t;

ad_array_response_element_t *ad_array_response_element_create(
    ad_response_t *data,
    exception_t *exceptions
);

void ad_array_response_element_free(ad_array_response_element_t *ad_array_response_element);

ad_array_response_element_t *ad_array_response_element_parseFromJSON(cJSON *ad_array_response_elementJSON);

cJSON *ad_array_response_element_convertToJSON(ad_array_response_element_t *ad_array_response_element);

#endif /* _ad_array_response_element_H_ */

