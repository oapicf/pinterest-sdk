/*
 * lead_form_status.h
 *
 * Status of the lead form
 */

#ifndef _lead_form_status_H_
#define _lead_form_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_status_t lead_form_status_t;


// Enum  for lead_form_status

typedef enum { pinterest_rest_api_lead_form_status__NULL = 0, pinterest_rest_api_lead_form_status__DRAFT, pinterest_rest_api_lead_form_status__ACTIVE } pinterest_rest_api_lead_form_status__e;

char* lead_form_status_lead_form_status_ToString(pinterest_rest_api_lead_form_status__e lead_form_status);

pinterest_rest_api_lead_form_status__e lead_form_status_lead_form_status_FromString(char* lead_form_status);

//cJSON *lead_form_status_lead_form_status_convertToJSON(pinterest_rest_api_lead_form_status__e lead_form_status);

//pinterest_rest_api_lead_form_status__e lead_form_status_lead_form_status_parseFromJSON(cJSON *lead_form_statusJSON);

#endif /* _lead_form_status_H_ */

