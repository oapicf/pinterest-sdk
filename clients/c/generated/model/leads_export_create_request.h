/*
 * leads_export_create_request.h
 *
 * 
 */

#ifndef _leads_export_create_request_H_
#define _leads_export_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_export_create_request_t leads_export_create_request_t;




typedef struct leads_export_create_request_t {
    char *start_date; // string
    char *end_date; // string
    char *ad_id; // string

} leads_export_create_request_t;

leads_export_create_request_t *leads_export_create_request_create(
    char *start_date,
    char *end_date,
    char *ad_id
);

void leads_export_create_request_free(leads_export_create_request_t *leads_export_create_request);

leads_export_create_request_t *leads_export_create_request_parseFromJSON(cJSON *leads_export_create_requestJSON);

cJSON *leads_export_create_request_convertToJSON(leads_export_create_request_t *leads_export_create_request);

#endif /* _leads_export_create_request_H_ */

