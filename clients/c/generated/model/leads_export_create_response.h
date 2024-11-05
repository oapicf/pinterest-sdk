/*
 * leads_export_create_response.h
 *
 * 
 */

#ifndef _leads_export_create_response_H_
#define _leads_export_create_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_export_create_response_t leads_export_create_response_t;




typedef struct leads_export_create_response_t {
    char *leads_export_id; // string

} leads_export_create_response_t;

leads_export_create_response_t *leads_export_create_response_create(
    char *leads_export_id
);

void leads_export_create_response_free(leads_export_create_response_t *leads_export_create_response);

leads_export_create_response_t *leads_export_create_response_parseFromJSON(cJSON *leads_export_create_responseJSON);

cJSON *leads_export_create_response_convertToJSON(leads_export_create_response_t *leads_export_create_response);

#endif /* _leads_export_create_response_H_ */

