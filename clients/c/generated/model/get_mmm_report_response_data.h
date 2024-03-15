/*
 * get_mmm_report_response_data.h
 *
 * 
 */

#ifndef _get_mmm_report_response_data_H_
#define _get_mmm_report_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_mmm_report_response_data_t get_mmm_report_response_data_t;


// Enum REPORTSTATUS for get_mmm_report_response_data

typedef enum  { pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_NULL = 0, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_DOES_NOT_EXIST, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_FINISHED, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_IN_PROGRESS, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_EXPIRED, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_FAILED, pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_CANCELLED } pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e;

char* get_mmm_report_response_data_report_status_ToString(pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_status);

pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e get_mmm_report_response_data_report_status_FromString(char* report_status);



typedef struct get_mmm_report_response_data_t {
    pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_status; //enum
    char *url; // string
    double size; //numeric

} get_mmm_report_response_data_t;

get_mmm_report_response_data_t *get_mmm_report_response_data_create(
    pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_status,
    char *url,
    double size
);

void get_mmm_report_response_data_free(get_mmm_report_response_data_t *get_mmm_report_response_data);

get_mmm_report_response_data_t *get_mmm_report_response_data_parseFromJSON(cJSON *get_mmm_report_response_dataJSON);

cJSON *get_mmm_report_response_data_convertToJSON(get_mmm_report_response_data_t *get_mmm_report_response_data);

#endif /* _get_mmm_report_response_data_H_ */

