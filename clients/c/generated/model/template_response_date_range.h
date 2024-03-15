/*
 * template_response_date_range.h
 *
 * 
 */

#ifndef _template_response_date_range_H_
#define _template_response_date_range_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct template_response_date_range_t template_response_date_range_t;

#include "template_response_date_range_absolute_date_range.h"
#include "template_response_date_range_dynamic_date_range.h"
#include "template_response_date_range_relative_date_range.h"



typedef struct template_response_date_range_t {
    struct template_response_date_range_dynamic_date_range_t *dynamic_date_range; //model
    struct template_response_date_range_relative_date_range_t *relative_date_range; //model
    struct template_response_date_range_absolute_date_range_t *absolute_date_range; //model

} template_response_date_range_t;

template_response_date_range_t *template_response_date_range_create(
    template_response_date_range_dynamic_date_range_t *dynamic_date_range,
    template_response_date_range_relative_date_range_t *relative_date_range,
    template_response_date_range_absolute_date_range_t *absolute_date_range
);

void template_response_date_range_free(template_response_date_range_t *template_response_date_range);

template_response_date_range_t *template_response_date_range_parseFromJSON(cJSON *template_response_date_rangeJSON);

cJSON *template_response_date_range_convertToJSON(template_response_date_range_t *template_response_date_range);

#endif /* _template_response_date_range_H_ */

