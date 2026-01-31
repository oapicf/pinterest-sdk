/*
 * feeds_create_request.h
 *
 * 
 */

#ifndef _feeds_create_request_H_
#define _feeds_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feeds_create_request_t feeds_create_request_t;

#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_feeds_create_request.h"
#include "catalogs_feeds_create_request_default_locale.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "catalogs_type.h"
#include "catalogs_vertical_feeds_create_request.h"
#include "country.h"
#include "nullable_currency.h"
#include "product_availability_type.h"



typedef struct feeds_create_request_t {
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    char *name; // string
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    struct catalogs_feeds_create_request_default_locale_t *default_locale; //model
    struct catalogs_feed_credentials_t *credentials; //model
    char *location; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    pinterest_rest_api_country__e default_country; //referenced enum
    pinterest_rest_api_product_availability_type__e default_availability; //referenced enum
    catalogs_status_t *status; // custom
    char *catalog_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} feeds_create_request_t;

__attribute__((deprecated)) feeds_create_request_t *feeds_create_request_create(
    pinterest_rest_api_nullable_currency__e default_currency,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_type__e catalog_type,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_product_availability_type__e default_availability,
    catalogs_status_t *status,
    char *catalog_id
);

void feeds_create_request_free(feeds_create_request_t *feeds_create_request);

feeds_create_request_t *feeds_create_request_parseFromJSON(cJSON *feeds_create_requestJSON);

cJSON *feeds_create_request_convertToJSON(feeds_create_request_t *feeds_create_request);

#endif /* _feeds_create_request_H_ */

