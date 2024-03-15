/*
 * template_response_date_range_relative_date_range.h
 *
 * The relative date range of the template
 */

#ifndef _template_response_date_range_relative_date_range_H_
#define _template_response_date_range_relative_date_range_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct template_response_date_range_relative_date_range_t template_response_date_range_relative_date_range_t;




typedef struct template_response_date_range_relative_date_range_t {
    char *type; // string
    double start_days_in_past; //numeric
    double end_days_in_past; //numeric

} template_response_date_range_relative_date_range_t;

template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_create(
    char *type,
    double start_days_in_past,
    double end_days_in_past
);

void template_response_date_range_relative_date_range_free(template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range);

template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_parseFromJSON(cJSON *template_response_date_range_relative_date_rangeJSON);

cJSON *template_response_date_range_relative_date_range_convertToJSON(template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range);

#endif /* _template_response_date_range_relative_date_range_H_ */

