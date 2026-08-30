/*
 * ai_disclosure_item.h
 *
 * AI disclosure declaration the creator has made about the Pin.
 */

#ifndef _ai_disclosure_item_H_
#define _ai_disclosure_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ai_disclosure_item_t ai_disclosure_item_t;


// Enum  for ai_disclosure_item

typedef enum { pinterest_rest_api_ai_disclosure_item__NULL = 0, pinterest_rest_api_ai_disclosure_item__AI_MODIFIED, pinterest_rest_api_ai_disclosure_item__SYNTHETIC_PERFORMER } pinterest_rest_api_ai_disclosure_item__e;

char* ai_disclosure_item_ai_disclosure_item_ToString(pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item);

pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item_ai_disclosure_item_FromString(char* ai_disclosure_item);

cJSON *ai_disclosure_item_convertToJSON(pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item);

pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item_parseFromJSON(cJSON *ai_disclosure_itemJSON);

#endif /* _ai_disclosure_item_H_ */

