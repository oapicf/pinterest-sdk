/*
 * pins_analytics_metric_types_parameter_inner.h
 *
 * 
 */

#ifndef _pins_analytics_metric_types_parameter_inner_H_
#define _pins_analytics_metric_types_parameter_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pins_analytics_metric_types_parameter_inner_t pins_analytics_metric_types_parameter_inner_t;




typedef struct pins_analytics_metric_types_parameter_inner_t {

} pins_analytics_metric_types_parameter_inner_t;

pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_create(
);

void pins_analytics_metric_types_parameter_inner_free(pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner);

pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_parseFromJSON(cJSON *pins_analytics_metric_types_parameter_innerJSON);

cJSON *pins_analytics_metric_types_parameter_inner_convertToJSON(pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner);

#endif /* _pins_analytics_metric_types_parameter_inner_H_ */

