/*
 * catalogs_report_parameters.h
 *
 * Report parameters
 */

#ifndef _catalogs_report_parameters_H_
#define _catalogs_report_parameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_parameters_t catalogs_report_parameters_t;

#include "catalogs_hotel_report_parameters.h"
#include "catalogs_hotel_report_parameters_report.h"
#include "catalogs_retail_report_parameters.h"
#include "catalogs_type.h"



typedef struct catalogs_report_parameters_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_hotel_report_parameters_report_t *report; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_report_parameters_t;

__attribute__((deprecated)) catalogs_report_parameters_t *catalogs_report_parameters_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_hotel_report_parameters_report_t *report
);

void catalogs_report_parameters_free(catalogs_report_parameters_t *catalogs_report_parameters);

catalogs_report_parameters_t *catalogs_report_parameters_parseFromJSON(cJSON *catalogs_report_parametersJSON);

cJSON *catalogs_report_parameters_convertToJSON(catalogs_report_parameters_t *catalogs_report_parameters);

#endif /* _catalogs_report_parameters_H_ */

