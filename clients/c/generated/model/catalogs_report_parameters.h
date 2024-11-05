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

// Enum  for catalogs_report_parameters

typedef enum  { pinterest_rest_api_catalogs_report_parameters__NULL = 0, pinterest_rest_api_catalogs_report_parameters__RETAIL, pinterest_rest_api_catalogs_report_parameters__HOTEL, pinterest_rest_api_catalogs_report_parameters__CREATIVE_ASSETS } pinterest_rest_api_catalogs_report_parameters__e;

char* catalogs_report_parameters_catalog_type_ToString(pinterest_rest_api_catalogs_report_parameters__e catalog_type);

pinterest_rest_api_catalogs_report_parameters__e catalogs_report_parameters_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_report_parameters_t {
    catalogs_type_t *catalog_type; // custom
    struct catalogs_hotel_report_parameters_report_t *report; //model

} catalogs_report_parameters_t;

catalogs_report_parameters_t *catalogs_report_parameters_create(
    catalogs_type_t *catalog_type,
    catalogs_hotel_report_parameters_report_t *report
);

void catalogs_report_parameters_free(catalogs_report_parameters_t *catalogs_report_parameters);

catalogs_report_parameters_t *catalogs_report_parameters_parseFromJSON(cJSON *catalogs_report_parametersJSON);

cJSON *catalogs_report_parameters_convertToJSON(catalogs_report_parameters_t *catalogs_report_parameters);

#endif /* _catalogs_report_parameters_H_ */

