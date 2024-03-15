/*
 * item_processing_status.h
 *
 * The status of the item processing record
 */

#ifndef _item_processing_status_H_
#define _item_processing_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_processing_status_t item_processing_status_t;


// Enum  for item_processing_status

typedef enum { pinterest_rest_api_item_processing_status__NULL = 0, pinterest_rest_api_item_processing_status__SUCCESS, pinterest_rest_api_item_processing_status__FAILURE, pinterest_rest_api_item_processing_status__PROCESSING } pinterest_rest_api_item_processing_status__e;

char* item_processing_status_item_processing_status_ToString(pinterest_rest_api_item_processing_status__e item_processing_status);

pinterest_rest_api_item_processing_status__e item_processing_status_item_processing_status_FromString(char* item_processing_status);

//cJSON *item_processing_status_item_processing_status_convertToJSON(pinterest_rest_api_item_processing_status__e item_processing_status);

//pinterest_rest_api_item_processing_status__e item_processing_status_item_processing_status_parseFromJSON(cJSON *item_processing_statusJSON);

#endif /* _item_processing_status_H_ */

