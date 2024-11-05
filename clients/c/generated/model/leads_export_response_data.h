/*
 * leads_export_response_data.h
 *
 * 
 */

#ifndef _leads_export_response_data_H_
#define _leads_export_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_export_response_data_t leads_export_response_data_t;

#include "leads_export_status.h"

// Enum  for leads_export_response_data

typedef enum  { pinterest_rest_api_leads_export_response_data__NULL = 0, pinterest_rest_api_leads_export_response_data__IN_PROGRESS, pinterest_rest_api_leads_export_response_data__FINISHED, pinterest_rest_api_leads_export_response_data__FAILED } pinterest_rest_api_leads_export_response_data__e;

char* leads_export_response_data_export_status_ToString(pinterest_rest_api_leads_export_response_data__e export_status);

pinterest_rest_api_leads_export_response_data__e leads_export_response_data_export_status_FromString(char* export_status);



typedef struct leads_export_response_data_t {
    leads_export_status_t *export_status; // custom
    char *download_url; // string

} leads_export_response_data_t;

leads_export_response_data_t *leads_export_response_data_create(
    leads_export_status_t *export_status,
    char *download_url
);

void leads_export_response_data_free(leads_export_response_data_t *leads_export_response_data);

leads_export_response_data_t *leads_export_response_data_parseFromJSON(cJSON *leads_export_response_dataJSON);

cJSON *leads_export_response_data_convertToJSON(leads_export_response_data_t *leads_export_response_data);

#endif /* _leads_export_response_data_H_ */

