/*
 * catalogs_hotel_feeds_create_request.h
 *
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */

#ifndef _catalogs_hotel_feeds_create_request_H_
#define _catalogs_hotel_feeds_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_feeds_create_request_t catalogs_hotel_feeds_create_request_t;

#include "catalogs_creative_assets_feeds_create_request_default_locale.h"
#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "nullable_currency.h"

// Enum CATALOGTYPE for catalogs_hotel_feeds_create_request

typedef enum  { pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_e;

char* catalogs_hotel_feeds_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_e catalogs_hotel_feeds_create_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_feeds_create_request_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_feed_credentials_t *credentials; //model
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    struct catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale; //model
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    char *location; // string
    char *name; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    catalogs_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_feeds_create_request_t;

__attribute__((deprecated)) catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_feeds_create_request_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
);

void catalogs_hotel_feeds_create_request_free(catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request);

catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_parseFromJSON(cJSON *catalogs_hotel_feeds_create_requestJSON);

cJSON *catalogs_hotel_feeds_create_request_convertToJSON(catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request);

#endif /* _catalogs_hotel_feeds_create_request_H_ */

