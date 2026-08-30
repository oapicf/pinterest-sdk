/*
 * catalogs_feed.h
 *
 * Catalogs Feed object
 */

#ifndef _catalogs_feed_H_
#define _catalogs_feed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_t catalogs_feed_t;

#include "catalogs_creative_assets_feed.h"
#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_format.h"
#include "catalogs_hotel_feed.h"
#include "catalogs_retail_feed.h"
#include "catalogs_status.h"
#include "country.h"
#include "nullable_currency.h"
#include "product_availability_type.h"

// Enum CATALOGTYPE for catalogs_feed

typedef enum  { pinterest_rest_api_catalogs_feed_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_feed_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_feed_CATALOGTYPE_e;

char* catalogs_feed_catalog_type_ToString(pinterest_rest_api_catalogs_feed_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_feed_CATALOGTYPE_e catalogs_feed_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_feed_t {
    pinterest_rest_api_catalogs_feed_CATALOGTYPE_e catalog_type; //enum
    char *created_at; //date time
    struct catalogs_feed_credentials_t *credentials; //model
    pinterest_rest_api_product_availability_type__e default_availability; //referenced enum
    pinterest_rest_api_country__e default_country; //referenced enum
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    char *default_locale; // string
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    char *id; // string
    char *location; // string
    char *name; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    pinterest_rest_api_catalogs_status__e status; //referenced enum
    char *updated_at; //date time
    char *catalog_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_t;

__attribute__((deprecated)) catalogs_feed_t *catalogs_feed_create(
    pinterest_rest_api_catalogs_feed_CATALOGTYPE_e catalog_type,
    char *created_at,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *id,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    char *updated_at,
    char *catalog_id
);

void catalogs_feed_free(catalogs_feed_t *catalogs_feed);

catalogs_feed_t *catalogs_feed_parseFromJSON(cJSON *catalogs_feedJSON);

cJSON *catalogs_feed_convertToJSON(catalogs_feed_t *catalogs_feed);

#endif /* _catalogs_feed_H_ */

