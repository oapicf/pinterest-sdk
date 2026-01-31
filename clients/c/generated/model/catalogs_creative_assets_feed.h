/*
 * catalogs_creative_assets_feed.h
 *
 * Catalogs Creative Asset Feed object
 */

#ifndef _catalogs_creative_assets_feed_H_
#define _catalogs_creative_assets_feed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_feed_t catalogs_creative_assets_feed_t;

#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "catalogs_type.h"
#include "country.h"
#include "nullable_currency.h"



typedef struct catalogs_creative_assets_feed_t {
    char *created_at; //date time
    char *id; // string
    char *updated_at; //date time
    char *catalog_id; // string
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_feed_credentials_t *credentials; //model
    pinterest_rest_api_country__e default_country; //referenced enum
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    char *default_locale; // string
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    char *location; // string
    char *name; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    pinterest_rest_api_catalogs_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_feed_t;

__attribute__((deprecated)) catalogs_creative_assets_feed_t *catalogs_creative_assets_feed_create(
    char *created_at,
    char *id,
    char *updated_at,
    char *catalog_id,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status
);

void catalogs_creative_assets_feed_free(catalogs_creative_assets_feed_t *catalogs_creative_assets_feed);

catalogs_creative_assets_feed_t *catalogs_creative_assets_feed_parseFromJSON(cJSON *catalogs_creative_assets_feedJSON);

cJSON *catalogs_creative_assets_feed_convertToJSON(catalogs_creative_assets_feed_t *catalogs_creative_assets_feed);

#endif /* _catalogs_creative_assets_feed_H_ */

