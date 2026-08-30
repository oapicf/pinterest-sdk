/*
 * advanced_auction_items_submit_delete_record.h
 *
 * Object describing an item bid option deletion operation
 */

#ifndef _advanced_auction_items_submit_delete_record_H_
#define _advanced_auction_items_submit_delete_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_submit_delete_record_t advanced_auction_items_submit_delete_record_t;

#include "advanced_auction_operation_error.h"
#include "country.h"
#include "language.h"

// Enum OPERATION for advanced_auction_items_submit_delete_record

typedef enum  { pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_NULL = 0, pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION__DELETE } pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_e;

char* advanced_auction_items_submit_delete_record_operation_ToString(pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_e operation);

pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_e advanced_auction_items_submit_delete_record_operation_FromString(char* operation);



typedef struct advanced_auction_items_submit_delete_record_t {
    pinterest_rest_api_country__e country; //referenced enum
    list_t *errors; //nonprimitive container
    char *item_id; // string
    pinterest_rest_api_language__e language; //referenced enum
    pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_e operation; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_items_submit_delete_record_t;

__attribute__((deprecated)) advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_create(
    pinterest_rest_api_country__e country,
    list_t *errors,
    char *item_id,
    pinterest_rest_api_language__e language,
    pinterest_rest_api_advanced_auction_items_submit_delete_record_OPERATION_e operation
);

void advanced_auction_items_submit_delete_record_free(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record);

advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_parseFromJSON(cJSON *advanced_auction_items_submit_delete_recordJSON);

cJSON *advanced_auction_items_submit_delete_record_convertToJSON(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record);

#endif /* _advanced_auction_items_submit_delete_record_H_ */

