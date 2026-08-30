/*
 * mmm_report_create.h
 *
 * Resource create operation model.
 */

#ifndef _mmm_report_create_H_
#define _mmm_report_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mmm_report_create_t mmm_report_create_t;

#include "mmm_report_granularity.h"
#include "mmm_report_level.h"
#include "mmm_reporting_column.h"
#include "mmm_reporting_targeting_type.h"
#include "targeting_advertiser_country.h"

// Enum  for mmm_report_create

typedef enum  { pinterest_rest_api_mmm_report_create__NULL = 0, pinterest_rest_api_mmm_report_create__SPEND_IN_DOLLAR, pinterest_rest_api_mmm_report_create__SPEND_IN_MICRO_DOLLAR, pinterest_rest_api_mmm_report_create__ECPC_IN_DOLLAR, pinterest_rest_api_mmm_report_create__ECTR, pinterest_rest_api_mmm_report_create__CAMPAIGN_NAME, pinterest_rest_api_mmm_report_create__TOTAL_ENGAGEMENT, pinterest_rest_api_mmm_report_create__EENGAGEMENT_RATE, pinterest_rest_api_mmm_report_create__ECPM_IN_DOLLAR, pinterest_rest_api_mmm_report_create__CAMPAIGN_ID, pinterest_rest_api_mmm_report_create__ADVERTISER_ID, pinterest_rest_api_mmm_report_create__AD_GROUP_ID, pinterest_rest_api_mmm_report_create__AD_GROUP_NAME, pinterest_rest_api_mmm_report_create__CLICKTHROUGH_1, pinterest_rest_api_mmm_report_create__IMPRESSION_1, pinterest_rest_api_mmm_report_create__CLICKTHROUGH_2, pinterest_rest_api_mmm_report_create__IMPRESSION_2, pinterest_rest_api_mmm_report_create__TOTAL_CLICKTHROUGH, pinterest_rest_api_mmm_report_create__TOTAL_IMPRESSION, pinterest_rest_api_mmm_report_create__ADVERTISER_NAME, pinterest_rest_api_mmm_report_create__SPEND_ORDER_LINE_PAID_TYPE, pinterest_rest_api_mmm_report_create__CAMPAIGN_OBJECTIVE_TYPE, pinterest_rest_api_mmm_report_create__PINNER_LIST_NAME, pinterest_rest_api_mmm_report_create__ADS_CREDIT_SPEND_IN_DOLLAR, pinterest_rest_api_mmm_report_create__ADVERTISER_PAID_SPEND_IN_DOLLAR, pinterest_rest_api_mmm_report_create__ADVERTISER_PAID_ECPC_IN_DOLLAR, pinterest_rest_api_mmm_report_create__ADVERTISER_PAID_ECPM_IN_DOLLAR } pinterest_rest_api_mmm_report_create__e;

char* mmm_report_create_columns_ToString(pinterest_rest_api_mmm_report_create__e columns);

pinterest_rest_api_mmm_report_create__e mmm_report_create_columns_FromString(char* columns);

// Enum  for mmm_report_create

typedef enum  { pinterest_rest_api_mmm_report_create__NULL = 0, pinterest_rest_api_mmm_report_create__US, pinterest_rest_api_mmm_report_create__GB, pinterest_rest_api_mmm_report_create__CA, pinterest_rest_api_mmm_report_create__IE, pinterest_rest_api_mmm_report_create__AU, pinterest_rest_api_mmm_report_create__NZ, pinterest_rest_api_mmm_report_create__FR, pinterest_rest_api_mmm_report_create__SE, pinterest_rest_api_mmm_report_create__IL, pinterest_rest_api_mmm_report_create__DE, pinterest_rest_api_mmm_report_create__AT, pinterest_rest_api_mmm_report_create__IT, pinterest_rest_api_mmm_report_create__ES, pinterest_rest_api_mmm_report_create__NL, pinterest_rest_api_mmm_report_create__BE, pinterest_rest_api_mmm_report_create__PT, pinterest_rest_api_mmm_report_create__CH, pinterest_rest_api_mmm_report_create__HK, pinterest_rest_api_mmm_report_create__JP, pinterest_rest_api_mmm_report_create__KR, pinterest_rest_api_mmm_report_create__SG, pinterest_rest_api_mmm_report_create___false, pinterest_rest_api_mmm_report_create__DK, pinterest_rest_api_mmm_report_create__FI, pinterest_rest_api_mmm_report_create__CY, pinterest_rest_api_mmm_report_create__LU, pinterest_rest_api_mmm_report_create__MT, pinterest_rest_api_mmm_report_create__PL, pinterest_rest_api_mmm_report_create__RO, pinterest_rest_api_mmm_report_create__HU, pinterest_rest_api_mmm_report_create__CZ, pinterest_rest_api_mmm_report_create__GR, pinterest_rest_api_mmm_report_create__SK, pinterest_rest_api_mmm_report_create__BR, pinterest_rest_api_mmm_report_create__MX, pinterest_rest_api_mmm_report_create__AR, pinterest_rest_api_mmm_report_create__CL, pinterest_rest_api_mmm_report_create__CO } pinterest_rest_api_mmm_report_create__e;

char* mmm_report_create_countries_ToString(pinterest_rest_api_mmm_report_create__e countries);

pinterest_rest_api_mmm_report_create__e mmm_report_create_countries_FromString(char* countries);

// Enum  for mmm_report_create

typedef enum  { pinterest_rest_api_mmm_report_create__NULL = 0, pinterest_rest_api_mmm_report_create__APPTYPE, pinterest_rest_api_mmm_report_create__COUNTRY, pinterest_rest_api_mmm_report_create__CREATIVE_TYPE, pinterest_rest_api_mmm_report_create__GENDER, pinterest_rest_api_mmm_report_create__LOCATION, pinterest_rest_api_mmm_report_create__PLACEMENT, pinterest_rest_api_mmm_report_create__AUDIENCE_INCLUDE } pinterest_rest_api_mmm_report_create__e;

char* mmm_report_create_targeting_types_ToString(pinterest_rest_api_mmm_report_create__e targeting_types);

pinterest_rest_api_mmm_report_create__e mmm_report_create_targeting_types_FromString(char* targeting_types);



typedef struct mmm_report_create_t {
    list_t *advertiser_ids; //primitive container
    list_t *columns; //nonprimitive container
    list_t *countries; //nonprimitive container
    list_t *custom_column_ids; //primitive container
    char *end_date; // string
    mmm_report_granularity_t *granularity; // custom
    mmm_report_level_t *level; // custom
    char *report_name; // string
    char *start_date; // string
    list_t *targeting_types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} mmm_report_create_t;

__attribute__((deprecated)) mmm_report_create_t *mmm_report_create_create(
    list_t *advertiser_ids,
    list_t *columns,
    list_t *countries,
    list_t *custom_column_ids,
    char *end_date,
    mmm_report_granularity_t *granularity,
    mmm_report_level_t *level,
    char *report_name,
    char *start_date,
    list_t *targeting_types
);

void mmm_report_create_free(mmm_report_create_t *mmm_report_create);

mmm_report_create_t *mmm_report_create_parseFromJSON(cJSON *mmm_report_createJSON);

cJSON *mmm_report_create_convertToJSON(mmm_report_create_t *mmm_report_create);

#endif /* _mmm_report_create_H_ */

