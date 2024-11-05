/*
 * catalogs_create_report_response.h
 *
 * 
 */

#ifndef _catalogs_create_report_response_H_
#define _catalogs_create_report_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_create_report_response_t catalogs_create_report_response_t;




typedef struct catalogs_create_report_response_t {
    char *token; // string

} catalogs_create_report_response_t;

catalogs_create_report_response_t *catalogs_create_report_response_create(
    char *token
);

void catalogs_create_report_response_free(catalogs_create_report_response_t *catalogs_create_report_response);

catalogs_create_report_response_t *catalogs_create_report_response_parseFromJSON(cJSON *catalogs_create_report_responseJSON);

cJSON *catalogs_create_report_response_convertToJSON(catalogs_create_report_response_t *catalogs_create_report_response);

#endif /* _catalogs_create_report_response_H_ */

