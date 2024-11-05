/*
 * leads_export_status.h
 *
 * Status of a leads export job
 */

#ifndef _leads_export_status_H_
#define _leads_export_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_export_status_t leads_export_status_t;


// Enum  for leads_export_status

typedef enum { pinterest_rest_api_leads_export_status__NULL = 0, pinterest_rest_api_leads_export_status__IN_PROGRESS, pinterest_rest_api_leads_export_status__FINISHED, pinterest_rest_api_leads_export_status__FAILED } pinterest_rest_api_leads_export_status__e;

char* leads_export_status_leads_export_status_ToString(pinterest_rest_api_leads_export_status__e leads_export_status);

pinterest_rest_api_leads_export_status__e leads_export_status_leads_export_status_FromString(char* leads_export_status);

//cJSON *leads_export_status_leads_export_status_convertToJSON(pinterest_rest_api_leads_export_status__e leads_export_status);

//pinterest_rest_api_leads_export_status__e leads_export_status_leads_export_status_parseFromJSON(cJSON *leads_export_statusJSON);

#endif /* _leads_export_status_H_ */

