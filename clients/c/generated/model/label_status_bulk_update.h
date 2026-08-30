/*
 * label_status_bulk_update.h
 *
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 */

#ifndef _label_status_bulk_update_H_
#define _label_status_bulk_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_status_bulk_update_t label_status_bulk_update_t;


// Enum  for label_status_bulk_update

typedef enum { pinterest_rest_api_label_status_bulk_update__NULL = 0, pinterest_rest_api_label_status_bulk_update__ARCHIVED } pinterest_rest_api_label_status_bulk_update__e;

char* label_status_bulk_update_label_status_bulk_update_ToString(pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update);

pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update_label_status_bulk_update_FromString(char* label_status_bulk_update);

cJSON *label_status_bulk_update_convertToJSON(pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update);

pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update_parseFromJSON(cJSON *label_status_bulk_updateJSON);

#endif /* _label_status_bulk_update_H_ */

