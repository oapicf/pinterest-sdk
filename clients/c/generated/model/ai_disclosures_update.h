/*
 * ai_disclosures_update.h
 *
 * AI disclosure declarations the creator has made about the Pin.
 */

#ifndef _ai_disclosures_update_H_
#define _ai_disclosures_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ai_disclosures_update_t ai_disclosures_update_t;

#include "ai_disclosure_item.h"

// Enum  for ai_disclosures_update

typedef enum  { pinterest_rest_api_ai_disclosures_update__NULL = 0, pinterest_rest_api_ai_disclosures_update__AI_MODIFIED, pinterest_rest_api_ai_disclosures_update__SYNTHETIC_PERFORMER } pinterest_rest_api_ai_disclosures_update__e;

char* ai_disclosures_update_values_ToString(pinterest_rest_api_ai_disclosures_update__e values);

pinterest_rest_api_ai_disclosures_update__e ai_disclosures_update_values_FromString(char* values);



typedef struct ai_disclosures_update_t {
    list_t *values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ai_disclosures_update_t;

__attribute__((deprecated)) ai_disclosures_update_t *ai_disclosures_update_create(
    list_t *values
);

void ai_disclosures_update_free(ai_disclosures_update_t *ai_disclosures_update);

ai_disclosures_update_t *ai_disclosures_update_parseFromJSON(cJSON *ai_disclosures_updateJSON);

cJSON *ai_disclosures_update_convertToJSON(ai_disclosures_update_t *ai_disclosures_update);

#endif /* _ai_disclosures_update_H_ */

