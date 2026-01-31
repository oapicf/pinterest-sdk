/*
 * reports_stats_parameters_parameter.h
 *
 * Report stats parameters
 */

#ifndef _reports_stats_parameters_parameter_H_
#define _reports_stats_parameters_parameter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct reports_stats_parameters_parameter_t reports_stats_parameters_parameter_t;

#include "catalogs_hotel_report_stats_parameters.h"
#include "catalogs_hotel_report_stats_parameters_report.h"
#include "catalogs_retail_report_stats_parameters.h"
#include "catalogs_type.h"



typedef struct reports_stats_parameters_parameter_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_hotel_report_stats_parameters_report_t *report; //model

    int _library_owned; // Is the library responsible for freeing this object?
} reports_stats_parameters_parameter_t;

__attribute__((deprecated)) reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_hotel_report_stats_parameters_report_t *report
);

void reports_stats_parameters_parameter_free(reports_stats_parameters_parameter_t *reports_stats_parameters_parameter);

reports_stats_parameters_parameter_t *reports_stats_parameters_parameter_parseFromJSON(cJSON *reports_stats_parameters_parameterJSON);

cJSON *reports_stats_parameters_parameter_convertToJSON(reports_stats_parameters_parameter_t *reports_stats_parameters_parameter);

#endif /* _reports_stats_parameters_parameter_H_ */

