/*
 * catalogs_hotel_feeds_update_request.h
 *
 * Request object for updating a feed.
 */

#ifndef _catalogs_hotel_feeds_update_request_H_
#define _catalogs_hotel_feeds_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_feeds_update_request_t catalogs_hotel_feeds_update_request_t;

#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "catalogs_type.h"
#include "nullable_currency.h"



typedef struct catalogs_hotel_feeds_update_request_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_feed_credentials_t *credentials; //model
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    char *location; // string
    char *name; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    pinterest_rest_api_catalogs_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_feeds_update_request_t;

__attribute__((deprecated)) catalogs_hotel_feeds_update_request_t *catalogs_hotel_feeds_update_request_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_nullable_currency__e default_currency,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status
);

void catalogs_hotel_feeds_update_request_free(catalogs_hotel_feeds_update_request_t *catalogs_hotel_feeds_update_request);

catalogs_hotel_feeds_update_request_t *catalogs_hotel_feeds_update_request_parseFromJSON(cJSON *catalogs_hotel_feeds_update_requestJSON);

cJSON *catalogs_hotel_feeds_update_request_convertToJSON(catalogs_hotel_feeds_update_request_t *catalogs_hotel_feeds_update_request);

#endif /* _catalogs_hotel_feeds_update_request_H_ */

