/*
 * creative_assets_processing_record.h
 *
 * Object describing an item processing record
 */

#ifndef _creative_assets_processing_record_H_
#define _creative_assets_processing_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct creative_assets_processing_record_t creative_assets_processing_record_t;

#include "item_processing_status.h"
#include "item_validation_event.h"

// Enum  for creative_assets_processing_record

typedef enum  { pinterest_rest_api_creative_assets_processing_record__NULL = 0, pinterest_rest_api_creative_assets_processing_record__SUCCESS, pinterest_rest_api_creative_assets_processing_record__FAILURE, pinterest_rest_api_creative_assets_processing_record__PROCESSING } pinterest_rest_api_creative_assets_processing_record__e;

char* creative_assets_processing_record_status_ToString(pinterest_rest_api_creative_assets_processing_record__e status);

pinterest_rest_api_creative_assets_processing_record__e creative_assets_processing_record_status_FromString(char* status);



typedef struct creative_assets_processing_record_t {
    char *creative_assets_id; // string
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container
    item_processing_status_t *status; // custom

} creative_assets_processing_record_t;

creative_assets_processing_record_t *creative_assets_processing_record_create(
    char *creative_assets_id,
    list_t *errors,
    list_t *warnings,
    item_processing_status_t *status
);

void creative_assets_processing_record_free(creative_assets_processing_record_t *creative_assets_processing_record);

creative_assets_processing_record_t *creative_assets_processing_record_parseFromJSON(cJSON *creative_assets_processing_recordJSON);

cJSON *creative_assets_processing_record_convertToJSON(creative_assets_processing_record_t *creative_assets_processing_record);

#endif /* _creative_assets_processing_record_H_ */

