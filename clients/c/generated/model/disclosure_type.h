/*
 * disclosure_type.h
 *
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */

#ifndef _disclosure_type_H_
#define _disclosure_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct disclosure_type_t disclosure_type_t;


// Enum  for disclosure_type

typedef enum { pinterest_rest_api_disclosure_type__NULL = 0, pinterest_rest_api_disclosure_type__NO_DISCLOSURE, pinterest_rest_api_disclosure_type__PRESCRIBING_INFORMATION, pinterest_rest_api_disclosure_type__PRESCRIBING_INFORMATION_BOX_WARNING, pinterest_rest_api_disclosure_type__IMPORTANT_SAFETY_INFO, pinterest_rest_api_disclosure_type__MED_GUIDE, pinterest_rest_api_disclosure_type__PATIENT_INFORMATION } pinterest_rest_api_disclosure_type__e;

char* disclosure_type_disclosure_type_ToString(pinterest_rest_api_disclosure_type__e disclosure_type);

pinterest_rest_api_disclosure_type__e disclosure_type_disclosure_type_FromString(char* disclosure_type);

cJSON *disclosure_type_convertToJSON(pinterest_rest_api_disclosure_type__e disclosure_type);

pinterest_rest_api_disclosure_type__e disclosure_type_parseFromJSON(cJSON *disclosure_typeJSON);

#endif /* _disclosure_type_H_ */

