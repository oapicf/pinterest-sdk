/*
 * catalogs_feed_create_request_schema.h
 *
 * 
 */

#ifndef _catalogs_feed_create_request_schema_H_
#define _catalogs_feed_create_request_schema_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_create_request_schema_t catalogs_feed_create_request_schema_t;

#include "catalogs_creative_assets_feeds_create_request_default_locale.h"
#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_feeds_create_request.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "catalogs_vertical_feeds_create_request.h"
#include "country.h"
#include "nullable_currency.h"
#include "product_availability_type.h"

// Enum CATALOGTYPE for catalogs_feed_create_request_schema

typedef enum  { pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e;

char* catalogs_feed_create_request_schema_catalog_type_ToString(pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalogs_feed_create_request_schema_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_feed_create_request_schema_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_feed_credentials_t *credentials; //model
    pinterest_rest_api_product_availability_type__e default_availability; //referenced enum
    pinterest_rest_api_country__e default_country; //referenced enum
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    struct catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale; //model
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    char *location; // string
    char *name; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    catalogs_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_create_request_schema_t;

__attribute__((deprecated)) catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
);

void catalogs_feed_create_request_schema_free(catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema);

catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_parseFromJSON(cJSON *catalogs_feed_create_request_schemaJSON);

cJSON *catalogs_feed_create_request_schema_convertToJSON(catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema);

#endif /* _catalogs_feed_create_request_schema_H_ */

