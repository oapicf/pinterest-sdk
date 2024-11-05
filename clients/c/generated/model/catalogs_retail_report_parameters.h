/*
 * catalogs_retail_report_parameters.h
 *
 * Parameters for retail report
 */

#ifndef _catalogs_retail_report_parameters_H_
#define _catalogs_retail_report_parameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_report_parameters_t catalogs_retail_report_parameters_t;

#include "catalogs_hotel_report_parameters_report.h"

// Enum CATALOGTYPE for catalogs_retail_report_parameters

typedef enum  { pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_e;

char* catalogs_retail_report_parameters_catalog_type_ToString(pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_e catalogs_retail_report_parameters_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_report_parameters_t {
    pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_hotel_report_parameters_report_t *report; //model

} catalogs_retail_report_parameters_t;

catalogs_retail_report_parameters_t *catalogs_retail_report_parameters_create(
    pinterest_rest_api_catalogs_retail_report_parameters_CATALOGTYPE_e catalog_type,
    catalogs_hotel_report_parameters_report_t *report
);

void catalogs_retail_report_parameters_free(catalogs_retail_report_parameters_t *catalogs_retail_report_parameters);

catalogs_retail_report_parameters_t *catalogs_retail_report_parameters_parseFromJSON(cJSON *catalogs_retail_report_parametersJSON);

cJSON *catalogs_retail_report_parameters_convertToJSON(catalogs_retail_report_parameters_t *catalogs_retail_report_parameters);

#endif /* _catalogs_retail_report_parameters_H_ */

