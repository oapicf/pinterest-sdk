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



typedef struct creative_assets_processing_record_t {
    char *creative_assets_id; // string
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container
    pinterest_rest_api_item_processing_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} creative_assets_processing_record_t;

__attribute__((deprecated)) creative_assets_processing_record_t *creative_assets_processing_record_create(
    char *creative_assets_id,
    list_t *errors,
    list_t *warnings,
    pinterest_rest_api_item_processing_status__e status
);

void creative_assets_processing_record_free(creative_assets_processing_record_t *creative_assets_processing_record);

creative_assets_processing_record_t *creative_assets_processing_record_parseFromJSON(cJSON *creative_assets_processing_recordJSON);

cJSON *creative_assets_processing_record_convertToJSON(creative_assets_processing_record_t *creative_assets_processing_record);

#endif /* _creative_assets_processing_record_H_ */

