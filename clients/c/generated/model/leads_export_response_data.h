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



typedef struct leads_export_response_data_t {
    pinterest_rest_api_leads_export_status__e export_status; //referenced enum
    char *download_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} leads_export_response_data_t;

__attribute__((deprecated)) leads_export_response_data_t *leads_export_response_data_create(
    pinterest_rest_api_leads_export_status__e export_status,
    char *download_url
);

void leads_export_response_data_free(leads_export_response_data_t *leads_export_response_data);

leads_export_response_data_t *leads_export_response_data_parseFromJSON(cJSON *leads_export_response_dataJSON);

cJSON *leads_export_response_data_convertToJSON(leads_export_response_data_t *leads_export_response_data);

#endif /* _leads_export_response_data_H_ */

