/*
 * ai_disclosures.h
 *
 * AI disclosure declarations the creator has made about the Pin.
 */

#ifndef _ai_disclosures_H_
#define _ai_disclosures_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ai_disclosures_t ai_disclosures_t;

#include "ai_disclosure_item.h"

// Enum  for ai_disclosures

typedef enum  { pinterest_rest_api_ai_disclosures__NULL = 0, pinterest_rest_api_ai_disclosures__AI_MODIFIED, pinterest_rest_api_ai_disclosures__SYNTHETIC_PERFORMER } pinterest_rest_api_ai_disclosures__e;

char* ai_disclosures_values_ToString(pinterest_rest_api_ai_disclosures__e values);

pinterest_rest_api_ai_disclosures__e ai_disclosures_values_FromString(char* values);



typedef struct ai_disclosures_t {
    list_t *values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ai_disclosures_t;

__attribute__((deprecated)) ai_disclosures_t *ai_disclosures_create(
    list_t *values
);

void ai_disclosures_free(ai_disclosures_t *ai_disclosures);

ai_disclosures_t *ai_disclosures_parseFromJSON(cJSON *ai_disclosuresJSON);

cJSON *ai_disclosures_convertToJSON(ai_disclosures_t *ai_disclosures);

#endif /* _ai_disclosures_H_ */

