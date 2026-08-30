/*
 * conversion_product_report_level.h
 *
 * Level of the report
 */

#ifndef _conversion_product_report_level_H_
#define _conversion_product_report_level_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_product_report_level_t conversion_product_report_level_t;


// Enum  for conversion_product_report_level

typedef enum { pinterest_rest_api_conversion_product_report_level__NULL = 0, pinterest_rest_api_conversion_product_report_level__ADVERTISER, pinterest_rest_api_conversion_product_report_level__CAMPAIGN, pinterest_rest_api_conversion_product_report_level__AD_GROUP } pinterest_rest_api_conversion_product_report_level__e;

char* conversion_product_report_level_conversion_product_report_level_ToString(pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level);

pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level_conversion_product_report_level_FromString(char* conversion_product_report_level);

cJSON *conversion_product_report_level_convertToJSON(pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level);

pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level_parseFromJSON(cJSON *conversion_product_report_levelJSON);

#endif /* _conversion_product_report_level_H_ */

